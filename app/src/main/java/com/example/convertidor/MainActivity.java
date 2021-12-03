package com.example.convertidor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spiner1,spiner2;
    EditText editText1;
    Button boton1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.txtamount);
        spiner1 = findViewById(R.id.spinerDe);
        spiner2 = findViewById(R.id.spinerA);
        boton1 = findViewById(R.id.boton1);


        String[] from = {"Pesos Mexicanos"};
        ArrayAdapter ad = new ArrayAdapter<String>( this,R.layout.support_simple_spinner_dropdown_item, from);
        spiner1.setAdapter(ad);

        String[] to = {"Libra esterlina","Pesos Chilenos","Yenes","Dollars"};
        ArrayAdapter ad1 = new ArrayAdapter<String>( this,R.layout.support_simple_spinner_dropdown_item, to);
        spiner2.setAdapter(ad1);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double tot;
                Double amount = Double.parseDouble(editText1.getText().toString());
                if (spiner1.getSelectedItem().toString() == "Pesos Mexicanos" && spiner2.getSelectedItem().toString()=="Dollars")
                {
                    tot = amount * .047;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if (spiner1.getSelectedItem().toString() == "Pesos Mexicanos" && spiner2.getSelectedItem().toString()=="Yenes")
                {
                    tot = amount * 5.32;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if (spiner1.getSelectedItem().toString() == "Pesos Mexicanos" && spiner2.getSelectedItem().toString()=="Pesos Chilenos")
                {
                    tot = amount * 38.83;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if (spiner1.getSelectedItem().toString() == "Pesos Mexicanos" && spiner2.getSelectedItem().toString()=="Libra esterlina")
                {
                    tot = amount * 0.035;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}