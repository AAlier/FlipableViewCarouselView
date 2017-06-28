package com.example.alier.flippable;


import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ViewListener;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    public BlankFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        CarouselView carouselView = (CarouselView) view.findViewById(R.id.carousel);
        carouselView.setPageCount(10);
        carouselView.setSlideInterval(0);

        carouselView.setViewListener(new ViewListener() {
            @Override
            public View setViewForPosition(int position) {
                View view = getActivity().getLayoutInflater().inflate(R.layout.temp, null, false);

                ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
                imageView.setImageResource(R.mipmap.ic_launcher);
                return view;
            }
        });
        return view;
    }

}
