package com.example.traveluz;

import android.app.Dialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ingroup.traveluz.R;

public class HomeF extends Fragment {
    @Nullable
    BottomNavigationView bottomNavigationView, bottomNavigationView2, bottomNavigationView3;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.f_home, container, false);


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
//            button.setOnClickListener(v -> getActivity().recreate());
//            dialog.show();
//        }

        bottomNavigationView=view.findViewById(R.id.bottom_cmh);

        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.city:
                    getChildFragmentManager().beginTransaction().replace(R.id.frame_cmh, new CityD()).commit();
                    break;

                case R.id.monument:
                    getChildFragmentManager().beginTransaction().replace(R.id.frame_cmh, new MonumentD()).commit();
                    break;

                case R.id.history:
                    getChildFragmentManager().beginTransaction().replace(R.id.frame_cmh, new HistoryD()).commit();
                    break;
            }
            return true;
        });










        bottomNavigationView2=view.findViewById(R.id.bottom_hmr);
        bottomNavigationView2.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.hotel:
                    getChildFragmentManager().beginTransaction().replace(R.id.frame_hmr, new HotelD()).commit();
                    break;

                case R.id.museum:
                    getChildFragmentManager().beginTransaction().replace(R.id.frame_hmr, new MuseumD()).commit();
                    break;

                case R.id.area:
                    getChildFragmentManager().beginTransaction().replace(R.id.frame_hmr, new AreaD()).commit();
                    break;
            }
            return true;
        });











        bottomNavigationView3=view.findViewById(R.id.bottom_pcg);
        bottomNavigationView3.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.park:
                    getChildFragmentManager().beginTransaction().replace(R.id.frame_pcg, new ParkD()).commit();
                    break;

                case R.id.cafe:
                    getChildFragmentManager().beginTransaction().replace(R.id.frame_pcg, new CafeD()).commit();
                    break;

                case R.id.garden:
                    getChildFragmentManager().beginTransaction().replace(R.id.frame_pcg, new GardenD()).commit();
                    break;
            }
            return true;
        });


        return view;
    }
}