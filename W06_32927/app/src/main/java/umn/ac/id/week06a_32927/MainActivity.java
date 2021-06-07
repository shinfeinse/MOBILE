package umn.ac.id.week06a_32927;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import umn.ac.id.week06a_32927.TDrawableActivity;
import umn.ac.id.week06a_32927.TFisikaActivity;
import umn.ac.id.week06a_32927.TPropertyActivity;

public class MainActivity extends AppCompatActivity {
    Button btnTutorialProperty, btnTutorialDrawable, btnTutorialFisika;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setTitle("Week06_29656 (Tutorial Animasi)");

        btnTutorialProperty = findViewById(R.id.btnTutorialProperty);
        btnTutorialDrawable = findViewById(R.id.btnTutorialDrawable);
        btnTutorialFisika = findViewById(R.id.btnTutorialFisika);

        btnTutorialProperty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TPropertyActivity.class));
            }
        });

        btnTutorialDrawable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TDrawableActivity.class));
            }
        });

        btnTutorialFisika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TFisikaActivity.class));
            }
        });
    }
}