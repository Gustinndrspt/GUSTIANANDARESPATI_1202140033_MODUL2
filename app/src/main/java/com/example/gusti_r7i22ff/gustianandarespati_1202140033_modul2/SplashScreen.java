package com.example.gusti_r7i22ff.gustianandarespati_1202140033_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

/**
 * Created by gusti_r7i22ff on 16/02/2018.
 */

public class SplashScreen extends AppCompatActivity {
    private static int splashInterval = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            // Handler menjadwalkan pesan atau Runnable untuk dieksekusi
            //Runnable merupakan bagian yang akan di eksekusi


            @Override
            public void run() {

                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i); // menghubungkan activity splashscreen ke main activity dengan intent

                Toast.makeText(SplashScreen.this,"GUSTIANANDARESPATI_1202140033",Toast.LENGTH_LONG).show();

                //jeda selesai Splashscreen
                this.finish();
            }

            private void finish() {


            }
        }, splashInterval);

    }
}

