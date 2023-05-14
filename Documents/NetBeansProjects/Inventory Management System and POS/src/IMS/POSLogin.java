package IMS;
/**
 *
 * @author Personal
 */
public class POSLogin extends javax.swing.JFrame {
    
    public POSLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Right = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Login ");
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Left.setBackground(new java.awt.Color(51, 51, 51));
        Left.setMinimumSize(new java.awt.Dimension(400, 500));
        Left.setPreferredSize(new java.awt.Dimension(400, 500));
        Left.setLayout(null);
        Left.add(jLabel5);
        jLabel5.setBounds(105, 117, 0, 190);

        jLabel6.setFont(new java.awt.Font("Gadugi", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("WELCOME TO POS SYSTEM");
        Left.add(jLabel6);
        jLabel6.setBounds(30, 290, 338, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMS/FantasticFourLogo.png"))); // NOI18N
        Left.add(jLabel7);
        jLabel7.setBounds(100, 90, 200, 200);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMS/FantasticFourLogo.png"))); // NOI18N
        Left.add(jLabel8);
        jLabel8.setBounds(100, 90, 200, 200);

        jPanel1.add(Left);
        Left.setBounds(0, -10, 400, 500);

        Right.setBackground(new java.awt.Color(255, 255, 255));
        Right.setMinimumSize(new java.awt.Dimension(400, 500));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));
        Right.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("LOGIN");
        Right.add(jLabel1);
        jLabel1.setBounds(128, 33, 118, 43);

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Username");
        jLabel2.setPreferredSize(new java.awt.Dimension(60, 20));
        Right.add(jLabel2);
        jLabel2.setBounds(18, 102, 141, 20);

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        Right.add(jTextField1);
        jTextField1.setBounds(18, 134, 324, 40);

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Password");
        Right.add(jLabel3);
        jLabel3.setBounds(18, 192, 129, 17);

        jPasswordField1.setForeground(new java.awt.Color(102, 102, 102));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        Right.add(jPasswordField1);
        jPasswordField1.setBounds(18, 221, 324, 40);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Right.add(jButton1);
        jButton1.setBounds(18, 292, 93, 35);

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("I don't have an account?");
        Right.add(jLabel4);
        jLabel4.setBounds(10, 400, 144, 30);

        jButton2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jButton2.setText("Sign Up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Right.add(jButton2);
        jButton2.setBounds(160, 400, 80, 30);

        jButton4.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Right.add(jButton4);
        jButton4.setBounds(270, 400, 70, 30);

        jPanel1.add(Right);
        Right.setBounds(410, 0, 360, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
       POSSignUp POSSignUpFrame = new  POSSignUp();
       POSSignUpFrame.setVisible(true);
       POSSignUpFrame.pack();
       POSSignUpFrame.setLocationRelativeTo(null); 
       this.dispose();
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         
         userType userTypeFrame = new userType();
         userTypeFrame.setVisible(true);
         userTypeFrame.pack();
         userTypeFrame.setLocationRelativeTo(null); 
         this.dispose();
         
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
