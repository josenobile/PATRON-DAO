//**********************************************************
// DESARROLLO DE SOFTWARE II
// TALLER: PATRON-DAO
//
// ARCHIVO: JPanelProgramaAcademico.java
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

import CONTROLADOR.ControladorProgramaAcademico;

public class JPanelProgramaAcademico extends javax.swing.JPanel {

    ControladorProgramaAcademico controladorPrograma;
    
    public JPanelProgramaAcademico() {
        
        controladorPrograma = new ControladorProgramaAcademico();
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
        jLNivel = new javax.swing.JLabel();
        jLNumCreditos = new javax.swing.JLabel();
        jTFCodigo = new javax.swing.JTextField();
        jTFNombre = new javax.swing.JTextField();
        jTFNivel = new javax.swing.JTextField();
        jTFNumCreditos = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Gestion Programa Academico");
        add(jLabelTitulo);
        jLabelTitulo.setBounds(0, 10, 580, 40);

        jPanelRegistro.setLayout(null);

        jLabelRegistar.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelRegistar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistar.setText("Registar Programa Academico");
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

        jLNivel.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNivel.setText("Nivel");
        jPanelRegistro.add(jLNivel);
        jLNivel.setBounds(50, 150, 200, 30);

        jLNumCreditos.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNumCreditos.setText("Numero de Creditos");
        jPanelRegistro.add(jLNumCreditos);
        jLNumCreditos.setBounds(50, 190, 200, 30);
        jPanelRegistro.add(jTFCodigo);
        jTFCodigo.setBounds(260, 70, 250, 30);
        jPanelRegistro.add(jTFNombre);
        jTFNombre.setBounds(260, 110, 250, 30);
        jPanelRegistro.add(jTFNivel);
        jTFNivel.setBounds(260, 150, 250, 30);
        jPanelRegistro.add(jTFNumCreditos);
        jTFNumCreditos.setBounds(260, 190, 250, 30);

        jButton3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton3.setText("LIMPIAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
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
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        jTFCodigo.setText("");
        jTFNombre.setText("");
        jTFNivel.setText("");
        jTFNumCreditos.setText("");
        
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLNivel;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLNumCreditos;
    private javax.swing.JLabel jLabelRegistar;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelRegistro;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFNivel;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFNumCreditos;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
