
package Telas;

import Classes.Receitas;
import Conexao.ReceitaDAO;
import Tabela.Lista_receitas;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class TelaGeral extends javax.swing.JFrame {

    public TelaGeral() {
        initComponents();
        atualizarTabela();
        preencherTabela();

    }
    
     public void atualizarTabela(){
        
        String[] colunas = {
            "Nome", "Ingredientes","Descrição", "Rendimento", "Tempo de preparo","Tipo de receita"
        };

        DefaultTableModel tableModel = new DefaultTableModel(colunas,0);
        
        List<Receitas> listaCompleta = Lista_receitas.Listar();

        for(Receitas r : listaCompleta){
            String[] linha = {
                r.getNome(),
                r.getIngredientes(),
                r.getDescricao(),
                r.getRendimento(),
                r.getTempo_de_preparo(),
                r.getTipo_receita()
            };
            
            tableModel.addRow(linha);
        }
        
        tabela_dados.setModel(tableModel);

    }
    
     private void preencherTabela() {
        ReceitaDAO receitadao = new ReceitaDAO();
        
        String receitas = tipoReceita_text.getText();
        List<Receitas> Listagem_dados = receitadao.Pesquisa(receitas);
        
        DefaultTableModel tabelaReceitas =  (DefaultTableModel) tabela_dados.getModel();
         
        tabelaReceitas.setNumRows(0);
        
        for (Receitas r : Listagem_dados) {
        tabelaReceitas.addRow(new Object[]{
                r.getNome(),
                r.getIngredientes(),
                r.getDescricao(),
                r.getRendimento(),
                r.getTempo_de_preparo(),
                r.getTipo_receita()     
        });
    }
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        receitas_botao = new javax.swing.JButton();
        doce_botao = new javax.swing.JButton();
        salgado_botao = new javax.swing.JButton();
        restrincoes_botao = new javax.swing.JButton();
        publique_botao = new javax.swing.JButton();
        voltar_botao = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_dados = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        tipoReceita_text = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(254, 235, 210));

        receitas_botao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        receitas_botao.setText("Receitas");

        doce_botao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        doce_botao.setText("Doce");
        doce_botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doce_botaoActionPerformed(evt);
            }
        });

        salgado_botao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        salgado_botao.setText("Salgado");
        salgado_botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salgado_botaoActionPerformed(evt);
            }
        });

        restrincoes_botao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        restrincoes_botao.setText("Restrições");
        restrincoes_botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restrincoes_botaoActionPerformed(evt);
            }
        });

        publique_botao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        publique_botao.setText("Publique");
        publique_botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publique_botaoActionPerformed(evt);
            }
        });

        voltar_botao.setText("Voltar");
        voltar_botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar_botaoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("RECEITAS");

        tabela_dados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabela_dados);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("Pesquisar receita por tipo:");

        tipoReceita_text.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tipoReceita_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoReceita_textActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltar_botao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(publique_botao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(receitas_botao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doce_botao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salgado_botao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(restrincoes_botao)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoReceita_text))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(receitas_botao)
                    .addComponent(doce_botao)
                    .addComponent(salgado_botao)
                    .addComponent(restrincoes_botao)
                    .addComponent(publique_botao)
                    .addComponent(voltar_botao))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoReceita_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
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
        TelaInicial tela_inicial = new TelaInicial();
        tela_inicial.setVisible(true);
        dispose();
    }//GEN-LAST:event_voltar_botaoActionPerformed

    private void publique_botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publique_botaoActionPerformed
        Publique tela_publique = new Publique();
        tela_publique.setVisible(true);
        dispose();
    }//GEN-LAST:event_publique_botaoActionPerformed

    private void restrincoes_botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restrincoes_botaoActionPerformed
        Restricoes tela_restricoes = new Restricoes();
        tela_restricoes.setVisible(true);
        dispose();
    }//GEN-LAST:event_restrincoes_botaoActionPerformed

    private void salgado_botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salgado_botaoActionPerformed
        Salgado tela_salgado = new Salgado();
        tela_salgado.setVisible(true);
        dispose();
    }//GEN-LAST:event_salgado_botaoActionPerformed

    private void doce_botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doce_botaoActionPerformed
        Doce tela_doce = new Doce();
        tela_doce.setVisible(true);
        dispose();
    }//GEN-LAST:event_doce_botaoActionPerformed

    private void tipoReceita_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoReceita_textActionPerformed
        
        preencherTabela();
         
    }//GEN-LAST:event_tipoReceita_textActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGeral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton doce_botao;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton publique_botao;
    private javax.swing.JButton receitas_botao;
    private javax.swing.JButton restrincoes_botao;
    private javax.swing.JButton salgado_botao;
    private javax.swing.JTable tabela_dados;
    private javax.swing.JTextField tipoReceita_text;
    private javax.swing.JButton voltar_botao;
    // End of variables declaration//GEN-END:variables
}
