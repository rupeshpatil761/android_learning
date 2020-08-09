package com.example.fragmenttest.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fragmenttest.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FirstFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FirstFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    public static FirstFragment newInstance(String param1, String param2) {
        FirstFragment fragment = new FirstFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view;
        Bundle bundle = getArguments();
        if (bundle!=null && bundle.containsKey("pageNumber")) {
            String pageNumber = bundle.getString("pageNumber");
            view  = inflater.inflate(R.layout.fragment_first, container, false);
            TextView textView = (TextView) view.findViewById(R.id.pageNumber);
            textView.setText(pageNumber);
            return view;
        } else {
            return inflater.inflate(R.layout.fragment_first, container, false);
        }
    }
}