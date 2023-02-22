package com.example.booklooth.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.booklooth.R;
import com.example.booklooth.data.ProfileWritingData;

import java.util.ArrayList;

public class ProfileWritingAdapter extends BaseAdapter {

    Context pContext = null;
    LayoutInflater pLayoutInflator = null;
    ArrayList<ProfileWritingData> profileWritingData;

    public ProfileWritingAdapter(Context context, ArrayList<ProfileWritingData> data) {
        pContext = context;
        profileWritingData = data;
        pLayoutInflator = LayoutInflater.from(pContext);
    }

    @Override
    public int getCount() {
        return profileWritingData.size();
    }

    @Override
    public Object getItem(int position) {
        return profileWritingData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        View view = pLayoutInflator.inflate(R.layout.profile_writing, null);

        ImageView memberProfile = (ImageView)view.findViewById(R.id.memberProfile);
        TextView memberName = (TextView)view.findViewById(R.id.memberName);
        TextView memberIntro = (TextView)view.findViewById(R.id.memberIntro);


        return view;
    }
}
