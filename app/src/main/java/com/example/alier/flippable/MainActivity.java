package com.example.alier.flippable;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bartoszlipinski.flippablestackview.FlippableStackView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    FlippableStackView stack;
    List<Fragment> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stack = (FlippableStackView) findViewById(R.id.stack);
        stack.initStack(2);

        for(int i = 0; i < 10;++i){
            list.add(new BlankFragment());
        }

        stack.setAdapter(new FlipAdapter(getSupportFragmentManager()));
    }

    public class FlipAdapter extends FragmentPagerAdapter{

        public FlipAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return list.get(position);
        }

        @Override
        public int getCount() {
            return list.size();
        }
    }
}
