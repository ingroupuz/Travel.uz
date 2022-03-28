package com.example.traveluz.malumotlar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.traveluz.MainActivity;
import com.ingroup.traveluz.R;

public class FrescoCafe extends AppCompatActivity {

    TextView telNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fresco_cafe);

        telNumber=findViewById(R.id.fresco_tel);

        telNumber.setOnClickListener(view ->{
            ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("Fresco cafe phone number", "+998 90 224 55 55");
            Toast.makeText(this, "Copied!", Toast.LENGTH_SHORT).show();
        });

    }

    public void backToHome(View view) {
        onBackPressed();
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
        // https://goo.gl/maps/EcpRwYHZe2quqdvLA
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/EcpRwYHZe2quqdvLA"));
        startActivity(intent);
    }
}