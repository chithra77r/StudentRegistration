package com.example.studentregistrstionapp.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.studentregistrstionapp.util.Communicator;
import com.example.studentregistrstionapp.R;
import com.example.studentregistrstionapp.databinding.FragHomeBinding;

public class HomeFrag  extends Fragment {
    private FragHomeBinding binding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.frag_home,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setListeners();
    }

    private void setListeners() {
        binding.bStudentReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Communicator)getActivity()).callFragment(0);
            }
        });

        binding.bShowStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Communicator)getActivity()).callFragment(1);
            }
        });



    }
}
