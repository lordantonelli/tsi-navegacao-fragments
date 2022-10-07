package com.example.navegaoactivities.navegacaoentrefragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    // Atributo representando o FrameLayout
    private FrameLayout placeHolder;

    // Atributos para guardar nome e email, transferidos entre fragments
    private String nome;
    private String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Conectando o atributo ao frameLayout
        placeHolder = findViewById( R.id.placeHolder );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Recuperar um objeto "inflador" de menus
        MenuInflater inflater = getMenuInflater();
        // Vamos inflar o menu que criamos em res/menu
        inflater.inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Variável para guardar o fragmentManager...
        FragmentManager fm = getSupportFragmentManager();
        // Variável para guardar a fragmentTransaction...
        FragmentTransaction ft = fm.beginTransaction();
        // Recuperando qual item do menu foi clicado
        switch (item.getItemId()) {
            case R.id.menPreencher:
                PreencheFragment pf = new PreencheFragment();
                ft.replace( R.id.placeHolder, pf );
                ft.commit();
                return true;

            case R.id.menExibir:
                ExibeFragment ef = new ExibeFragment();
                ft.replace( R.id.placeHolder, ef );
                ft.commit();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    // Método para que um fragment guarde o nome e email
    // nos atributos desta activity
    public void setNomeEmail( String n, String e ) {
        nome = n;
        email = e;
    }

    // Método para recuperar o nome armazenado aqui
    public String getNome() {
        return nome;
    }

    // Método para recuperar o email armazenado aqui
    public String getEmail() {
        return email;
    }

}