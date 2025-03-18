package com.example.aula11_listview;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnprox,btnant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.lista);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Log.d("MainActivit","onCreate; Startes.");
        ArrayList <String> nomes = new ArrayList<>();
        nomes.add("Pedro Willian Moraes Lourenço");
        nomes.add("Ana Clara Tomaz");
        nomes.add("Lucas de oliveira");
        nomes.add("Tarcisio Antonio");
        nomes.add("Thalles Bruno");
        nomes.add("Geraldo Ribeiro");
        nomes.add("nome teste final");

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.layout_lista1, nomes);
        listView.setAdapter(adapter);

    }
    public void avancar (View v){
        Intent intent = new Intent(v.getContext(), MainActivity2.class);
        v.getContext().startActivity(intent);
    }


}