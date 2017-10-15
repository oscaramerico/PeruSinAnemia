package com.example.lenovo.perusinanemia.dao;

import android.content.Context;

import com.example.asus.myapplication.beans.NiñoBean;

import java.util.ArrayList;

/**
 * Created by ASUS on 14/10/2017.
 */

public interface NiñoDAO {

    public void insertNiño(Context context, NiñoBean niñoBean) ;
    public ArrayList<NiñoBean> getAllNiño(Context context);
}
