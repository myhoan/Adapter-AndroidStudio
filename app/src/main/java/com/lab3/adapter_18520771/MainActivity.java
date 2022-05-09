package com.lab3.adapter_18520771;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        populateUsersList();
    }

    private void populateUsersList() {
        ArrayList<User> arrayOfUsers = new ArrayList<User>();
        UserAdapter adapter = new UserAdapter(this, arrayOfUsers);
//        ListView listView = (ListView) findViewById(R.id.lvItems);
//        listView.setAdapter(adapter);
    }
}