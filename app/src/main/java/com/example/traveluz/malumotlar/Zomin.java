package com.example.traveluz.malumotlar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.traveluz.MainActivity;
import com.ingroup.traveluz.R;

public class Zomin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zomin);
    }

    public void backToHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void watch(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=aVcJZtGSUCc"));
        startActivity(intent);
    }

    public void checkBoxClicked(View view) {
    }

    public void booking(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.booking.com"));
        startActivity(intent);
    }

    public void yandex(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.taxi.yandex.uz"));
        startActivity(intent);
    }

    public void map(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/f3EdVjQ7NU67oQNFA"));
        startActivity(intent);
    }
}