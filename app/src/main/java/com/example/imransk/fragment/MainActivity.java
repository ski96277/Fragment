package com.example.imransk.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.imransk.fragment.Fragment.FragmentOne;
import com.example.imransk.fragment.Fragment.FragmentTwo;

public class MainActivity extends AppCompatActivity {

    Button button1;

    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.fragment1);
        button2 = findViewById(R.id.fragment2);

        final Bundle bundle=new Bundle();
        bundle.putString("name","Imran Sk");
        bundle.putString("country","Bangladesh");

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new FragmentOne();
                if (fragment != null) {

                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.changeLayout, fragment);
                    fragment.setArguments(bundle);
                    fragmentTransaction.commit();
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new FragmentTwo();
                if (fragment != null) {

                    FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.changeLayout,fragment);
                    fragmentTransaction.commit();
                }
            }
        });
    }
}
