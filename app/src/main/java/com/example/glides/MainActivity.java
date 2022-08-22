package com.example.glides;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    SampleAdapter mSampleAdapter;
    ArrayList<String> mStringArrayLists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recycler);
        mStringArrayLists = new ArrayList<>();

        mStringArrayLists.add("https://unsplash.com/photos/X_roZ7toBJY/download?ixid=MnwxMjA3fDB8MXxzZWFyY2h8NTB8fG5ldyUyMHlvcmt8ZW58MHx8fHwxNjU2Njg1NTgz&force=true&w=1920");
        mStringArrayLists.add("https://iislaventures.com/app/uploads/2021/02/flat-lay-arrangement-with-burgers-pizza-scaled.jpg");


        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mSampleAdapter = new SampleAdapter(this, mStringArrayLists);
        mRecyclerView.setAdapter(mSampleAdapter);
    }
}