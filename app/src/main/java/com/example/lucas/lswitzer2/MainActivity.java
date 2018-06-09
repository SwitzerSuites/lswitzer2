package com.example.lucas.lswitzer2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.lucas.lswitzer2.Fragment.DemoFragment;
import com.example.lucas.lswitzer2.Fragment.WorkFragment;

public class MainActivity extends AppCompatActivity {

    private Button orgButton;
    private Button picButton;
    private Button demoButton;
    private Button workButton;
    private LinearLayout fragmentLayout;

    private DemoFragment demoFragment;
    private WorkFragment workFragment;


    public void onBack(View v){
        Toast.makeText(MainActivity.this, "Orange Button!", Toast.LENGTH_SHORT).show();
    }


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        demoFragment = new DemoFragment();
        workFragment = new WorkFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment_layout,demoFragment).commit();

        orgButton = findViewById(R.id.main_title_bt_org);
        picButton = findViewById(R.id.main_title_bt_pic);
        demoButton = findViewById(R.id.main_tool_demo_bt);
        demoButton.setTextColor(Color.RED);
        workButton = findViewById(R.id.main_tool_work_bt);



        demoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                demoButton.setTextColor(Color.RED);
                workButton.setTextColor(Color.BLACK);
                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment_layout,demoFragment).commit();
            }
        });

        workButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                workButton.setTextColor(Color.RED);
                demoButton.setTextColor(Color.BLACK);
                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment_layout,workFragment).commit();
            }
        });




        picButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Picture Button!", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
