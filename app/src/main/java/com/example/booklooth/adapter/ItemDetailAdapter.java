package com.example.booklooth.adapter;


import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.booklooth.R;
import com.example.booklooth.data.ItemDetailData;

import java.util.ArrayList;


public class ItemDetailAdapter extends RecyclerView.Adapter <ItemDetailAdapter.ViewHolder> {
    //베스트 감상평 데이터 리스트
    private ArrayList<ItemDetailData> mDataset;
    public ItemDetailAdapter(ArrayList<ItemDetailData> itemDataSet) {
        mDataset = itemDataSet;
    }

    private OnItemClickListener itemClickListener;
    private OnCommentClickListener commentClickListener;

    //인터페이스 선언
    public interface OnItemClickListener{
        //클릭시 동작할 함수
        void onItemClick(View v);
    }
    public void setOnItemClickListener(OnItemClickListener listener){
        this.itemClickListener = listener;
    }

    public interface OnCommentClickListener{
        //클릭시 동작할 함수
        void onCommentClick(View v);
    }
    public void setOnCommentClickListener(OnCommentClickListener listener){
        this.commentClickListener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //ViewHolder 객체 생성 후 리턴
        //item_detail.xml 을 생성하는 부분
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_detail, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;

    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //ViewHolder가 재활용될 때 사용되는 메소드
        ItemDetailData data = mDataset.get(position);
        holder.userNameTextView.setText(data.getName());
        holder.likeTextView.setText("좋아요 " + data.getLike() + "개");
        holder.titleTextView.setText(data.getTitle());
        holder.contentTextView.setText(data.getContent());

        holder.userNameTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 팔로우를 한 사람인 경우와 팔로우를 하지 않은 사람인 경우로 나눠서 처리
                Dialog userProfile = new Dialog(view.getContext());
                userProfile.setContentView(R.layout.profile_dialog);
                userProfile.show();
            }
        });
        holder.contentTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // click 시 필요한 동작 정의
                // 게시 fragment로 이동
                //동작 호출 (onItemClick 함수 호출)
                if(itemClickListener != null) {
                    itemClickListener.onItemClick(view);
                }
            }
        });
        holder.commentImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // click 시 필요한 동작 정의
                // 댓글 fragment 로 이동
                //동작 호출 (onItemClick 함수 호출)
                if(commentClickListener != null) {
                    commentClickListener.onCommentClick(view);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        //전체 데이터 개수 조회
        return mDataset.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        //ViewHolder에 필요한 데이터들
        public TextView userNameTextView;   //유저 이름
        public TextView likeTextView;   //좋아요 개수
        public TextView titleTextView;  //제목
        public TextView contentTextView;    //내용
        public ImageView commentImageView;  //댓글 이미지뷰

        public ViewHolder(@NonNull View view) {
            super(view);
            userNameTextView = (TextView) view.findViewById(R.id.userNameTextView);
            likeTextView = (TextView) view.findViewById(R.id.detailviewitem_favoritecounter_textview);
            titleTextView = (TextView) view.findViewById(R.id.detailviewitem_title_textview);
            contentTextView = (TextView) view.findViewById(R.id.detailviewitem_explian_textview);
            commentImageView = (ImageView) view.findViewById(R.id.detailviewitem_comment_imageview);
        }
    }
}