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

}
