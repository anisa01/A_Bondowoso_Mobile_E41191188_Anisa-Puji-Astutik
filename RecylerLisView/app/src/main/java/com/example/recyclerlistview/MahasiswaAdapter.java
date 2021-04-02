package com.example.recyclerlistview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder> {

   private ArrayList<Mahasiswa> datalist;

    public MahasiswaAdapter(ArrayList<Mahasiswa> mDataMahasiswa){
        this.datalist = mDataMahasiswa;
    }


    @NonNull
    @Override
    public MahasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         LayoutInflater LayoutInflater = android.view.LayoutInflater.from(parent.getContext());
         View view = LayoutInflater.inflate(R.layout.list_item, parent , false);
         return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaViewHolder holder, int position) {
        holder.txNama.setText(datalist.get(position).getNama());
        holder.txNim.setText(datalist.get(position).getNim());
        holder.txNoHp.setText(datalist.get(position).getNoHp());
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder {
        private TextView txNama, txNim, txNoHp;

        public MahasiswaViewHolder(@NonNull View itemView) {
            super(itemView);
            txNama = itemView. findViewById(R.id.tx_nama_mahasiswa);
            txNim = itemView. findViewById(R.id.tx_npm_mahasiswa);
            txNoHp = itemView. findViewById(R.id.tx_noHp_mahasiswa);
        }
    }
}
