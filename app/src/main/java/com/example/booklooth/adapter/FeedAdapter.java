package com.example.booklooth.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.booklooth.R;
import com.example.booklooth.data.FeedData;

import java.util.ArrayList;

public class FeedAdapter extends RecyclerView.Adapter <FeedAdapter.ViewHolder> {
    private ArrayList<FeedData> mDataset;

    public FeedAdapter(ArrayList postDataSet) {
        mDataset = postDataSet;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.feed_detail, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        FeedData data = mDataset.get(position);
        holder.postUserNameTextView.setText(data.getName());
        holder.postLikeTextView.setText("좋아요 " + data.getLike() + "개");
        holder.postTitleTextView.setText(data.getTitle());
        holder.postContentTextView.setText(data.getContent());

    }


    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView postUserNameTextView;   //유저 이름
        public TextView postLikeTextView;   //좋아요 개수
        public TextView postTitleTextView;  //제목
        public TextView postContentTextView;   //내용

        public ViewHolder(@NonNull View view) {
            super(view);
            postUserNameTextView = (TextView) view.findViewById(R.id.feed_userName_textView);
            postLikeTextView = (TextView) view.findViewById(R.id.feed_favoritecounter_textview);
            postTitleTextView = (TextView) view.findViewById(R.id.feed_title_textview);
            postContentTextView = (TextView) view.findViewById(R.id.feed_explian_textview);
        }
    }

}
