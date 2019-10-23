package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends AppCompatActivity {

    final List<Animal> animals = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);

        animals.add(new Animal("Ant", R.mipmap.ant_round));
        animals.add(new Animal("Cat", R.mipmap.cat_round));
        animals.add(new Animal("Dog", R.mipmap.dog_round));
        animals.add(new Animal("Bird", R.mipmap.bird_round));

        final ListView listView = findViewById(R.id.listview);
        AnimalAdapter adapter = new AnimalAdapter(this, animals);
        listView.setAdapter(adapter);
    }
}
