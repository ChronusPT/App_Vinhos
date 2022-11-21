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

public class Brancos extends AppCompatActivity {

    // declarar arrays com regiao de nomes e imagens dos vinhos.
    private String [] Regiao = new String[] {"Douro", "Alentejo"};
    private int [] nomesD = new int [] {R.string.nomebranco1, R.string.nomebranco2, R.string.nomebranco3};
    private int [] imagensD = new int [] {R.drawable.branco1, R.drawable.branco2, R.drawable.branco3};
    private int [] precoD = new int [] {R.string.precobranco1, R.string.precobranco2, R.string.precobranco3};
    private int [] descricaoD = new int [] {R.string.descricaobranco1, R.string.descricaobranco2, R.string.descricaobranco3};
    private int [] nomesA = new int [] {R.string.nomebranca1, R.string.nomebranca2, R.string.nomebranca3};
    private int [] imagensA = new int [] {R.drawable.branca1, R.drawable.branca2, R.drawable.branca3};
    private int [] precoA = new int [] {R.string.precobranca1, R.string.precobranca2, R.string.precobranca3};
    private int [] descricaoA = new int [] {R.string.descricaobranca1, R.string.descricaobranca2, R.string.descricaobranca3};

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
        setContentView(R.layout.activity_brancos);

        sp = findViewById(R.id.spinner2);
        img1 = findViewById(R.id.imageView4);
        img2 = findViewById(R.id.imageView5);
        img3 = findViewById(R.id.imageView6);
        nom1 = findViewById(R.id.textView13);
        nom2 = findViewById(R.id.textView15);
        nom3 = findViewById(R.id.textView19);
        dsc1 = findViewById(R.id.textView14);
        dsc2 = findViewById(R.id.textView16);
        dsc3 = findViewById(R.id.textView18);
        prc1 = findViewById(R.id.textView21);
        prc2 = findViewById(R.id.textView17);
        prc3 = findViewById(R.id.textView20);



        // construir array adapter e carregar no spinner
        ArrayAdapter<String> valores =
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
                Toast.makeText(Brancos.this, sp.getSelectedItem()+"",Toast.LENGTH_LONG).show();
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
        menu.removeItem(R.id.brancos);
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
            Intent it = new Intent(Brancos.this,Home.class);
            startActivity(it);
            finish();
        }

        if(id == R.id.tintos){
            Intent it = new Intent(Brancos.this,Tintos.class);
            startActivity(it);
            finish();
        }

        if(id == R.id.espirituosos){
            Intent it = new Intent(Brancos.this,Espirituosos.class);
            startActivity(it);
            finish();
        }

        if(id == R.id.licores){
            Intent it = new Intent(Brancos.this,elementos.class);
            startActivity(it);
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

}