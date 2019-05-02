package com.example.recyclercontoh;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.VieHolder> {
    private Context context;
    private List<kumpulandata> data;

    public adapter(Context context, List<kumpulandata> data) {
        this.context = context;
        this.data = data;
    }

    public class VieHolder extends RecyclerView.ViewHolder {
        TextView nama,isi;
        public VieHolder(@NonNull View itemView) {
            super(itemView);
            nama= (TextView)itemView.findViewById(R.id.nama);
            isi= (TextView)itemView.findViewById(R.id.isi);
        }
    }
    @NonNull
    @Override
    public VieHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_print, parent, false);
        VieHolder viewHolder = new VieHolder(v);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull VieHolder vieHolder, int position) {

        kumpulandata  pu = data.get(position);

        vieHolder.nama.setText(pu.getNama());
        vieHolder.isi.setText(pu.getIsi());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }


}
