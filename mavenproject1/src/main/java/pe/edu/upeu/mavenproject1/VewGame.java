/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pe.edu.upeu.mavenproject1;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author INGTEC
 */
public class VewGame extends javax.swing.JFrame {

    /**
     * Creates new form VewGame
     */
    private final JLabel[][] casillas;
    public VewGame() {
        casillas = new JLabel [3][3];
        initComponents();
        asignarCasillas ();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        vistorias2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        rodolfito1 = new javax.swing.JLabel();
        rodolfito6 = new javax.swing.JLabel();
        rodolfito3 = new javax.swing.JLabel();
        rodolfito8 = new javax.swing.JLabel();
        rodolfito4 = new javax.swing.JLabel();
        rodolgito7 = new javax.swing.JLabel();
        rodolfito9 = new javax.swing.JLabel();
        rodolfito2 = new javax.swing.JLabel();
        rodolfito5 = new javax.swing.JLabel();
        reinicio = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        victorias1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(51, 51, 255));
        jLabel13.setText("Player2");
        jLabel13.setOpaque(true);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 70, 40));

        vistorias2.setBackground(new java.awt.Color(0, 102, 0));
        vistorias2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 24)); // NOI18N
        vistorias2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vistorias2.setText("0");
        vistorias2.setOpaque(true);
        getContentPane().add(vistorias2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 70, 40));

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setForeground(new java.awt.Color(102, 102, 0));

        jLabel3.setText("jLabel2");

        rodolfito1.setBackground(new java.awt.Color(255, 255, 255));
        rodolfito1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        rodolfito1.setOpaque(true);

        rodolfito6.setBackground(new java.awt.Color(255, 255, 255));
        rodolfito6.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        rodolfito6.setOpaque(true);

        rodolfito3.setBackground(new java.awt.Color(255, 255, 255));
        rodolfito3.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        rodolfito3.setOpaque(true);

        rodolfito8.setBackground(new java.awt.Color(255, 255, 255));
        rodolfito8.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        rodolfito8.setOpaque(true);

        rodolfito4.setBackground(new java.awt.Color(255, 255, 255));
        rodolfito4.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        rodolfito4.setOpaque(true);

        rodolgito7.setBackground(new java.awt.Color(255, 255, 255));
        rodolgito7.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        rodolgito7.setOpaque(true);

        rodolfito9.setBackground(new java.awt.Color(255, 255, 255));
        rodolfito9.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        rodolfito9.setOpaque(true);

        rodolfito2.setBackground(new java.awt.Color(255, 255, 255));
        rodolfito2.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        rodolfito2.setOpaque(true);

        rodolfito5.setBackground(new java.awt.Color(255, 255, 255));
        rodolfito5.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        rodolfito5.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rodolgito7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rodolfito8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(rodolfito1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(rodolfito2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(rodolfito4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rodolfito5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rodolfito6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rodolfito9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rodolfito3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rodolfito3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rodolfito1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rodolfito2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rodolfito5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rodolfito4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(rodolfito6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rodolgito7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rodolfito9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rodolfito8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 300, 280));

        reinicio.setText("VOLEVER A JUGAR");
        getContentPane().add(reinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));

        jLabel11.setBackground(new java.awt.Color(204, 255, 255));
        jLabel11.setFont(new java.awt.Font("SimSun", 3, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("Victorias");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        victorias1.setBackground(new java.awt.Color(0, 102, 0));
        victorias1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 24)); // NOI18N
        victorias1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        victorias1.setText("0");
        victorias1.setOpaque(true);
        getContentPane().add(victorias1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 70, 40));

        jLabel15.setBackground(new java.awt.Color(0, 102, 0));
        jLabel15.setText("Player1");
        jLabel15.setOpaque(true);
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 70, 40));

        jLabel1.setBackground(new java.awt.Color(0, 153, 51));
        jLabel1.setForeground(new java.awt.Color(0, 204, 102));
        jLabel1.setText("V");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VewGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VewGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VewGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VewGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VewGame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton reinicio;
    private javax.swing.JLabel rodolfito1;
    private javax.swing.JLabel rodolfito2;
    private javax.swing.JLabel rodolfito3;
    private javax.swing.JLabel rodolfito4;
    private javax.swing.JLabel rodolfito5;
    private javax.swing.JLabel rodolfito6;
    private javax.swing.JLabel rodolfito8;
    private javax.swing.JLabel rodolfito9;
    private javax.swing.JLabel rodolgito7;
    private javax.swing.JLabel victorias1;
    private javax.swing.JLabel vistorias2;
    // End of variables declaration//GEN-END:variables

    private void asignarCasillas() {
        casillas [0][0]= rodolfito1;
        casillas [0][1]= rodolfito2;
        casillas [0][2]= rodolfito3;
        casillas [1][0]= rodolfito4;
        casillas [1][1]= rodolfito5;
        casillas [1][2]= rodolfito6;
        casillas [2][0]= rodolfito8;
        casillas [2][1]= rodolfito9;
        casillas [2][2]= rodolgito7;
        
    
    }
    public JLabel [][] getCasillas () {
        return casillas;
    }
    public JLabel getVictorias1() {
     return victorias1;
    }
    public JLabel  getVictorias2() {
       return vistorias2; 
    }
    public JButton getReinicio (){
        return reinicio;
    }
}
