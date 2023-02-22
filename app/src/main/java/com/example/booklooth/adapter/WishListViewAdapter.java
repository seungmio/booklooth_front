package com.example.booklooth.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.example.booklooth.R;
import com.example.booklooth.data.WishListViewData;

import java.util.ArrayList;

public class WishListViewAdapter extends BaseAdapter {
    Context wContext = null;
    LayoutInflater wLayoutInflater = null;
    ArrayList<WishListViewData> wishListViewData;

    public WishListViewAdapter(Context context, ArrayList<WishListViewData> data) {
        wContext = context;
        wishListViewData = data;
        wLayoutInflater = LayoutInflater.from(wContext);
    }

    @Override
    public int getCount() {
        return wishListViewData.size();
    }

    @Override
    public WishListViewData getItem(int position) {
        return wishListViewData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        View view = wLayoutInflater.inflate(R.layout.mypage_wishlistview, null);

        ImageView bookImage = (ImageView)view.findViewById(R.id.bookImage);
        TextView bookName = (TextView)view.findViewById(R.id.bookName);
        TextView bookInform = (TextView)view.findViewById(R.id.bookInform);
        ImageButton deleteBtn = (ImageButton)view.findViewById(R.id.deleteBtn);

        bookImage.setImageResource(wishListViewData.get(position).getBookImage());
        bookName.setText(wishListViewData.get(position).getBookName());
        bookInform.setText(wishListViewData.get(position).getBookInform());

        deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu postpopup = new PopupMenu(view.getContext(), view);

                postpopup.getMenuInflater().inflate(R.menu.deletebutton, postpopup.getMenu());

                postpopup.show();
            }
        });

        return view;
    }
}
