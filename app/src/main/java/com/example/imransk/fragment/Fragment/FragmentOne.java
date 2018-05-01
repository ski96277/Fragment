package com.example.imransk.fragment.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.imransk.fragment.R;

/**
 * Created by imran sk on 5/1/2018.
 */

public class FragmentOne extends Fragment {

    String name;
    String cuntry;
TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Bundle bundle=getArguments();
        name=bundle.getString("name");
        cuntry=bundle.getString("country");

        return inflater.inflate(R.layout.fragmentone,null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView=view.findViewById(R.id.textview1);
        textView.setText(name+"  "+cuntry);
    }
}
