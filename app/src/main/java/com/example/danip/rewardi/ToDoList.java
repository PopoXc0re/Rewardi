package com.example.danip.rewardi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ToDoList extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        return inflater.inflate(R.layout.to_do_list_menu, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstancesState){
        super.onViewCreated(view, savedInstancesState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("To Do List");
    }
}
