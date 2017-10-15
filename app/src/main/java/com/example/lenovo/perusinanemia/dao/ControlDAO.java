package com.example.lenovo.perusinanemia.dao;

import android.content.Context;

import com.example.asus.myapplication.beans.ControlBean;

import java.util.ArrayList;

/**
 * Created by ASUS on 14/10/2017.
 */

public interface ControlDAO {

    public void insertControl(Context context, ControlBean controlBean) ;
    public ArrayList<ControlBean> getAllControl(Context context);
}
