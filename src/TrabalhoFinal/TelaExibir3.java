/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoFinal;

import TrabalhoFinal.RepositoriosManager;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Cliente
 */
public class TelaExibir3 extends javax.swing.JInternalFrame {

       private TelaCadastrar2 telaCadastro;
        
    
    
    public TelaExibir3() {
        initComponents();
        this.setSize(830, 620);
     
        CarregarTabela();
    }
    public TelaExibir3(TelaCadastrar2 telaCadastro){
      this();
      this.telaCadastro=telaCadastro;
  
     }  


    private void CarregarTabela() {
        ArrayList<TrabalhoFinal.Produto> lista = RepositoriosManager.getInstance().obterListaProdutos();

        DefaultTableModel modelo = new javax.swing.table.DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nome");
        modelo.addColumn("Quantidade");
        modelo.addColumn("Fornecedor");
        modelo.addColumn("ValorVenda");
        modelo.addColumn("ValorVenda");
        modelo.addColumn("Observação");
        

        if (lista.size() == 0) {
            modelo.addRow(new String[]{"Codigo",
                        "nome",
                        "quanti",
                        "forne",
                        "comprar",
                        "venda",
                        "observação"});
        }
        
        for (int i = 0; i < lista.size(); i++) {
            TrabalhoFinal.Produto p = lista.get(i);
            //System.out.println(p.toString());
            
            // Alimenta as linhas de dados  
            modelo.addRow(new String[]{
                        p.getCod()+ "",
                        p.getNome() + "",
                        p.isQuantidade()+"",
                        p.getFornecedor()+"",
                        p.getVlCompra()+ "",
                        p.getVlVenda()+ "",
                        p.getObserv()+""});  
        }
 
        tabela.setModel(modelo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        adicionar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(null);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Qdt", "Valor da Compra", "Valor da Venda", "Observação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(130, 280, 680, 280);

        adicionar.setText("Adicionar");
        adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarActionPerformed(evt);
            }
        });
        getContentPane().add(adicionar);
        adicionar.setBounds(20, 330, 99, 29);

        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });
        getContentPane().add(excluir);
        excluir.setBounds(20, 380, 99, 29);

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        getContentPane().add(sair);
        sair.setBounds(20, 430, 99, 29);

        jLabel2.setFont(new java.awt.Font("Ubuntu Medium", 0, 18)); // NOI18N
        jLabel2.setText("Produtos Cadastrados");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 230, 210, 34);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TrabalhoFinal/Captura de tela de 2016-11-24 15_31_39.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 10, 330, 180);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TrabalhoFinal/61368_Papel-de-Parede-Flores-Azuis_1024x768.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 820, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarActionPerformed
       new TelaCadastrar2().setVisible(true);
        

    }//GEN-LAST:event_adicionarActionPerformed
    
    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        ((DefaultTableModel) tabela.getModel()).removeRow(tabela.getSelectedRow());
    }//GEN-LAST:event_excluirActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionar;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sair;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
