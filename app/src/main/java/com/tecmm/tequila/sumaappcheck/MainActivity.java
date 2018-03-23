package com.tecmm.tequila.sumaappcheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtNum1, txtNum2;
    TextView txtResultado;
    RadioButton rdSuma, rdResta, rdDividir, rdMultiplicar;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                txtNum1 = (EditText) findViewById(R.id.txtNum1);
                txtNum2 = (EditText) findViewById(R.id.txtNum2);

        txtResultado = (TextView) findViewById(R.id.txtResultado);

        rdSuma = (RadioButton) findViewById(R.id.rdSuma);
        rdResta = (RadioButton) findViewById(R.id.rdResta);
        rdDividir = (RadioButton) findViewById(R.id.rdDividir);
        rdMultiplicar = (RadioButton) findViewById(R.id.rdMultiplica);

        boton = (Button) findViewById(R.id.button);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("Click", "Se hizo click en el botón");
                int resultado;
                int num1 = Integer.parseInt(txtNum1.getText().toString());
                int num2 = Integer.parseInt(txtNum2.getText().toString());

                if(rdSuma.isChecked())
                    resultado = num1 + num2;
                else if(rdResta.isChecked())
                    resultado = num1 - num2;
                else if (rdDividir.isChecked())
                    resultado = num1 / num2;
                else
                    resultado = num1 * num2;

                txtResultado.setText("Resultado: " + resultado);
            }
        });
    }
}
