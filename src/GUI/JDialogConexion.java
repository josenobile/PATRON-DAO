package GUI;

import CONTROLADOR.ControladorConfiguracionBD;
import javax.swing.JOptionPane;

public class JDialogConexion extends javax.swing.JDialog {
    private ControladorConfiguracionBD controladorBD;

    public JDialogConexion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        controladorBD = new ControladorConfiguracionBD();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo1 = new javax.swing.JLabel();
        jLabelHost = new javax.swing.JLabel();
        jLabelPort = new javax.swing.JLabel();
        jLabelDataBase = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jTFHost = new javax.swing.JTextField();
        jTFPort = new javax.swing.JTextField();
        jTFBaseDatos = new javax.swing.JTextField();
        jTFUsuario = new javax.swing.JTextField();
        jPFPassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuracion");
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabelTitulo1.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabelTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo1.setText("Conexion Base de Datos");
        jPanel1.add(jLabelTitulo1);
        jLabelTitulo1.setBounds(0, 10, 400, 30);

        jLabelHost.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLabelHost.setText("Host");
        jPanel1.add(jLabelHost);
        jLabelHost.setBounds(50, 60, 130, 30);

        jLabelPort.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLabelPort.setText("Port");
        jPanel1.add(jLabelPort);
        jLabelPort.setBounds(50, 100, 130, 30);

        jLabelDataBase.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLabelDataBase.setText("Base de Datos");
        jPanel1.add(jLabelDataBase);
        jLabelDataBase.setBounds(50, 140, 130, 30);

        jLabelUser.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLabelUser.setText("Usuario");
        jPanel1.add(jLabelUser);
        jLabelUser.setBounds(50, 180, 130, 30);

        jLabelPassword.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLabelPassword.setText("Password");
        jPanel1.add(jLabelPassword);
        jLabelPassword.setBounds(50, 220, 130, 30);

        jTFHost.setText("gustalibreros.no-ip.org");
        jPanel1.add(jTFHost);
        jTFHost.setBounds(190, 60, 180, 30);

        jTFPort.setText("5432");
        jPanel1.add(jTFPort);
        jTFPort.setBounds(190, 100, 180, 30);

        jTFBaseDatos.setText("postgres");
        jPanel1.add(jTFBaseDatos);
        jTFBaseDatos.setBounds(190, 140, 180, 30);

        jTFUsuario.setText("postgres");
        jPanel1.add(jTFUsuario);
        jTFUsuario.setBounds(190, 180, 180, 30);

        jPFPassword.setText("LibreroS10");
        jPanel1.add(jPFPassword);
        jPFPassword.setBounds(190, 220, 180, 30);

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(170, 260, 37, 32);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 300);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-410)/2, (screenSize.height-330)/2, 410, 330);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButton1ActionPerformed()">
        String respuesta = controladorBD.setParametros(
                jTFHost.getText(),
                jTFPort.getText(),
                jTFBaseDatos.getText(),
                jTFUsuario.getText(),
                new String(jPFPassword.getPassword()));
        
        if (!respuesta.equals("OK")) {
            JOptionPane.showMessageDialog(this, respuesta);
        }
        else{
            this.dispose();
        }
        //</editor-fold>
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelDataBase;
    private javax.swing.JLabel jLabelHost;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPort;
    private javax.swing.JLabel jLabelTitulo1;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JPasswordField jPFPassword;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFBaseDatos;
    private javax.swing.JTextField jTFHost;
    private javax.swing.JTextField jTFPort;
    private javax.swing.JTextField jTFUsuario;
    // End of variables declaration//GEN-END:variables
}
