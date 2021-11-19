package com.example.icecreamisland;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Table {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String name;
    private String password;

    public Table(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
