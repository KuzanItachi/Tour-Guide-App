package com.example.android.tourguideappdhanbad;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class DescriptionAdapter extends ArrayAdapter<Description> {

    public DescriptionAdapter(Context context, ArrayList<Description> events) {
        super(context, 0, events);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Description currentEvent = getItem(position);
        TextView addresstextview = listItemView.findViewById(R.id.address_text_view);
        addresstextview.setText(currentEvent.getmAddress());
        ImageView photoview = listItemView.findViewById(R.id.image);
        photoview.setImageResource(currentEvent.getmResourceID());

        TextView timingtextview = listItemView.findViewById(R.id.timings_text_view);
        if (timingtextview.getText().length() == 0) {
            timingtextview.setText(currentEvent.getmTimings());
        } else {
            timingtextview.setVisibility(View.GONE);
        }
        TextView titletextview = listItemView.findViewById(R.id.title);
        titletextview.setText(currentEvent.getmTitle());

        return listItemView;
    }
}
