package com.example.booklooth.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import com.example.booklooth.R;
import com.example.booklooth.SearchListViewData;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {

    ArrayList<SearchListViewData> searchListViewData;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main_menu_search);

        SearchView search_bar = (SearchView)findViewById(R.id.search_bar);

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
    }
}
