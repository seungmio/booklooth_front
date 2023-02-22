package com.example.booklooth;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.booklooth.adapter.WishListViewAdapter;
import com.example.booklooth.data.WishListViewData;

import java.util.ArrayList;

public class MyPageWishListFragment extends Fragment {
    ArrayList<WishListViewData> wishListViewData;
    ListView wishlistview;
    private static WishListViewAdapter wishListViewAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.mypage_wishlist, container, false);

        wishListViewData = new ArrayList<>();
        wishListViewData.add(new WishListViewData(R.drawable.bookimagesample, "책 이름1", "작가1"));
        wishListViewData.add(new WishListViewData(R.drawable.bookimagesample, "책 이름2", "작가2"));
        wishListViewData.add(new WishListViewData(R.drawable.bookimagesample, "책 이름3", "작가3"));

        wishlistview = (ListView)rootView.findViewById(R.id.wishlistview);

        wishListViewAdapter = new WishListViewAdapter(getContext(), wishListViewData);
        wishlistview.setAdapter(wishListViewAdapter);


        return rootView;
    }
}
