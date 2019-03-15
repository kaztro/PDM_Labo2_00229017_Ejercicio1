package com.example.pdm_labo2_000229017_e1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText texV1;
    EditText texV2;
    TextView tV;
    Button btn_fake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText texV1 = findViewById(R.id.edit1_id);
        final EditText texV2 = findViewById(R.id.edit2_id);
        final TextView tV = findViewById(R.id.textV_id);
        Button btn_fake = findViewById(R.id.button1_id);

        btn_fake.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tV.setText(texV1.getText().toString());
            }
        });

        btn_fake.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                tV.setText(texV2.getText().toString());
                return true;
            }
        });
    }

}
