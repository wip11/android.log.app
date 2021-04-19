package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void disable(View v){
        /*View myView = findViewById(R.id.button);
        myView.setEnabled(false);
        Button button = (Button) myView;
        button.setText("New Disabled");
        Log.d("success", "Button Disabled");
*/

        
        /*
        v.setEnabled(false);
        Log.d("success", "Button Disabled");
        Button button = (Button) v;
        button.setText("Disabled");
         */
    }
}