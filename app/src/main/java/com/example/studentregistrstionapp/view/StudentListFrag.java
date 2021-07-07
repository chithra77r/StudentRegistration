package com.example.studentregistrstionapp.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.studentregistrstionapp.R;
import com.example.studentregistrstionapp.viewmodel.StudentViewModel;
import com.example.studentregistrstionapp.data.Student;
import com.example.studentregistrstionapp.databinding.FragListStudentBinding;

import java.util.ArrayList;
import java.util.List;

public class StudentListFrag extends Fragment {
    private MyAdapter adapter;
    private StudentViewModel viewModel;
    private FragListStudentBinding fragListStudentBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragListStudentBinding = DataBindingUtil.inflate(inflater, R.layout.frag_list_student, container, false);
        return fragListStudentBinding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel = new ViewModelProvider(getActivity()).get(StudentViewModel.class);
        setObserver();

    }

    private void setObserver() {
        viewModel.getAll().observe(getViewLifecycleOwner(), new Observer<List<Student>>() {
            @Override
            public void onChanged(List<Student> students) {
                adapter = new MyAdapter((ArrayList<Student>) students);
                fragListStudentBinding.recycleView.setAdapter(adapter);
            }
        });
    }

}
