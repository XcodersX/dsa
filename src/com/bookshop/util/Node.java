/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookshop.util;

import com.bookshop.entity.Book;

/**
 *
 * @author ravindu
 */
public class Node {
    private Node parent;
    private Node leftChild;
    private Node rightChild;
    private Book book;

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    
    public Boolean hasLeftChild(){
        return leftChild == null ? true:false;                
    }
    
    public Boolean rightLeftChild(){
        return rightChild == null ? true:false;                
    }
    
    public Boolean isRoot(){
        return parent != null ? true:false;                
    }
}
