package com.example.app_vinhos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class Tintos extends AppCompatActivity {

    // declarar arrays com regiao de nomes e imagens dos vinhos.
    private String [] Regiao = new String[] {"Douro", "Alentejo"};
    private int [] nomesD = new int [] {R.string.nometinto1, R.string.nometinto2, R.string.nometinto3};
    private int [] imagensD = new int [] {R.drawable.tinto1, R.drawable.tinto2, R.drawable.tinto3};
    private int [] precoD = new int [] {R.string.precotinto1, R.string.precotinto2, R.string.precotinto3};
    private int [] descricaoD = new int [] {R.string.descricaotinto1, R.string.descricaotinto2, R.string.descricaotinto3};
    private int [] nomesA = new int [] {R.string.nometintoA1, R.string.nometintoA2, R.string.nometintoA3};
    private int [] imagensA = new int [] {R.drawable.tinta1, R.drawable.tinta2, R.drawable.tinta3};
    private int [] precoA = new int [] {R.string.precotintoA1, R.string.precotintoA2, R.string.precotintoA3};
    private int [] descricaoA = new int [] {R.string.descricaotintoA1, R.string.descricaotintoA2, R.string.descricaotintoA3};

    // Criar variaveis dos elementos do xml:
    private Spinner sp;
    private ImageView img1;
    private ImageView img2;
    private ImageView img3;
    private TextView nom1;
    private TextView nom2;
    private TextView nom3;
    private TextView dsc1;
    private TextView dsc2;
    private TextView dsc3;
    private TextView prc1;
    private TextView prc2;
    private TextView prc3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tintos);

        sp = findViewById(R.id.spinner1);
        img1 = findViewById(R.id.imageView7);
        img2 = findViewById(R.id.imageView8);
        img3 = findViewById(R.id.imageView9);
        nom1 = findViewById(R.id.textView3);
        nom2 = findViewById(R.id.textView6);
        nom3 = findViewById(R.id.textView10);
        dsc1 = findViewById(R.id.textView4);
        dsc2 = findViewById(R.id.textView7);
        dsc3 = findViewById(R.id.textView9);
        prc1 = findViewById(R.id.textView5);
        prc2 = findViewById(R.id.textView8);
        prc3 = findViewById(R.id.textView11);



        // construir array adapter e carregar no spinner
        ArrayAdapter <String> valores =
                new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,Regiao);

        //associar o array ao spinner
        sp.setAdapter(valores);


        //aplicar codigo de erro aos eventos
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    img1.setImageResource(imagensD[0]);
                    img2.setImageResource(imagensD[1]);
                    img3.setImageResource(imagensD[2]);
                    nom1.setText(nomesD[0]);
                    nom2.setText(nomesD[1]);
                    nom3.setText(nomesD[2]);
                    dsc1.setText(descricaoD[0]);
                    dsc2.setText(descricaoD[1]);
                    dsc3.setText(descricaoD[2]);
                    prc1.setText(precoD[0]);
                    prc2.setText(precoD[1]);
                    prc3.setText(precoD[2]);
                }else{
                    img1.setImageResource(imagensA[0]);
                    img2.setImageResource(imagensA[1]);
                    img3.setImageResource(imagensA[2]);
                    nom1.setText(nomesA[0]);
                    nom2.setText(nomesA[1]);
                    nom3.setText(nomesA[2]);
                    dsc1.setText(descricaoA[0]);
                    dsc2.setText(descricaoA[1]);
                    dsc3.setText(descricaoA[2]);
                    prc1.setText(precoA[0]);
                    prc2.setText(precoA[1]);
                    prc3.setText(precoA[2]);
                }
                Toast.makeText(Tintos.this, sp.getSelectedItem()+"",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }



    // Incluir o menu na activity :
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuvinhos,menu);
        menu.removeItem(R.id.tintos);
        return super.onCreateOptionsMenu(menu);
    }

    // programar cada botão do menu :
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.btnsair){
            finish();
        }

        if(id == R.id.btnhome){
            Intent it = new Intent(Tintos.this,Home.class);
            startActivity(it);
            finish();
        }

        if(id == R.id.brancos){
            Intent it = new Intent(Tintos.this,Brancos.class);
            startActivity(it);
            finish();
        }

        if(id == R.id.espirituosos){
            Intent it = new Intent(Tintos.this,Espirituosos.class);
            startActivity(it);
            finish();
        }

        if(id == R.id.licores){
            Intent it = new Intent(Tintos.this,elementos.class);
            startActivity(it);
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

}