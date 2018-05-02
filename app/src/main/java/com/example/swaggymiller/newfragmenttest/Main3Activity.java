package com.example.swaggymiller.newfragmenttest;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.swaggymiller.newfragmenttest.Myfragment.MyFragment3;
import com.example.swaggymiller.newfragmenttest.Myfragment.MyFragment4;

public class Main3Activity extends AppCompatActivity {
    private Button bt;
    private boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        init();
        bt = findViewById(R.id.transferactivity_main3);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction beginTransacaion = fragmentManager.beginTransaction();
                if(flag){
                    MyFragment4 myFragment4 = new MyFragment4();
                    beginTransacaion.replace(R.id.layout,myFragment4);
                    flag = false;
                }else{
                    MyFragment3 myFragment3 = new MyFragment3();
                    beginTransacaion.replace(R.id.layout,myFragment3);
                    flag = true;
                }

                beginTransacaion.commit();
            }
        });
    }

    private void init() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        MyFragment3 myFragment3 = new MyFragment3();
        beginTransaction.add(R.id.layout,myFragment3);
        beginTransaction.commit();

    }
}
