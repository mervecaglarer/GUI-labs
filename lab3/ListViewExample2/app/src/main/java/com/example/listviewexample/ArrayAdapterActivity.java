package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class ArrayAdapterActivity extends ListActivity {
    static String[] ANIMALS = new String[] {"Ant", "Cat", "Dog" , "Bird"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_array_adapter);
        ListView listView = getListView();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.activity_array_adapter, ANIMALS);
        setListAdapter(adapter);
        listView.setTextFilterEnabled(true);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ArrayAdapterActivity.this, ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
