package com.example.booklooth.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.booklooth.R;
import com.example.booklooth.adapter.CommentAdapter;
import com.example.booklooth.data.CommentData;

import java.sql.Timestamp;
import java.util.ArrayList;

public class CommentFragment extends Fragment {

    private RecyclerView commentRecyclerView;
    private CommentAdapter commentAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<CommentData> commentData;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_comment, container, false);
        commentRecyclerView = (RecyclerView) view.findViewById(R.id.detailviewfragment_recyclerview);
        commentRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        commentRecyclerView.setLayoutManager(mLayoutManager);
        commentRecyclerView.scrollToPosition(0);
        commentAdapter = new CommentAdapter(commentData);
        commentRecyclerView.setAdapter(commentAdapter);
        commentRecyclerView.setItemAnimator(new DefaultItemAnimator());
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataset();
    }

    private void initDataset() {
        //for Test
        Timestamp date = new Timestamp(System.currentTimeMillis()); //timestamp dummy data

        commentData = new ArrayList<>();
        commentData.add(new CommentData("https://t1.daumcdn.net/cfile/tistory/2520CF4753E942C332", 1, 1, "user1", date, "comment1"));
        commentData.add(new CommentData("https://t1.daumcdn.net/cfile/tistory/2520CF4753E942C332", 2, 2, "user2", date, "comment2"));
        commentData.add(new CommentData("https://t1.daumcdn.net/cfile/tistory/2520CF4753E942C332", 3, 3, "user3", date, "comment3"));
        commentData.add(new CommentData("https://t1.daumcdn.net/cfile/tistory/2520CF4753E942C332", 4, 4, "user4", date, "comment4"));

    }
}