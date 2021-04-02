package com.example.recyclerlistview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView rvMahasiswa;
    private MahasiswaAdapter adapterMahasiswa;
    private ArrayList<Mahasiswa> mDataMahasiswa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        addData();

        adapterMahasiswa = new  MahasiswaAdapter(mDataMahasiswa);

        rvMahasiswa = findViewById(R.id.rv_mahasiswa);
        rvMahasiswa.setLayoutManager(new LinearLayoutManager(this));
        rvMahasiswa.setAdapter(adapterMahasiswa);

    }

    private void addData() {
        mDataMahasiswa = new ArrayList<>();
        mDataMahasiswa.add(new Mahasiswa("Anisa Puji Astutik", "E41191188", "12345678"));
        mDataMahasiswa.add(new Mahasiswa("Diana Suga Lestari", "E41191188", "12345678"));
        mDataMahasiswa.add(new Mahasiswa("Dewi aghesty", "E41191188", "12345678"));
        mDataMahasiswa.add(new Mahasiswa("Riskie Nur Fadilah", "E41191188", "12345678"));
    }


}