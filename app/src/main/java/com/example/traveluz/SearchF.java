package com.example.traveluz;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import androidx.appcompat.widget.SearchView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.traveluz.malumotlar.Anhor;
import com.example.traveluz.malumotlar.FrescoCafe;
import com.example.traveluz.malumotlar.History;
import com.example.traveluz.malumotlar.MilliyBog;
import com.example.traveluz.malumotlar.Registon;
import com.example.traveluz.malumotlar.Tashkent;
import com.example.traveluz.malumotlar.UzbHotel;
import com.example.traveluz.malumotlar.UzbTMuzey;
import com.example.traveluz.malumotlar.Zomin;
import com.example.traveluz.search.Adapter;
import com.example.traveluz.search.Model;
import com.ingroup.traveluz.R;

import java.util.ArrayList;

public class SearchF extends Fragment {
    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<Model> modelArrayList;
    SearchView searchView;
    private Context context;




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.f_search, container, false);

        searchView = view.findViewById(R.id.searchv);
        recyclerView = view.findViewById(R.id.recyclerviewforsearch);
        setData();
        setAdapter();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filter(newText);
                return false;
            }
        });

        return view;
    }

    private void filter(String text) {
        ArrayList<Model> filteredlist = new ArrayList<>();

        for (Model item : modelArrayList) {
            if (item.getJoyNomi().toLowerCase().contains(text.toLowerCase())) {
                filteredlist.add(item);
            }
        }
        if (filteredlist.isEmpty()) {
           // Toast.makeText(getActivity(), "No Data Found..", Toast.LENGTH_SHORT).show();
        } else {
            adapter.filterList(filteredlist);
        }
    }

    private void setAdapter(){
        adapter = new Adapter(modelArrayList, getActivity());
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    private void setData(){
        modelArrayList = new ArrayList<>();
        modelArrayList.add(new Model("Anhor Lokomotiv Park", R.drawable.anhor, Anhor.class));
        modelArrayList.add(new Model("Fresco Cafe", R.drawable.fresco, FrescoCafe.class));
        modelArrayList.add(new Model("History of Uzbekistan", R.drawable.history, History.class));
        modelArrayList.add(new Model("National Park of Uzbekistan", R.drawable.milliybog, MilliyBog.class));
        modelArrayList.add(new Model("Registan, Samarkand", R.drawable.registon, Registon.class));
        modelArrayList.add(new Model("Tashkent", R.drawable.tashkent, Tashkent.class));
        modelArrayList.add(new Model("Uzbekistan hotel", R.drawable.uzbhotel, UzbHotel.class));
        modelArrayList.add(new Model("State museum of the history of Uzbekistan", R.drawable.uzbmuseum, UzbTMuzey.class));
        modelArrayList.add(new Model("Zaamin sanatorium", R.drawable.zomin, Zomin.class));
    }
}