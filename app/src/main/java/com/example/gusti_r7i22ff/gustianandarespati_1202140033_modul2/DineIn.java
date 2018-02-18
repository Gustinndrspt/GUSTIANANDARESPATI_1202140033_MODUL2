package com.example.gusti_r7i22ff.gustianandarespati_1202140033_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by gusti_r7i22ff on 17/02/2018.
 */

public class DineIn extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String mSpinnerlabel = "";
    public Spinner e;
    public Button g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dinein);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.labels_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); //untuk menambahkan string ke dalam spinner yang sudah dibuat
        if (e != null) {
            e.setAdapter(adapter);
        }

        addListenerOnButton();


    }



    public void addListenerOnButton() {
        e = (Spinner) findViewById(R.id.spinner);
        g = (Button) findViewById(R.id.button3);

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String meja = e.getSelectedItem().toString();

                if(meja.equalsIgnoreCase("meja 1")){
                    Toast.makeText(DineIn.this,"Meja 1", Toast.LENGTH_SHORT).show(); //menampilkan notifikasi ketika meja 1 terpilih
                } else if (meja.equalsIgnoreCase("meja 2")){
                    Toast.makeText(DineIn.this,"Meja 2", Toast.LENGTH_SHORT).show(); //menampilkan notifikasi ketika meja 2 terpilih
                }else if (meja.equalsIgnoreCase("meja 3")){
                    Toast.makeText(DineIn.this,"Meja 3", Toast.LENGTH_SHORT).show(); //menampilkan notifikasi ketika meja 3 terpilih
                }else if (meja.equalsIgnoreCase("meja 4")){
                    Toast.makeText(DineIn.this,"Meja 4", Toast.LENGTH_SHORT).show(); //menampilkan notifikasi ketika meja 4 terpilih
                }
                Intent t = new Intent(DineIn.this, ListMenu.class); //menghubungkan DineIn dengan ListMenu menggunakan intent
                startActivity(t);
            }

        });


    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        mSpinnerlabel = parent.getItemAtPosition(position).toString();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

