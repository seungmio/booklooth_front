package com.example.booklooth.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.booklooth.R;
import com.example.booklooth.adapter.AlarmListViewAdapter;
import com.example.booklooth.data.AlarmListViewData;

import java.util.ArrayList;

public class AlarmFragment extends Fragment {
    ArrayList<AlarmListViewData> alarms;
    ListView alarmListView;
    private static AlarmListViewAdapter alarmAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_alarm, container, false);

        //data를 가져와서 어답터와 연결해 준다. 서버에서 가져오는게 대부분 이다.
        alarms = new ArrayList<>();
        alarms.add(new AlarmListViewData("user1", "alarm1"));
        alarms.add(new AlarmListViewData("user2", "alarm1"));
        alarms.add(new AlarmListViewData("user3", "alarm1"));


        alarmListView  = (ListView) rootView.findViewById(R.id.alarmListView);
        alarmAdapter = new AlarmListViewAdapter(getContext(), alarms);
        alarmListView.setAdapter(alarmAdapter);
        alarmListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                //각 아이템을 분간 할 수 있는 position과 뷰
                String selectedItem = (String) view.findViewById(R.id.memberAlarm).getTag().toString();
                Toast.makeText(getContext(), "Clicked: " + position +" " + selectedItem, Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }
}