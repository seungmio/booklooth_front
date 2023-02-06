package com.example.booklooth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager = getSupportFragmentManager();
    private MainMenuFragment fragmentMain = new MainMenuFragment();
    private MainMenuSearchFragment fragmentSearch = new MainMenuSearchFragment();
    private MainMenuFeedFragment fragmentFeed = new MainMenuFeedFragment();
    private MainMenuMypageFragment fragmentMypage = new MainMenuMypageFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.menu_frame_layout, fragmentMain).commitAllowingStateLoss();

        BottomNavigationView bottomNavigationView = findViewById(R.id.botton_navigation);
        bottomNavigationView.setOnItemSelectedListener(new ItemSelectedListener());

    }

    class ItemSelectedListener implements NavigationBarView.OnItemSelectedListener {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            FragmentTransaction transaction = fragmentManager.beginTransaction();

            switch (item.getItemId()) {
                case R.id.action_home:
                    transaction.replace(R.id.menu_frame_layout, fragmentMain).commitAllowingStateLoss();
                    break;
                case R.id.action_search:
                    transaction.replace(R.id.menu_frame_layout, fragmentSearch).commitAllowingStateLoss();
                    break;
                case R.id.action_feed:
                    transaction.replace(R.id.menu_frame_layout, fragmentFeed).commitAllowingStateLoss();
                    break;
                case R.id.action_mypage:
                    transaction.replace(R.id.menu_frame_layout, fragmentMypage).commitAllowingStateLoss();
                    break;
            }
            return false;
        }
    }
}