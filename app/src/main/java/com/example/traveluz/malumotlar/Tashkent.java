package com.example.traveluz.malumotlar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;

import com.example.traveluz.MainActivity;
import com.ingroup.traveluz.R;

public class Tashkent extends AppCompatActivity {

    CheckBox like;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tashkent);

        like=findViewById(R.id.like_chb_tashkent);

    }

    public void watch(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=I92NxgeEoJk"));
        startActivity(intent);
    }

    public void booking(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.booking.com"));
        startActivity(intent);
    }

    public void yandex(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.taxi.yandex.uz"));
        startActivity(intent);
    }

    public void checkBoxClicked(View view){
        if (like.isChecked()){
        }
    }

    public void backToHome(View view) {
        onBackPressed();
    }
}