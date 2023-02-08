package com.example.booklooth.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
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

        bookImage.setImageResource(searchListViewData.get(position).getBookImage());
        bookName.setText(searchListViewData.get(position).getBookName());
        bookInform.setText(searchListViewData.get(position).getBookInform());

        return view;
    }
}
