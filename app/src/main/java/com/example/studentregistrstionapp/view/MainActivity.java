package com.example.studentregistrstionapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.studentregistrstionapp.util.Communicator;
import com.example.studentregistrstionapp.R;

public class MainActivity extends AppCompatActivity implements Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.fcvFrag,new HomeFrag()).commit();
    }

    @Override
    public void callFragment(int type) {
        switch (type) {
            case 0:
                getSupportFragmentManager().beginTransaction().add(R.id.fcvFrag,new RegistrationFrag()).commit();
                break;
            case 1:
                getSupportFragmentManager().beginTransaction().add(R.id.fcvFrag,new StudentListFrag()).addToBackStack("null").commit();
                break;

        }
    }
}