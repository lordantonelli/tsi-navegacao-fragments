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

}
