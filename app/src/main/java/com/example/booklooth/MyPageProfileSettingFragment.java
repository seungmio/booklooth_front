package com.example.booklooth;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MyPageProfileSettingFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.mypage_profile_setting, container, false);

        Switch settingPushAlarm = (Switch)rootView.findViewById(R.id.settinPushAlarm);
        TextView pushAlarmText = (TextView)rootView.findViewById(R.id.pushAlarmText);
        TextView logout = (TextView)rootView.findViewById(R.id.logout);

        settingPushAlarm.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked)
                {
                    // 푸시 알림 on 했을 때

                } else {
                    // 푸시 알림 off 했을 때

                }
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 로그아웃 클릭 시

            }
        });

        return rootView;
    }
}
