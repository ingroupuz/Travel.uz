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

import com.example.traveluz.MainActivity;
import com.example.traveluz.SearchF;
import com.example.traveluz.malumotlar.Anhor;
import com.example.traveluz.malumotlar.FrescoCafe;
import com.example.traveluz.malumotlar.History;
import com.example.traveluz.malumotlar.MilliyBog;
import com.example.traveluz.malumotlar.Registon;
import com.example.traveluz.malumotlar.Tashkent;
import com.example.traveluz.malumotlar.UzbHotel;
import com.example.traveluz.malumotlar.UzbTMuzey;
import com.example.traveluz.malumotlar.Zomin;
import com.ingroup.traveluz.R;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
    private ArrayList<Model> modelArrayList;
    private Context context;
    Context context2;

    public Adapter(ArrayList<Model> modelArrayList, Context context) {
        this.modelArrayList = modelArrayList;
        this.context = context;
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
        holder.name.setText(model.getJoyNomi());
        holder.image.setImageResource(model.getJoyRasmi());

        context2=holder.itemView.getContext();
        final Intent intent;
        switch (modelArrayList.get(position)){
            case 0:
                intent =  new Intent(context2, Anhor.class);
                break;

            case 1:
                intent =  new Intent(context2, FrescoCafe.class);
                break;

            case 2:
                intent =  new Intent(context2, History.class);
                break;

            case 3:
                intent =  new Intent(context2, MilliyBog.class);
                break;


            case 4:
                intent =  new Intent(context2, Registon.class);
                break;


            case 5:
                intent =  new Intent(context2, Tashkent.class);
                break;


            case 6:
                intent =  new Intent(context2, UzbHotel.class);
                break;


            case 7:
                intent =  new Intent(context2, UzbTMuzey.class);
                break;


            case 8:
                intent =  new Intent(context2, Zomin.class);
                break;

            default:
                intent =  new Intent(context2, SearchF.class);
                break;
        }

        context.startActivity(intent);
    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name;
        private ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.txt_search);
            image = itemView.findViewById(R.id.img_search);
        }
    }
}
