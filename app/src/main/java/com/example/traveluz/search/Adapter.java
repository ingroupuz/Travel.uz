package com.example.traveluz.search;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ingroup.traveluz.R;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
    private ArrayList<Model> modelArrayList;
    private Context context;

    public Adapter(ArrayList<Model> modelArrayList, Context context) {
        this.modelArrayList = modelArrayList;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView name;
        private ImageView image;

        public ViewHolder(final View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.txt_search);
            image = itemView.findViewById(R.id.img_search);
        }

        public void bind(Model model){
            name.setText(model.getJoyNomi());
            image.setImageResource(model.getJoyRasmi());
            itemView.setOnClickListener(v -> {
                Context context = itemView.getContext();
                Intent intent = new Intent(context, model.getLaunchClass());
                context.startActivity(intent);
            });
        }
    }

    public void filterList(ArrayList<Model> filterllist) {
        modelArrayList = filterllist;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_for_search, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        Model model = modelArrayList.get(position);
        holder.bind(model);
    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }
}
