package com.ngopidev.project.androidlatihan5_direktori;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.ngopidev.project.androidlatihan5_direktori.helpers.PrefsHelper;


/**
 * created by Irfan Assidiq on 2019-05-22
 * email : assidiq.irfan@gmail.com
 **/
public class AfterClick extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afterclick);
        TextView tvNama = findViewById(R.id.tvNama);

            String x = PrefsHelper.sharedInstance(getApplicationContext()).getNama();
            tvNama.setText(x);

    }
}
