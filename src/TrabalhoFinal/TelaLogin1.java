package TrabalhoFinal;

import javax.swing.JOptionPane;

public class TelaLogin1 extends javax.swing.JFrame {

    public TelaLogin1() {
        initComponents();
        this.setSize(468, 400);
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuario = new javax.swing.JTextField();
        entrar = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        senha = new javax.swing.JPasswordField();
        Usuario = new javax.swing.JLabel();
        senhajLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        getContentPane().setLayout(null);

        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(usuario);
        usuario.setBounds(160, 190, 170, 30);

        entrar.setText("Entrar");
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        getContentPane().add(entrar);
        entrar.setBounds(160, 300, 90, 40);

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        getContentPane().add(sair);
        sair.setBounds(270, 300, 90, 40);

        senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });
        getContentPane().add(senha);
        senha.setBounds(160, 230, 170, 30);

        Usuario.setText("Usuario:");
        getContentPane().add(Usuario);
        Usuario.setBounds(90, 200, 80, 17);

        senhajLabel2.setText("Senha:");
        getContentPane().add(senhajLabel2);
        senhajLabel2.setBounds(90, 240, 80, 17);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TrabalhoFinal/Captura de tela de 2016-11-24 15_31_39.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 10, 300, 180);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TrabalhoFinal/61368_Papel-de-Parede-Flores-Azuis_1024x768.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 510, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed

    }//GEN-LAST:event_usuarioActionPerformed

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        TelaCadastrar2 tc = new TelaCadastrar2();
       
        if (usuario.getText().equals ("")&& senha.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Acesso Permitido");
            new TelaPrincipal().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_entrarActionPerformed
    else {
            JOptionPane.showMessageDialog(null, "Usuario ou senha invalido!");
        }
    }

    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed

    }//GEN-LAST:event_senhaActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new TelaLogin1().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Usuario;
    private javax.swing.JButton entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton sair;
    private javax.swing.JPasswordField senha;
    private javax.swing.JLabel senhajLabel2;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}

