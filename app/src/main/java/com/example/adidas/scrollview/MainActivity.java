package com.example.adidas.scrollview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ListView milista = (ListView) findViewById(R.id.milista);
        String[] values = new String[]{"Ironman","Capitan America","Hulk","Thor","Black Widow","Ant man","Spider man"};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values );

        milista.setAdapter(arrayAdapter);
        ayudatamanolista.getListViewSize(milista); //Aqui Llamo a la clase que cree en este caso ayudatamanolista para que me ddiagrame el tamaño de la lista


    }
}
