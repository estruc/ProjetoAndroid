package br.com.ead.eadandroidjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
  private Button botao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botao = findViewById(R.id.btnLogar);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tLogin = findViewById(R.id.idLogin);
                TextView tSenha = findViewById(R.id.idSenha);
                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();
                validaLogin(login,senha);

            }
        });

    }

    private void validaLogin(String login, String senha){

        if(login.equals("ead")&&senha.equals("123")){
           // Toast.makeText(this, "Logim realizado com sucesso", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(),MenuActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Seu login falhou", Toast.LENGTH_SHORT).show();
        }

    }

}
