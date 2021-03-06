package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class colorAdapter extends ArrayAdapter<color> {
    public colorAdapter(Activity context, ArrayList<color> colors) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, colors); }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View listItemView1 = convertView;
        if(listItemView1 == null) {
            listItemView1 = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item1, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        color currentcolor = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokTextView = (TextView) listItemView1.findViewById(R.id.miwok_text_view1);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        miwokTextView.setText(currentcolor.getmiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultTextView = (TextView) listItemView1.findViewById(R.id.default_text_view1);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        defaultTextView.setText(currentcolor.getDefaultTranslation());



        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView1;
    }
    }

