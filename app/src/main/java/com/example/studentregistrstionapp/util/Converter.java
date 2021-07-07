package com.example.studentregistrstionapp.util;

import androidx.databinding.InverseMethod;

public class Converter {
    public static int convertStringToInt(String value){
     try {
         return Integer.parseInt(value);
        } catch (NumberFormatException e){
         return 0;
        }
    }

    @InverseMethod(value="convertStringToInt")
    public static String convertIntToString(int value) {
        return Integer.toString(value);
    }
}

