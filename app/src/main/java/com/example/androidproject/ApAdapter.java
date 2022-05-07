package com.example.androidproject;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ApAdapter extends ArrayAdapter<ApSubclass> {
    private static final String LOG_TAG = ApAdapter.class.getSimpleName();

    public ApAdapter(Activity context, ArrayList<ApSubclass> grades){
        super(context, 0, grades);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView2 = convertView;
        if (listItemView2 == null) {
            listItemView2 = LayoutInflater.from(getContext()).inflate(
                    R.layout.and_prjct, parent, false
            );
        }

        ApSubclass currentName = getItem(position);
        TextView topicTextView = (TextView) listItemView2.findViewById(R.id.textViewAp);
        topicTextView.setText(currentName.getCourseName());

//        CheckBox subTopic1TextView = (CheckBox) listItemView1.findViewById(R.id.checkBoxAp);
//        subTopic1TextView.setText(currentName.isCheckedOrNot());

//        TextView subTopic1TextView = (TextView) listItemView1.findViewById(R.id.sub1);
//        subTopic1TextView.setText(currentName.getDsaProfLvl());
//
//        TextView subTopic2TextView = (TextView) listItemView1.findViewById(R.id.sub2);
//        subTopic2TextView.setText(currentName.getDsaQuesRatio());


        return listItemView2;
    }

}
