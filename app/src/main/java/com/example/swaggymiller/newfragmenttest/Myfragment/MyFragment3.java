package com.example.swaggymiller.newfragmenttest.Myfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.swaggymiller.newfragmenttest.R;

public class MyFragment3 extends Fragment {
    private TextView textView;
    private Button bt;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //将layout布局文件转换成view对象
        //res:所需要加载的布局文件
        //root:加载layout的父组件
        //attachToRoot:是否返回父组件
        //返回view值
        View view = inflater.inflate(R.layout.fragment,container,false);
        TextView tv = view.findViewById(R.id.fragment_textView);
        tv.setText("It's Fragment3");
        tv.setAllCaps(true);
        bt = view.findViewById(R.id.fragment_change);
        bt.setVisibility(view.INVISIBLE);
        return view;
    }

}
