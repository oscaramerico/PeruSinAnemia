package com.example.lenovo.perusinanemia.dao;

import android.content.Context;

import com.example.asus.myapplication.beans.DietaBean;

import java.util.ArrayList;

/**
 * Created by ASUS on 14/10/2017.
 */

public interface DietaDAO {

    public void insertDieta(Context context, DietaBean dietaBean) ;
    public ArrayList<DietaBean> getAllDieta(Context context);
}
