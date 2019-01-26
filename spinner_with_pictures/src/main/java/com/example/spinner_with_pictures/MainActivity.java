package com.example.spinner_with_pictures;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Spinner;

public class MainActivity extends Activity {

    private String[] auto_list = {"BMV","Mersedes", "Audi","Ford"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = findViewById(R.id.spinner);

        MyCustomAdapter myCustomAdapter = new MyCustomAdapter(this, R.layout.row, auto_list);
        spinner.setAdapter(myCustomAdapter);
        spinner.setSelection(1, true);

    }
}
