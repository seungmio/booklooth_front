package com.example.booklooth;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.booklooth.activity.MainActivity;
import com.example.booklooth.adapter.ItemDetailAdapter;
import com.example.booklooth.data.ItemDetailData;

import java.util.ArrayList;

public class MainMenuFragment extends Fragment {
    MainActivity mainActivity;
    private RecyclerView bestItemRecyclerView;  //베스트 감상평 리사이클러뷰
    private ItemDetailAdapter itemDetailAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<ItemDetailData> itemDetailData;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_main_menu, container, false);

        ImageButton btnAlarm = (ImageButton) rootView.findViewById(R.id.mainAlarm);
        ImageButton btnBookCal = (ImageButton) rootView.findViewById(R.id.bookCalImageBtn);
        ImageButton btnBestSeller = (ImageButton) rootView.findViewById(R.id.bestSellerImageBtn);
        ImageButton btnReview = (ImageButton) rootView.findViewById(R.id.reviewImageBtn);

        //베스트 감상평 리사이클러뷰
        bestItemRecyclerView = (RecyclerView) rootView.findViewById(R.id.bestRecyclerView);
        bestItemRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        bestItemRecyclerView.setLayoutManager(mLayoutManager);
        bestItemRecyclerView.scrollToPosition(0);
        itemDetailAdapter = new ItemDetailAdapter(itemDetailData);
        bestItemRecyclerView.setAdapter(itemDetailAdapter);
        bestItemRecyclerView.setItemAnimator(new DefaultItemAnimator());



        btnAlarm.setOnClickListener(new View.OnClickListener() {    //알람버튼
            @Override
            public void onClick(View view) {
                mainActivity.onChangeFragment(1);
            }
        });
        btnBookCal.setOnClickListener(new View.OnClickListener() {  //캘린더버튼
            @Override
            public void onClick(View view) {
                mainActivity.onChangeFragment(2);
            }
        });
        btnBestSeller.setOnClickListener(new View.OnClickListener() {   //베스트셀러(서치)버튼
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

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataset();
    }

    private void initDataset() {
        //for Test
        itemDetailData = new ArrayList<>();
        itemDetailData.add(new ItemDetailData("user1", 10, "제목1", "내용1"));
        itemDetailData.add(new ItemDetailData("user2", 20, "제목2", "내용2"));
        itemDetailData.add(new ItemDetailData("user3", 30, "제목3", "내용3"));
        itemDetailData.add(new ItemDetailData("user4", 40, "제목4", "내용4"));
    }

}