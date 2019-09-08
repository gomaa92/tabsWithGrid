package com.example.tabfragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class Tab1Fragment extends Fragment {
    private static final String TAG = "Tab1Fragment";
    GridView gridView;
    String[] text = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    int[] images = {R.drawable.ic_one, R.drawable.ic_two, R.drawable.ic_three, R.drawable.ic_4, R.drawable.ic_5,
            R.drawable.ic_6, R.drawable.ic_7, R.drawable.ic_8, R.drawable.ic_f9};


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1fragment, container, false);
        gridView = view.findViewById(R.id.grid_view);
        MainAdapter mainAdapter = new MainAdapter(getContext(), text, images);
        gridView.setAdapter(mainAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), "you clicked" + text[+position], Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
