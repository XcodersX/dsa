/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookshop.gui;

import com.bookshop.controller.AuthorJpaController;
import com.bookshop.controller.BookJpaController;
import com.bookshop.controller.TypeJpaController;
import com.bookshop.entity.Author;
import com.bookshop.entity.Book;
import com.bookshop.entity.Type;
import com.bookshop.util.BinarySearchTree;
import com.bookshop.util.ComboItem;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author amila
 */
public class InsertWindow extends javax.swing.JInternalFrame {

    /**
     * Creates new form InsertWindow
     */
    private List<Author> authors = new ArrayList();         
    private List<Type> bookType = new ArrayList();
    private AuthorJpaController ajc ;               //*********ajc variable used to access  Author JPA controller*************
    private TypeJpaController tjc;                  //*********tjc variable used to access Type JPA controller****************
    private BinarySearchTree searchTree;
 
    
    public InsertWindow(){
    } 
    public InsertWindow(BinarySearchTree bst) {
        
        initComponents();
        
        setTitle("Add New Book");
        searchTree = bst;
        
        tjc = new TypeJpaController();
        ajc = new AuthorJpaController();
        
        authors = ajc.findAuthorEntities();
        for(Author  au:authors){
        //******************load authors names to combo box******************************************  
       cmbAuthor.addItem(new ComboItem(au.getId(),au.getSurname().toString()+" "+au.getName().toString()));
       
     //cmbAuthor.addItem(new Item(au.getId(),au.getName().toString() + " " +au.getSurname().toString()));
        }
      bookType = tjc.findTypeEntities();
      for(Type ty : bookType){
          //*****************load type list to combo box**********************************************
          cmbType.addItem(new ComboItem(ty.getId(),ty.getName()));
      }
        
    }
    
   /* public InsertWindow(InsertWindow iw){
    
    }*/

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
        cmbType = new javax.swing.JComboBox();
        btnRefresh = new javax.swing.JButton();

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

        jLabel6.setText("Author");

        btnNewAuthor.setText("Add New Author");
        btnNewAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewAuthorActionPerformed(evt);
            }
        });

        jLabel3.setText("Category");

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout insesrtPanelLayout = new javax.swing.GroupLayout(insesrtPanel);
        insesrtPanel.setLayout(insesrtPanelLayout);
        insesrtPanelLayout.setHorizontalGroup(
            insesrtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insesrtPanelLayout.createSequentialGroup()
                .addGroup(insesrtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(insesrtPanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(insesrtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addGap(46, 46, 46)
                        .addGroup(insesrtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(insesrtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, insesrtPanelLayout.createSequentialGroup()
                                    .addComponent(cmbAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnNewAuthor))
                                .addComponent(txtBookTitle, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtIsbn, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(insesrtPanelLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(insesrtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnInsert)
                    .addComponent(btnRefresh))
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
        //t***** we can add a new book to the database through this funcyion
        
        if(txtBookTitle.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Book Title Cannot Be Empty!");
        
        //******************check whether the Book name is empty******************
        }
        else if(txtIsbn.getText().equals("")){
             //******************check whether the ISBN is empty******************
               JOptionPane.showMessageDialog(null, "ISBN Code cannot be Empty!");
        }
        else if(txtIsbn.getText().length() != 9){
            //* *****************check whether the ISBN has 9 digits***************
        
        
        }else {            
        
            
          //To Xcoders :-  code for inserting a book into the database goes here
            
            Book book = new Book();
            book.setIsbn(new Integer(txtIsbn.getText()));
            book.setTitle(txtBookTitle.getText());
          // book.setType(cmbType.getSelectedIndex());
            book.setAuthor(ajc.findAuthor(((ComboItem)cmbAuthor.getSelectedItem()).getKey()));
            //System.out.println(ajc.findAuthor(((ComboItem)cmbAuthor.getSelectedItem()).getKey()));
            book.setType(tjc.findType(((ComboItem)cmbType.getSelectedItem()).getKey()));
           // System.out.println(ajc.findAuthor(((ComboItem)cmbType.getSelectedItem()).getKey()));
            
            try {
                BookJpaController bookController = new BookJpaController ();
                bookController.create(book);
                JOptionPane.showMessageDialog(null, "Book Inserted to the DataBase Successfully!!!!!");
                searchTree.add(book);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error Occurred while inserting book to the database");
            }
        }
    }//GEN-LAST:event_btnInsertActionPerformed
 
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
       //*******reseting TextFields**********************************************
        
        txtBookTitle.setText("");
        txtIsbn.setText("");

    }//GEN-LAST:event_btnResetActionPerformed

    
    private void btnNewAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewAuthorActionPerformed
        //********************Direct  to adding new Author Window****************
        NewAuthorWindow nwAuthor =  new NewAuthorWindow();
        nwAuthor.setVisible(true);
    }//GEN-LAST:event_btnNewAuthorActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here
        cmbAuthor.removeAllItems();
         authors = ajc.findAuthorEntities();
        for(Author  au:authors){
        //cmbAuthor.
       // cmbAuthor.addItem(au.getName().toString() + " " +au.getSurname().toString());
        }
    }//GEN-LAST:event_btnRefreshActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnNewAuthor;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox cmbAuthor;
    private javax.swing.JComboBox cmbType;
    public javax.swing.JPanel insesrtPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtBookTitle;
    private javax.swing.JTextField txtIsbn;
    // End of variables declaration//GEN-END:variables
}
