package com.example.booklooth.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.booklooth.R;
import com.example.booklooth.data.MyReviewData;

import java.util.ArrayList;

public class MyReviewAdapter extends BaseAdapter {

    Context rContext = null;
    LayoutInflater rLayoutInflator = null;
    ArrayList<MyReviewData> myReviewData;

    public MyReviewAdapter(Context context, ArrayList<MyReviewData> data) {
        rContext = context;
        myReviewData = data;
        rLayoutInflator = LayoutInflater.from(rContext);
    }

    @Override
    public int getCount() {
        return myReviewData.size();
    }

    @Override
    public MyReviewData getItem(int position) {
        return myReviewData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        View view = rLayoutInflator.inflate(R.layout.mypage_myreview_gridview, null);

        ImageView myreviewImg = (ImageView)view.findViewById(R.id.myreviewImg);
        TextView myreviewTitle = (TextView)view.findViewById(R.id.myreviewTitle);

        myreviewImg.setImageResource(myReviewData.get(position).getBookImage());
        myreviewTitle.setText(myReviewData.get(position).getBookName());

        return view;
    }
}
