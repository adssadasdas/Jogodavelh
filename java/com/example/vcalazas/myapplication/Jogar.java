package com.example.vcalazas.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Jogar extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    TextView retorno;
    Integer Jogada = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogar);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        retorno = (TextView)findViewById(R.id.retorno);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                if(button1.getText().equals(" ")) {
                    if (Jogada % 2 == 0) {
                        button1.setText("X");
                        retorno.setText("Vez do Jogador 2");
                    } else {
                        button1.setText("O");
                        retorno.setText("Vez do Jogador 1");
                    }
                    verifica_jogo();
                    Jogada++;
                }
                break;
            case R.id.button2:
                if(button2.getText().equals(" ")) {
                    if (Jogada % 2 == 0) {
                        button2.setText("X");
                        retorno.setText("Vez do Jogador 2");
                    } else {
                        button2.setText("O");
                        retorno.setText("Vez do Jogador 1");
                    }
                    verifica_jogo();
                    Jogada++;
                }
                break;
            case R.id.button3:
                if(button3.getText().equals(" ")) {
                    if (Jogada % 2 == 0) {
                        button3.setText("X");
                        retorno.setText("Vez do Jogador 2");
                    } else {
                        button3.setText("O");
                        retorno.setText("Vez do Jogador 1");
                    }
                    verifica_jogo();
                    Jogada++;
                }
                break;
            case R.id.button4:
                if(button4.getText().equals(" ")) {
                    if (Jogada % 2 == 0) {
                        button4.setText("X");
                        retorno.setText("Vez do Jogador 2");
                    } else {
                        button4.setText("O");
                        retorno.setText("Vez do Jogador 1");
                    }
                    verifica_jogo();
                    Jogada++;
                }
                break;
            case R.id.button5:
                if(button5.getText().equals(" ")) {
                    if (Jogada % 2 == 0) {
                        button5.setText("X");
                        retorno.setText("Vez do Jogador 2");
                    } else {
                        button5.setText("O");
                        retorno.setText("Vez do Jogador 1");
                    }
                    verifica_jogo();
                    Jogada++;
                }
                break;
            case R.id.button6:
                if(button6.getText().equals(" ")) {
                    if (Jogada % 2 == 0) {
                        button6.setText("X");
                        retorno.setText("Vez do Jogador 2");
                    } else {
                        button6.setText("O");
                        retorno.setText("Vez do Jogador 1");
                    }
                    verifica_jogo();
                    Jogada++;
                }
                break;
            case R.id.button7:
                if(button7.getText().equals(" ")) {
                    if (Jogada % 2 == 0) {
                        button7.setText("X");
                        retorno.setText("Vez do Jogador 2");
                    } else {
                        button7.setText("O");
                        retorno.setText("Vez do Jogador 1");
                    }
                    verifica_jogo();
                    Jogada++;
                }
                break;
            case R.id.button8:
                if(button8.getText().equals(" ")) {
                    if (Jogada % 2 == 0) {
                        button8.setText("X");
                        retorno.setText("Vez do Jogador 2");
                    } else {
                        button8.setText("O");
                        retorno.setText("Vez do Jogador 1");
                    }
                    verifica_jogo();
                    Jogada++;
                }
                break;
            case R.id.button9:
                if(button9.getText().equals(" ")) {
                    if (Jogada % 2 == 0) {
                        button9.setText("X");
                        retorno.setText("Vez do Jogador 2");
                    } else {
                        button9.setText("O");
                        retorno.setText("Vez do Jogador 1");
                    }
                    verifica_jogo();
                    Jogada++;
                }
                break;
        }
    }

    /*    1 2 3   *
     *    4 5 6   *
     *    7 8 9   */

    public void verifica_jogo(){
        if(
                (button1.getText().equals(button2.getText()) && button2.getText().equals(button3.getText())
                        && button3.getText().equals(" ") == false) || /* Horizontal 1 */
                        (button4.getText().equals(button5.getText()) &&
                                button5.getText().equals(button6.getText())
                                && button6.getText().equals(" ") == false) || /* Horizontal 2 */
                        (button7.getText().equals(button8.getText())
                                && button8.getText().equals(button9.getText())
                                && button9.getText().equals(" ") == false) || /* Horizontal 3 */
                        (button1.getText().equals(button4.getText())
                                && button4.getText().equals(button7.getText())
                                && button7.getText().equals(" ") == false) || /* Vertical 1 */
                        (button2.getText().equals(button5.getText())
                                && button5.getText().equals(button8.getText())
                                && button8.getText().equals(" ") == false) || /* Vertical 2 */
                        (button3.getText().equals(button6.getText())
                                && button6.getText().equals(button9.getText())
                                && button9.getText().equals(" ") == false) || /* Vertical 3 */
                        (button1.getText().equals(button5.getText())
                                && button5.getText().equals(button9.getText())
                                && button9.getText().equals(" ") == false) || /* Diagonal 1 */
                        (button3.getText().equals(button5.getText())
                                && button5.getText().equals(button7.getText())
                                && button7.getText().equals(" ") == false)    /* Diagonal 2 */
                ){
            fim_de_jogo();
        }
        else if(
                button1.getText().equals(" ") == false &&
                        button2.getText().equals(" ") == false &&
                        button3.getText().equals(" ") == false &&
                        button4.getText().equals(" ") == false &&
                        button5.getText().equals(" ") == false &&
                        button6.getText().equals(" ") == false &&
                        button7.getText().equals(" ") == false &&
                        button8.getText().equals(" ") == false &&
                        button9.getText().equals(" ") == false
                ){
            deu_velha();
        }
    }

    public void fim_de_jogo(){
        if(Jogada%2 == 0){
            retorno.setText("O Jogador 1 ganhou!");
        }
        else{
            retorno.setText("O Jogador 2 ganhou!");
        }
        if(button1.getText().equals(" ")){
            button1.setText("");
        }
        if(button2.getText().equals(" ")){
            button2.setText("");
        }
        if(button3.getText().equals(" ")){
            button3.setText("");
        }
        if(button4.getText().equals(" ")){
            button4.setText("");
        }
        if(button5.getText().equals(" ")){
            button5.setText("");
        }
        if(button6.getText().equals(" ")){
            button6.setText("");
        }
        if(button7.getText().equals(" ")){
            button7.setText("");
        }
        if(button8.getText().equals(" ")){
            button8.setText("");
        }
        if(button9.getText().equals(" ")){
            button9.setText("");
        }
    }
    public void deu_velha(){
        retorno.setText("Deu Velha!");
    }

    public void limpar(View view) {
        button1.setText(" ");
        button2.setText(" ");
        button3.setText(" ");
        button4.setText(" ");
        button5.setText(" ");
        button6.setText(" ");
        button7.setText(" ");
        button8.setText(" ");
        button9.setText(" ");
        Jogada = 0;
        retorno.setText("Vez do Jogador 1");
    }
}