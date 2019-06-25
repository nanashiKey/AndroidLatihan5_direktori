package com.ngopidev.project.androidlatihan5_direktori.helpers;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * created by Irfan Assidiq on 2019-05-22
 * email : assidiq.irfan@gmail.com
 **/
public class PrefsHelper {
    SharedPreferences prefs;
    Context ctx;

    private static PrefsHelper instance;
    public static PrefsHelper sharedInstance(Context ctx){
        if(instance == null){
            instance = new PrefsHelper(ctx);
        }
        return  instance;
    }
    private PrefsHelper(Context ctx){
        this.ctx = ctx;
        this.prefs = ctx.getSharedPreferences("LATIHAN", Context.MODE_PRIVATE);
    }
    //ini untuk simpan status input nama
    public void setStatusInput(boolean status){
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("STATUS", status);
        editor.apply();
    }
    public boolean cekStatus(){return prefs.getBoolean("STATUS", false);}

    //ini untuk menyimpan nilai dari nama yang diinputkan
    public void setNama(String nama){
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("NAMA", nama);
        editor.apply();
    }
    public String getNama(){return prefs.getString("NAMA", "TIDAK ADA");}
}
