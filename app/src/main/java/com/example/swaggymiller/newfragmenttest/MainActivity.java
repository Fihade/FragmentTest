package com.example.swaggymiller.newfragmenttest;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.swaggymiller.newfragmenttest.Myfragment.MyFragment2;
import com.example.swaggymiller.newfragmenttest.Myfragment.MyFragment3;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{
    private RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = findViewById(R.id.radiogroup);
        radioGroup.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();


        switch (checkedId){
            case R.id.first:{
                RadioButton rb1 = findViewById(R.id.first);
                rb1.setBackgroundColor(getColor(R.color.radiobutton1clicked));
                Intent intent = new Intent(this,Main2Activity.class);
                startActivity(intent);
                break;
            }
            case R.id.second:{
                MyFragment2 fragment2 = new MyFragment2();
//                FragmentManager fragmentManager2 = getFragmentManager();
//                FragmentTransaction beginTransaction = fragmentManager2.beginTransaction();
                beginTransaction.add(R.id.activity_main_frame,fragment2);
                beginTransaction.addToBackStack(null);
                beginTransaction.commit();
                break;

            }
            case R.id.third:{
                Intent intent = new Intent(this,Main3Activity.class);
                startActivity(intent);
//                MyFragment3 fragment3 = new MyFragment3();
//                beginTransaction.add(R.id.activity_main_frame,fragment3);
//                beginTransaction.commit();
                break;
            }
            case R.id.fourth:{

            }
        }
    }
}
