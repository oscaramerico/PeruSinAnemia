package com.example.lenovo.perusinanemia.dao;

import android.content.Context;

import com.example.lenovo.perusinanemia.beans.ApoderadoBean;

import java.util.ArrayList;

/**
 * Created by ASUS on 14/10/2017.
 */

public interface ApoderadoDAO {

    public void insertApoderado(Context context, ApoderadoBean apoderadoBean) ;
    public ArrayList<ApoderadoBean> getAllApoderado(Context context);
}
