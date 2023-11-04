package com.example.helloandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button bOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bOk = (Button) findViewById(R.id.bOk);
        bOk.setOnClickListener(new View.OnClickListener() {
                                   public void onClick(View v) {
                                       Intent eintent = new Intent(MainActivity.this, SecondActivity.class);
                                       startActivity(eintent);
                                   }
                               }
        );
    }

    protected void onStart() {
        super.onStart();
        //Toast.makeText(getApplicationContext(), "Called onStart()", Toast.LENGTH_LONG).show();
    }

    protected void onResume() {
        super.onResume();
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        //Toast.makeText(getApplicationContext(), "Called onResume()", Toast.LENGTH_LONG).show();
        Log.d("TAG", "onResume");
    }

    protected void onPause() {
        super.onPause();
        //Toast.makeText(getApplicationContext(), "Called onPause()", Toast.LENGTH_LONG).show();
    }

    protected void onStop() {
        super.onStop();
        //Toast.makeText(getApplicationContext(), "Called onStop()", Toast.LENGTH_LONG).show();
    }

    protected void onDestroy() {
        super.onDestroy();
        //Toast.makeText(getApplicationContext(), "Called onDestroy()", Toast.LENGTH_LONG).show();
    }

    public void onSaveInstanceState(Bundle savedInstanceState) {
        //Toast.makeText(getApplicationContext(), "Called onSaveInstanceState()", Toast.LENGTH_LONG).show();
        savedInstanceState.putString("1", "Parameter 1");
        savedInstanceState.putString("2", "Parameter 2");
        super.onSaveInstanceState(savedInstanceState);
    }

}