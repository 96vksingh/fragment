package com.example.dhamaka;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Fragment1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.activity_fragment1,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        ImageView i=(ImageView)getView().findViewById(R.id.imageView);
        if(MainActivity.imgsel==1)
        {
            i.setImageResource(R.drawable.random);
        }
        else if(MainActivity.imgsel==2)
        {
            i.setImageResource(R.drawable.download);
        }
        else if(MainActivity.imgsel==3)
        {
            i.setImageResource(R.drawable.download11);
        }
        else
        {
            i.setImageResource(R.drawable.download22);
        }
    }
}
