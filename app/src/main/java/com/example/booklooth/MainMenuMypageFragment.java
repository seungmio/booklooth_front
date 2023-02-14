package com.example.booklooth;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainMenuMypageFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_main_menu_mypage, container, false);

        ImageButton settingBtn = (ImageButton) rootView.findViewById(R.id.settingBtn); // 설정 버튼
        Button profileEdit = (Button)rootView.findViewById(R.id.profileEdit); // 프로필 수정 버튼
        TextView wishlistmoreText = (TextView)rootView.findViewById(R.id.wishlistmoreText); // 위시리스트로 이동
        TextView reviewmoreText = (TextView)rootView.findViewById(R.id.reviewmoreText); // 내 리뷰 보기로 이동


        settingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                MyPageProfileSettingFragment myPageProfileSettingFragment = new MyPageProfileSettingFragment();
                transaction.replace(R.id.menu_frame_layout, myPageProfileSettingFragment);
                transaction.commit();
            }
        });

        profileEdit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                MyPageProfileEditFragment myPageProfileEditFragment = new MyPageProfileEditFragment();
                transaction.replace(R.id.menu_frame_layout, myPageProfileEditFragment);
                transaction.commit();
            }
        });

        wishlistmoreText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 위시리스트 페이지로 이동

            }
        });

        reviewmoreText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                MyPageMyReviewFragment myPageMyReviewFragment = new MyPageMyReviewFragment();
                transaction.replace(R.id.menu_frame_layout, myPageMyReviewFragment);
                transaction.commit();
            }
        });

        return rootView;

    }
}