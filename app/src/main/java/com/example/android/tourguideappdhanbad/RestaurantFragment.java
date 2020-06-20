package com.example.android.tourguideappdhanbad;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class RestaurantFragment extends Fragment {
    public RestaurantFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // List of places which are famous restaurants
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Description> restaurants = new ArrayList<>();
        restaurants.add(new Description(getString(R.string.degree_address), getString(R.string.degree_timings), R.drawable.degree,
                getString(R.string.degree)));
        restaurants.add(new Description(getString(R.string.shahi_address), getString(R.string.shahi_timings), R.drawable.shahidarbar,
                getString(R.string.shahi)));
        restaurants.add(new Description(getString(R.string.dominos_address), getString(R.string.dominos_timings), R.drawable.dominos,
                getString(R.string.dominos)));
        restaurants.add(new Description(getString(R.string.madhulika_address), getString(R.string.madhulika_timings), R.drawable.madhulika,
                getString(R.string.madhulika)));
        restaurants.add(new Description(getString(R.string.khalsa_address), getString(R.string.khalsa_timings), R.drawable.khalsa,
                getString(R.string.khalsa)));
        DescriptionAdapter adapter = new DescriptionAdapter(getActivity(), restaurants);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
