package com.creatpixel.learnsimple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    static final String MSG = "com.creatpixel.learnsimple.MSG";

    public void numbers(View view){
        Button numButton = findViewById(R.id.numbers);
        Intent intent = new Intent(this, HindiNumbers.class);
        intent.putExtra(MSG, "HindiNumbers");
        startActivity(intent);
    }
    public void tables(View view){
        Button tableButton = findViewById(R.id.tables);
        Intent intent = new Intent(this, MathsTables.class);
        intent.putExtra(MSG, "MathsTables");
        startActivity(intent);
    }
    public void relations(View view){
        Button relationsButton = findViewById(R.id.relations);
        Intent intent = new Intent(this, FamilyRelations.class);
        intent.putExtra(MSG, "FamilyRelations");
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
