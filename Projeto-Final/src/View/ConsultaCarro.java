
package View;
import Controller.CarroController;
import Model.Carro;
import Servicos.BD;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class ConsultaCarro extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaVeiculo
     */
    public ConsultaCarro() {
        BD.conectar();
        initComponents();
        CarroController.getAll();
        ArrayList<Carro> veiculos = new ArrayList<Carro>();

        for (Carro carro: CarroController.getAll()) {

            resultsV.setText(carro.getMarca() + "\n" + carro.getModelo() + "\n" + carro.getPlaca());
        }

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        resultsV = new javax.swing.JTextArea();
        btnExportar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnCadC = new javax.swing.JMenu();
        btnCadV = new javax.swing.JMenu();
        btnConsC = new javax.swing.JMenu();
        btnConsV = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        resultsV.setColumns(20);
        resultsV.setRows(5);
        jScrollPane1.setViewportView(resultsV);

        btnExportar.setText("Exportar");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

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
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExportar)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExportar)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {
        ConsultaCliente textArea = new ConsultaCliente();

        String content = resultsV.getText();

        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter("D:\\Step Computer Academy\\Dever de casa\\Java\\Projeto-Final\\BD\\CadVeiculos.txt");
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        try {
            bufferedWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        JOptionPane.showMessageDialog(null, "Arquivo exportado com sucesso.", "Sucesso!",HEIGHT);
    }

    private void btnCadCMouseClicked(java.awt.event.MouseEvent evt) {
        this.setVisible(false);
        CadastroCliente tela = new CadastroCliente();
        tela.setVisible(true);
    }

    private void btnCadVMouseClicked(java.awt.event.MouseEvent evt) {
        this.setVisible(false);
        CadastroCarro tela = new CadastroCarro();
        tela.setVisible(true);
    }

    private void btnConsCMouseClicked(java.awt.event.MouseEvent evt) {
        this.setVisible(false);
        ConsultaCliente tela = new ConsultaCliente();
        tela.setVisible(true);
    }

    private void btnConsVMouseClicked(java.awt.event.MouseEvent evt) {
        JOptionPane.showMessageDialog(rootPane, "Clique em outra página", "Aviso", HEIGHT);
    }

    /**
     * @param args the command linements
     */
    public static void corcunda(String args[]) {
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
            Logger.getLogger(ConsultaCarro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ConsultaCarro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ConsultaCarro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ConsultaCarro.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaCarro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JMenu btnCadC;
    private javax.swing.JMenu btnCadV;
    private javax.swing.JMenu btnConsC;
    private javax.swing.JMenu btnConsV;
    private javax.swing.JButton btnExportar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea resultsV;
    // End of variables declaration
}
