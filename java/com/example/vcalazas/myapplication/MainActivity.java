package com.example.vcalazas.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public Button jogar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jogar = (Button)findViewById(R.id.buttonJ);

        jogar.setOnClickListener(this);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.buttonJ:
                Jogar();
                break;
        }
    }

    public void Jogar(){
        Intent intent = new Intent(this, Jogar.class);
        startActivity(intent);
    }

    public void NJogar(View v){
        Toast.makeText(this, "Você não pode não jogar MUAHUAHAHAHA", Toast.LENGTH_SHORT).show();
    }
}
