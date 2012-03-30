//**********************************************************
// DESARROLLO DE SOFTWARE II
// TALLER: PATRON-DAO
//
// ARCHIVO: JPanelEstudiantes.java
//
// FECHA:12/03/30
//
// AUTORES:
// Gustavo Adolfo Rodriguez    0932979-3743
// gustalibreros@hotmail.com
//
// José Antonio Nobile Rendón  0747102-2711
// jose.nobile@gmail.com
//
// Roberto Ceballos            0441812-3743
// robertrock2000@gmail.com
//
// ESCUELA DE INGENIERIA DE SISTEMAS Y COMPUTACION
// UNIVERSIDAD DEL VALLE
//*********************************************************

package GUI;

import CONTROLADOR.ControladorEstudiante;

public class JPanelEstudiantes extends javax.swing.JPanel {

    ControladorEstudiante controladorEstudiante;
    
    public JPanelEstudiantes() {
        
        controladorEstudiante = new ControladorEstudiante();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelRegistro = new javax.swing.JPanel();
        jLabelRegistar = new javax.swing.JLabel();
        jLCodigo = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jLSexo = new javax.swing.JLabel();
        jLPrograma = new javax.swing.JLabel();
        jTFCodigo = new javax.swing.JTextField();
        jTFNombre = new javax.swing.JTextField();
        jCBSexo = new javax.swing.JComboBox();
        jTFPrograma = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Gestion Estudiantes");
        add(jLabelTitulo);
        jLabelTitulo.setBounds(0, 10, 580, 40);

        jPanelRegistro.setLayout(null);

        jLabelRegistar.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelRegistar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistar.setText("Registar Nuevo Estudiante");
        jPanelRegistro.add(jLabelRegistar);
        jLabelRegistar.setBounds(0, 10, 580, 40);

        jLCodigo.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLCodigo.setText("Codigo");
        jPanelRegistro.add(jLCodigo);
        jLCodigo.setBounds(50, 70, 200, 30);

        jLNombre.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNombre.setText("Nombre");
        jPanelRegistro.add(jLNombre);
        jLNombre.setBounds(50, 110, 200, 30);

        jLSexo.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLSexo.setText("Sexo");
        jPanelRegistro.add(jLSexo);
        jLSexo.setBounds(50, 150, 200, 30);

        jLPrograma.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLPrograma.setText("Programa Academico");
        jPanelRegistro.add(jLPrograma);
        jLPrograma.setBounds(50, 190, 200, 30);
        jPanelRegistro.add(jTFCodigo);
        jTFCodigo.setBounds(260, 70, 250, 30);
        jPanelRegistro.add(jTFNombre);
        jTFNombre.setBounds(260, 110, 250, 30);

        jCBSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Masculino", "Femenino" }));
        jPanelRegistro.add(jCBSexo);
        jCBSexo.setBounds(260, 150, 250, 30);
        jPanelRegistro.add(jTFPrograma);
        jTFPrograma.setBounds(260, 190, 250, 30);

        jButton3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton3.setText("LIMPIAR");
        jPanelRegistro.add(jButton3);
        jButton3.setBounds(290, 240, 100, 35);

        jButton4.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton4.setText("REGISTAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanelRegistro.add(jButton4);
        jButton4.setBounds(170, 240, 100, 35);

        jTabbedPane1.addTab("Registar", jPanelRegistro);

        add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 50, 580, 450);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        controladorEstudiante.insertarEstudiante(
                jTFCodigo.getText(),
                jTFNombre.getText(),
                jCBSexo.getSelectedItem().toString(),
                jTFPrograma.getText());
        
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jCBSexo;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLPrograma;
    private javax.swing.JLabel jLSexo;
    private javax.swing.JLabel jLabelRegistar;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelRegistro;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFPrograma;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
