package com.example.booklooth.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.booklooth.AlarmFragment;
import com.example.booklooth.CalendarFragment;
import com.example.booklooth.MainMenuFeedFragment;
import com.example.booklooth.MainMenuFragment;
import com.example.booklooth.MainMenuMypageFragment;
import com.example.booklooth.MainMenuSearchFragment;
import com.example.booklooth.MyPageProfileEditFragment;
import com.example.booklooth.R;
import com.example.booklooth.ReviewFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager = getSupportFragmentManager();
    private MainMenuFragment fragmentMain = new MainMenuFragment();
    private MainMenuSearchFragment fragmentSearch = new MainMenuSearchFragment();
    private MainMenuFeedFragment fragmentFeed = new MainMenuFeedFragment();
    private MainMenuMypageFragment fragmentMypage = new MainMenuMypageFragment();
    private AlarmFragment fragmentAlarm = new AlarmFragment();
    private CalendarFragment fragmentCalendar = new CalendarFragment();
    private ReviewFragment fragmentReview = new ReviewFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.menu_frame_layout, fragmentMain).commitAllowingStateLoss();

        BottomNavigationView bottomNavigationView = findViewById(R.id.botton_navigation);
        bottomNavigationView.setOnItemSelectedListener(new ItemSelectedListener());

    }

    public void onChangeFragment(int index) {
        if(index == 1){ //알림
            getSupportFragmentManager().beginTransaction().replace(R.id.menu_frame_layout, fragmentAlarm).commit();
        } else if (index == 2) { //캘린더
            getSupportFragmentManager().beginTransaction().replace(R.id.menu_frame_layout, fragmentCalendar).commit();
        } else if (index == 3) {    //베스트셀러
            getSupportFragmentManager().beginTransaction().replace(R.id.menu_frame_layout, fragmentSearch).commit();
        } else if (index == 4) {    //리뷰
            getSupportFragmentManager().beginTransaction().replace(R.id.menu_frame_layout, fragmentReview).commit();
        }
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