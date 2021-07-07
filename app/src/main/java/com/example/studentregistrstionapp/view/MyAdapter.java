package com.example.studentregistrstionapp.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.studentregistrstionapp.R;
import com.example.studentregistrstionapp.data.Student;
import com.example.studentregistrstionapp.databinding.StudentRowBinding;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    ArrayList<Student> list;

    public MyAdapter(ArrayList<Student> list) {
        this.list = list;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      StudentRowBinding binding =  DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.student_row,parent,false);
      return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        holder.binding.setStudent(list.get(position));
        holder.binding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder {
        StudentRowBinding binding;
        public MyViewHolder(@NonNull StudentRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

    }
}
