package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
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
        final EditText input = findViewById(R.id.input);


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
                String temp = input.getText().toString();
                double input_value = 0;
                if (!temp.equals("")) {
                    input_value = Double.parseDouble(temp);
                }

                String i = spinner.getSelectedItem().toString();
                String j = spinner2.getSelectedItem().toString();
                double r = convert(i, j, input_value);
                noelle.animate().alpha(0f);

                if (r == 0) {
                    base.setText("");
                    equals.setText("Invalid Request");
                    result.setText("");
                } else {
                    base.setText(input_value + " " + i);
                    equals.setText("=");
                    result.setText(r + " " + j);
                }
            }
        });
    }

    protected double convert(String i, String j, double d) {
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
                        c = d;
                        break;
                    case "centimeters(cm)":
                        c = 0.1 * d;
                        break;
                    case "meters(m)":
                        c = 0.001 * d;
                        break;
                    case "kilometers(km)":
                        c = 0.000001 * d;
                        break;
                    case "inches(in)":
                        c = 0.0393701 * d;
                        break;
                    case "feet(ft)":
                        c = 0.00328084 * d;
                        break;
                    case "yards(yd)":
                        c = 0.00109361 * d;
                        break;
                    case "miles(mi)":
                        c = 0.00000062137 * d;
                        break;
                }
                break;
            case "centimeters(cm)":
                switch(multiplier) {
                    case "ChooseOne":
                        c = 0;
                    break;
                    case "millimeters(mm)":
                        c = 10 * d;
                    break;
                    case "centimeters(cm)":
                        c = d;
                    break;
                    case "meters(m)":
                        c = 0.01 * d;
                    break;
                    case "kilometers(km)":
                        c = 0.00001 * d;
                    break;
                    case "inches(in)":
                        c = 0.393701 * d;
                    break;
                    case "feet(ft)":
                        c = 0.0328084 * d;
                    break;
                    case "yards(yd)":
                        c = 0.0109361 * d;
                    break;
                    case "miles(mi)":
                        c = 0.0000062137 * d;
                    break;
                }
                break;
            case "meters(m)":
                switch(multiplier) {
                    case "ChooseOne":
                        c = 0;
                    break;
                    case "millimeters(mm)":
                        c = 1000 * d;
                    break;
                    case "centimeters(cm)":
                        c = 100 * d;
                    break;
                    case "meters(m)":
                        c = d;
                    break;
                    case "kilometers(km)":
                        c = 0.001 * d;
                    break;
                    case "inches(in)":
                        c = 39.3701 * d;
                    break;
                    case "feet(ft)":
                        c = 3.28084 * d;
                    break;
                    case "yards(yd)":
                        c = 1.09361 * d;
                    break;
                    case "miles(mi)":
                        c = 0.00062137 * d;
                    break;
                }
                break;
            case "kilometers(km)":
                switch(multiplier) {
                    case "ChooseOne":
                        c = 0;
                    break;
                    case "millimeters(mm)":
                        c = 1000000 * d;
                    break;
                    case "centimeters(cm)":
                        c = 100000 * d;
                    break;
                    case "meters(m)":
                        c = 1000 * d;
                    break;
                    case "kilometers(km)":
                        c = d;
                    break;
                    case "inches(in)":
                        c = 39370.1 * d;
                    break;
                    case "feet(ft)":
                        c = 3280.84 * d;
                    break;
                    case "yards(yd)":
                        c = 1093.61 * d;
                    break;
                    case "miles(mi)":
                        c = 0.62137 * d;
                    break;
                }
                break;
            case "inches(in)":
                switch(multiplier) {
                    case "ChooseOne":
                        c = 0;
                    break;
                    case "millimeters(mm)":
                        c = 25.4 * d;
                    break;
                    case "centimeters(cm)":
                        c = 2.54 * d;
                    break;
                    case "meters(m)":
                        c = 0.0254 * d;
                    break;
                    case "kilometers(km)":
                        c = 0.0000254 * d;
                    break;
                    case "inches(in)":
                        c = d;
                    break;
                    case "feet(ft)":
                        c = 0.0833333 * d;
                    break;
                    case "yards(yd)":
                        c = 0.0277778 * d;
                    break;
                    case "miles(mi)":
                        c = 0.000015783 * d;
                    break;
                }
                break;
            case "feet(ft)":
                switch(multiplier) {
                    case "ChooseOne":
                        c = 0;
                    break;
                    case "millimeters(mm)":
                        c = 304.8 * d;
                    break;
                    case "centimeters(cm)":
                        c = 30.48 * d;
                    break;
                    case "meters(m)":
                        c = 0.3048 * d;
                    break;
                    case "kilometers(km)":
                        c = 0.0003048 * d;
                    break;
                    case "inches(in)":
                        c = 12 * d;
                    break;
                    case "feet(ft)":
                        c = d;
                    break;
                    case "yards(yd)":
                        c = 0.3333333 * d;
                    break;
                    case "miles(mi)":
                        c = 0.000189394 * d;
                    break;
                }
                break;
            case "yards(yd)":
                switch(multiplier) {
                    case "ChooseOne":
                        c = 0;
                    break;
                    case "millimeters(mm)":
                        c = 914.4 * d;
                    break;
                    case "centimeters(cm)":
                        c = 91.44 * d;
                    break;
                    case "meters(m)":
                        c = 0.9144 * d;
                    break;
                    case "kilometers(km)":
                        c = 0.0009144 * d;
                    break;
                    case "inches(in)":
                        c = 36 * d;
                    break;
                    case "feet(ft)":
                        c = 3 * d;
                    break;
                    case "yards(yd)":
                        c = d;
                    break;
                    case "miles(mi)":
                        c = 0.000568182 * d;
                    break;
                }
                break;
            case "miles(mi)":
                switch(multiplier) {
                    case "ChooseOne":
                        c = 0;
                    break;
                    case "millimeters(mm)":
                        c = 1609340 * d;
                    break;
                    case "centimeters(cm)":
                        c = 160934 * d;
                    break;
                    case "meters(m)":
                        c = 1609.34 * d;
                    break;
                    case "kilometers(km)":
                        c = 1.60934 * d;
                    break;
                    case "inches(in)":
                        c = 63360 * d;
                    break;
                    case "feet(ft)":
                        c = 5280 * d;
                    break;
                    case "yards(yd)":
                        c = 1760 * d;
                    break;
                    case "miles(mi)":
                        c = d;
                    break;
                }
                break;
        }
        return c;
    }
}
