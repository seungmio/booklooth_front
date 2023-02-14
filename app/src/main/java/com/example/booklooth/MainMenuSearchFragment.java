package com.example.booklooth;

import android.os.Bundle;

import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

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

        return rootView;
    }

    public void sampleSearchData() {
        searchListViewData = new ArrayList<SearchListViewData>();
        searchListViewData.add(new SearchListViewData(R.drawable.bookimagesample, "노인과 바다", "작가 이름"));
        searchListViewData.add(new SearchListViewData(R.drawable.bookimagesample, "노인과 바다", "작가 이름"));
        searchListViewData.add(new SearchListViewData(R.drawable.bookimagesample, "노인과 바다", "작가 이름"));
        searchListViewData.add(new SearchListViewData(R.drawable.bookimagesample, "노인과 바다", "작가 이름"));
        searchListViewData.add(new SearchListViewData(R.drawable.bookimagesample, "노인과 바다", "작가 이름"));
        searchListViewData.add(new SearchListViewData(R.drawable.bookimagesample, "노인과 바다", "작가 이름"));
        searchListViewData.add(new SearchListViewData(R.drawable.bookimagesample, "노인과 바다", "작가 이름"));

    }
}