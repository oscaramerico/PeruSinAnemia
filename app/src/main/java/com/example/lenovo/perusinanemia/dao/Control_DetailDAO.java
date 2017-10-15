package com.example.lenovo.perusinanemia.dao;

import android.content.Context;

import com.example.asus.myapplication.beans.Control_DetailBean;

import java.util.ArrayList;

/**
 * Created by ASUS on 14/10/2017.
 */

public interface Control_DetailDAO {

    public void insertControlDetail(Context context, Control_DetailBean control_detailBean) ;
    public ArrayList<Control_DetailBean> getAllControlDetail(Context context);
}
