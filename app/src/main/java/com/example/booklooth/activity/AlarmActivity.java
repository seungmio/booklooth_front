package com.example.booklooth.activity;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.booklooth.AlarmListViewAdapter;
import com.example.booklooth.AlarmListViewData;
import com.example.booklooth.R;

import java.util.ArrayList;

public class AlarmActivity extends AppCompatActivity {

    ArrayList<AlarmListViewData> alarmListViewData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm);

        this.InitializeAlarmData();

        ListView alarmListView = (ListView)findViewById(R.id.alarmListView);

        final AlarmListViewAdapter alarmListViewAdapter = new AlarmListViewAdapter(this, alarmListViewData);

        alarmListView.setAdapter(alarmListViewAdapter);

        // 알림 선택 시 그 페이지로 이동?하는 이벤트 구현
    }

    public void InitializeAlarmData() {
        // 알람 데이터 받아와서 add
    }
}
