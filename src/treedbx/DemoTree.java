/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package treedbx;

import com.bookshop.entity.Author;
import com.bookshop.entity.Book;
import com.bookshop.entity.Type;
import com.bookshop.exceptions.NonExistingBookException;
import com.bookshop.util.BinarySearchTree;
import java.util.List;

/**
 *
 * @author ravindu
 */
//This class is used to demo the behaviour of the BinarySearchTree
public class DemoTree {

    public static void main(String args[]) {
        //create a new binary search tree object in ram
        BinarySearchTree bst = new BinarySearchTree();

        //create books

        Type typeJava = new Type();
        typeJava.setName("Java");

        Type typePHP = new Type();
        typePHP.setName("PHP");

        Book book = new Book();
        book.setIsbn(100000001);
        book.setTitle("Data Structures and Algorithms in Java Fourth Edition");
        book.setType(typeJava);

        Book book1 = new Book();
        book1.setIsbn(200000001);
        book1.setTitle("SCJP Sun Certified Programmer for Java 6 Exam 310-065");
        book1.setType(typeJava);

        Book book2 = new Book();
        book2.setIsbn(300000001);
        book2.setTitle("Head First Java 2nd Edition");
        book2.setType(typeJava);

        Book book3 = new Book();
        book3.setIsbn(400000001);
        book3.setTitle("Professional Java, JDK 6 Edition");
        book3.setType(typeJava);

        Book book4 = new Book();
        book4.setIsbn(500000001);
        book4.setTitle("Practical PHP and MySQL");
        book4.setType(typePHP);

        Book book5 = new Book();
        book5.setIsbn(600000001);
        book5.setTitle("Professional PHP Programming");
        book5.setType(typePHP);

        Book book6 = new Book();
        book6.setIsbn(700000001);
        book6.setTitle("OReilly Programming PHP 2nd Edition");
        book6.setType(typePHP);

        Book book7 = new Book();
        book7.setIsbn(800000001);
        book7.setTitle("Head First PHP and MySQL");
        book7.setType(typePHP);


        //add and print books

        bst.add(book);
        bst.print();

        bst.add(book1);
        bst.print();

        bst.add(book2);
        bst.print();

        bst.add(book3);
        bst.print();

        bst.add(book4);
        bst.print();

        bst.add(book5);
        bst.print();

        bst.add(book6);
        bst.print();

        bst.add(book7);
        bst.print();


        //Binary Search Book

        List<Book> list1 = bst.binarySearchByName("head first java");
        
        System.out.println("Search result : ");
        for (Book b : list1) {
            System.out.println(b.getTitle());
        }
        System.out.println("\n\n");

        //remove book from tree and print again
        try {
            bst.remove(500000001);
        } catch (NonExistingBookException ex) {
            System.err.println("Error : " + ex.getMessage());
        }
        bst.print();
    }
}
