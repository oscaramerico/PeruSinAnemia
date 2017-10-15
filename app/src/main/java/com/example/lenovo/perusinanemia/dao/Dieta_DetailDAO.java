package com.example.lenovo.perusinanemia.dao;

import android.content.Context;

import com.example.asus.myapplication.beans.Dieta_DetailBean;

import java.util.ArrayList;

/**
 * Created by ASUS on 14/10/2017.
 */

public interface Dieta_DetailDAO {

    public void insertDietDetail(Context context, Dieta_DetailBean dieta_detailBean) ;
    public ArrayList<Dieta_DetailBean> getAllDietaDetail(Context context);
}
