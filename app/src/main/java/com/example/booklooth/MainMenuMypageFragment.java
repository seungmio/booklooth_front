package com.example.booklooth;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.SurfaceControl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.booklooth.activity.MainActivity;


public class MainMenuMypageFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_main_menu_mypage, container, false);

        ImageButton settingBtn = (ImageButton) rootView.findViewById(R.id.settingBtn); // 설정 버튼

        settingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                MyPageProfileSettingFragment myPageProfileSettingFragment = new MyPageProfileSettingFragment();
                transaction.replace(R.id.menu_frame_layout, myPageProfileSettingFragment);
                transaction.commit();
            }
        });

        Button profileEdit = (Button)rootView.findViewById(R.id.profileEdit); // 프로필 수정 버튼

        profileEdit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                MyPageProfileEditFragment myPageProfileEditFragment = new MyPageProfileEditFragment();
                transaction.replace(R.id.menu_frame_layout, myPageProfileEditFragment);
                transaction.commit();
            }
        });

        return rootView;

    }
}