 package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.*;

 public class MainActivity extends AppCompatActivity {


    @Override



    protected void onCreate(Bundle savedInstanceState) {
        Log.d("tag","ska");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

     public void button_click(View view)
     {
//         String str="logout";
//         login.setText(str);
         Button mybutton = (Button) findViewById(R.id.login);
         mybutton.setText("logout");
     }

}
