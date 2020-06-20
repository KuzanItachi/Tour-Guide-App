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

public class AttractionFragment extends Fragment {
    public AttractionFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Description> attractions = new ArrayList<>();
        // List of places which are famous attractions
        attractions.add(new Description(getString(R.string.maithon_address), getString(R.string.maithon_timings), R.drawable.maithon_dam,
                getString(R.string.maithondam)));
        attractions.add(new Description(getString(R.string.bhatinda_address), getString(R.string.bhatinda_timings), R.drawable.bhatinda_fall,
                getString(R.string.bhatindafalls)));
        attractions.add(new Description(getString(R.string.birsa_address), getString(R.string.birsa_timings), R.drawable.birsa_munda_park,
                getString(R.string.birsamunda)));
        attractions.add(new Description(getString(R.string.topchanchi_address), getString(R.string.topchanchi_timings), R.drawable.topchanchiwildlife,
                getString(R.string.topchanchi)));

        DescriptionAdapter adapter = new DescriptionAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
