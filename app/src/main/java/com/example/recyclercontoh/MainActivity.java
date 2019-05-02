package com.example.recyclercontoh;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    RecyclerView recyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;
    EditText etnama, etisi;
    FloatingActionButton btnAdd;
    List<kumpulandata> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnama = findViewById(R.id.etNama);
        etisi = findViewById(R.id.etIsi);
        btnAdd = findViewById(R.id.id_add);

        recyclerView = (RecyclerView) findViewById(R.id.recy);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);

        data = new ArrayList<kumpulandata>();

        mAdapter = new adapter(this,data);
        recyclerView.setAdapter(mAdapter );

        btnAdd.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        data.add(new kumpulandata(etnama.getText().toString(),etisi.getText().toString()));

        mAdapter.notifyDataSetChanged();

    }
}
