package com.example.qing.first;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

public class FruitAdapter extends ArrayAdapter<Fruit> {
    private int resourceId;
    public FruitAdapter(Context context,int textViewResourceId,List<Fruit> objects){
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;
    }
}
