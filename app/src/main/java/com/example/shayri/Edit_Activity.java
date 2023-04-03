package com.example.shayri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class Edit_Activity extends AppCompatActivity implements View.OnClickListener
{
    TextView eshayri;
    Button bg,txtcolor,font,txtsize,shareimage,emoji;
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        String string = getIntent().getStringExtra("shayri");
        eshayri.setText(string);
        eshayri=findViewById(R.id.edit_shayri);

        //buttons
        bg=findViewById(R.id.edit_back);
        txtcolor=findViewById(R.id.edit_color);
        font=findViewById(R.id.edit_font);
        txtsize= findViewById(R.id.edit_textsize);
        emoji= findViewById(R.id.edit_emoji);
        shareimage=findViewById(R.id.edit_share);

        //buttons on click listners
        bg.setOnClickListener(this);
        txtcolor.setOnClickListener(this);
        txtsize.setOnClickListener(this);
        shareimage.setOnClickListener(this);
        emoji.setOnClickListener(this);
        font.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if (view.getId() == bg.getId());
        {
            BottomSheetDialog dialog = new BottomSheetDialog(Edit_Activity.this);
            dialog.setContentView(R.layout.gridview_for_shayri);
            grid_adpter_for_themes adpter = new grid_adpter_for_themes(Edit_Activity.this,themes.themesop);
            gridView=dialog.findViewById(R.id.item_for_grid);
            gridView.setAdapter(adpter);
            dialog.show();
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    eshayri.setBackgroundResource(themes.themesop[i]);
                }
            });

        }
        if(view.getId()==txtcolor.getId()){
            BottomSheetDialog dialog = new BottomSheetDialog(Edit_Activity.this);
            dialog.setContentView(R.layout.gridview_for_shayri);
            grid_adpter_for_themes adpter = new grid_adpter_for_themes(Edit_Activity.this,themes.colors);
            gridView=dialog.findViewById(R.id.item_for_grid);
            gridView.setAdapter(adpter);
            dialog.show();
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    eshayri.setTextColor(getResources().getColor(themes.colors[i]));
                }
            });

        }
        if(view.getId()==emoji.getId()){
            BottomSheetDialog dialog= new BottomSheetDialog(Edit_Activity.this);
            dialog.setContentView(R.layout.gridview_for_shayri);
            gridView=dialog.findViewById(R.id.item_for_grid);
            emoji_adapter adpter = new emoji_adapter(Edit_Activity.this,themes.emoji);
            gridView.setAdapter(adpter);
            dialog.show();
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String string = null;
                    eshayri.setText(""+themes.emoji[i]+"\n"+string+"\n"+themes.emoji[i]);
                }
            });
        }
        if(view.getId()==font.getId()){
            BottomSheetDialog dialog= new BottomSheetDialog(Edit_Activity.this);
            dialog.setContentView(R.layout.gridview_for_shayri);
            gridView=dialog.findViewById(R.id.item_for_grid);
            emoji_adapter adpter = new emoji_adapter(Edit_Activity.this,themes.emoji);
            gridView.setAdapter(adpter);
            dialog.show();
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String string = null;
                    eshayri.setText(""+themes.emoji[i]+"\n"+string+"\n"+themes.emoji[i]);
                }
            });
        }

    }
}