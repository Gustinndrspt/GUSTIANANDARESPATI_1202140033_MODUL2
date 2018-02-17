package com.example.gusti_r7i22ff.gustianandarespati_1202140033_modul2;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    public RadioButton a, b;
    public Button c;
    public RadioGroup d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }


    public void addListenerOnButton() {
        d = (RadioGroup) findViewById(R.id.radioMenu);
        c = (Button) findViewById(R.id.button);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = d.getCheckedRadioButtonId();
                a = (RadioButton) findViewById(R.id.radioButton);
                b = (RadioButton) findViewById(R.id.radioButton2);
                if(selectedId == a.getId()) {                           //untuk memanggil id radio button yang pertama
                    Toast.makeText(MainActivity.this,              //memunculkan notifikasi toast
                            "Dine In", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, DineIn.class);
                    startActivity(intent);
                }else if(selectedId == b.getId()){                      //untuk memanggil id radio button yang kedua
                    Toast.makeText(MainActivity.this,               //memunculkan notifikasi toast
                            "Take Away", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, TakeAway.class);
                    startActivity(intent);
                }
            }
        });





        }

            }











