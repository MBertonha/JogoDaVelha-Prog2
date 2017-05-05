/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogovelha;

/**
 *
 * @author Usuario
 */
public class TelaJogo extends javax.swing.JFrame {

    JogoVelha jogo;
    boolean vez;
    String posicao;
    
    public TelaJogo() {
        initComponents();
        jogo = new JogoVelha();
        vez = false; //Vez J1
        posicao = " ";
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeJogador1 = new javax.swing.JTextField();
        nomeJogador2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        char1 = new javax.swing.JTextField();
        char2 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        inserir = new javax.swing.JButton();
        escolha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        campo1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        campo2 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        campo3 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        campo4 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        campo7 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        campo8 = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        campo5 = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        campo9 = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        campo6 = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        ganhador = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome J1:");

        jLabel2.setText("Nome J2:");

        nomeJogador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeJogador2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Char 1:");

        jLabel4.setText("Char 2:");

        char2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                char2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Posição:");

        inserir.setText("Inserir");
        inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(campo1);

        jScrollPane2.setViewportView(campo2);

        jScrollPane3.setViewportView(campo3);

        jScrollPane4.setViewportView(campo4);

        jScrollPane5.setViewportView(campo7);

        jScrollPane6.setViewportView(campo8);

        jScrollPane7.setViewportView(campo5);

        jScrollPane8.setViewportView(campo9);

        jScrollPane9.setViewportView(campo6);

        jButton1.setText("Testar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ganhador.setText(" ");

        jLabel6.setText("Vencedor:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nomeJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(escolha))
                                    .addComponent(nomeJogador2))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(char1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(char2))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(inserir))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ganhador, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                            .addComponent(jScrollPane6)
                                            .addComponent(jScrollPane2))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane3)
                                            .addComponent(jScrollPane8)
                                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomeJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(char1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeJogador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(char2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(escolha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inserir))
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane7)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8)
                    .addComponent(jScrollPane6)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(ganhador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeJogador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeJogador2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeJogador2ActionPerformed

    private void char2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_char2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_char2ActionPerformed

    private void inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirActionPerformed
        jogo.j1.nome = nomeJogador1.getText();
        jogo.j2.nome = nomeJogador2.getText();
        if (vez == false){
            jogo.j1.caractere = char1.getText();
            jogo.j1.jogada = escolha.getText();
            if("1".equals(jogo.j1.jogada)){
                campo1.setText(jogo.j1.caractere);
            }
            if("2".equals(jogo.j1.jogada)){
                campo2.setText(jogo.j1.caractere);
            }
            if("3".equals(jogo.j1.jogada)){
                campo3.setText(jogo.j1.caractere);
            }
            if("4".equals(jogo.j1.jogada)){
                campo4.setText(jogo.j1.caractere);
            }
            if("5".equals(jogo.j1.jogada)){
                campo5.setText(jogo.j1.caractere);
            }
            if("6".equals(jogo.j1.jogada)){
                campo6.setText(jogo.j1.caractere);
            }
            if("7".equals(jogo.j1.jogada)){
                campo7.setText(jogo.j1.caractere);
            }
            if("8".equals(jogo.j1.jogada)){
                campo8.setText(jogo.j1.caractere);
            }
            if("9".equals(jogo.j1.jogada)){
                campo9.setText(jogo.j1.caractere);
            }
        vez = true;
        }
        else{
            jogo.j2.caractere = char2.getText();
            jogo.j2.jogada = escolha.getText();
            if("1".equals(jogo.j2.jogada)){
                campo1.setText(jogo.j2.caractere);
            }
            if("2".equals(jogo.j2.jogada)){
                campo2.setText(jogo.j2.caractere);
            }
            if("3".equals(jogo.j2.jogada)){
                campo3.setText(jogo.j2.caractere);
            }
            if("4".equals(jogo.j2.jogada)){
                campo4.setText(jogo.j2.caractere);
            }
            if("5".equals(jogo.j2.jogada)){
                campo5.setText(jogo.j2.caractere);
            }
            if("6".equals(jogo.j2.jogada)){
                campo6.setText(jogo.j2.caractere);
            }
            if("7".equals(jogo.j2.jogada)){
                campo7.setText(jogo.j2.caractere);
            }
            if("8".equals(jogo.j2.jogada)){
                campo8.setText(jogo.j2.caractere);
            }
            if("9".equals(jogo.j2.jogada)){
                campo9.setText(jogo.j2.caractere);
            }
           vez = false;
        }
    }//GEN-LAST:event_inserirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//J1
    //J1 ------------------ Linhas ---------------
        if(campo1.getText().equals(jogo.j1.caractere) && campo2.getText().equals(jogo.j1.caractere) && campo3.getText().equals(jogo.j1.caractere)){
            ganhador.setText(jogo.j1.nome);
        }
        else if(campo4.getText().equals(jogo.j1.caractere) && campo5.getText().equals(jogo.j1.caractere) && campo6.getText().equals(jogo.j1.caractere)){
            ganhador.setText(jogo.j1.nome);
        }
        else if(campo7.getText().equals(jogo.j1.caractere) && campo8.getText().equals(jogo.j1.caractere) && campo9.getText().equals(jogo.j1.caractere)){
            ganhador.setText(jogo.j1.nome);
        }
    //J1 ------------------ Colunas ---------------
        else if(campo1.getText().equals(jogo.j1.caractere) && campo4.getText().equals(jogo.j1.caractere) && campo7.getText().equals(jogo.j1.caractere)){
            ganhador.setText(jogo.j1.nome);
        }
        else if(campo2.getText().equals(jogo.j1.caractere) && campo5.getText().equals(jogo.j1.caractere) && campo8.getText().equals(jogo.j1.caractere)){
            ganhador.setText(jogo.j1.nome);
        }
        else if(campo3.getText().equals(jogo.j1.caractere) && campo6.getText().equals(jogo.j1.caractere) && campo9.getText().equals(jogo.j1.caractere)){
            ganhador.setText(jogo.j1.nome);
        }
    //J1 ----------------- Diagonal -----------------
        else if(campo1.getText().equals(jogo.j1.caractere) && campo5.getText().equals(jogo.j1.caractere) && campo9.getText().equals(jogo.j1.caractere)){
            ganhador.setText(jogo.j1.nome);
        }
        else if(campo2.getText().equals(jogo.j1.caractere) && campo5.getText().equals(jogo.j1.caractere) && campo7.getText().equals(jogo.j1.caractere)){
            ganhador.setText(jogo.j1.nome);
        }

