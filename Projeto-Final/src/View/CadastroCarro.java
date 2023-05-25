/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Controller.CarroController;
import Model.Carro;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CadastroCarro extends javax.swing.JFrame {

    public CadastroCarro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        btnCadastraV = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnCadC = new javax.swing.JMenu();
        btnCadV = new javax.swing.JMenu();
        btnConsC = new javax.swing.JMenu();
        btnConsV = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCadastraV.setText("Cadastrar");
        btnCadastraV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastraVActionPerformed(evt);
            }
        });

        jLabel2.setText("Modelo");

        jLabel3.setText("Marca");

        jLabel4.setText("Placa");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Cadastro de Veículos");

        btnCadC.setText("Cadastro Clientes");
        btnCadC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadCMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnCadC);

        btnCadV.setText("Cadastro Veículos");
        btnCadV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadVMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnCadV);

        btnConsC.setText("Consulta Clientes");
        btnConsC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsCMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnConsC);

        btnConsV.setText("Consulta Veículos");
        btnConsV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsVMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnConsV);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(14, 14, 14)
                                                                .addComponent(btnCadastraV, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtModelo)))
                                .addContainerGap(97, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(124, 124, 124))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addComponent(btnCadastraV)
                                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>

    private void btnCadCMouseClicked(java.awt.event.MouseEvent evt) {
        this.setVisible(false);
        CadastroCliente tela = new CadastroCliente();
        tela.setVisible(true);
    }

    private void btnCadVMouseClicked(java.awt.event.MouseEvent evt) {
        JOptionPane.showMessageDialog(rootPane, "Você já está nesta página", "Aviso", HEIGHT);
    }

    private void btnConsCMouseClicked(java.awt.event.MouseEvent evt) {
        this.setVisible(false);
        ConsultaCliente tela = new ConsultaCliente();
        tela.setVisible(true);    }

    private void btnConsVMouseClicked(java.awt.event.MouseEvent evt) {
        this.setVisible(false);
        ConsultaCarro tela = new ConsultaCarro();
        tela.setVisible(true);
    }

    private void btnCadastraVActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            Carro carro = new Carro();
            carro.setMarca(txtMarca.getText());
            carro.setModelo(txtModelo.getText());
            carro.setPlaca(txtPlaca.getText());

            if(txtMarca.getText().equals("") || txtModelo.getText().equals("") || txtPlaca.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Preencha todos os campos.", "Sucesso!",HEIGHT);
            } else {
                FileWriter arquivo;
                try {
                    arquivo = new FileWriter("D:\\Step Computer Academy\\Dever de casa\\Java\\Projeto-Final\\BD\\CadVeiculos.txt",true);
                    PrintWriter print = new PrintWriter(arquivo);

                    print.println(carro.getModelo() + "#;#" + carro.getPlaca() + "#;#" + carro.getMarca());
                    arquivo.close();

                } catch (IOException ex) {
                    Logger.getLogger(CadastroCarro.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NumberFormatException ex){
                    Logger.getLogger(CadastroCarro.class.getName()).log(Level.SEVERE, null, ex);
                }

                CarroController.insert(carro);
                JOptionPane.showMessageDialog(null, "Veículo Cadastrado!");
                txtModelo.setText("");
                txtPlaca.setText("");
                txtMarca.setText("");
            }

        } catch(NumberFormatException err){
            JOptionPane.showMessageDialog(null, "O ano só pode ter número!");
        }
    }


    public static void cadunic(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CadastroCarro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(CadastroCarro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(CadastroCarro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(CadastroCarro.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCarro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JMenu btnCadC;
    private javax.swing.JMenu btnCadV;
    private javax.swing.JButton btnCadastraV;
    private javax.swing.JMenu btnConsC;
    private javax.swing.JMenu btnConsV;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtMarca;
    // End of variables declaration
}
