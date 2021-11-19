package com.example.icecreamisland;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = Table.class,version = 1)
public abstract class TableDataBase extends RoomDatabase {

    private static TableDataBase instance;
    public abstract TableDao dao();

    public static synchronized TableDataBase getInstance(Context context){
        if(instance == null){
        instance = Room.databaseBuilder(context.getApplicationContext(),TableDataBase.class,"table")
                .fallbackToDestructiveMigration().build();
        }
        return instance;
    }


}
