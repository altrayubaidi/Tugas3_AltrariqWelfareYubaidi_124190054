package com.example.influentialpeople;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.ViewHolder> {
    private Context context;
    private ArrayList<PeopleModel> peopleModels;

    public PeopleAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<PeopleModel> getPeopleModels() {
        return peopleModels;
    }

    public void setPeopleModels(ArrayList<PeopleModel> peopleModels) {
        this.peopleModels = peopleModels;
    }

    @NonNull
    @Override
    public PeopleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_people,viewGroup,false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull PeopleAdapter.ViewHolder viewHolder, int i) {
        Glide.with(context).load(getPeopleModels().get(i).getPersonPhoto()).into (viewHolder.ivPersonPhoto);
        viewHolder.tvPersonName.setText(getPeopleModels().get(i).getPersonName());
    }

    @Override
    public int getItemCount() {
        return getPeopleModels().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {private ImageView ivPersonPhoto;
        private TextView tvPersonName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivPersonPhoto = itemView.findViewById(R.id.cetak_gambar);
            tvPersonName = itemView.findViewById(R.id.cetak_text);
        }
    }
}
