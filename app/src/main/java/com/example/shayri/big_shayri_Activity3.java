package com.example.shayri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class big_shayri_Activity3 extends AppCompatActivity implements View.OnClickListener
{
    String shayri="kdk";
    Button pre,next;
    TextView txtcounter;
    ImageButton ibtntheme,theme_changer,edit;
    TextView shayri_text;
    GridView gridView;
    ArrayList<String> temp= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big_shayri3);
        pre = findViewById(R.id.pre);
        next = findViewById(R.id.next);
        txtcounter = findViewById(R.id.txtcounter);
        ibtntheme = findViewById(R.id.ibtntheme);
        theme_changer = findViewById(R.id.ibtnchange_theme);
        edit = findViewById(R.id.ibtnedit);
        pre.setOnClickListener(this);
        next.setOnClickListener(this);
        ibtntheme.setOnClickListener(this);
        theme_changer.setOnClickListener(this);
        edit.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

    }
}