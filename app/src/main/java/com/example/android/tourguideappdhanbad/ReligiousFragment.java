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

public class ReligiousFragment extends Fragment {
    public ReligiousFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Description> sites = new ArrayList<>();
        // List of places which are famous religious sites
        sites.add(new Description(getString(R.string.shakti_address), R.drawable.shaktimandir, getString(R.string.shaktimandir)));
        sites.add(new Description(getString(R.string.bhuiphore_address), R.drawable.bhuiphore, getString(R.string.bhuiphoremandir)));
        sites.add(new Description(getString(R.string.jaganath_address), R.drawable.jagannath, getString(R.string.jagannathmandir)));

        DescriptionAdapter adapter = new DescriptionAdapter(getActivity(), sites);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
