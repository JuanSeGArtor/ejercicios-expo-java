package com.example.practicacheckboxandradiobutton;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity {
    private CheckBox checkBox;
    private RadioGroup radioGroup;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar vistas
        checkBox = findViewById(R.id.checkBox);
        radioGroup = findViewById(R.id.radioGroup);
        textView = findViewById(R.id.textView);

        // Manejar eventos del CheckBox
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Mostrar o ocultar el saludo según el estado del CheckBox
                if (isChecked) {
                    textView.setVisibility(TextView.VISIBLE);
                } else {
                    textView.setVisibility(TextView.INVISIBLE);
                }
            }
        });

        // Manejar eventos del RadioGroup
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // Mostrar el texto de la opción seleccionada en el TextView
                RadioButton radioButton = findViewById(checkedId);
                if (radioButton != null) {
                    textView.setText("Seleccionaste: " + radioButton.getText());
                }
            }
        });
    }
}