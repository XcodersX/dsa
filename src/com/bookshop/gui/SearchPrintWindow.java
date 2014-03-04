/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookshop.gui;

import com.bookshop.controller.BookJpaController;
import com.bookshop.util.BinarySearchTree;
import java.text.MessageFormat;
//import java.awt.print.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.bookshop.entity.Book;

/**
 *
 * @author amila
 */
public class SearchPrintWindow extends javax.swing.JInternalFrame {

    /**
     * Creates new form SearchPrintWindow
     */
    private BinarySearchTree searchTree;
    private String[] titles={"Name","ISBN","Author"};
    DefaultTableModel model = new  DefaultTableModel();
    private List<Book> bookList = new ArrayList();
    
    //no arguments constructor
    public SearchPrintWindow() {
        initComponents();
        setTitle("Serch Books");
       // model.setColumnIdentifiers(titles);
        
    } 
    
    //ovarloaded constructor
    public SearchPrintWindow(BinarySearchTree bst) {
        initComponents();
        setTitle("Serch Books");
        searchTree = bst;
        model.setColumnIdentifiers(new String[]{"ISBN","Title","Author"});
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnPrintAll = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Search Books");

        searchTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(searchTable);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Enter KeyWord");

        btnSearch.setText("Single Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jButton1.setText("Multiple Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(jButton1))
                .addGap(25, 25, 25))
        );

        btnPrintAll.setText("Print List");
        btnPrintAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrintAll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPrintAll)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintAllActionPerformed
        // ************************************create header for the report************************************
        MessageFormat header = new MessageFormat("Book List");
        // ********************************create footer for the report with page numbering********************
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            //*****************print the data of the table****************************
            searchTable.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (java.awt.print.PrinterException ex) {
            System.err.format("Cannot Print", ex.getMessage());
        }
    }//GEN-LAST:event_btnPrintAllActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        if(txtSearch.getText().equals("")){
                //************check whether the searching value TextField  is empty*************************
            JOptionPane.showMessageDialog(null, "Please Enter value for search!");
        }
        else{
        //************coding for the searching particular  book & populate that data into  the table goes here*********************
           model.setRowCount(0); 
          bookList =searchTree.find(txtSearch.getText());
          

          
            System.out.println("S:"+1);
         for(Book b:bookList){
             System.out.println("b:"+b.getIsbn());
         model.addRow(new String[]{b.getIsbn().toString(),b.getTitle().toString(),b.getAuthor().getSurname().toString()+" "+b.getAuthor().getName().toString()});
             System.out.println("sout"+b.getIsbn().toString()+"ti"+b.getTitle().toString()+"au"+b.getAuthor().getSurname().toString());
         }
        searchTable.setModel(model);
        searchTree.print();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
           if(txtSearch.getText().equals("")){
                //************check whether the searching value TextField  is empty*************************
            JOptionPane.showMessageDialog(null, "Please Enter value for search!");
        }
        else{
        //************coding for the searching particular  book & populate that data into  the table goes here*********************
           model.setRowCount(0); 
          bookList =searchTree.findAll(txtSearch.getText());
          

          
            System.out.println("S:"+1);
         for(Book b:bookList){
             System.out.println("b:"+b.getIsbn());
         model.addRow(new String[]{b.getIsbn().toString(),b.getTitle().toString(),b.getAuthor().getSurname().toString()+" "+b.getAuthor().getName().toString()});
             System.out.println("sout"+b.getIsbn().toString()+"ti"+b.getTitle().toString()+"au"+b.getAuthor().getSurname().toString());
         }
        searchTable.setModel(model);
        searchTree.print();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrintAll;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable searchTable;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
