package com.example.maquinadevendas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Double saldo = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btnSaldoOnClick(View v){
        EditText editTextMoeda = findViewById(R.id.editTextDinheiro);
        TextView textViewSaldo = findViewById(R.id.textViewSaldo);
        TextView textViewRetire = findViewById(R.id.textViewRetire);

        if (Double.parseDouble(editTextMoeda.getText().toString()) == 0.25 || Double.parseDouble(editTextMoeda.getText().toString()) == 0.10){
            saldo += Double.parseDouble(editTextMoeda.getText().toString());
            textViewSaldo.setText("Saldo: $" + saldo);

            if (saldo >= 0.45){
                textViewRetire.setText("Retire sua Coca-Cola!");
                textViewRetire.setVisibility(View.VISIBLE);
            }
            else{
                textViewRetire.setText("Saldo insuficiente!");
                textViewRetire.setVisibility(View.VISIBLE);
            }
        }
        else {
            Toast.makeText(this, "Valor não aceito!", Toast.LENGTH_SHORT).show();
        }



    }
}
