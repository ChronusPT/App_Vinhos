package com.example.app_vinhos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Brancos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brancos);
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

        return super.onOptionsItemSelected(item);
    }

}