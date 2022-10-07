package com.example.navegaoactivities.navegacaoentrefragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class ExibeFragment extends Fragment {

    // Atributos representando os objetos da interface gráfica
    private TextView lblNome;
    private TextView lblEmail;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Criando o desenho da interface deste fragment (variável view),
        // inflando o layout XML que criamos para este fragment.
        View view = inflater.inflate( R.layout.fragment_exibe, container, false );
        // Ligando os atributos aos objetos gráficos
        lblNome = view.findViewById( R.id.lblNome );
        lblEmail = view.findViewById( R.id.lblEmail );
        // Pegando uma referencia para a activity onde este fragment está
        MainActivity a = (MainActivity) getActivity();
        // Pegando o nome guardado na activity
        String nome, email;
        nome = a.getNome();
        // Se nome for diferente de null, é pq tem algo em email também
        if ( nome != null ) {
            email = a.getEmail();
            // Colocando nome e email nas caixas de texto
            lblNome.setText( nome );
            lblEmail.setText( email );
        }
        return view;
    }
}
