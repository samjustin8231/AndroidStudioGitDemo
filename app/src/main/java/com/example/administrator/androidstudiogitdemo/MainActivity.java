package com.example.administrator.androidstudiogitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 两个整数相加
     * @param num1 加数1
     * @param num2 加数2
     * @return 和
     */
    public int addNums(int num1,int num2){
        return num1+num2;
    }

    public int subNums(int num1,int num2){
        return num1-num2;
    }

    public int devideNums(int num1,int num2){
        return num1/num2;
    }

    public int munNums(int num1,int num2){
        return num1*num2;
    }
}
