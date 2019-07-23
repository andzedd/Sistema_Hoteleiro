/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.view;

import br.com.fatec.dao.HospedeDAO;
import br.com.fatec.dao.QuartoDAO;
import br.com.fatec.dao.UtilizarReservarDAO;
import br.com.fatec.model.Hospede;
import br.com.fatec.model.Quarto;
import br.com.fatec.model.UtilizarReservar;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author s4ms3pi0l
 */
public class AdicionarAluguel extends javax.swing.JInternalFrame {
    HospedeDAO hospedeDao = new HospedeDAO();
    QuartoDAO qDao = new QuartoDAO();
    UtilizarReservarDAO urDao = new UtilizarReservarDAO();
    /**
     * Creates new form AdicionarReserva
     */
    public AdicionarAluguel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNomeHospede = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtTot = new javax.swing.JTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        txtEntrada = new javax.swing.JFormattedTextField();
        txtSaida = new javax.swing.JFormattedTextField();

        jLabel5.setText("jLabel5");

        jLabel1.setText("CPF do Hospede");

        jLabel2.setText("Nome do Hospede");

        txtNomeHospede.setEnabled(false);

        jLabel3.setText("Número do Quarto");

        txtNum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumFocusLost(evt);
            }
        });
        txtNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumKeyTyped(evt);
            }
        });

        jButton1.setText("Verificar Disponibilidade");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo do Quarto");

        txtTipo.setEnabled(false);

        jLabel6.setText("Data de Entrada");

        jLabel7.setText("Data de Saída");

        jLabel8.setText("Valor Diaria");

        txtTotal.setEnabled(false);

        jButton2.setText("Confirmar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel9.setText("Valor Total");

        txtTot.setEnabled(false);

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(txtNomeHospede, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(txtCpf))
                    .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtTipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                .addComponent(txtNum, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtTot, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtSaida, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                        .addGap(33, 33, 33)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3))
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeHospede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(txtTot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        hide();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(txtCpf.getText().equals("") || txtNum.getText().equals("") || txtEntrada.getText().equals("") || txtSaida.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos de aluguel!");
        } else {
            UtilizarReservar ur = new UtilizarReservar();
            ur.setCpf(txtCpf.getText());
            ur.setNumQuarto(txtNum.getText());
            ur.setValorTotal(Float.parseFloat(txtTot.getText()));
            ur.setEntrada(txtEntrada.getText());
            ur.setSaida(txtSaida.getText());
            try {
                if(urDao.inserirReserva(ur)){
                    JOptionPane.showMessageDialog(null, "Aluguel realizado com sucesso!");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao alugar: " + ex);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao alugar! " + ex);
            }
            limpaDados();        
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(txtNum.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Insira o numero do quarto!");
        } else if(txtEntrada.getText().equals("") || txtEntrada.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Insira as datas de entrada/saída corretamente!");
        } else {
            UtilizarReservar ur = new UtilizarReservar();
            
            ur.setNumQuarto(txtNum.getText());
            try {
                ur = urDao.consultarDisponibilidade(ur);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro: "
                        + ex.getMessage());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(BuscarHospede.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (ur == null) {
                JOptionPane.showMessageDialog(rootPane, "Quarto disponível");
            } else if (Integer.parseInt(txtEntrada.getText()) > Integer.parseInt(txtSaida.getText())){
            } else if (Integer.parseInt(ur.getEntrada()) > Integer.parseInt(txtEntrada.getText())){
                if(Integer.parseInt(ur.getEntrada()) < Integer.parseInt(txtSaida.getText())){
                    //insere no banco
                    JOptionPane.showMessageDialog(rootPane, "Quarto disponível nesta data!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Quarto indisponível nesta data!");
                    txtEntrada.setText("");
                    txtSaida.setText("");
                }
            } else if (Integer.parseInt(ur.getSaida()) < Integer.parseInt(txtEntrada.getText())){
                // insere no banco
                JOptionPane.showMessageDialog(rootPane, "Quarto disponível nesta data!");
            } else if (Integer.parseInt(txtEntrada.getText()) > Integer.parseInt(ur.getEntrada())){
                if(Integer.parseInt(txtEntrada.getText()) > Integer.parseInt(ur.getSaida())){
                    //insere no banco
                    JOptionPane.showMessageDialog(rootPane, "Quarto disponível nesta data!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Quarto indisponível nesta data!");
                    txtEntrada.setText("");
                    txtSaida.setText("");
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumFocusLost
        // TODO add your handling code here:
        Quarto q = new Quarto();
        q.setNumQuarto(txtNum.getText());
        try {
            q = qDao.buscar(q);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro: "
                    + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdicionarAluguel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(q != null){
            txtTipo.setText(q.getTipoQuarto());
            txtTotal.setText(String.valueOf(q.getValorDiaria()));
        } else {
            JOptionPane.showMessageDialog(rootPane, "Quarto não encontrado!");
            txtTipo.setText("");
            txtTotal.setText("");
        }
    }//GEN-LAST:event_txtNumFocusLost

    private void txtNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE){
            evt.consume();
        }
    }//GEN-LAST:event_txtNumKeyTyped

    public void limpaDados(){
        txtCpf.setText("");
        txtNum.setText("");
        txtNomeHospede.setText("");
        txtTipo.setText("");
        txtTotal.setText("");
        txtEntrada.setText("");
        txtSaida.setText("");
        txtTot.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtEntrada;
    private javax.swing.JTextField txtNomeHospede;
    private javax.swing.JTextField txtNum;
    private javax.swing.JFormattedTextField txtSaida;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtTot;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
