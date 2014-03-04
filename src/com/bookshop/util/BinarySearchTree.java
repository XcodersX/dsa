/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookshop.util;

import com.bookshop.entity.Book;
import com.bookshop.exceptions.NonExistingBookException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author ravindu
 */
public class BinarySearchTree {

    private Node root;
    private Book resultBook;
    private Node resultNode;

    //vijani----------------------------------------------------------------------
    public void add(Book book) {
        Node node = new Node();
        node.setBook(book);

        if (root != null) {
           // System.out.println("root is not null");
            attachNode(root, node);
        } else {
           // System.out.println("root is null");
            root = node;
          //  System.out.println("attached root " + node.getBook().getTitle());
        }
    }

    private void attachNode(Node n1, Node n2) {
      //  System.out.println("attach node method n1 : " + n1);
       // System.out.println("attach node method n2 : " + n2);
        int c = n1.getBook().getTitle().compareTo(n2.getBook().getTitle());
        if (c > 0) {
            if (n1.hasLeftChild()) {
               // System.out.println("n1 left child : " + n1.getLeftChild());
                attachNode(n1.getLeftChild(), n2);
            } else {
               // System.out.println("-------> " + n1.getBook().getTitle() + " left child " + n2.getBook().getTitle());
                n1.setLeftChild(n2);
                n2.setParent(n1);
            }
        } else {
            if (n1.hasRightChild()) {
              //  System.out.println("n1 right child : " + n1.getLeftChild());
                attachNode(n1.getRightChild(), n2);
            } else {
              //  System.out.println("-------> " + n1.getBook().getTitle() + " right child " + n2.getBook().getTitle());
                n1.setRightChild(n2);
                n2.setParent(n1);
            }
        }
    }

    public void add(List<Book> books) {
        for (Book book : books) {
            add(book);
        }
    }

    //sanu----------------------------------------------------------------------
    //To vijani :: NonExistingBookException means if there isbn is wrong there wont be any book to delete 
    //so a book not exists error should be thrown
    public Book remove(Integer isbn) throws NonExistingBookException {
        Book bookRemoved = null;
        inOrderGetNodeByISBN(isbn, root);
       // System.out.println("@remove result node is : " + resultNode);
        if (resultNode == null) {
            throw new NonExistingBookException("No book with isbn " + isbn + " found!");
        }

        if (resultNode.isExternal()) {
            //incase the node is an external node
            if (resultNode.getParent().getLeftChild().equals(resultNode)) {
                resultNode.getParent().setLeftChild(null);
            } else {
                resultNode.getParent().setRightChild(null);
            }
            resultNode.setParent(null);
            bookRemoved = resultNode.getBook();
        } else if (resultNode.getLeftChild() == null || resultNode.getRightChild() == null) {
            //incase the node has only one child
            Node childNode = null;
            childNode = resultNode.getLeftChild() != null ? resultNode.getLeftChild() : childNode;
            childNode = resultNode.getRightChild() != null ? resultNode.getRightChild() : childNode;
            childNode.setParent(resultNode.getParent());

            if (resultNode.getParent().getLeftChild().equals(resultNode)) {
                resultNode.getParent().setLeftChild(childNode);
            } else {
                resultNode.getParent().setRightChild(childNode);
            }

            resultNode.setParent(null);
            resultNode.setLeftChild(null);
            resultNode.setRightChild(null);
            bookRemoved = resultNode.getBook();

        } else {
            //in case the node has 2 childern
            Node minNode = findNodeWithMinBook(resultNode.getRightChild());
            bookRemoved = resultNode.getBook();
            resultNode.setBook(minNode.getBook());
            minNode.getParent().setLeftChild(null);
            minNode.setParent(null);
        }
        return bookRemoved;
    }

    public List<Book> remove(String name) {
        List<Book> booksRemoved = null;
        //code here
        return booksRemoved;
    }

    //lochi----------------------------------------------------------------------
    public Book find(Integer isbn) {
        inOrderGetBookByISBN(isbn, root);
        return resultBook;
    }

    public List<Book> find(String name) {
        //List<Book> books = new ArrayList<>();
        // name = name.trim().toLowerCase();
        //inOrderGetBookByName(books, name, root);
        //return books;
        return binarySearchByName(name);
    }

