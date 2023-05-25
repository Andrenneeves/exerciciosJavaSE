package Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {
    private JLabel lbl_titulo;
    private JTextField txt_valor1;
    private JTextField txt_visor;

    private JButton btn_0;
    private JButton btn_1;
    private JButton btn_2;
    private JButton btn_3;
    private JButton btn_4;
    private JButton btn_5;
    private JButton btn_6;
    private JButton btn_7;
    private JButton btn_8;
    private JButton btn_9;

    private JButton btn_soma;
    private JButton btn_subtrai;
    private JButton btn_multiplica;
    private JButton btn_divide;
    private JButton btn_igual;
    private JButton btn_ponto;
    private JButton btn_igual;
    private JButton btn_quadrado;
    private JButton btn_raizQuadrada;
    private JButton btn_umSobreValor;
    private JButton btn_inverteSinal;
    private JButton btn_porcentagem;
    private JButton btn_clear;
    private JButton btn_clearEntry;
    private JButton btn_apaga;
    private double valor1;
    private String operador;

    public Calculadora() {
        //JANELA
        super.getContentPane().setLayout(null);
        super.getContentPane().setBackground(new Color(10,10,10));
        super.setSize(450,350);
        super.setTitle("Calculadora que não funciona");
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setLocation(200,200);

        //Titulo LABEL
        lbl_titulo = new JLabel("CALCULADORA");
        lbl_titulo.setBounds(150,20,320,25);
        lbl_titulo.setForeground(new Color(255,255,255));
        super.getContentPane().add(lbl_titulo);

        //VISOR
        txt_visor = new JTextField(15);
        txt_visor.setBounds(40,60,300,25);
        super.getContentPane().add(txt_visor);

        //LINHA 1--------------------------------------------

        btn_porcentagem = new JButton("%");
        btn_porcentagem.setBounds(20, 100, 65, 40);
        super.getContentPane().add(btn_porcentagem);

        btn_clearEntry = new JButton("CE");
        btn_clearEntry.setBounds(90, 100, 65, 40);
        super.getContentPane().add(btn_clearEntry);

        btn_clear = new JButton("C");
        btn_clear.setBounds(160, 100, 65, 40);
        super.getContentPane().add(btn_clear);

        btn_apaga = new JButton("⌫");
        btn_apaga.setBounds(230, 100, 65, 40);
        super.getContentPane().add(btn_apaga);

        //LINHA 2-----------------------------------------------

        btn_umSobreValor = new JButton("1/x");
        btn_umSobreValor.setBounds(20, 145, 65, 40);
        super.getContentPane().add(btn_umSobreValor);

        btn_quadrado = new JButton("x²");
        btn_quadrado.setBounds(90, 145, 65, 40);
        super.getContentPane().add(btn_quadrado);

        btn_raizQuadrada = new JButton("√x");
        btn_raizQuadrada.setBounds(160, 145, 65, 40);
        super.getContentPane().add(btn_raizQuadrada);

        btn_divide = new JButton("÷");
        btn_divide.setBounds(230, 145, 65, 40);
        super.getContentPane().add(btn_divide);

        //LINHA 3--------------------------------------------

        btn_7 = new JButton("7");
        btn_7.setBounds(20, 190, 65, 40);
        super.getContentPane().add(btn_7);

        btn_8 = new JButton("8");
        btn_8.setBounds(90, 190, 65, 40);
        super.getContentPane().add(btn_8);

        btn_9 = new JButton("9");
        btn_9.setBounds(160, 190, 65, 40);
        super.getContentPane().add(btn_9);

        btn_multiplica = new JButton("*");
        btn_multiplica.setBounds(230, 190, 65, 40);
        super.getContentPane().add(btn_multiplica);

        //LINHA 4--------------------------------------------

        btn_4 = new JButton("4");
        btn_4.setBounds(20, 235, 65, 40);
        super.getContentPane().add(btn_4);

        btn_5 = new JButton("5");
        btn_5.setBounds(90, 235, 65, 40);
        super.getContentPane().add(btn_5);

        btn_6 = new JButton("6");
        btn_6.setBounds(160, 235, 65, 40);
        super.getContentPane().add(btn_6);

        btn_subtrai = new JButton("-");
        btn_subtrai.setBounds(230, 235, 65, 40);
        super.getContentPane().add(btn_subtrai);

        //LINHA 5--------------------------------------------

        btn_1 = new JButton("1");
        btn_1.setBounds(20, 280, 65, 40);
        super.getContentPane().add(btn_1);

        btn_2 = new JButton("2");
        btn_2.setBounds(90, 280, 65, 40);
        super.getContentPane().add(btn_2);

        btn_3 = new JButton("3");
        btn_3.setBounds(160, 280, 65, 40);
        super.getContentPane().add(btn_3);

        btn_soma = new JButton("+");
        btn_soma.setBounds(230, 280, 65, 40);
        super.getContentPane().add(btn_soma);

        //LINHA 6--------------------------------------------

        btn_inverteSinal = new JButton("+/-");
        btn_inverteSinal.setBounds(20, 325, 65, 40);
        super.getContentPane().add(btn_inverteSinal);

        btn_0 = new JButton("0");
        btn_0.setBounds(90, 325, 65, 40);
        super.getContentPane().add(btn_0);

        btn_ponto = new JButton(",");
        btn_ponto.setBounds(160, 325, 65, 40);
        super.getContentPane().add(btn_ponto);

        btn_igual = new JButton("=");
        btn_igual.setBounds(230, 325, 65, 40);
        btn_igual.setBackground(new Color(73, 160, 213));
        //btn_igual.setBorder(BorderFactory.createLineBorder(new Color(73,160,213)));
        super.getContentPane().add(btn_igual);

        this.eventosBtnNumeros();
        this.eventosBtnOperador();
  }

    private ActionListener btnNum(String num) {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txt_visor.getText().equals("0"))
                    txt_visor.setText(num);
                else
                    txt_visor.setText(txt_visor.getText() + num);
            }
        };
    }
    private void eventosBtnNumeros(){
        //Botão 0
        btn_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!txt_visor.getText().equals("0"))
                    txt_visor.setText(txt_visor.getText() + "0");
            }
        });
        //Botão 1
        btn_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txt_visor.getText().equals("0"))
                    txt_visor.setText("1");
                else
                    txt_visor.setText(txt_visor.getText() + "1");
            }
        });

        //Botão 2
        btn_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txt_visor.getText().equals("0"))
                    txt_visor.setText("2");
                else
                    txt_visor.setText(txt_visor.getText() + "2");
            }
        });

        //Botão 3
        btn_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txt_visor.getText().equals("0"))
                    txt_visor.setText("3");
                else
                    txt_visor.setText(txt_visor.getText() + "3");
            }
        });

        //Botão 4
        btn_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txt_visor.getText().equals("0"))
                    txt_visor.setText("4");
                else
                    txt_visor.setText(txt_visor.getText() + "4");
            }
        });

        //Botão 5
        btn_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txt_visor.getText().equals("0"))
                    txt_visor.setText("5");
                else
                    txt_visor.setText(txt_visor.getText() + "5");
            }
        });

        //Botão6
        btn_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txt_visor.getText().equals("0"))
                    txt_visor.setText("6");
                else
                    txt_visor.setText(txt_visor.getText() + "6");
            }
        });

        //Botão 7
        btn_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txt_visor.getText().equals("0"))
                    txt_visor.setText("7");
                else
                    txt_visor.setText(txt_visor.getText() + "7");
            }
        });

        //Botão 8
        btn_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txt_visor.getText().equals("0"))
                    txt_visor.setText("8");
                else
                    txt_visor.setText(txt_visor.getText() + "8");
            }
        });

        //Botão 9
        btn_9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txt_visor.getText().equals("0"))
                    txt_visor.setText("9");
                else
                    txt_visor.setText(txt_visor.getText() + "9");
            }


        });

        private void eventosBtnOperador(){
            btn_soma.addActionListener(btnOp("+"));
            btn_subtrai.addActionListener(btnOp("-"));
            btn_multiplica.addActionListener(btnOp("*"));
            btn_divide.addActionListener(btnOp("/"));
            btn_porcentagem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double num = Double.parseDouble(txt_visor.getText().replace(",", "."));
                    txt_visor.setText(String.valueOf(valor1*num/100).replace(".", ","));
                }
            });
            btn_clearEntry.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    txt_visor.setText("");
                }
            });
            btn_clear.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    txt_valor1.setText("");
                    txt_visor.setText("");
                }
            });
            btn_apaga.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    txt_visor.setText(txt_visor.getText().substring(0, txt_visor.getText().length() -1).replace(".", ","));
                }
            });
            btn_quadrado.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double num = Double.parseDouble(txt_visor.getText().replace(",", "."));
                    txt_visor.setText(String.valueOf(num*num).replace(".", ","));
                }
            });
            btn_inverteSinal.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double num = Double.parseDouble(txt_visor.getText().replace(",", "."));
                    txt_visor.setText(String.valueOf(num*-1).replace(".", ","));
                }
            });
            btn_raizQuadrada.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double num = Double.parseDouble(txt_visor.getText().replace(",", "."));
                    txt_visor.setText(String.valueOf(Math.sqrt(num)).replace(".", ","));
                }
            });
            btn_umSobreValor.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double num = Double.parseDouble(txt_visor.getText().replace(",", "."));
                    txt_visor.setText(String.valueOf(1/num).replace(".", ","));
                }
            });
            btn_ponto.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (contaVirgulaVisor(txt_visor.getText()) < 1)
                        if(txt_visor.getText().equals("")){
                            txt_visor.setText("0");
                            txt_visor.setText(txt_visor.getText() + ",");
                        } else
                            txt_visor.setText(txt_visor.getText() + ",");
                    else
                        txt_visor.setText(txt_visor.getText() + "");
                }
            });
            btn_igual.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double valor2 = Double.parseDouble(txt_visor.getText().replace(",", "."));

                    switch (operador){
                        case "+":
                            txt_visor.setText(String.valueOf(valor1 + valor2).replace(".", ","));
                            break;
                        case "-":
                            txt_visor.setText(String.valueOf(valor1 - valor2).replace(".", ","));
                            break;
                        case "*":
                            txt_visor.setText(String.valueOf(valor1 * valor2).replace(".", ","));
                            break;
                        case "/":
                            if(valor2 == 0){
                                txt_visor.setText("0");
                            } else {
                                txt_visor.setText(String.valueOf(valor1 / valor2).replace(".", ","));
                            }
                            break;
                    }
                }
            });
        }

        private ActionListener btnOp(String op){

            return new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    valor1 = Double.parseDouble(txt_visor.getText().replace(",", "."));
                    txt_valor1.setText(String.valueOf(valor1).replace(".", ","));
                    txt_visor.setText("");
                    operador = op;
                }
            };
        }
        private static int contaVirgulaVisor(String texto){
            int contador = 0;

            for (int i = 0; i < texto.length(); i++){
                char c = texto.charAt(i);
                if (c == ',')
                    contador++;
            }
            return contador;
        }
    }
}
