package com.example.lucas.lswitzer2.Fragment;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.lucas.lswitzer2.Adapter.MainListAdapter;
import com.example.lucas.lswitzer2.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class DemoFragment extends Fragment {

    private MainListAdapter adapter;
    public List<String> list = new ArrayList<String>();
    private ListView listView;

    public DemoFragment() {
        // Required empty public constructor
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_demo, container, false);
        listView = view.findViewById(R.id.main_demo_list);
        adapter = new MainListAdapter(getContext(),list);
        listView.setAdapter(adapter);
        return view;
    }

}
