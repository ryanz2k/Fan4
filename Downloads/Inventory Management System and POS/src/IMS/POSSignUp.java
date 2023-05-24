package IMS;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class POSSignUp extends javax.swing.JFrame {
    
    public POSSignUp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Right = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        employeeFullname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        employeePassword = new javax.swing.JPasswordField();
        employeeSignUpButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        employeeUsername = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Sign Up ");
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Left.setBackground(new java.awt.Color(51, 51, 51));
        Left.setMinimumSize(new java.awt.Dimension(400, 500));
        Left.setPreferredSize(new java.awt.Dimension(400, 500));
        Left.setLayout(null);
        Left.add(jLabel5);
        jLabel5.setBounds(580, 113, 0, 190);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMS/FantasticFourLogo.png"))); // NOI18N
        Left.add(jLabel9);
        jLabel9.setBounds(100, 90, 0, 0);

        jLabel6.setFont(new java.awt.Font("Gadugi", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("WELCOME TO POS SYSTEM");
        Left.add(jLabel6);
        jLabel6.setBounds(30, 290, 338, 40);

        jPanel1.add(Left);
        Left.setBounds(0, -10, 400, 500);

        Right.setBackground(new java.awt.Color(255, 255, 255));
        Right.setMinimumSize(new java.awt.Dimension(400, 500));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("SIGN UP");

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Employee Full Name");
        jLabel2.setPreferredSize(new java.awt.Dimension(60, 20));

        employeeFullname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        employeeFullname.setForeground(new java.awt.Color(102, 102, 102));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Password");

        employeePassword.setForeground(new java.awt.Color(102, 102, 102));
        employeePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeePasswordActionPerformed(evt);
            }
        });

        employeeSignUpButton.setBackground(new java.awt.Color(102, 102, 102));
        employeeSignUpButton.setForeground(new java.awt.Color(255, 255, 255));
        employeeSignUpButton.setText("Sign Up");
        employeeSignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeSignUpButtonActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("I've an account");

        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Username");
        jLabel7.setPreferredSize(new java.awt.Dimension(60, 20));

        employeeUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        employeeUsername.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RightLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(employeeFullname, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(employeePassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(employeeUsername, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(employeeSignUpButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employeeFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employeeUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employeePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(employeeSignUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton2))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel1.add(Right);
        Right.setBounds(420, 0, 400, 500);

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

    
   
    
    private void employeePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeePasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeePasswordActionPerformed

    private void employeeSignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeSignUpButtonActionPerformed
     
        String fullnameEmployee = employeeFullname.getText();
        String usernameEmployee = employeeUsername.getText();
        String passwordEmployee = new String(employeePassword.getPassword());
        String DIRECTORY_PATH = "NetbeansProject/Inventory Management and POS/ F4 Data"; 
        
         if (fullnameEmployee.isEmpty() || usernameEmployee.isEmpty() || passwordEmployee.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Error: Please fill in all fields");
            return; 
        }
 
     
            File directory = new File(DIRECTORY_PATH);
            if (directory.exists()) {
            } else {
                directory.mkdirs(); // Create the directory if it doesn't exist
        }
            
             try {
                File file = new File(DIRECTORY_PATH,fullnameEmployee + ".txt");
                
                
                if (file.exists()) {
                    JOptionPane.showMessageDialog(null,"Error: Account already exists");
                    return; 
                }
                
            
                FileWriter writer = new FileWriter(file);
                
            try (BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
                bufferedWriter.write("Full Name: " + fullnameEmployee);
                bufferedWriter.newLine();
                bufferedWriter.write("Username: " + usernameEmployee);
                bufferedWriter.newLine();
                bufferedWriter.write("Password: " + passwordEmployee);
            }
                JOptionPane.showMessageDialog(null,"Account Successfully Registered!");

                
                 POSLogin POSLoginFrame = new  POSLogin();
                 POSLoginFrame.setVisible(true);
                 POSLoginFrame.pack();
                 POSLoginFrame.setLocationRelativeTo(null); 
                 this.dispose();
                
                
            } catch (IOException e) {
                 JOptionPane.showMessageDialog(null,"An error occurred: " + e.getMessage());
            }
             

          
             
    }//GEN-LAST:event_employeeSignUpButtonActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
       POSLogin POSLoginFrame = new  POSLogin();
       POSLoginFrame.setVisible(true);
       POSLoginFrame.pack();
       POSLoginFrame.setLocationRelativeTo(null); 
       this.dispose();
    
       
       
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JTextField employeeFullname;
    private javax.swing.JPasswordField employeePassword;
    private javax.swing.JButton employeeSignUpButton;
    private javax.swing.JTextField employeeUsername;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

 

    }




