package com.example.booklooth.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.booklooth.R;
import com.example.booklooth.data.SearchListViewData;

import java.util.ArrayList;

public class SearchListViewAdapter extends BaseAdapter {
    Context sContext = null;
    LayoutInflater sLayoutInflater = null;
    ArrayList<SearchListViewData> searchListViewData;

    public SearchListViewAdapter(Context context, ArrayList<SearchListViewData> data) {
        sContext = context;
        searchListViewData = data;
        sLayoutInflater = LayoutInflater.from(sContext);
    }

    @Override
    public int getCount() {
        return searchListViewData.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public SearchListViewData getItem(int position) {
        return searchListViewData.get(position);
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        View view = sLayoutInflater.inflate(R.layout.search_listview, null);

        ImageView bookImage = (ImageView)view.findViewById(R.id.bookImage);
        TextView bookName = (TextView)view.findViewById(R.id.bookName);
        TextView bookInform = (TextView)view.findViewById(R.id.bookInform);
        ImageButton bookHeartBtn = (ImageButton)view.findViewById(R.id.bookHeartBtn);

        bookImage.setImageResource(searchListViewData.get(position).getBookImage());
        bookName.setText(searchListViewData.get(position).getBookName());
        bookInform.setText(searchListViewData.get(position).getBookInform());
        bookHeartBtn.setOnClickListener(new View.OnClickListener() {
            boolean push = true;
            @Override
            public void onClick(View view) {
                if (push == true)
                {
                    bookHeartBtn.setImageResource(R.drawable.heartbtnpush);
                    push = false;
                    // 위시리스트에 추가하는 메서드 추가
                } else {
                    bookHeartBtn.setImageResource(R.drawable.heartbtn);
                    push = true;
                    // 위시리스트에서 삭제하는 메서드 추가
                }
            }
        });

        return view;
    }
}
