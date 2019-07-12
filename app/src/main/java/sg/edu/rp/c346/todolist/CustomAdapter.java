package sg.edu.rp.c346.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<TODO> taskList;

    public CustomAdapter(Context context, int resource, ArrayList<TODO> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        taskList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvTask = rowView.findViewById(R.id.textViewTask);
        TextView tvDate = rowView.findViewById(R.id.textViewDate);

        TODO currentTask = taskList.get(position);

        tvTask.setText(currentTask.getTask());
        tvDate.setText(currentTask.getDate());

        return rowView;
    }
}
