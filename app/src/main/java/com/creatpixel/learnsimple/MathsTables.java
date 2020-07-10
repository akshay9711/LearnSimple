package com.creatpixel.learnsimple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MathsTables extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths_tables);
        //______________________________________________________________________________________________________________________________________________
        SeekBar seekBar = findViewById(R.id.seekBar);
        seekBar.setMax(20);
        seekBar.setProgress(2);

        final ArrayList<String> tableNumbersArray = new ArrayList<>();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tableNumbersArray);
        ListView tableListView = findViewById(R.id.tableListView);
        tableListView.setAdapter(arrayAdapter);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {


                int fixNumber = progress;

                for (int i = 1; i <= 10; i++) {
                    //Now we are making tables 2 x 1 = 2, 2 x 2 = 4 etc.
                    progress = fixNumber * i;
                    //We get number from user example 2, for 2 ki table
                    String resultString = fixNumber + " x " + i + " = " + progress;
                    //Now ad result in array
                    tableNumbersArray.add(resultString);
                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
