package com.example.shayri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

public class Shayriopen extends AppCompatActivity
{

    TextView textView;
    String shayri;
    String[]shayriarr;
    int k;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shayriopen);
        setContentView(R.layout.activity_shayriopen);
        textView=findViewById(R.id.Shayri_open_txt);
      k=getIntent().getIntExtra("pos",0);
      shayriarr=getIntent().getStringArrayExtra("shayri");
      textView.setText(shayriarr[k]);

    }
}