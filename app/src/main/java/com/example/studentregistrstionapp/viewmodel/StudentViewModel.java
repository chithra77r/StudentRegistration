package com.example.studentregistrstionapp.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.studentregistrstionapp.data.DataRepository;
import com.example.studentregistrstionapp.data.Student;

import java.util.List;

public class StudentViewModel extends AndroidViewModel {
    public Student student;

    private DataRepository dataRepository;

    {
        student = new Student(); //0x100
        dataRepository = new DataRepository(getApplication().getApplicationContext());
    }

    public StudentViewModel(@NonNull Application application) {
        super(application);
    }

    public void insertStudent() {
        dataRepository.insertStudent(student);
    }

    public LiveData<List<Student>> getAll() {

       return dataRepository.getAll();

    }

}
