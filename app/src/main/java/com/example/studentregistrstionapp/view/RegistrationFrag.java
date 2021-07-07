package com.example.studentregistrstionapp.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.studentregistrstionapp.util.Communicator;
import com.example.studentregistrstionapp.R;
import com.example.studentregistrstionapp.data.Student;
import com.example.studentregistrstionapp.viewmodel.StudentViewModel;
import com.example.studentregistrstionapp.databinding.FragRegistrationBinding;

public class RegistrationFrag extends Fragment{

    private FragRegistrationBinding binding;
    private StudentViewModel viewModel;
    Communicator communicator ;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.frag_registration, container, false);
        viewModel = new ViewModelProvider(getActivity()).get(StudentViewModel.class);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setListeners();
        binding.setStudent(viewModel.student);


    }

    private void setListeners() {
      binding.bAdd.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              viewModel.student = binding.getStudent();
              viewModel.insertStudent();
              ((Communicator)getActivity()).callFragment(1);
              Student s = new Student();
              binding.setStudent(s);

          }
      });
    }


}