//J2----------------------------------------------------------------------------
    //J2 ------------------ Linhas ---------------
        else if(campo1.getText().equals(jogo.j2.caractere) && campo2.getText().equals(jogo.j2.caractere) && campo3.getText().equals(jogo.j2.caractere)){
            ganhador.setText(jogo.j2.nome);
        }
        else if(campo4.getText().equals(jogo.j2.caractere) && campo5.getText().equals(jogo.j2.caractere) && campo6.getText().equals(jogo.j2.caractere)){
            ganhador.setText(jogo.j2.nome);
        }
        else if(campo7.getText().equals(jogo.j2.caractere) && campo8.getText().equals(jogo.j2.caractere) && campo9.getText().equals(jogo.j2.caractere)){
            ganhador.setText(jogo.j2.nome);
        }
    //J2 ------------------ Colunas ---------------
        else if(campo1.getText().equals(jogo.j2.caractere) && campo4.getText().equals(jogo.j2.caractere) && campo7.getText().equals(jogo.j2.caractere)){
            ganhador.setText(jogo.j2.nome);
        }
        else if(campo2.getText().equals(jogo.j2.caractere) && campo5.getText().equals(jogo.j2.caractere) && campo8.getText().equals(jogo.j2.caractere)){
            ganhador.setText(jogo.j2.nome);
        }
        else if(campo3.getText().equals(jogo.j2.caractere) && campo6.getText().equals(jogo.j2.caractere) && campo9.getText().equals(jogo.j2.caractere)){
            ganhador.setText(jogo.j2.nome);
        }
    //J2 ----------------- Diagonal -----------------
        else if(campo1.getText().equals(jogo.j2.caractere) && campo5.getText().equals(jogo.j2.caractere) && campo9.getText().equals(jogo.j2.caractere)){
            ganhador.setText(jogo.j2.nome);
        }
        else if(campo2.getText().equals(jogo.j2.caractere) && campo5.getText().equals(jogo.j2.caractere) && campo7.getText().equals(jogo.j2.caractere)){
            ganhador.setText(jogo.j2.nome);
        }
        else{
            ganhador.setText("EMPATE! ");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane campo1;
    private javax.swing.JTextPane campo2;
    private javax.swing.JTextPane campo3;
    private javax.swing.JTextPane campo4;
    private javax.swing.JTextPane campo5;
    private javax.swing.JTextPane campo6;
    private javax.swing.JTextPane campo7;
    private javax.swing.JTextPane campo8;
    private javax.swing.JTextPane campo9;
    private javax.swing.JTextField char1;
    private javax.swing.JTextField char2;
    private javax.swing.JTextField escolha;
    private javax.swing.JTextField ganhador;
    private javax.swing.JButton inserir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nomeJogador1;
    private javax.swing.JTextField nomeJogador2;
    // End of variables declaration//GEN-END:variables
}
