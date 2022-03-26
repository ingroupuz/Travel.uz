package com.example.traveluz;

import android.app.Dialog;
import android.content.Context;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.traveluz.search.Adapter;
import com.example.traveluz.search.Model;
import com.ingroup.traveluz.R;

import java.util.ArrayList;

public class SearchF extends Fragment {
    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<Model> modelArrayList;
    SearchView searchView;




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.f_search, container, false);


        //        ConnectivityManager connectivityManager = (ConnectivityManager) getContext().getSystemService(Context.CONNECTIVITY_SERVICE);
//        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
//        if (networkInfo == null || !networkInfo.isConnected() || !networkInfo.isAvailable()){
//            Dialog dialog = new Dialog(getActivity());
//            dialog.setContentView(R.layout.nointernet);
//            dialog.setCancelable(false);
//            dialog.getWindow().setLayout(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
//            dialog.getWindow().getAttributes().windowAnimations= android.R.style.Animation_Dialog;
//
//            Button button=dialog.findViewById(R.id.retry);
//            button.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    getActivity().recreate();
//                }
//            });
//            dialog.show();
//        }


        recyclerView = view.findViewById(R.id.recyclerviewforsearch);
        buildRecyclerView();

        searchView = view.findViewById(R.id.searchv);
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
            Toast.makeText(getActivity(), "No Data Found..", Toast.LENGTH_SHORT).show();
        } else {
            adapter.filterList(filteredlist);
        }
    }

    private void buildRecyclerView() {

        modelArrayList = new ArrayList<>();

        modelArrayList.add(new Model("Anhor Lokomotiv Park", R.drawable.anhor));
        modelArrayList.add(new Model("Fresco Cafe", R.drawable.fresco));
        modelArrayList.add(new Model("History of Uzbekistan", R.drawable.history));
        modelArrayList.add(new Model("National Park of Uzbekistan", R.drawable.milliybog));
        modelArrayList.add(new Model("Registan, Samarkand", R.drawable.registon));
        modelArrayList.add(new Model("Tashkent", R.drawable.tashkent));
        modelArrayList.add(new Model("Uzbekistan hotel", R.drawable.uzbhotel));
        modelArrayList.add(new Model("State museum of the history of Uzbekistan", R.drawable.uzbmuseum));
        modelArrayList.add(new Model("Zaamin sanatorium", R.drawable.zomin));

        adapter = new Adapter(modelArrayList, getActivity());

        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(manager);

        recyclerView.setAdapter(adapter);
    }

}