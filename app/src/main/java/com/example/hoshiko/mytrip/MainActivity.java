package com.example.hoshiko.mytrip;


import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mBottomNavigation
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.action_popular:
                    switchToPopularFragment();
                    break;

                case R.id.action_my_places:
                    //switchToMyPlacesFragment();
                    break;
                case R.id.action_favorites:
                    switchToFavoritesFragment();
                    break;

                case R.id.action_settings:
                    //switchToSettingsFragment();
                    break;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set up for the first time
        switchToPopularFragment();

        //Khởi tạo thanh Điều hướng phía dưới của app
        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        //Helps Navigation Bar could Items display all Icon with text
       BottomNavigationViewHelper.removeShiftMode(bottomNavigationView);
        //
        bottomNavigationView.setOnNavigationItemSelectedListener(mBottomNavigation);

    }

    public void switchToPopularFragment() {
        PopularFragment popularFragment = new PopularFragment();
        FragmentManager manager = getFragmentManager();
        manager.beginTransaction().replace(R.id.first_fragment, popularFragment).commit();
    }

    public void switchToFavoritesFragment() {
        PopularFragment popularFragment = new PopularFragment();
        FragmentManager manager = getFragmentManager();
        manager.beginTransaction().replace(R.id.first_fragment, popularFragment).commit();
    }


}
