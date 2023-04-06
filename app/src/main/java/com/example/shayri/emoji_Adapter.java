package com.example.shayri;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class emoji_Adapter extends BaseAdapter
{
    MainActivity3 mainActivity3;
    String[] colours;
    String type;

    public emoji_Adapter(MainActivity3 mainActivity3, String[] colours, String type) {
        this.mainActivity3=mainActivity3;
        this.colours=colours;
        this.type=type;
    }

    @Override
    public int getCount() {
        return colours.length;
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
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        view= LayoutInflater.from(mainActivity3).inflate(R.layout.grid_item_for_bottom,viewGroup,false);
        TextView textView = view.findViewById(R.id.item_for_bottom);
        if(type.equals("font")) {
            Typeface typeface = Typeface.createFromAsset(mainActivity3.getAssets(), Config.fonts[i]);
            textView.setText("padu");
            textView.setTypeface(typeface);
        }
        else {
            textView.setText(Config.emoji[i]);
        }
        return view;
    }
}
