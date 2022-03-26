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
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.traveluz.malumotlar.Registon;
import com.example.traveluz.malumotlar.UzbTMuzey;
import com.ingroup.traveluz.R;

public class MuseumD extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.museum_hmr, container, false);
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

        LinearLayout linearLayout = view.findViewById(R.id.uzbmuseum);
        linearLayout.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), UzbTMuzey.class);
            startActivity(intent);
        });

        return view;
    }
}