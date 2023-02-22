package com.example.booklooth.adapter;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.booklooth.R;
import com.example.booklooth.data.CommentData;
import com.example.booklooth.data.ItemDetailData;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class CommentAdapter extends RecyclerView.Adapter <CommentAdapter.ViewHolder> {
    //베스트 감상평 데이터 리스트
    private ArrayList<CommentData> commentDataSet;

    public CommentAdapter(ArrayList<CommentData> itemDataSet) {
        commentDataSet = itemDataSet;
    }

    @NonNull
    @Override
    public CommentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //ViewHolder 객체 생성 후 리턴
        //comment_detail.xml 을 생성하는 부분
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.comment_detail, parent, false);

        CommentAdapter.ViewHolder vh = new CommentAdapter.ViewHolder(v);
        return vh;
    }


    @Override
    public void onBindViewHolder(@NonNull CommentAdapter.ViewHolder holder, int position) {
        //ViewHolder가 재활용될 때 사용되는 메소드
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  //format 수정해야 함 (timestamp->string 변환)
        String date_string = dateFormat.format(commentDataSet.get(position).getCommentDate());

        CommentData data = commentDataSet.get(position);
        String imageUrl = commentDataSet.get(position).getCommentImg();
        Glide.with(holder.profileImageView.getContext())
                .load(imageUrl).into(holder.profileImageView);
        holder.userNameTextView.setText(commentDataSet.get(position).getUserName());
        holder.timeTextView.setText(date_string);
        holder.commentTextView.setText(commentDataSet.get(position).getCommentContent());
        holder.responseTextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {    //답글달기 click 시 필요한 동작 정의

            }
        });

    }

    @Override
    public int getItemCount() {
        //전체 데이터 개수 조회
        return commentDataSet.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        //ViewHolder에 필요한 데이터들
        public ImageView profileImageView;  //프로필 사진
        public TextView userNameTextView;   //유저 이름
        public TextView timeTextView;   //댓글 단 시간
        public TextView commentTextView;    //댓글 내용
        public TextView responseTextView;   //답글 달기 (버튼 역할)

        public ViewHolder(@NonNull View view) {
            super(view);
            profileImageView = (ImageView) view.findViewById(R.id.commentviewitem_imageview_profile);
            userNameTextView = (TextView) view.findViewById(R.id.commentviewitem_textview_profile);
            timeTextView = (TextView) view.findViewById(R.id.commentviewitem_textview_minute);
            commentTextView = (TextView) view.findViewById(R.id.commentviewitem_textview_comment);
            responseTextView = (TextView) view.findViewById(R.id.commentviewitem_textview_response);
        }
    }
}

