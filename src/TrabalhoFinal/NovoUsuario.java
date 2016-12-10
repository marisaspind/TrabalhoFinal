/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoFinal;

/**
 *
 * @author Cliente
 */
public class NovoUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    public NovoUsuario() {
        initComponents();
        this.setSize(580, 450);
        this.setEnabled(true);
    }
 

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {
        TelaLogin1 t = new TelaLogin1 ();
        new TelaLogin1().setVisible(true);
        this.dispose();
    }

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {
         TelaLogin1 f = new TelaLogin1 ();
        new TelaLogin1().setVisible(true);
        this.dispose();
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        Salvar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Ubuntu Medium", 0, 18)); // NOI18N
        jLabel1.setText("Novo Usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 210, 150, 30);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(200, 250, 210, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nome:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 260, 40, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Senha:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 290, 60, 20);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(200, 290, 210, 30);

        Salvar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Salvar.setText("Salvar");
        getContentPane().add(Salvar);
        Salvar.setBounds(240, 330, 100, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TrabalhoFinal/Captura de tela de 2016-11-24 15_31_39.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 20, 310, 180);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TrabalhoFinal/61368_Papel-de-Parede-Flores-Azuis_1024x768.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 610, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new NovoUsuario().setVisible(true);
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
