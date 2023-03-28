package com.example.shayri;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Custom_Adapter2 extends BaseAdapter {
    MainActivity2 mainActivity2;
    int image;
    String[] type;
    ListView lv;
    ImageView img;
    TextView txt;

    public Custom_Adapter2(MainActivity2 mainActivity2, String[] lvshayri, int image) {
        this.mainActivity2 = mainActivity2;
        this.type=lvshayri;
        this.image=image;

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
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent)

    {
        view= LayoutInflater.from(mainActivity2).inflate(R.layout.s1,parent,false);
        txt=view.findViewById(R.id.s1_txt);
        img=view.findViewById(R.id.s1_img);
        txt.setText(""+type[i]);
        img.setImageResource(image);
         return view;
    }
}
