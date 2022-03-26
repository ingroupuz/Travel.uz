package com.example.traveluz.malumotlar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.traveluz.MainActivity;
import com.ingroup.traveluz.R;

public class UzbHotel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uzb_hotel);
    }

    public void backToHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void checkBoxClicked(View view) {
    }

    public void booking(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.booking.com/city/uz/tashkent.ru.html?aid=319915;label=tashkent-LzvAOQKsTR*WO8gh3GwceQS390408494076:pl:ta:p115:p2:ac:ap:neg:fi:tikwd-156028790:lp1028523:li:dec:dm:ppccp=UmFuZG9tSVYkc2RlIyh9YdQLqCSGZAFDHKNAytkZCCU;ws=&gclid=CjwKCAjwrfCRBhAXEiwAnkmKmUUZEZ1EYBvwRM8NqcU4_0F2A7SPrmbRjGkMYJOv_cO5RHgCapb3nxoC22oQAvD_BwE"));
        startActivity(intent);
        // https://www.booking.com/city/uz/tashkent.ru.html?aid=319915;label=tashkent-LzvAOQKsTR*WO8gh3GwceQS390408494076:pl:ta:p115:p2:ac:ap:neg:fi:tikwd-156028790:lp1028523:li:dec:dm:ppccp=UmFuZG9tSVYkc2RlIyh9YdQLqCSGZAFDHKNAytkZCCU;ws=&gclid=CjwKCAjwrfCRBhAXEiwAnkmKmUUZEZ1EYBvwRM8NqcU4_0F2A7SPrmbRjGkMYJOv_cO5RHgCapb3nxoC22oQAvD_BwE
    }

    public void yandex(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.taxi.yandex.uz"));
        startActivity(intent);
    }

    public void watch(View view) {
        // https://www.youtube.com/watch?v=2iD3XOgeSio
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=2iD3XOgeSio"));
        startActivity(intent);
    }

    public void map(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/GRaM5pjcKn1PjZF28"));
        startActivity(intent);
    }
}