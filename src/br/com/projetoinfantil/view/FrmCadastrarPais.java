package br.com.projetoinfantil.view;
import br.com.projetoinfantil.dao.CadastrarPaisDao;
import br.com.projetoinfantil.model.CadastrarPais;
import javax.swing.JOptionPane;

/**
 *
 * @author android
 */
public class FrmCadastrarPais extends javax.swing.JFrame {

    public FrmCadastrarPais() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbSenhaRepete = new javax.swing.JLabel();
        lbLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        senha = new javax.swing.JPasswordField();
        confirmar = new javax.swing.JPasswordField();
        lbSenha1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbSenhaRepete.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        lbSenhaRepete.setText("Repita sua senha:");
        getContentPane().add(lbSenhaRepete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 35));

        lbLogin.setFont(new java.awt.Font("Ravie", 3, 18)); // NOI18N
        lbLogin.setText("Digite seu login:");
        getContentPane().add(lbLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 214, -1));
        getContentPane().add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 176, -1));

        btSalvar.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });
        getContentPane().add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 170, -1));
        getContentPane().add(confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 170, -1));

        lbSenha1.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        lbSenha1.setText("Digite sua senha: ");
        getContentPane().add(lbSenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 128, -1, 35));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        CadastrarPais u = new CadastrarPais();
        CadastrarPaisDao dao = new CadastrarPaisDao();
        String confereSenha = String.copyValueOf(senha.getPassword());
        String confereConfirmar = String.copyValueOf(confirmar.getPassword());
        if (confereSenha.equals(confereConfirmar)) {
            u.setLoginpais(txtLogin.getText());
            u.setSenhapais(senha.getText());
            JOptionPane.showMessageDialog(null, "Usuário cadastrado!");
            new FrmLogin().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Senhas não conferem!");
        }
        dao.create(u);
    }//GEN-LAST:event_btSalvarActionPerformed

    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCadastrarPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastrarPais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvar;
    private javax.swing.JPasswordField confirmar;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbSenha1;
    private javax.swing.JLabel lbSenhaRepete;
    private javax.swing.JPasswordField senha;
    private javax.swing.JTextField txtLogin;
    // End of variables declaration//GEN-END:variables
}
