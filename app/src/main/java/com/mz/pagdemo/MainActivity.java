package com.mz.pagdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.mz.pagdemo.adapter.SimpleListAdapter;

public class MainActivity extends AppCompatActivity implements SimpleListAdapter.ItemClickListener {


    private static final String[] items = new String[]{
            "Render Multiple PAGImageView",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new SimpleListAdapter(items, this));
    }

    @Override
    public void onItemClick(int position) {
        switch (position) {
            case 0:
                startActivity(new Intent(MainActivity.this, MultiplePAGImageViewActivity.class));
                break;
            default:
                break;
        }
    }
}