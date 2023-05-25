import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {
    //criando os Textos
    private JLabel lbl_texto1;
    private JLabel lbl_texto2;
    private JLabel lbl_texto3;

    //criando inputs de texto
    private JTextField txt_texto1;
    private JTextField txt_texto2;
    private JTextField txt_resultado;

    //criando botões
    private JButton btn_somar;
    private JButton btn_subtrair;
    private JButton btn_multiplicar;
    private JButton btn_dividir;

    //Variáveis de ambiente
    private double valor1, valor2;

    public Calculadora(){
        //JFRAME - TELA
        setTitle("Calculadora JAVA - STEP");
        setSize(286,300);
        setLocation(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //LABELS
        lbl_texto1 = new JLabel("Valor 1: ");
        lbl_texto2 = new JLabel("Valor 2: ");
        lbl_texto3 = new JLabel("Resultado: ");

        //inputs
        txt_texto1 = new JTextField(10);
        txt_texto2 = new JTextField(10);
        txt_resultado = new JTextField(10);

        //BOTÕES
        btn_somar = new JButton("+");
        btn_subtrair = new JButton("-");
        btn_multiplicar = new JButton("*");
        btn_dividir = new JButton("/");

    }

    public void exit(){
        super.setVisible(false);
    }

    public void start(){
        //deixando o layout livre de grids
        getContentPane().setLayout(null);
        //cor de fundo
        getContentPane().setBackground(new Color(152, 155, 255));

        //Adicionar
        getContentPane().add(lbl_texto1);
        getContentPane().add(lbl_texto2);
        getContentPane().add(lbl_texto3);
        getContentPane().add(txt_texto1);
        getContentPane().add(txt_texto2);
        getContentPane().add(txt_resultado);
        getContentPane().add(btn_somar);
        getContentPane().add(btn_multiplicar);
        getContentPane().add(btn_dividir);
        getContentPane().add(btn_subtrair);

        //posicionando labels
        lbl_texto1.setBounds(40,20,100,25);
        lbl_texto2.setBounds(40,60,100,25);
        lbl_texto3.setBounds(40,100,100,25);

        //posicionando inputs
        txt_texto1      .setBounds(115,20,100,25);
        txt_texto2      .setBounds(115,60,100,25);
        txt_resultado   .setBounds(115,100,100,25);

        //posicionando os botões
        btn_somar       .setBounds(20,140,50,25);
        btn_subtrair    .setBounds(80,140,50,25);
        btn_multiplicar .setBounds(140,140,50,25);
        btn_dividir     .setBounds(200,140,50,25);

        this.setVisible(true);

        //instanciando a classe operaçoes e addiconando os eventos
        Operacoes op = new Operacoes();
        btn_somar       .addActionListener(op);
        btn_subtrair    .addActionListener(op);
        btn_multiplicar .addActionListener(op);
        btn_dividir     .addActionListener(op);
    }


    private class Calculos{
        static double somar(double valor1, double valor2){
            return valor1 + valor2;
        }
        static double subtrair(double valor1, double valor2){
            return valor1 - valor2;
        }
        static double dividir(double valor1, double valor2){
            return valor1 / valor2;
        }
        static double multiplicar(double valor1, double valor2){
            return valor1 * valor2;
        }
    }

    private class Operacoes implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource() == btn_somar){
                if(txt_texto1.getText().equals("") &&
                        txt_texto2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,
                            "Precisa preencher os Valores 1 e 2!");
                } else {
                    valor1 = Double.parseDouble(txt_texto1.getText());
                    valor2 = Double.parseDouble(txt_texto2.getText());

                    txt_resultado.setText(String.valueOf(Calculos.somar(valor1,valor2)));
                }
            } else if( e.getSource() == btn_somar){

            }
            //Botão subtrair
            if(e.getSource() == btn_subtrair){
                if(txt_texto1.getText().equals("") &&
                        txt_texto2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,
                            "Precisa preencher os Valores 1 e 2!");
                } else {
                    valor1 = Double.parseDouble(txt_texto1.getText());
                    valor2 = Double.parseDouble(txt_texto2.getText());

                    txt_resultado.setText(String.valueOf(Calculos.subtrair(valor1,valor2)));
                }
            } else if( e.getSource() == btn_subtrair){

            }
            //Botão multiplicar
            if(e.getSource() == btn_multiplicar){
                if(txt_texto1.getText().equals("") &&
                        txt_texto2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,
                            "Precisa preencher os Valores 1 e 2!");
                } else {
                    valor1 = Double.parseDouble(txt_texto1.getText());
                    valor2 = Double.parseDouble(txt_texto2.getText());

                    txt_resultado.setText(String.valueOf(Calculos.multiplicar(valor1,valor2)));
                }
            } else if( e.getSource() == btn_multiplicar){

            }
            //Botão Dividir
            if(e.getSource() == btn_dividir){
                if(txt_texto1.getText().equals("") &&
                        txt_texto2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,
                            "Precisa preencher os Valores 1 e 2!");
                } else {
                    valor1 = Double.parseDouble(txt_texto1.getText());
                    valor2 = Double.parseDouble(txt_texto2.getText());

                    txt_resultado.setText(String.valueOf(Calculos.dividir(valor1,valor2)));
                }
            } else if( e.getSource() == btn_dividir){

            }


        }
    }
}//--------------------FIM class Calculadora

