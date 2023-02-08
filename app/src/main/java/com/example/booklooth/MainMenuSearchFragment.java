package com.example.booklooth;

import android.os.Bundle;

import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.booklooth.adapter.SearchListViewAdapter;
import com.example.booklooth.data.SearchListViewData;

import java.util.ArrayList;

public class MainMenuSearchFragment extends Fragment {

    ArrayList<SearchListViewData> searchListViewData;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_main_menu_search, container, false);

        SearchView search_bar = (SearchView)rootView.findViewById(R.id.search_bar);

        search_bar.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        this.sampleSearchData();

        ListView searchListView = (ListView)rootView.findViewById(R.id.searchListView);

        final SearchListViewAdapter searchListViewAdapter = new SearchListViewAdapter(getActivity(), searchListViewData);

        searchListView.setAdapter(searchListViewAdapter);

        // ImageButton bookHeartBtn = (ImageButton)rootView.findViewById(R.id.bookHeartBtn);

        /* bookHeartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 버튼 클릭 시 나의 위시리스트로 이동 및 버튼 이미지 변경
            }
        }); */

        return rootView;
    }

    public void sampleSearchData() {
        searchListViewData = new ArrayList<SearchListViewData>();
        searchListViewData.add(new SearchListViewData(R.drawable.login_google, "노인과 바다", "작가 이름"));
    }
}