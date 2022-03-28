package com.example.traveluz.malumotlar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.traveluz.MainActivity;
import com.ingroup.traveluz.R;

public class History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
    }

    public void backToHome(View view) {
        onBackPressed();
    }

    public void watch(View view) {
        //https://www.youtube.com/watch?v=2FgM__jIekk
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=2FgM__jIekk"));
        startActivity(intent);
    }

    public void checkBoxClicked(View view) {
    }
}