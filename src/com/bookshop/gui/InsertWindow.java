/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookshop.gui;

import javax.swing.JOptionPane;

/**
 *
 * @author amila
 */
public class InsertWindow extends javax.swing.JInternalFrame {

    /**
     * Creates new form InsertWindow
     */
    public InsertWindow() {
        initComponents();
        setTitle("Add New Book");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        insesrtPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBookTitle = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIsbn = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        cmbAuthor = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        btnNewAuthor = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Book Title");

        jLabel2.setText("ISBN Code");

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        cmbAuthor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Author");

        btnNewAuthor.setText("Add New Author");
        btnNewAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewAuthorActionPerformed(evt);
            }
        });

        jLabel3.setText("Category");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Java", "PHP" }));

        javax.swing.GroupLayout insesrtPanelLayout = new javax.swing.GroupLayout(insesrtPanel);
        insesrtPanel.setLayout(insesrtPanelLayout);
        insesrtPanelLayout.setHorizontalGroup(
            insesrtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insesrtPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(insesrtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addGap(46, 46, 46)
                .addGroup(insesrtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(insesrtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(insesrtPanelLayout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, insesrtPanelLayout.createSequentialGroup()
                            .addComponent(cmbAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnNewAuthor))
                        .addComponent(txtBookTitle, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtIsbn, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        insesrtPanelLayout.setVerticalGroup(
            insesrtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insesrtPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(insesrtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(insesrtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(insesrtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnNewAuthor))
                .addGap(18, 18, 18)
                .addGroup(insesrtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(insesrtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnInsert))
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(insesrtPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(insesrtPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        //to add a new book to the database.....ur code should be written in here
        
        if(txtBookTitle.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Book Title Cannot Be Empty!");
        
        //check whether the Book name is empty
        }
        else if(txtIsbn.getText().equals("")){
               JOptionPane.showMessageDialog(null, "ISBN Code cannot be Empty!");
        } else {            
         //code for inserting a book into the database goes here
        }
    }//GEN-LAST:event_btnInsertActionPerformed
 
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtBookTitle.setText("");
        txtIsbn.setText("");

    }//GEN-LAST:event_btnResetActionPerformed

    private void btnNewAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewAuthorActionPerformed

        NewAuthorWindow nwAuthor =  new NewAuthorWindow();
        nwAuthor.setVisible(true);
    }//GEN-LAST:event_btnNewAuthorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnNewAuthor;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox cmbAuthor;
    private javax.swing.JPanel insesrtPanel;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtBookTitle;
    private javax.swing.JTextField txtIsbn;
    // End of variables declaration//GEN-END:variables
}
