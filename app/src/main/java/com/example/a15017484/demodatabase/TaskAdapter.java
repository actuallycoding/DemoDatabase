package com.example.a15017484.demodatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 15017484 on 16/5/2017.
 */

public class TaskAdapter extends ArrayAdapter<Task> {
    private Context context;
    private ArrayList<Task> tasks;
    private TextView tvId;
    private TextView tvDesc;
    private TextView tvDate;

    public TaskAdapter(Context context, int resource, ArrayList<Task> objects){
        super(context, resource, objects);
        tasks = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvId = (TextView)rowView.findViewById(R.id.textViewId);
        tvDesc = (TextView)rowView.findViewById(R.id.textViewDesc);
        tvDate = (TextView)rowView.findViewById(R.id.textViewDate);
        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Task currentTask = tasks.get(position);
        // Set the TextView to show the food

        tvId.setText(""+currentTask.getId());
        tvDesc.setText(""+currentTask.getDescription());
        tvDate.setText(""+currentTask.getDate());

        return rowView;
    }
}
