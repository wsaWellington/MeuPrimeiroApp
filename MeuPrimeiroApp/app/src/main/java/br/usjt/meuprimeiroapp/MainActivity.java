package br.usjt.meuprimeiroapp;

import android.app.Activity;
import android.os.Bundle;


/**
 *
 *@author Wellington Souza Araujo
 * @ra 816120947
 * */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     *
     *@author Wellington Souza Araujo
     * @ra 816120947
     * */
    //será chamado quando o usuário clicar em Enviar
    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);

    }

    //constante static para identificar a mensagem
    public final static String EXTRA_MESSAGE =
            "br.usjt.meuprimeiroapp.MESSAGE";
    //será chamado quando o usuário clicar em Enviar
    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
