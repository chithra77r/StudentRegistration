package com.example.studentregistrstionapp.data.local;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.studentregistrstionapp.data.Student;


@Database(entities = {Student.class}, version = 1)

public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase database;
    public abstract StudentDao studentDao();

    public static AppDatabase getInstance(Context context) {
        if (database == null) {
            database = Room.databaseBuilder(context,
                    AppDatabase.class, "database-name")
                    .allowMainThreadQueries()
                    .build();
            return database;
        }
        return database;
    }

}
