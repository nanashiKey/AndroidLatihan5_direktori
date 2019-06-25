package com.ngopidev.project.androidlatihan5_direktori;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ngopidev.project.androidlatihan5_direktori.helpers.PrefsHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText etName = findViewById(R.id.etName);
        Button btnMasuk = findViewById(R.id.btnMasuk);

        final Bundle b = new Bundle();

        boolean statusInput = PrefsHelper.sharedInstance(getApplicationContext())
                .cekStatus();
        if(statusInput){
            startActivity(new Intent(MainActivity.this,
                    AfterClick.class));
            finish();
        }

        btnMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //hide dulu
//                b.putString("nama", etName.getText().toString());
                Intent i = new Intent(MainActivity.this,
                        AfterClick.class);
//                i.putExtras(b);
                PrefsHelper.sharedInstance(getApplicationContext()).setNama(
                        etName.getText().toString());
                PrefsHelper.sharedInstance(getApplicationContext())
                        .setStatusInput(true);
                startActivity(i);
                finish();
            }
        });
    }
}
