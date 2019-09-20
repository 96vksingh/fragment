package com.example.dhamaka;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageButton b1,b2,b3,b4;
    FrameLayout t1;
    static int imgsel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(ImageButton) findViewById(R.id.imageButton);
        b2=(ImageButton) findViewById(R.id.imageButton2);
        b3=(ImageButton) findViewById(R.id.imageButton3);
        b4=(ImageButton) findViewById(R.id.imageButton4);
        t1=(FrameLayout) findViewById(R.id.fragment_container);
        listener();
    }
    public void  listener()
    {
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgsel=1;
                FragmentTransaction f1 = getSupportFragmentManager().beginTransaction();
                Fragment1 ff= new Fragment1();
                f1.replace(R.id.fragment_container,ff);
                f1.addToBackStack(null);
                f1.commit();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgsel=2;
                FragmentTransaction f1 = getSupportFragmentManager().beginTransaction();
                Fragment1 ff= new Fragment1();
                f1.replace(R.id.fragment_container,ff);
                f1.addToBackStack(null);
                f1.commit();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgsel=3;
                FragmentTransaction f1 = getSupportFragmentManager().beginTransaction();
                Fragment1 ff= new Fragment1();
                f1.replace(R.id.fragment_container,ff);
                f1.addToBackStack(null);
                f1.commit();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgsel=4;
                FragmentTransaction f1 = getSupportFragmentManager().beginTransaction();
                Fragment1 ff= new Fragment1();
                f1.replace(R.id.fragment_container,ff);
                f1.addToBackStack(null);
                f1.commit();
            }
        });
    }

    public void onBackPressed() {
        if (getFragmentManager().getBackStackEntryCount() > 0) {
            getFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
    }
}
