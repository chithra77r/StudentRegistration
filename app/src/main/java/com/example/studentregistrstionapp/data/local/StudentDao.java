package com.example.studentregistrstionapp.data.local;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.studentregistrstionapp.data.Student;

import java.util.List;

@Dao
public interface StudentDao {

    @Query("select * from student")
    LiveData<List<Student>> getAll();

    @Insert
    void insertStudentInfo(Student student);

}
