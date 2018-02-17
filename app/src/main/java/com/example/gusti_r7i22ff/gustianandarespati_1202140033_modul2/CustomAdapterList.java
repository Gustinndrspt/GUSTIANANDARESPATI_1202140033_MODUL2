package com.example.gusti_r7i22ff.gustianandarespati_1202140033_modul2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapterList extends BaseAdapter {
    Context context;
    String nama2[];
    LayoutInflater inflter;

    public CustomAdapterList(Context applicationContext, String[] nama) {
        this.context = context;
        this.nama2 = nama;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return nama2.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.dinein, null);
        TextView nm = (TextView) view.findViewById(R.id.textView);
        nm.setText(nama2[i]);
        return view;
    }
}



