
package Telas;

import Classes.Receitas;
import Conexao.ReceitaDAO;
import Conexao.conexao;
import Tabela.Lista_receitas;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Publique extends javax.swing.JFrame {
    
    private TelaGeral lista;

    public Publique() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        restricoes = new javax.swing.JButton();
        salgado_botao = new javax.swing.JButton();
        doce_botao = new javax.swing.JButton();
        receitas_botao = new javax.swing.JButton();
        publique_botao = new javax.swing.JButton();
        voltar_botao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        nomeReceita_text = new javax.swing.JTextField();
        rendimento_text = new javax.swing.JTextField();
        tempo_text = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ingredientes_text = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        comentario_text = new javax.swing.JTextArea();
        cadastrar_botao = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        modoPreparo_text = new javax.swing.JTextArea();
        tipos_combo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(254, 235, 210));

        restricoes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        restricoes.setText("Restrições");
        restricoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restricoesActionPerformed(evt);
            }
        });

        salgado_botao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        salgado_botao.setText("Salgado");
        salgado_botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salgado_botaoActionPerformed(evt);
            }
        });

        doce_botao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        doce_botao.setText("Doce");
        doce_botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doce_botaoActionPerformed(evt);
            }
        });

        receitas_botao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        receitas_botao.setText("Receitas");
        receitas_botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receitas_botaoActionPerformed(evt);
            }
        });

        publique_botao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        publique_botao.setText("Publique");

        voltar_botao.setText("Voltar");
        voltar_botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar_botaoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("INFORMAÇÕES:");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Carregar foto ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel5)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel5)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        nomeReceita_text.setForeground(new java.awt.Color(153, 153, 153));
        nomeReceita_text.setText("Escreva o nome da receita aqui ");

        rendimento_text.setForeground(new java.awt.Color(153, 153, 153));
        rendimento_text.setText("Escreva o rendimento aqui ");

        tempo_text.setForeground(new java.awt.Color(153, 153, 153));
        tempo_text.setText("Escreva o tempo de preparo aqui ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("INGREDIENTES:");

        ingredientes_text.setColumns(20);
        ingredientes_text.setRows(5);
        jScrollPane1.setViewportView(ingredientes_text);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("MODO DE PREPARO:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("COMENTÁRIO:");

        comentario_text.setColumns(20);
        comentario_text.setForeground(new java.awt.Color(153, 153, 153));
        comentario_text.setRows(5);
        comentario_text.setText("Opcional");
        comentario_text.setToolTipText("");
        jScrollPane3.setViewportView(comentario_text);

        cadastrar_botao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cadastrar_botao.setText("Cadastrar");
        cadastrar_botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_botaoActionPerformed(evt);
            }
        });

        modoPreparo_text.setColumns(20);
        modoPreparo_text.setRows(5);
        jScrollPane4.setViewportView(modoPreparo_text);

        tipos_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doces", "Salgadas", "Saudáveis", "Sem glúten" }));

        jLabel6.setText("Tipo de receita:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(voltar_botao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(publique_botao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(receitas_botao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doce_botao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salgado_botao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(restricoes))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(tempo_text)
                            .addComponent(rendimento_text)
                            .addComponent(nomeReceita_text, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipos_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cadastrar_botao, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(restricoes)
                    .addComponent(salgado_botao)
                    .addComponent(doce_botao)
                    .addComponent(receitas_botao)
                    .addComponent(publique_botao)
                    .addComponent(voltar_botao))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeReceita_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rendimento_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tempo_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tipos_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(10, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cadastrar_botao)
                        .addGap(35, 35, 35))))
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

    private void voltar_botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar_botaoActionPerformed
        TelaGeral tela_geral = new TelaGeral();
        tela_geral.setVisible(true);
        dispose();
    }//GEN-LAST:event_voltar_botaoActionPerformed

    private void receitas_botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receitas_botaoActionPerformed
        TelaGeral tela_geral = new TelaGeral();
        tela_geral.setVisible(true);
        dispose();
    }//GEN-LAST:event_receitas_botaoActionPerformed

    private void doce_botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doce_botaoActionPerformed
        Doce tela_doce = new Doce();
        tela_doce.setVisible(true);
        dispose();
    }//GEN-LAST:event_doce_botaoActionPerformed

    private void salgado_botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salgado_botaoActionPerformed
        Salgado tela_salgado = new Salgado();
        tela_salgado.setVisible(true);
        dispose();
    }//GEN-LAST:event_salgado_botaoActionPerformed

    private void restricoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restricoesActionPerformed
        Restricoes tela_restricoes = new Restricoes();
        tela_restricoes.setVisible(true);
        dispose();
    }//GEN-LAST:event_restricoesActionPerformed

    private void cadastrar_botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_botaoActionPerformed

        if (nomeReceita_text.getText().isEmpty()
            && rendimento_text.getText().isEmpty()
            && tempo_text.getText().isEmpty()
            && ingredientes_text.getText().isEmpty()
            && modoPreparo_text.getText().isEmpty()
        ){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
            return;
        } else{
            JOptionPane.showMessageDialog(null, "A receita " + nomeReceita_text.getText() + " foi cadastrada com sucesso!");
        }
        
        ReceitaDAO receitadao = new ReceitaDAO();
        String nome = nomeReceita_text.getText();
        String rendimento = rendimento_text.getText();
        String tempo_de_preparo = tempo_text.getText();
        String ingredientes = ingredientes_text.getText();
        String descricao = modoPreparo_text.getText();
        
        String tipoCombo = tipos_combo.getSelectedItem().toString();
        
        if (tipos_combo.equals("Doces")){
            tipoCombo = "Doces";
        } else if (tipos_combo.equals("Salgadas")){
            tipoCombo = "Salgadas";
        } else if (tipos_combo.equals("Saudáveis")){
            tipoCombo = "Saudáveis";
        } else if (tipos_combo.equals("Sem glúten")){
            tipoCombo = "Sem glúten";
        }
        
        Receitas receitas = new Receitas();
        
        receitas.setNome(nome);
        receitas.setRendimento(rendimento);
        receitas.setTempo_de_preparo(tempo_de_preparo);
        receitas.setIngredientes(ingredientes);
        receitas.setDescricao(descricao);
        receitas.setTipo_receita(tipoCombo);
        
        receitadao.salvar(receitas);
        
        conexao conexao_banco = new conexao();
        
        conexao_banco.Conectar();
        
        Lista_receitas lista_receitas= new Lista_receitas();
        
        
        try {
            receitas.setNome(nome);
            receitas.setRendimento(rendimento);
            receitas.setTempo_de_preparo(tempo_de_preparo);
            receitas.setIngredientes(ingredientes);
            receitas.setDescricao(descricao);
            receitas.setTipo_receita(tipoCombo);
            
            lista_receitas.setDadosReceitas(receitas);
            
            if (lista != null){
                lista.atualizarTabela();
            }
        } catch (Exception ex){
            Logger.getLogger(Publique.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_cadastrar_botaoActionPerformed

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
            java.util.logging.Logger.getLogger(Publique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Publique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Publique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Publique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Publique().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar_botao;
    private javax.swing.JTextArea comentario_text;
    private javax.swing.JButton doce_botao;
    private javax.swing.JTextArea ingredientes_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea modoPreparo_text;
    private javax.swing.JTextField nomeReceita_text;
    private javax.swing.JButton publique_botao;
    private javax.swing.JButton receitas_botao;
    private javax.swing.JTextField rendimento_text;
    private javax.swing.JButton restricoes;
    private javax.swing.JButton salgado_botao;
    private javax.swing.JTextField tempo_text;
    private javax.swing.JComboBox<String> tipos_combo;
    private javax.swing.JButton voltar_botao;
    // End of variables declaration//GEN-END:variables
}
