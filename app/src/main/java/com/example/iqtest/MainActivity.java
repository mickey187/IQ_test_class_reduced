package com.example.iqtest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.icu.util.EthiopicCalendar;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    FrameLayout main_frame;
    BottomNavigationView bottomNavigationView;
    HomeFragment homeFragment;
    NotificationFragment notificationFragment;
    ScoresFragment scoresFragment;
    SettingFragment settingFragment;
    SharedPreferences sharedPreferences;
    Context context;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_frame =findViewById(R.id.frameLayout);
        bottomNavigationView = findViewById(R.id.bottom_nav);

        homeFragment = new HomeFragment();
        notificationFragment = new NotificationFragment();
        scoresFragment = new ScoresFragment();
        settingFragment = new SettingFragment();

        setFragment(homeFragment);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.nav_home:

                        setFragment(homeFragment);
                        return true;

                    case R.id.nav_score:

                        setFragment(scoresFragment);
                        return true;

                    case R.id.nav_setting:

                        setFragment(settingFragment);
                        return true;
                }
                return false;
            }
        });


    }
    private void setFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,fragment);
        fragmentTransaction.commit();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        sharedPreferences = getSharedPreferences("preferences",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.commit();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        this.recreate();
    }
}
