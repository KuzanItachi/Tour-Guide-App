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

public class ShoppingFragment extends Fragment {
    public ShoppingFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        // List of places which are famous shopping malls in Dhanbad
        int countOfShoppingMalls = 0;
        final ArrayList<Description> malls = new ArrayList<>();
        malls.add(new Description(getString(R.string.ozone_address), getString(R.string.ozone_timings), R.drawable.ozonegalleria,
                getString(R.string.ozone_mall)));
        malls.add(new Description(getString(R.string.sriram_address), getString(R.string.sriram_timings), R.drawable.shriram, getString(R.string.shriram_plaza)));
        malls.add(new Description(getString(R.string.citycentre_address), getString(R.string.citycentre_timings), R.drawable.citycentre, getString(R.string.city_centre)));

        DescriptionAdapter adapter = new DescriptionAdapter(getActivity(), malls);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
