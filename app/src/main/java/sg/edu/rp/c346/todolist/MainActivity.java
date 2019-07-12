package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvTaskList;
    ArrayList<TODO> taskList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTaskList = findViewById(R.id.listViewTask);
        taskList = new ArrayList<>();

        taskList.add(new TODO("MSA", "1/7/2019"));
        taskList.add(new TODO("Go for haircut", "22/9/2019"));

        CustomAdapter adapter = new CustomAdapter(this, R.layout.row, taskList);
        lvTaskList.setAdapter(adapter);
    }
}
