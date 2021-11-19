package com.example.icecreamisland;

import android.content.Context;

public class ServiceTable {

    TableDataBase dataBase;
    Context context;

    ServiceTable(Context context){
        dataBase = TableDataBase.getInstance(context);
        this.context = context;
    }

    public void inserTable(Context context){

    }


}
