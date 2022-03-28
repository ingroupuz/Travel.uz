package com.example.traveluz.malumotlar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.traveluz.MainActivity;
import com.ingroup.traveluz.R;

public class Anhor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anhor);
    }

    public void backToHome(View view) {
        onBackPressed();
    }

    public void booking(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.booking.com"));
        startActivity(intent);
    }

    public void yandex(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.taxi.yandex.uz"));
        startActivity(intent);
    }

    public void watch(View view) {
        // https://www.youtube.com/watch?v=H2AlOGGUchQ
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=H2AlOGGUchQ"));
        startActivity(intent);
    }

    public void map(View view) {
        // https://goo.gl/maps/U8imHrVguF7esFb3A
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/U8imHrVguF7esFb3A"));
        startActivity(intent);
    }

    public void checkBoxClicked(View view) {
    }
}