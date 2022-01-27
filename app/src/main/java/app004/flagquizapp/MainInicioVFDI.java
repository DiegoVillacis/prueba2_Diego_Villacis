package app004.flagquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainInicioVFDI extends AppCompatActivity {


    EditText textUsuarioVFDI, textPassVFDI;
    Button buttonIngresarVFDI, b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_inicio_vfdi);


        textUsuarioVFDI = (EditText) findViewById(R.id.textUsuarioVFDI);
        textPassVFDI = (EditText) findViewById(R.id.editTextPassVFDI);
        buttonIngresarVFDI = (Button) findViewById(R.id.buttonIngresarVFDI);

        buttonIngresarVFDI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = textUsuarioVFDI.getText().toString();
                String password = textPassVFDI.getText().toString();


                if (email.equals("Diego") || email.equals("UTA") && password.equals("Diego") || password.equals("UTA")) {
                    Toast.makeText(getApplicationContext(), "Ha iniciado sesión correctamente", Toast.LENGTH_SHORT).show();
                    crearInicio(v);
                } else
                    Toast.makeText(getApplicationContext(), "Email o contraseña incorrectos", Toast.LENGTH_SHORT).show();
            }


        });
    }



    public void crearInicio(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

        intent.putExtra("variable_usuarioVFDI", textUsuarioVFDI.getText());
        startActivity(intent);

    }



    public void onClick(View v) {

        String email = textUsuarioVFDI.getText().toString();
        String password = textPassVFDI.getText().toString();

        if (email.equals("Diego") || email.equals("UTA") && password.equals("Diego") || password.equals("UTA"))
            crearInicio(v); Toast.makeText(getApplicationContext(), "Ha iniciado sesión correctamente", Toast.LENGTH_SHORT).show();
    }

}