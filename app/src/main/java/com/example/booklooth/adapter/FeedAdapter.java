package com.example.booklooth.adapter;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.booklooth.R;
import com.example.booklooth.data.FeedData;

import java.util.ArrayList;

public class FeedAdapter extends RecyclerView.Adapter <FeedAdapter.ViewHolder> {
    private ArrayList<FeedData> mDataset;

    public FeedAdapter(ArrayList feedDataSet) {
        mDataset = feedDataSet;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.feed_detail, parent, false);

        ImageButton feed_profile_btn = v.findViewById(R.id.feed_profile_btn);

        feed_profile_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu postpopup = new PopupMenu(v.getContext(), view);

                postpopup.getMenuInflater().inflate(R.menu.posteditbutton, postpopup.getMenu());

                postpopup.show();
            }
        });

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        FeedData data = mDataset.get(position);
        holder.feedUserNameTextView.setText(data.getName());
        holder.feedLikeTextView.setText("좋아요 " + data.getLike() + "개");
        holder.feedTitleTextView.setText(data.getTitle());
        holder.feedContentTextView.setText(data.getContent());

        holder.feedUserNameTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 팔로우를 한 사람인 경우와 팔로우를 하지 않은 사람인 경우로 나눠서 처리
                Dialog userProfile = new Dialog(view.getContext());
                userProfile.setContentView(R.layout.profile_dialog);
                userProfile.show();
            }
        });

        holder.feed_favorite_imageview.setOnClickListener(new View.OnClickListener() {
            boolean push = true;
            @Override
            public void onClick(View view) {
                if (push == true)
                {
                    holder.feed_favorite_imageview.setImageResource(R.drawable.heartbtnpush);
                    push = false;
                    // 좋아요 수 늘리기
                } else {
                    holder.feed_favorite_imageview.setImageResource(R.drawable.heartbtn);
                    push = true;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView feedUserNameTextView;   //유저 이름
        public TextView feedLikeTextView;   //좋아요 개수
        public TextView feedTitleTextView;  //제목
        public TextView feedContentTextView;   //내용
        public ImageView feed_favorite_imageview;

        public ViewHolder(@NonNull View view) {
            super(view);
            feedUserNameTextView = (TextView) view.findViewById(R.id.feed_userName_textView);
            feedLikeTextView = (TextView) view.findViewById(R.id.feed_favoritecounter_textview);
            feedTitleTextView = (TextView) view.findViewById(R.id.feed_title_textview);
            feedContentTextView = (TextView) view.findViewById(R.id.feed_explian_textview);
            feed_favorite_imageview = (ImageView) view.findViewById(R.id.feed_favorite_imageview);
        }
    }

}