    public List<Book> findAll() {
        List<Book> books = new ArrayList<>();
        inOrder(books, root);
        //Collections.reverse(books);
        return books;
    }

    /*public void inOrder() {
     List<Book> books = new ArrayList<>();
     inOrder(books,root);
     }*/
    public void inOrder(List<Book> books, Node n) {
        if (n.hasLeftChild()) {
            inOrder(books, n.getLeftChild());
        }

        books.add(n.getBook());
        if (n.hasRightChild()) {
            inOrder(books, n.getRightChild());
        }
    }

    private void inOrderGetBookByName(List<Book> books, String name, Node n) {
        if (n.hasLeftChild()) {
            inOrderGetBookByName(books, name, n.getLeftChild());
        }
        if (n.getBook().getTitle().toLowerCase().contains(name)) {
            books.add(n.getBook());
        }

        if (n.hasRightChild()) {
            inOrderGetBookByName(books, name, n.getRightChild());
        }
    }

    private void inOrderGetBookByISBN(Integer i, Node n) {
      //  System.out.println(i + " : " + n.getBook().getIsbn());
        if (n.getBook().getIsbn().equals(i)) {
          //  System.out.println("found book");
            resultBook = n.getBook();

        } else {
            if (n.hasLeftChild()) {
                inOrderGetBookByISBN(i, n.getLeftChild());
            }
            //System.out.println(n);
            // books.add(n.getBook());            
            if (n.hasRightChild()) {
                inOrderGetBookByISBN(i, n.getRightChild());
            }
        }
    }

    private void inOrderGetNodeByISBN(Integer i, Node n) {
       // System.out.println(i + " : " + n.getBook().getIsbn());
        if (n.getBook().getIsbn().equals(i)) {
           // System.out.println("found node");
            resultNode = n;
           // System.out.println("@find result node is : " + resultNode);
        } else {
            if (n.hasLeftChild()) {
                inOrderGetNodeByISBN(i, n.getLeftChild());
            }
            if (n.hasRightChild()) {
                inOrderGetNodeByISBN(i, n.getRightChild());
            }
        }
    }

    public List<Book> binarySearchByName(String name) {
        List<Book> books = new ArrayList<>();
        boolean end = false;
        Node n = root;
        while (!end) {
            if (n == null) {
                break;
            }
            if (n.getBook().getTitle().toLowerCase().contains(name.trim().toLowerCase())) {
                books.add(n.getBook());
            }

            int c = n.getBook().getTitle().toLowerCase().compareTo(name.trim().toLowerCase());

            if (c > 0) {
                n = n.getLeftChild();
            } else {
                n = n.getRightChild();
            }
        }
        return books;
    }
    
    public Book binarySearchByISBN(Integer isbn) {
        Book book = null;       
        Node n = root;
        while (true) {
            if (n == null) {
                break;
            }
            if (n.getBook().getIsbn().equals(isbn)) {
                return n.getBook();
            }           

            if (n.getBook().getIsbn().equals(isbn)) {
                n = n.getLeftChild();
            } else {
                n = n.getRightChild();
            }
        }
        return book;
    }

    public void print() {
        System.out.println("()BinarySearchTree > Print --------------------");
        print(root);
        System.out.println("-----------------------------------------------\n\n");
    }
 

    public void print(Node n) {
        if (n != null) {
            System.out.println( "(*) " + n.getBook().getTitle() + "(" + n.getBook().getIsbn() + ")");
            if (n.getLeftChild() != null && n.getLeftChild().getBook() != null) {
                System.out.println("\t--> leftChild --> " + n.getLeftChild().getBook().getTitle() + "(" + n.getLeftChild().getBook().getIsbn() + ")");
            }
            if (n.getRightChild() != null && n.getRightChild().getBook() != null) {
                System.out.println("\t--> rightChild --> " + n.getRightChild().getBook().getTitle() + "(" + n.getRightChild().getBook().getIsbn() + ")");
            }
            print(n.getLeftChild());
            print(n.getRightChild());
        } else {
            // System.out.println(++x + "-->");
        }

    }

    private Node findNodeWithMinBook(Node n) {
        Node resultNodeWithMinBook = n;
        while (resultNodeWithMinBook.getLeftChild() != null) {
            resultNodeWithMinBook = resultNodeWithMinBook.getLeftChild();
        }
        return resultNodeWithMinBook;
    }
}
