package com.nazareth.Activites;

import android.content.Intent;
import android.os.Bundle;

import com.nazareth.R;

import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread timer=new Thread(  )
        {
            @Override
            public void run() {
                super.run();
                try {
                    sleep( 3000 );

                }catch (InterruptedException e)
                {
                    e.printStackTrace();
                }finally {

                    Intent intent = new Intent(Splash.this, Navigation.class);
                    startActivity(intent);
                    finish();
                }
            }
        };

        timer.start();

    }
}
