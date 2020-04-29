package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView base = findViewById(R.id.base);
        final TextView equals = findViewById(R.id.equals);
        final TextView result = findViewById(R.id.result);
        final ImageView noelle = findViewById(R.id.imageView);

        final Spinner spinner = findViewById(R.id.spinner_top);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.converter_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        final Spinner spinner2 = findViewById(R.id.spinner_bottom);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.converter_options, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String i = spinner.getSelectedItem().toString();
                String j = spinner2.getSelectedItem().toString();
                double r = convert(i, j);
                noelle.animate().alpha(0f);

                if (r == 0) {
                    equals.setText("Invalid Request");
                } else {
                    base.setText(1 + " " + i);
                    equals.setText("=");
                    result.setText(r + " " + j);
                }
            }
        });
    }

    protected double convert(String i, String j) {
        double c = 0;
        String base = i;
        String multiplier = j;
        switch(base) {
            case "ChooseOne":
                c = 0;
                break;
            case "millimeters(mm)":
                switch(multiplier) {
                    case "ChooseOne":
                        c = 0;
                        break;
                    case "millimeters(mm)":
                        c = 1;
                        break;
                    case "centimeters(cm)":
                        c = 0.1;
                        break;
                    case "meters(m)":
                        c = 0.001;
                        break;
                    case "kilometers(km)":
                        c = 0.000001;
                        break;
                    case "inches(in)":
                        c = 0.0393701;
                        break;
                    case "feet(ft)":
                        c = 0.00328084;
                        break;
                    case "yards(yd)":
                        c = 0.00109361;
                        break;
                    case "miles(mi)":
                        c = 0.00000062;
                        break;
                }
                break;
            case "centimeters(cm)":
                switch(multiplier) {
                    case "ChooseOne":
                        c = 0;
                    break;
                    case "millimeters(mm)":
                        c = 10;
                    break;
                    case "centimeters(cm)":
                        c = 1;
                    break;
                    case "meters(m)":
                        c = 0.01;
                    break;
                    case "kilometers(km)":
                        c = 0.00001;
                    break;
                    case "inches(in)":
                        c = 0.393701;
                    break;
                    case "feet(ft)":
                        c = 0.0328084;
                    break;
                    case "yards(yd)":
                        c = 0.0109361;
                    break;
                    case "miles(mi)":
                        c = 0.0000062;
                    break;
                }
                break;
            case "meters(m)":
                switch(multiplier) {
                    case "ChooseOne":
                        c = 0;
                    break;
                    case "millimeters(mm)":
                        c = 1000;
                    break;
                    case "centimeters(cm)":
                        c = 100;
                    break;
                    case "meters(m)":
                        c = 1;
                    break;
                    case "kilometers(km)":
                        c = 0.001;
                    break;
                    case "inches(in)":
                        c = 39.3701;
                    break;
                    case "feet(ft)":
                        c = 3.28084;
                    break;
                    case "yards(yd)":
                        c = 1.09361;
                    break;
                    case "miles(mi)":
                        c = 0.00062;
                    break;
                }
                break;
            case "kilometers(km)":
                switch(multiplier) {
                    case "ChooseOne":
                        c = 0;
                    break;
                    case "millimeters(mm)":
                        c = 1000000;
                    break;
                    case "centimeters(cm)":
                        c = 100000;
                    break;
                    case "meters(m)":
                        c = 1000;
                    break;
                    case "kilometers(km)":
                        c = 1;
                    break;
                    case "inches(in)":
                        c = 39370.1;
                    break;
                    case "feet(ft)":
                        c = 3280.84;
                    break;
                    case "yards(yd)":
                        c = 1093.61;
                    break;
                    case "miles(mi)":
                        c = 0.62;
                    break;
                }
                break;
            case "inches(in)":
                switch(multiplier) {
                    case "ChooseOne":
                        c = 0;
                    break;
                    case "millimeters(mm)":
                        c = 25.4;
                    break;
                    case "centimeters(cm)":
                        c = 2.54;
                    break;
                    case "meters(m)":
                        c = 0.0254;
                    break;
                    case "kilometers(km)":
                        c = 0.0000254;
                    break;
                    case "inches(in)":
                        c = 1;
                    break;
                    case "feet(ft)":
                        c = 0.0833333;
                    break;
                    case "yards(yd)":
                        c = 0.0277778;
                    break;
                    case "miles(mi)":
                        c = 0.0000158;
                    break;
                }
                break;
            case "feet(ft)":
                switch(multiplier) {
                    case "ChooseOne":
                        c = 0;
                    break;
                    case "millimeters(mm)":
                        c = 304.8;
                    break;
                    case "centimeters(cm)":
                        c = 30.48;
                    break;
                    case "meters(m)":
                        c = 0.3048;
                    break;
                    case "kilometers(km)":
                        c = 0.0003048;
                    break;
                    case "inches(in)":
                        c = 12;
                    break;
                    case "feet(ft)":
                        c = 1;
                    break;
                    case "yards(yd)":
                        c = 0.3333333;
                    break;
                    case "miles(mi)":
                        c = 0.0001894;
                    break;
                }
                break;
            case "yards(yd)":
                switch(multiplier) {
                    case "ChooseOne":
                        c = 0;
                    break;
                    case "millimeters(mm)":
                        c = 914.4;
                    break;
                    case "centimeters(cm)":
                        c = 91.44;
                    break;
                    case "meters(m)":
                        c = 0.9144;
                    break;
                    case "kilometers(km)":
                        c = 0.0009144;
                    break;
                    case "inches(in)":
                        c = 36;
                    break;
                    case "feet(ft)":
                        c = 3;
                    break;
                    case "yards(yd)":
                        c = 1;
                    break;
                    case "miles(mi)":
                        c = 0.0005682;
                    break;
                }
                break;
            case "miles(mi)":
                switch(multiplier) {
                    case "ChooseOne":
                        c = 0;
                    break;
                    case "millimeters(mm)":
                        c = 1609340;
                    break;
                    case "centimeters(cm)":
                        c = 160934;
                    break;
                    case "meters(m)":
                        c = 1609.34;
                    break;
                    case "kilometers(km)":
                        c = 1.60934;
                    break;
                    case "inches(in)":
                        c = 63360;
                    break;
                    case "feet(ft)":
                        c = 5280;
                    break;
                    case "yards(yd)":
                        c = 1760;
                    break;
                    case "miles(mi)":
                        c = 1;
                    break;
                }
                break;
        }
        return c;
    }
}
