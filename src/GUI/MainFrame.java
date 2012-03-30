//**********************************************************
// DESARROLLO DE SOFTWARE II
// TALLER: PATRON-DAO
//
// ARCHIVO: MainFrame.java
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

public class MainFrame extends javax.swing.JFrame {

    JPanelEstudiantes panelEstudiantes;
    JPanelProgramaAcademico panelPrograma;

    public MainFrame() {
        initComponents();
        panelEstudiantes = new JPanelEstudiantes();
        panelPrograma = new JPanelProgramaAcademico();
        getContentPane().add(panelEstudiantes);
        panelEstudiantes.setBounds(220, 0, 580, 500);
        panelEstudiantes.setVisible(false);
        getContentPane().add(panelPrograma);
        panelPrograma.setBounds(220, 0, 580, 500);
        panelPrograma.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jButtonEstudiantes = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonPrograma = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabelLogo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuEdit = new javax.swing.JMenu();
        jMenuHelp = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PATRON-DAO");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(5, 120, 200, 6);

        jButtonEstudiantes.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jButtonEstudiantes.setText("Estudiantes");
        jButtonEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEstudiantesActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEstudiantes);
        jButtonEstudiantes.setBounds(5, 130, 200, 35);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(5, 170, 200, 6);

        jButtonPrograma.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jButtonPrograma.setText("Programa Academico");
        jButtonPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProgramaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonPrograma);
        jButtonPrograma.setBounds(5, 180, 200, 35);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(210, 0, 6, 500);
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(5, 220, 200, 6);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/UNIVALLE.jpg"))); // NOI18N
        jPanel1.add(jLabelLogo);
        jLabelLogo.setBounds(70, 10, 72, 100);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 220, 500);

        jMenuFile.setText("File");
        jMenuBar1.add(jMenuFile);

        jMenuEdit.setText("Edit");
        jMenuBar1.add(jMenuEdit);

        jMenuHelp.setText("Help");
        jMenuBar1.add(jMenuHelp);

        setJMenuBar(jMenuBar1);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-810)/2, (screenSize.height-530)/2, 810, 530);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEstudiantesActionPerformed
        
        panelPrograma.setVisible(false);
        panelEstudiantes.setVisible(true);

    }//GEN-LAST:event_jButtonEstudiantesActionPerformed

    private void jButtonProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProgramaActionPerformed

        panelEstudiantes.setVisible(false);
        panelPrograma.setVisible(true);
    }//GEN-LAST:event_jButtonProgramaActionPerformed

    public static void main(String args[]) {

        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEstudiantes;
    private javax.swing.JButton jButtonPrograma;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEdit;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenu jMenuHelp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
