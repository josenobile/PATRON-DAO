//**********************************************************
// DESARROLLO DE SOFTWARE II
// TALLER: PATRON-DAO
//
// ARCHIVO: JPanelEstudiante.java
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
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class JPanelEstudiante extends javax.swing.JPanel {

    ControladorEstudiante controladorEstudiante;

    public JPanelEstudiante() {

        controladorEstudiante = new ControladorEstudiante();
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
        jLSexo = new javax.swing.JLabel();
        jLPrograma = new javax.swing.JLabel();
        jTFCodigo = new javax.swing.JTextField();
        jTFNombre = new javax.swing.JTextField();
        jCBSexo = new javax.swing.JComboBox();
        jCBPrograma = new javax.swing.JComboBox();
        jButtonLimpiarR = new javax.swing.JButton();
        jButtonRegistar = new javax.swing.JButton();
        jPanelConsulta = new javax.swing.JPanel();
        jLabelRegistar1 = new javax.swing.JLabel();
        jLCodigo1 = new javax.swing.JLabel();
        jLNombre1 = new javax.swing.JLabel();
        jLSexo1 = new javax.swing.JLabel();
        jLPrograma1 = new javax.swing.JLabel();
        jTFCodigo1 = new javax.swing.JTextField();
        jTFNombre1 = new javax.swing.JTextField();
        jCBSexo1 = new javax.swing.JComboBox();
        jCBPrograma1 = new javax.swing.JComboBox();
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
        jLSexo3 = new javax.swing.JLabel();
        jLPrograma3 = new javax.swing.JLabel();
        jTFCodigo3 = new javax.swing.JTextField();
        jTFNombre3 = new javax.swing.JTextField();
        jCBSexo3 = new javax.swing.JComboBox();
        jCBPrograma3 = new javax.swing.JComboBox();
        jButtonLimpiarE = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();

        setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Gestion Estudiante");
        add(jLabelTitulo);
        jLabelTitulo.setBounds(0, 10, 580, 40);

        jPanelRegistro.setLayout(null);

        jLabelRegistar.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelRegistar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistar.setText("Registar Estudiante");
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
        jLPrograma.setText("Codigo Programa");
        jPanelRegistro.add(jLPrograma);
        jLPrograma.setBounds(50, 190, 200, 30);
        jPanelRegistro.add(jTFCodigo);
        jTFCodigo.setBounds(260, 70, 250, 30);
        jPanelRegistro.add(jTFNombre);
        jTFNombre.setBounds(260, 110, 250, 30);

        jCBSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Masculino", "Femenino" }));
        jPanelRegistro.add(jCBSexo);
        jCBSexo.setBounds(260, 150, 250, 30);

        jCBPrograma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jCBPrograma.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jCBProgramaPopupMenuWillBecomeVisible(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanelRegistro.add(jCBPrograma);
        jCBPrograma.setBounds(260, 190, 250, 30);

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
        jLabelRegistar1.setText("Consulta Estudiantes");
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

        jLSexo1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLSexo1.setText("Sexo");
        jPanelConsulta.add(jLSexo1);
        jLSexo1.setBounds(20, 150, 180, 30);

        jLPrograma1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLPrograma1.setText("Codigo Programa");
        jPanelConsulta.add(jLPrograma1);
        jLPrograma1.setBounds(20, 190, 180, 30);
        jPanelConsulta.add(jTFCodigo1);
        jTFCodigo1.setBounds(200, 70, 200, 30);
        jPanelConsulta.add(jTFNombre1);
        jTFNombre1.setBounds(200, 110, 200, 30);

        jCBSexo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Masculino", "Femenino" }));
        jPanelConsulta.add(jCBSexo1);
        jCBSexo1.setBounds(200, 150, 200, 30);

        jCBPrograma1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jCBPrograma1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jCBPrograma1PopupMenuWillBecomeVisible(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanelConsulta.add(jCBPrograma1);
        jCBPrograma1.setBounds(200, 190, 200, 30);

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
        jLabelRegistar3.setText("Edicion Estudiante");
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

        jLSexo3.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLSexo3.setText("Sexo");
        jPanelEditar.add(jLSexo3);
        jLSexo3.setBounds(50, 150, 200, 30);

        jLPrograma3.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLPrograma3.setText("Codigo Programa");
        jPanelEditar.add(jLPrograma3);
        jLPrograma3.setBounds(50, 190, 200, 30);

        jTFCodigo3.setEnabled(false);
        jPanelEditar.add(jTFCodigo3);
        jTFCodigo3.setBounds(260, 70, 250, 30);
        jPanelEditar.add(jTFNombre3);
        jTFNombre3.setBounds(260, 110, 250, 30);

        jCBSexo3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Masculino", "Femenino" }));
        jPanelEditar.add(jCBSexo3);
        jCBSexo3.setBounds(260, 150, 250, 30);

        jCBPrograma3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jCBPrograma3.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jCBPrograma3PopupMenuWillBecomeVisible(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanelEditar.add(jCBPrograma3);
        jCBPrograma3.setBounds(260, 190, 250, 30);

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

        Object programas[][] = controladorEstudiante.consultarEstudiantes(
                jTFCodigo1.getText(),
                jTFNombre1.getText(),
                jCBSexo1.getSelectedItem().toString(),
                jCBPrograma1.getSelectedItem().toString());

        TableModel myModel = new javax.swing.table.DefaultTableModel(
                programas,
                new String[]{
                    "Codigo", "Nombre", "Sexo", "Programa"
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
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonLimpiarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarCActionPerformed
        limpiarCamposConsulta();
   }//GEN-LAST:event_jButtonLimpiarCActionPerformed

    private void jButtonRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistarActionPerformed
        String registro;
        registro = controladorEstudiante.insertarEstudiante(
                jTFCodigo.getText(),
                jTFNombre.getText(),
                jCBSexo.getSelectedItem().toString(),
                jCBPrograma.getSelectedItem().toString());

        if (registro.equals("OK")) {
            jTFCodigo1.setText(jTFCodigo.getText());
            jButtonConsultar.doClick();
            jTabbedPane1.setSelectedIndex(1);
            limpiarCamposRegistro();
        } else {
            JOptionPane.showMessageDialog(this, registro);
        }
    }//GEN-LAST:event_jButtonRegistarActionPerformed

    private void jButtonLimpiarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarRActionPerformed
        limpiarCamposRegistro();
    }//GEN-LAST:event_jButtonLimpiarRActionPerformed

    private void jButtonLimpiarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarEActionPerformed
        jTFNombre3.setText("");
        jCBSexo3.setSelectedIndex(0);
        jCBPrograma3.setSelectedIndex(0);
    }//GEN-LAST:event_jButtonLimpiarEActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        controladorEstudiante.eliminarEstudiante();
        limpiarCamposConsulta();
        jButtonConsultar.doClick();
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        String actualizacion;
        actualizacion = controladorEstudiante.actualizarEstudiante(
                jTFNombre3.getText(),
                jCBSexo3.getSelectedItem().toString(),
                jCBPrograma3.getSelectedItem().toString());

        if (actualizacion.equals("OK")) {
            jTFCodigo1.setText(jTFCodigo3.getText());
            jButtonConsultar.doClick();
            jTabbedPane1.setSelectedIndex(1);
            limpiarCamposEdicion();
        } else {
            JOptionPane.showMessageDialog(this, actualizacion);
        }
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        int seleccionado = jTableResultados.getSelectedRow();
        if (seleccionado >= 0) {
            String programa[] = controladorEstudiante.seleccionarEstudiante(seleccionado);

            jTFCodigo3.setText(programa[0]);
            jTFNombre3.setText(programa[1]);

            if (programa[2].equals("M")) {
                jCBSexo3.setSelectedIndex(1);
            } else {
                jCBSexo3.setSelectedIndex(2);
            }

            jCBPrograma3.setModel(
                    new javax.swing.DefaultComboBoxModel(
                    controladorEstudiante.cargarProgramas()));
            jCBPrograma3.setSelectedItem(programa[3]);
            System.out.println("programaAcademico: "+programa[3]);
            jTabbedPane1.setSelectedIndex(2);
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jCBProgramaPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBProgramaPopupMenuWillBecomeVisible
        jCBPrograma.setModel(
                new javax.swing.DefaultComboBoxModel(
                controladorEstudiante.cargarProgramas()));
    }//GEN-LAST:event_jCBProgramaPopupMenuWillBecomeVisible

    private void jCBPrograma1PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBPrograma1PopupMenuWillBecomeVisible
        jCBPrograma1.setModel(
                new javax.swing.DefaultComboBoxModel(
                controladorEstudiante.cargarProgramas()));
    }//GEN-LAST:event_jCBPrograma1PopupMenuWillBecomeVisible

    private void jCBPrograma3PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBPrograma3PopupMenuWillBecomeVisible
        jCBPrograma1.setModel(
                new javax.swing.DefaultComboBoxModel(
                controladorEstudiante.cargarProgramas()));
    }//GEN-LAST:event_jCBPrograma3PopupMenuWillBecomeVisible

    private void limpiarCamposRegistro() {
        //<editor-fold defaultstate="collapsed" desc="limpiarCamposRegistro()">
        jTFCodigo.setText("");
        jTFNombre.setText("");
        jCBSexo.setSelectedIndex(0);
        jCBPrograma.setSelectedIndex(0);
        //</editor-fold>
    }

    private void limpiarCamposEdicion() {
        //<editor-fold defaultstate="collapsed" desc="limpiarCamposEdicion()">
        jTFCodigo3.setText("");
        jTFNombre3.setText("");
        jCBSexo3.setSelectedIndex(0);
        jCBPrograma3.setSelectedIndex(0);
        //</editor-fold>
    }

    private void limpiarCamposConsulta() {
        //<editor-fold defaultstate="collapsed" desc="limpiarCamposConsulta()">
        jTFCodigo1.setText("");
        jTFNombre1.setText("");
        jCBSexo1.setSelectedIndex(0);
        jCBPrograma1.setSelectedIndex(0);

        TableModel myModel = new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Codigo", "Nombre", "Sexo", "Programa"
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
    private javax.swing.JComboBox jCBPrograma;
    private javax.swing.JComboBox jCBPrograma1;
    private javax.swing.JComboBox jCBPrograma3;
    private javax.swing.JComboBox jCBSexo;
    private javax.swing.JComboBox jCBSexo1;
    private javax.swing.JComboBox jCBSexo3;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLCodigo1;
    private javax.swing.JLabel jLCodigo3;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLNombre1;
    private javax.swing.JLabel jLNombre3;
    private javax.swing.JLabel jLPrograma;
    private javax.swing.JLabel jLPrograma1;
    private javax.swing.JLabel jLPrograma3;
    private javax.swing.JLabel jLSexo;
    private javax.swing.JLabel jLSexo1;
    private javax.swing.JLabel jLSexo3;
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
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFNombre1;
    private javax.swing.JTextField jTFNombre3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableResultados;
    // End of variables declaration//GEN-END:variables
}
