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
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class JPanelProgramaAcademico extends javax.swing.JPanel {

    ControladorProgramaAcademico controladorPrograma;
    
    public JPanelProgramaAcademico() {

        controladorPrograma = new ControladorProgramaAcademico();
        initComponents();
        jTabbedPane1.setEnabledAt(2, false);
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
        jButtonLimpiarR = new javax.swing.JButton();
        jButtonRegistar = new javax.swing.JButton();
        jPanelConsulta = new javax.swing.JPanel();
        jLabelRegistar1 = new javax.swing.JLabel();
        jLCodigo1 = new javax.swing.JLabel();
        jLNombre1 = new javax.swing.JLabel();
        jLNivel1 = new javax.swing.JLabel();
        jLNumCreditos1 = new javax.swing.JLabel();
        jTFCodigo1 = new javax.swing.JTextField();
        jTFNombre1 = new javax.swing.JTextField();
        jTFNivel1 = new javax.swing.JTextField();
        jTFNumCreditos1 = new javax.swing.JTextField();
        jButtonLimpiarC = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableResultados = new javax.swing.JTable();
        jLabelNotaEditar = new javax.swing.JLabel();
        jPanelEditar = new javax.swing.JPanel();
        jLabelRegistar3 = new javax.swing.JLabel();
        jLCodigo3 = new javax.swing.JLabel();
        jLNombre3 = new javax.swing.JLabel();
        jLNivel3 = new javax.swing.JLabel();
        jLNumCreditos3 = new javax.swing.JLabel();
        jTFCodigo3 = new javax.swing.JTextField();
        jTFNombre3 = new javax.swing.JTextField();
        jTFNivel3 = new javax.swing.JTextField();
        jTFNumCreditos3 = new javax.swing.JTextField();
        jButtonLimpiarE = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();

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

        jButtonLimpiarR.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonLimpiarR.setText("LIMPIAR");
        jButtonLimpiarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarRActionPerformed(evt);
            }
        });
        jPanelRegistro.add(jButtonLimpiarR);
        jButtonLimpiarR.setBounds(290, 240, 100, 35);

        jButtonRegistar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonRegistar.setText("REGISTAR");
        jButtonRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistarActionPerformed(evt);
            }
        });
        jPanelRegistro.add(jButtonRegistar);
        jButtonRegistar.setBounds(170, 240, 100, 35);

        jTabbedPane1.addTab("Registar", jPanelRegistro);

        jPanelConsulta.setLayout(null);

        jLabelRegistar1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelRegistar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistar1.setText("Consulta Programas Academicos");
        jPanelConsulta.add(jLabelRegistar1);
        jLabelRegistar1.setBounds(0, 10, 580, 40);

        jLCodigo1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLCodigo1.setText("Codigo");
        jPanelConsulta.add(jLCodigo1);
        jLCodigo1.setBounds(20, 70, 180, 30);

        jLNombre1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNombre1.setText("Nombre");
        jPanelConsulta.add(jLNombre1);
        jLNombre1.setBounds(20, 110, 180, 30);

        jLNivel1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNivel1.setText("Nivel");
        jPanelConsulta.add(jLNivel1);
        jLNivel1.setBounds(20, 150, 180, 30);

        jLNumCreditos1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNumCreditos1.setText("Numero de Creditos");
        jPanelConsulta.add(jLNumCreditos1);
        jLNumCreditos1.setBounds(20, 190, 180, 30);
        jPanelConsulta.add(jTFCodigo1);
        jTFCodigo1.setBounds(200, 70, 200, 30);
        jPanelConsulta.add(jTFNombre1);
        jTFNombre1.setBounds(200, 110, 200, 30);
        jPanelConsulta.add(jTFNivel1);
        jTFNivel1.setBounds(200, 150, 200, 30);
        jPanelConsulta.add(jTFNumCreditos1);
        jTFNumCreditos1.setBounds(200, 190, 200, 30);

        jButtonLimpiarC.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonLimpiarC.setText("LIMPIAR");
        jButtonLimpiarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarCActionPerformed(evt);
            }
        });
        jPanelConsulta.add(jButtonLimpiarC);
        jButtonLimpiarC.setBounds(420, 180, 140, 35);

        jButtonConsultar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonConsultar.setText("CONSULTAR");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });
        jPanelConsulta.add(jButtonConsultar);
        jButtonConsultar.setBounds(420, 100, 140, 35);

        jButtonEditar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonEditar.setText("EDITAR*");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        jPanelConsulta.add(jButtonEditar);
        jButtonEditar.setBounds(420, 140, 140, 35);

        jTableResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Nivel", "Numero Creditos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableResultados);

        jPanelConsulta.add(jScrollPane1);
        jScrollPane1.setBounds(20, 250, 540, 140);

        jLabelNotaEditar.setText("* Debe seleccionar solamente una fila dentro de la tabla");
        jPanelConsulta.add(jLabelNotaEditar);
        jLabelNotaEditar.setBounds(20, 392, 540, 18);

        jTabbedPane1.addTab("Consultar", jPanelConsulta);

        jPanelEditar.setLayout(null);

        jLabelRegistar3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelRegistar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistar3.setText("Edicion Programa Academico");
        jPanelEditar.add(jLabelRegistar3);
        jLabelRegistar3.setBounds(0, 10, 580, 40);

        jLCodigo3.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLCodigo3.setText("Codigo");
        jPanelEditar.add(jLCodigo3);
        jLCodigo3.setBounds(50, 70, 200, 30);

        jLNombre3.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNombre3.setText("Nombre");
        jPanelEditar.add(jLNombre3);
        jLNombre3.setBounds(50, 110, 200, 30);

        jLNivel3.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNivel3.setText("Nivel");
        jPanelEditar.add(jLNivel3);
        jLNivel3.setBounds(50, 150, 200, 30);

        jLNumCreditos3.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNumCreditos3.setText("Numero de Creditos");
        jPanelEditar.add(jLNumCreditos3);
        jLNumCreditos3.setBounds(50, 190, 200, 30);

        jTFCodigo3.setEnabled(false);
        jPanelEditar.add(jTFCodigo3);
        jTFCodigo3.setBounds(260, 70, 250, 30);
        jPanelEditar.add(jTFNombre3);
        jTFNombre3.setBounds(260, 110, 250, 30);
        jPanelEditar.add(jTFNivel3);
        jTFNivel3.setBounds(260, 150, 250, 30);
        jPanelEditar.add(jTFNumCreditos3);
        jTFNumCreditos3.setBounds(260, 190, 250, 30);

        jButtonLimpiarE.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonLimpiarE.setText("LIMPIAR");
        jButtonLimpiarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarEActionPerformed(evt);
            }
        });
        jPanelEditar.add(jButtonLimpiarE);
        jButtonLimpiarE.setBounds(340, 250, 130, 35);

        jButtonEliminar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonEliminar.setText("ELIMINAR");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanelEditar.add(jButtonEliminar);
        jButtonEliminar.setBounds(200, 250, 130, 35);

        jButtonActualizar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonActualizar.setText("ACTUALIZAR");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });
        jPanelEditar.add(jButtonActualizar);
        jButtonActualizar.setBounds(60, 250, 130, 35);

        jTabbedPane1.addTab("Editar", jPanelEditar);

        add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 50, 580, 450);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonConsultarActionPerformed()">
        Object programas[][] = controladorPrograma.consultarProgramas(
                jTFCodigo1.getText(),
                jTFNombre1.getText(),
                jTFNivel1.getText(),
                jTFNumCreditos1.getText());
        
        TableModel myModel = new javax.swing.table.DefaultTableModel(
                programas,
                new String[]{
                    "Codigo", "Nombre", "Nivel", "Numero Creditos"
                }) {
                    
                    boolean[] canEdit = new boolean[]{
                        false, false, false, false
                    };
                    
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                };
        
        jTableResultados.setModel(myModel);
        jTableResultados.setRowSorter(new TableRowSorter(myModel));
        //</editor-fold>
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonLimpiarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarCActionPerformed
        limpiarCamposConsulta();
   }//GEN-LAST:event_jButtonLimpiarCActionPerformed

    private void jButtonRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistarActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonRegistarActionPerformed()">
        String registro;
        registro = controladorPrograma.insertarPrograma(
                jTFCodigo.getText(),
                jTFNombre.getText(),
                jTFNivel.getText(),
                jTFNumCreditos.getText());
        
        if (registro.equals("OK")) {
            jTFCodigo1.setText(jTFCodigo.getText());
            jButtonConsultar.doClick();
            jTabbedPane1.setSelectedIndex(1);
            limpiarCamposRegistro();
        } else {
            JOptionPane.showMessageDialog(this, registro);
        }
        //</editor-fold>
    }//GEN-LAST:event_jButtonRegistarActionPerformed

    private void jButtonLimpiarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarRActionPerformed
        limpiarCamposRegistro();
    }//GEN-LAST:event_jButtonLimpiarRActionPerformed

    private void jButtonLimpiarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarEActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonLimpiarEActionPerformed()">
        jTFNombre3.setText("");
        jTFNivel3.setText("");
        jTFNumCreditos3.setText("");
        //</editor-fold>
    }//GEN-LAST:event_jButtonLimpiarEActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonEliminarActionPerformed()">
        controladorPrograma.eliminarPrograma();
        limpiarCamposConsulta();
        jButtonConsultar.doClick();
        jTabbedPane1.setSelectedIndex(1);
        //</editor-fold>
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonActualizarActionPerformed()">
        String actualizacion;
        actualizacion = controladorPrograma.actualizarPrograma(
                jTFNombre3.getText(),
                jTFNivel3.getText(),
                jTFNumCreditos3.getText());
        
        if (actualizacion.equals("OK")) {
            jTFCodigo1.setText(jTFCodigo3.getText());
            jButtonConsultar.doClick();
            jTabbedPane1.setSelectedIndex(1);
            limpiarCamposEdicion();
        } else {
            JOptionPane.showMessageDialog(this, actualizacion);
        }
        //</editor-fold>
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonEditarActionPerformed()">
        int seleccionado = jTableResultados.getSelectedRow();
        if (seleccionado >= 0) {
            String programa[] = controladorPrograma.seleccionarPrograma(seleccionado);
            jTabbedPane1.setSelectedIndex(2);
            jTFCodigo3.setText(programa[0]);
            jTFNombre3.setText(programa[1]);
            jTFNivel3.setText(programa[2]);
            jTFNumCreditos3.setText(programa[3]);
        }
        //</editor-fold>
    }//GEN-LAST:event_jButtonEditarActionPerformed

    public void limpiarCamposRegistro() {
        //<editor-fold defaultstate="collapsed" desc="limpiarCamposRegistro()">
        jTFCodigo.setText("");
        jTFNombre.setText("");
        jTFNivel.setText("");
        jTFNumCreditos.setText("");
        //</editor-fold>
    }

    public void limpiarCamposEdicion() {
        //<editor-fold defaultstate="collapsed" desc="limpiarCamposEdicion()">
        jTFCodigo3.setText("");
        jTFNombre3.setText("");
        jTFNivel3.setText("");
        jTFNumCreditos3.setText("");
        //</editor-fold>
    }

    public void limpiarCamposConsulta() {
        //<editor-fold defaultstate="collapsed" desc="limpiarCamposConsulta()">
        jTFCodigo1.setText("");
        jTFNombre1.setText("");
        jTFNivel1.setText("");
        jTFNumCreditos1.setText("");
        
        TableModel myModel = new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Codigo", "Nombre", "Nivel", "Numero Creditos"
                });
        
        jTableResultados.setModel(myModel);
        jTableResultados.setRowSorter(new TableRowSorter(myModel));
        //</editor-fold>
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonLimpiarC;
    private javax.swing.JButton jButtonLimpiarE;
    private javax.swing.JButton jButtonLimpiarR;
    private javax.swing.JButton jButtonRegistar;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLCodigo1;
    private javax.swing.JLabel jLCodigo3;
    private javax.swing.JLabel jLNivel;
    private javax.swing.JLabel jLNivel1;
    private javax.swing.JLabel jLNivel3;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLNombre1;
    private javax.swing.JLabel jLNombre3;
    private javax.swing.JLabel jLNumCreditos;
    private javax.swing.JLabel jLNumCreditos1;
    private javax.swing.JLabel jLNumCreditos3;
    private javax.swing.JLabel jLabelNotaEditar;
    private javax.swing.JLabel jLabelRegistar;
    private javax.swing.JLabel jLabelRegistar1;
    private javax.swing.JLabel jLabelRegistar3;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelConsulta;
    private javax.swing.JPanel jPanelEditar;
    private javax.swing.JPanel jPanelRegistro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFCodigo1;
    private javax.swing.JTextField jTFCodigo3;
    private javax.swing.JTextField jTFNivel;
    private javax.swing.JTextField jTFNivel1;
    private javax.swing.JTextField jTFNivel3;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFNombre1;
    private javax.swing.JTextField jTFNombre3;
    private javax.swing.JTextField jTFNumCreditos;
    private javax.swing.JTextField jTFNumCreditos1;
    private javax.swing.JTextField jTFNumCreditos3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableResultados;
    // End of variables declaration//GEN-END:variables
}
