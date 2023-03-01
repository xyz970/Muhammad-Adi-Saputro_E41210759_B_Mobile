package com.example.mahasiswa_recyclerview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private List<Mahasiswa> mahasiswaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mahasiswaList = addData();

        recyclerView = findViewById(R.id.recycler_view);
        adapter = new MahasiswaAdapter((ArrayList<Mahasiswa>) mahasiswaList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private List<Mahasiswa> addData() {
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new Mahasiswa("Muhammad Adi Saputro", "E41210759", "085748314069"));
        return mahasiswaList;
    }
}