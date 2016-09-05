package com.example.faustocheca.myfragmentminif;

import android.content.Context;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (R.id.frame_layout_container != 0){
            if (savedInstanceState !=null){
                return;
            }

        }





    FragmentOne fragmentOne = new FragmentOne();
        FragmentTwo fragmentTwo = new FragmentTwo();

        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction();
        fragmentTransaction.add(R.id.frame_layout_container,fragmentOne,"Tag1");
        fragmentTransaction.add(R.id.frame_layout_container,fragmentTwo,"Tag2");
        fragmentTransaction.commit();





    }


}
