/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package IMS;

import java.io.*;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raidi
 */
public class CustomerOrderList extends javax.swing.JFrame {

    /**
     * Creates new form CustomerInvoice
     */
    public CustomerOrderList() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderlist = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        enteredaddress = new javax.swing.JTextField();
        seethefile = new javax.swing.JButton();
        backtoprofile = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        invoice = new javax.swing.JTextArea();
        createthereciept = new javax.swing.JButton();
        makethereciept = new javax.swing.JButton();
        deleteorderfile = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Your Orders");

        orderlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Quantity", "Price", "Total Price"
            }
        ));
        jScrollPane1.setViewportView(orderlist);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Enter the Order Number:");

        enteredaddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        seethefile.setText("Check the Adress");
        seethefile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seethefileActionPerformed(evt);
            }
        });

        backtoprofile.setText("Back to Profile");
        backtoprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtoprofileActionPerformed(evt);
            }
        });

        invoice.setEditable(false);
        invoice.setColumns(20);
        invoice.setRows(5);
        jScrollPane2.setViewportView(invoice);

        createthereciept.setText("Create Reciept");
        createthereciept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createtherecieptActionPerformed(evt);
            }
        });

        makethereciept.setText("Make Reciept");
        makethereciept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maketherecieptActionPerformed(evt);
            }
        });

        deleteorderfile.setText("Cancel Order");
        deleteorderfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteorderfileActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(enteredaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(seethefile)
                    .addComponent(backtoprofile)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deleteorderfile)
                                .addGap(288, 288, 288)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(createthereciept)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(makethereciept))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enteredaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seethefile)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteorderfile))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(makethereciept)
                            .addComponent(createthereciept))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(backtoprofile)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seethefileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seethefileActionPerformed
        // Presents the data within the file
        String address = enteredaddress.getText();
        
        String thefilepath = "NetbeansProject\\Inventory Management and POS\\ F4 Data\\Customer Data\\"+address+".txt";
        File getfile = new File(thefilepath);
            
        try {
            FileReader thefile = new FileReader(getfile);
            BufferedReader readingfile = new BufferedReader(thefile);
                
            DefaultTableModel listoforder = (DefaultTableModel)orderlist.getModel();
            Object[] eachline = readingfile.lines().toArray();
                
            for(int s = 0; s < eachline.length; s++){
                String[] perRow = eachline[s].toString().split(" ");
                listoforder.addRow(perRow);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CustomerOrderList.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_seethefileActionPerformed

    private void backtoprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtoprofileActionPerformed
        // goes back to user's profile
        dispose();
        CustomerProfile orderlisttoprofile = new CustomerProfile();
        orderlisttoprofile.setVisible(true);
    }//GEN-LAST:event_backtoprofileActionPerformed

    private void createtherecieptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createtherecieptActionPerformed
        // Creates the invoice
        String address = enteredaddress.getText();
        
        String thefilepath = "NetbeansProject\\Inventory Management and POS\\ F4 Data\\Customer Data\\"+address+".txt";
        File getfile = new File(thefilepath);
        
        try {
            FileReader readthecartlist = new FileReader(getfile);
            BufferedReader reading = new BufferedReader(readthecartlist);
            try {
                invoice.read(reading, null);
            } catch (IOException ex) {
                Logger.getLogger(CustomerOrderList.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CustomerOrderList.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_createtherecieptActionPerformed

    private void maketherecieptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maketherecieptActionPerformed
        // prints out the invoice
        String address = enteredaddress.getText();
        
        String thefilepath = "NetbeansProject\\Inventory Management and POS\\ F4 Data\\Customer Data\\"+address+"-receipt.txt";
        File getfile = new File(thefilepath);
        
        try {
            FileWriter createinvoice = new FileWriter(getfile);
            BufferedWriter writeinvoice = new BufferedWriter(createinvoice);
            writeinvoice.write("------------------\n");
            writeinvoice.write("Deliver to: "+address);
            writeinvoice.write("\nProduct Name | Quantity | Price | Total Price |\n");
            invoice.write(writeinvoice);
            writeinvoice.write("\n------------------");
            writeinvoice.close();
        } catch (IOException ex) {
            Logger.getLogger(CustomerOrderList.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(this, "Receipt Printed!");
    }//GEN-LAST:event_maketherecieptActionPerformed

    private void deleteorderfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteorderfileActionPerformed
        // Delete the text file
        String address = enteredaddress.getText();
        
        String thefilepath = "NetbeansProject\\Inventory Management and POS\\ F4 Data\\Customer Data\\"+address+"-receipt.txt";
        File getfile = new File(thefilepath);
        
        if(getfile.delete()){
            JOptionPane.showMessageDialog(this, "Your Order has been Cancelled!");
        }
        else{
            JOptionPane.showMessageDialog(this, "Order does not Exist!");
        }
    }//GEN-LAST:event_deleteorderfileActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerOrderList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerOrderList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerOrderList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerOrderList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerOrderList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backtoprofile;
    private javax.swing.JButton createthereciept;
    private javax.swing.JButton deleteorderfile;
    private javax.swing.JTextField enteredaddress;
    private javax.swing.JTextArea invoice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton makethereciept;
    private javax.swing.JTable orderlist;
    private javax.swing.JButton seethefile;
    // End of variables declaration//GEN-END:variables
}
