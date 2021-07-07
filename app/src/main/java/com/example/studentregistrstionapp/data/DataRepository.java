package com.example.studentregistrstionapp.data;

import android.content.Context;

import androidx.lifecycle.LiveData;

import com.example.studentregistrstionapp.data.Student;
import com.example.studentregistrstionapp.data.local.AppDatabase;

import java.util.List;

public class DataRepository {
    private AppDatabase database;

    public DataRepository(Context applicationContext) {
        database = AppDatabase.getInstance(applicationContext);
    }

    public void insertStudent(Student student) {
        database.studentDao().insertStudentInfo(student);
    }

    public LiveData<List<Student>> getAll() {
        return database.studentDao().getAll();

    }
}
