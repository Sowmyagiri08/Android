package com.task.sowmya.facts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView factBox;
    Facts factholder = new Facts();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        factBox = (TextView) findViewById(R.id.textbox);
    }

    public void genFact(View view) {
        factBox.setText(factholder.nextFact());
    }
}