package GUI;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
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

        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jButton2.setText("Programa Academico");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(5, 180, 200, 35);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(5, 170, 200, 6);

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jButton1.setText("Estudiantes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(5, 130, 200, 35);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(210, 0, 6, 500);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(5, 120, 200, 6);
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        JPanelEstudiantes panelEstudiantes = new JPanelEstudiantes();
        getContentPane().add(panelEstudiantes);
        panelEstudiantes.setBounds(220, 0, 580, 500);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
