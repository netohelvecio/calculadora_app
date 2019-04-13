package com.example.neto.app_calculadora;


import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.neto.app_calculadora.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_0, btn_1, btn_2, btn_3, btn_4,
            btn_5, btn_6, btn_7, btn_8, btn_9,
            btn_ce, btn_back, btn_ponto,
            btn_dividir, btn_vezes, btn_mais, btn_menos, btn_igual;

    TextView tvoper1, tvoper2, result, tvop;

    private boolean flagMudancaTexto = false; // controla a mudança dos preenchimento dos campos número
    Context context = this; // referencia this

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //captura dos componentes
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_ce = (Button) findViewById(R.id.btn_ce);
        btn_back = (Button) findViewById(R.id.btn_back);
        btn_ponto = (Button) findViewById(R.id.btn_ponto);
        btn_dividir = (Button) findViewById(R.id.btn_dividir);
        btn_vezes = (Button) findViewById(R.id.btn_vezes);
        btn_mais = (Button) findViewById(R.id.btn_mais);
        btn_menos = (Button) findViewById(R.id.btn_menos);
        btn_igual = (Button) findViewById(R.id.btn_igual);
        tvoper1 = (TextView) findViewById(R.id.tvoper1);
        tvoper2 = (TextView) findViewById(R.id.tvoper2);
        tvop = (TextView) findViewById(R.id.tvop);
        result = (TextView) findViewById(R.id.result);

        // operações
        btn_mais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button btn = (Button) v; // converte o view em botão
                verificaCaixa1(btn); // metodo de verifica caixa 1
            }
        });
        btn_menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button btn = (Button) v; // converte o view em botão
                verificaCaixa1(btn); // metodo de verifica caixa 1
            }
        });
        btn_dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button btn = (Button) v; // converte o view em botão
                verificaCaixa1(btn); // metodo de verifica caixa 1
            }
        });
        btn_vezes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button btn = (Button) v; // converte o view em botão
                verificaCaixa1(btn); // metodo de verifica caixa 1
            }
        });

        //números
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mudancaFoco(); // metodo para mudar o foco
                escreverNum(v);// metodo para exibir texto nos textviews
            }
        });
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mudancaFoco(); // metodo para mudar o foco
                escreverNum(v);// metodo para exibir texto nos textviews
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mudancaFoco(); // metodo para mudar o foco
                escreverNum(v);// metodo para exibir texto nos textviews
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mudancaFoco(); // metodo para mudar o foco
                escreverNum(v);// metodo para exibir texto nos textviews
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mudancaFoco(); // metodo para mudar o foco
                escreverNum(v);// metodo para exibir texto nos textviews
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mudancaFoco(); // metodo para mudar o foco
                escreverNum(v);// metodo para exibir texto nos textviews
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mudancaFoco(); // metodo para mudar o foco
                escreverNum(v);// metodo para exibir texto nos textviews
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mudancaFoco(); // metodo para mudar o foco
                escreverNum(v);// metodo para exibir texto nos textviews
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mudancaFoco(); // metodo para mudar o foco
                escreverNum(v);// metodo para exibir texto nos textviews
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mudancaFoco(); // metodo para mudar o foco
                escreverNum(v);// metodo para exibir texto nos textviews
            }
        });

        //outros botões
        btn_ponto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mudancaFoco(); // metodo para mudar o foco
                Button btn = (Button) v; // converte o view em botão
                String texto = tv.getText().toString(); // obtem o texto já existente
                if (!texto.contains(".") && texto.length() != 0) { //verifica se já exite ponto
                    texto = texto + btn.getText().toString(); // concatena texto existente com o ponto
                }
                tv.setText(texto); // altera o textview
            }
        });

        btn_igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO operação de igual

                if (tvoper1.getText().toString().equals("") || tvoper2.getText().toString().equals("") || tvop.getText().equals("")) {
                    Toast.makeText(context, "Adicione os valores!", Toast.LENGTH_SHORT).show(); // apresenta texto na tela informando erro
                }


                if (!tvoper1.getText().toString().equals("") && !tvoper2.getText().toString().equals("") && !tvop.getText().toString().equals("")) { //Se as 2 tv estiverem com dados , faz a operação
                    // converte os textos para double
                    Double op1 = Double.valueOf(tvoper1.getText().toString());
                    Double op2 = Double.valueOf(tvoper2.getText().toString());
                    String op = tvop.getText().toString(); // verifica qual a operação
                    Double resultado = 0.0;

                    if (op.equals("+")) {
                        resultado = op1 + op2;
                    } else if (op.equals("-")) {
                        resultado = op1 - op2;
                    } else if (op.equals("*")) {
                        resultado = op1 * op2;
                    } else {
                        resultado = op1 / op2;
                    }
                    if (op2 == 0) {
                        result.setText("Impossível dividir por zero"); // apresenta o erro
                    } else {
                        String texto = resultado.toString();
                        tvoper1.setText(resultado.toString());
                        tvoper2.setText("");
                        tvop.setText("");
                        flagMudancaTexto = true;
                        if(texto.substring(texto.length() -2).equals(".0")){
                            texto = texto.substring(0, texto.length() -2);
                            result.setText(texto);
                            tvoper1.setText(texto);
                        }else{
                            result.setText(resultado.toString()); // coloco resultado na tela
                        }
                    }
                }
            }
        });

        btn_ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO limpar todos textviews
                tvoper1.setText("");
                tvoper2.setText("");
                tvop.setText("");
                result.setText("");
                flagMudancaTexto = false; // retorna foco para primeira caixa
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO operação de apagar ultimo caracter
                mudancaFoco();
                String texto = tv.getText().toString();
                if (texto.length() != 0) { //verifica se o texto esta vazio
                    texto = texto.substring(0, texto.length() - 1); //apaga o caracter mais a direita
                    if (texto.length() != 0 && texto.substring(texto.length() - 1).equals(".")) { //verifica se sobrou ponto a direita
                        texto = texto.substring(0, texto.length() - 1); //apaga a direita mais uma vez
                    }
                    tv.setText(texto);
                }
            }
        });
    }

    @Override
    public void onClick(View v) {

    }

    TextView tv;

    public void mudancaFoco() { // metodo para mudar o foco
        if (flagMudancaTexto == true) { // verifica se o valor do botão deve ser colocado na primeira ou na segunda caixa
            //false = caixa1
            //true = caixa2
            tv = tvoper2; // coloca na segunda
        } else {
            tv = tvoper1; // colcoa na primeira
        }
    }

    public void verificaCaixa1(Button x) { // metodo para verificar se a primeira caixa esta vazia, para não preencher a segunda
        if (tvoper1.getText().equals("")) { // verifica se esta vazia
            Toast.makeText(this, "Adicione o primeiro operando!", Toast.LENGTH_SHORT).show(); // apresenta texto na tela informando erro
        } else { // se estiver preenchida altera para caixa 2
            flagMudancaTexto = true; // muda o foco para a caixa 2
            tvop.setText(x.getText()); // adiciona a operação ao textview
        }
    }

    public void escreverNum(View x) { // metodo para exibir numero nos textviews
        Button btn = (Button) x; // converte o view em botão
        String texto = tv.getText().toString(); // obtem o texto já existente
        texto = texto + btn.getText().toString(); // concatena texto existente com o número
        tv.setText(texto); // altera o textview
    }
}
