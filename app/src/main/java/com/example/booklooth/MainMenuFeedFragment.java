package com.example.booklooth;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.booklooth.adapter.FeedAdapter;
import com.example.booklooth.data.FeedData;
import com.example.booklooth.data.FeedData;

import java.util.ArrayList;

public class MainMenuFeedFragment extends Fragment {
    private RecyclerView postRecyclerView;
    private FeedAdapter postAdapter;
    private ArrayList<FeedData> postData = new ArrayList<>();
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_main_menu_feed, container, false);

        postRecyclerView = (RecyclerView) rootView.findViewById(R.id.feedRecyclerView);
        postRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        postRecyclerView.setLayoutManager(mLayoutManager);
        postRecyclerView.scrollToPosition(0);
        postAdapter = new FeedAdapter(postData);
        postRecyclerView.setAdapter(postAdapter);
        postRecyclerView.setItemAnimator(new DefaultItemAnimator());

        return rootView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataset();
    }

    private void initDataset() {
        //for Test
        postData = new ArrayList<>();
        postData.add(new FeedData("user1", 10, "제목1", "내용1"));
        postData.add(new FeedData("user2", 20, "제목2", "내용2"));
        postData.add(new FeedData("user3", 30, "제목3", "내용3"));
        postData.add(new FeedData("user4", 40, "제목4", "내용4"));
    }
}