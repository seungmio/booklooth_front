package com.example.booklooth;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AlarmListViewAdapter extends BaseAdapter {
    Context aContext = null;
    LayoutInflater aLayoutInflater = null;
    ArrayList<AlarmListViewData> alarmListViewData;

    public AlarmListViewAdapter(Context context, ArrayList<AlarmListViewData> data) {
        aContext = context;
        alarmListViewData = data;
        aLayoutInflater = LayoutInflater.from(aContext);
    }

    @Override
    public int getCount() {
        return alarmListViewData.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public AlarmListViewData getItem(int position) {
        return alarmListViewData.get(position);
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        View view = aLayoutInflater.inflate(R.layout.alarm_listview, null);

        ImageView memberImage = (ImageView)view.findViewById(R.id.memberImage);
        TextView memberAlarm = (TextView)view.findViewById(R.id.memberAlarm);
        TextView memberAlarmsContent = (TextView)view.findViewById(R.id.memberAlarmContent);

        memberImage.setImageResource(alarmListViewData.get(position).getMemberImage());
        memberAlarm.setText(alarmListViewData.get(position).getMemberAlarm());
        memberAlarmsContent.setText(alarmListViewData.get(position).getMemberAlarmContent());

        return view;
    }
}
