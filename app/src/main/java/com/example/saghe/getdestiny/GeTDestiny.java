package com.example.saghe.getdestiny;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GeTDestiny extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       //this.requestWindowFeature(Window.FEATURE_NO_TITLE);
       //getSupportActionBar().hide();
       // this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
              //  WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_getdestiny);


        onClick_signup_button();
        //onClick_signinas_button();
        onClick_location_buttons();
    }

    private void onClick_signinas_button(){

    }

    private void onClick_signup_button()
    {
        findViewById(R.id.signup_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GeTDestiny.this,Activity_sign_up.class));
            }
        });
    }
    private void onClick_location_buttons()
    {
        findViewById(R.id.skr_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GeTDestiny.this, Activity_skr_details.class));
            }
        });

        findViewById(R.id.khi_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GeTDestiny.this, Activity_khi_details.class));
            }
        });

        findViewById(R.id.isl_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GeTDestiny.this, Activity_isl_details.class));
            }
        });

        findViewById(R.id.lhr_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GeTDestiny.this, Activity_lhr_details.class));
            }
        });
/*
        findViewById(R.id.signin_admin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GeTDestiny.this, Activity_sign_in.class));
            }
        });

        findViewById(R.id.signin_general).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GeTDestiny.this, Activity_sign_in.class));
            }
        });

        findViewById(R.id.signin_guest).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GeTDestiny.this, Activity_Selection_guest.class));
            }
        });

        findViewById(R.id.signup_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GeTDestiny.this,Activity_sign_up.class));
            }
        });
        */
    }

}
