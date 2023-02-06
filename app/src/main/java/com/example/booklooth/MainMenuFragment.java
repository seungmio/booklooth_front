package com.example.booklooth;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.booklooth.activity.MainActivity;

public class MainMenuFragment extends Fragment {
    MainActivity mainActivity;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mainActivity = (MainActivity)getActivity();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mainActivity = null;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_main_menu, container, false);

        ImageButton btnAlarm = (ImageButton) rootView.findViewById(R.id.mainAlarm);
        ImageButton btnBookCal = (ImageButton) rootView.findViewById(R.id.bookCalImageBtn);
        ImageButton btnBestSeller = (ImageButton) rootView.findViewById(R.id.bestSellerImageBtn);
        ImageButton btnReview = (ImageButton) rootView.findViewById(R.id.reviewImageBtn);
        btnAlarm.setOnClickListener(new View.OnClickListener() {    //알람버튼
            @Override
            public void onClick(View view) {
                mainActivity.onChangeFragment(1);
            }
        });
        btnBookCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivity.onChangeFragment(2);
            }
        });
        btnBestSeller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivity.onChangeFragment(3);
            }
        });
        btnReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivity.onChangeFragment(4);
            }
        });

        return rootView;
    }
}