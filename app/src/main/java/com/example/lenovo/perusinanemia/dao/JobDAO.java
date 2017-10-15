package com.example.lenovo.perusinanemia.dao;

import android.content.Context;

import com.example.asus.myapplication.beans.JobBean;

import java.util.ArrayList;

/**
 * Created by ASUS on 14/10/2017.
 */

public interface JobDAO {

    public void insertJob(Context context, JobBean jobBean) ;
    public ArrayList<JobBean> getAllJob(Context context);
}
