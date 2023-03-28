package com.example.shayri;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class  Custom_Adapter extends BaseAdapter {
    MainActivity mainActivity;
    int[] image;
    String[] type;
    ListView lv;
    ImageView img;
    TextView txt;

    public Custom_Adapter(MainActivity mainActivity, String[] type, int[] image) {
        this.mainActivity=mainActivity;
        this.image=image;
        this.type=type;
    }

    @Override
    public int getCount() {
        return type.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view= LayoutInflater.from(mainActivity).inflate(R.layout.s1,parent,false);
        img=view.findViewById(R.id.s1_img);
        txt=view.findViewById(R.id.s1_txt);
        img.setImageResource(image[position]);
        txt.setText(type[position]);
        return view;
    }
}
