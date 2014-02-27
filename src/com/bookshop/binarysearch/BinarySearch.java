/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookshop.binarysearch;

/**
 *
 * @author Lochana
 */
import java.util.*;
import com.bookshop.entity.*;

class Node<N extends Comparable> {
    //private Node<N> left; can't get this to work
    //private Node<N> right;
    public Node<N> left;
    public Node<N> right;
    public N value;
    
    Node(N value)
    {
        this.value = value;
    }
    
    Node(Node<N> node)
    {
        left = node.left;
        right = node.right;
        value = node.value;
    }
    
    /*public Node<N> getLeft()
    {
        return this.left;
    }
    
    public Node<N> getRight()
    {
        return this.right;
    
    }*/
}
public class BinarySearch<N extends Comparable> {
    Node<N> root;
    public N search(N key)
    {
        List<Book> booklist = new ArrayList<>();
        //Node<N> var = new Node(N);
        if (root == null)
            return null;
        
        Node<N> node = root;
        int compare;
        while ((compare = node.value.compareTo(key))!= 0)
        {
            if(compare > 0)
            {
                if(node.left != null)
                {
                    node = node.left; //couldn't encapsulate these variables

                }
                else
                    return null;
            }
            else
            {
                if(node.right != null)
                    node = node.right;
                else
                    return null;
            }
            
            booklist.add((Book) node.value);
        }
        return (N) booklist;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
}
