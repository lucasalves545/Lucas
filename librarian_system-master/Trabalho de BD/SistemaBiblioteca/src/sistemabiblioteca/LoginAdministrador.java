/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabiblioteca;


import javax.swing.JOptionPane;

/**
 *
 * @author 20111094010316
 */
public class LoginAdministrador extends javax.swing.JFrame {
    

    /**
     * Creates new form LoginAdministrador
     */
    public LoginAdministrador() {
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

        LoginADM = new javax.swing.JTextField();
        Confirmar = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SenhaADM = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(LoginADM);
        LoginADM.setBounds(230, 40, 110, 20);

        Confirmar.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        Confirmar.setText("Confirmar");
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(Confirmar);
        Confirmar.setBounds(153, 140, 100, 31);

        Voltar.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar);
        Voltar.setBounds(260, 140, 80, 31);

        jLabel2.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jLabel2.setText("Login:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 30, 70, 40);

        jLabel3.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jLabel3.setText("Senha:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(154, 84, 70, 40);
        getContentPane().add(SenhaADM);
        SenhaADM.setBounds(230, 100, 111, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/livros-sobre-empreendedorismo-1024x640.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-3, 1, 351, 222);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        MenuInicial a = new MenuInicial();
        a.setVisible(true);
        a.setResizable(false);
        a.setSize(400, 225);
        a.setLocationRelativeTo(null);
        this.setVisible(false);
        
    }//GEN-LAST:event_VoltarActionPerformed

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
  String senha = new String(SenhaADM.getPassword());
        
        if("adm".equals(LoginADM.getText()) && "123".equals(senha)){
      int a =  JOptionPane.showConfirmDialog(null, "deseja alterar a senha agora?","SistemaOteca",JOptionPane.YES_NO_OPTION);
        if(a==JOptionPane.YES_OPTION){
        CadastroAdministrador j = new CadastroAdministrador();
        j.setVisible(true);
        j.setResizable(false);
        j.setSize(350, 250);
        this.setVisible(false);
        j.setLocationRelativeTo(null);
        } 
     else{
        MenuAdministrador e = new MenuAdministrador();
        e.setVisible(true);
        e.setResizable(false);
        e.setSize(400, 315);
        e.setLocationRelativeTo(null);
        this.setVisible(false);
        }
     }
    }//GEN-LAST:event_ConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(LoginAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAdministrador().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirmar;
    private javax.swing.JTextField LoginADM;
    private javax.swing.JPasswordField SenhaADM;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
