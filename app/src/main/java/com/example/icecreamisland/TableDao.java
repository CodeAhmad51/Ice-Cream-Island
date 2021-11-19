package com.example.icecreamisland;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface TableDao {

    @Insert
    void insert(Table table);

    @Update
    void update(Table table);

    @Delete
    void Delete(Table table);

    @Query("DELETE FROM `Table`")
    void deleteAll();

    @Query("SELECT * FROM `Table` ORDER BY id")
    List<Table> getAllNotes();
}
