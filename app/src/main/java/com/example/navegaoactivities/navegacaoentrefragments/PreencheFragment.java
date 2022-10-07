package com.example.navegaoactivities.navegacaoentrefragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class PreencheFragment extends Fragment {

    // Atributos representando os objetos da interface gráfica
    private EditText txtNome;
    private EditText txtEmail;
    private Button btnEnviar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Criando o desenho da interface deste fragment (variável view),
        // inflando o layout XML que criamos para este fragment.
        View view = inflater.inflate( R.layout.fragment_preenche, container, false );
        // Ligando os atributos aos objetos gráficos
        txtNome = view.findViewById( R.id.txtNome );
        txtEmail = view.findViewById( R.id.txtEmail );
        btnEnviar = view.findViewById( R.id.btnEnviar );
        // Definindo o escutador do botao OK
        btnEnviar.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verificando se as caixas estão preenchidas
                if ( txtNome.getText().toString().isEmpty() || txtEmail.getText().toString().isEmpty() ) {
                    // Alguma delas está vazia. Informar o erro!
                    Toast.makeText(getContext(), "Precisa preencher as caixas!!", Toast.LENGTH_SHORT).show();
                    // Esvaziar as duas caixas (talvez o usuário tenha preenchido só uma delas).
                    // Como não sabemos qual, esvaziamos as duas...
                    txtNome.setText( "" );
                    txtEmail.setText( "" );
                } else {
                    // Caixas preenchidas... armazenando os conteúdos lá na activity
                    // Recuperando a referência para a Activity onde está este fragment:
                    MainActivity act = (MainActivity) getActivity();
                    // Variáveis para os textos
                    String nome, email;
                    // Pegando os textos nas caixas
                    nome = txtNome.getText().toString();
                    email = txtEmail.getText().toString();
                    // Chamando, lá na activity, o método que coloca os textos nos atributos
                    act.setNomeEmail( nome, email );
                    // Esvaziando as caixas
                    txtNome.setText( "" );
                    txtEmail.setText( "" );
                    // Informando que está tudo ok, via toast:
                    Toast.makeText(getContext(), "Informações enviadas para a Activity!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }

}
