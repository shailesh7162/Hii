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
    int s;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shayriopen);
        setContentView(R.layout.activity_shayriopen);
        textView=findViewById(R.id.Shayri_open_txt);
        s=getIntent().getIntExtra("pos",0);
        shayriarr=getIntent().getStringArrayExtra("shayri");
        shayri=getIntent().getStringExtra("shayri");
        textView.setText(""+shayri);

    }
}