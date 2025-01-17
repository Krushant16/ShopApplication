package com.example.shopapplication;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Product.class}, version = 1)
abstract class AppDatabase extends RoomDatabase {

    public abstract ProductDao productDao();

}
