/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package treedbx;

import com.bookshop.controller.BookJpaController;
import com.bookshop.entity.Author;
import com.bookshop.entity.Book;
import com.bookshop.entity.Type;
import com.bookshop.util.BinarySearchTree;

/**
 *
 * @author ravindu
 */
public class TreeDBX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*Book book = new Book();
        book.setIsbn(234457845);
        book.setTitle("TINTIN");
        
        Type type = new Type();
        type.setName("Comic");
        book.setType(type);
        
        Author author = new Author();
        author.setName("Herge");
        book.setAuthor(author);
        
        BookJpaController bjc = new BookJpaController();        
        bjc.create(book); */
        //book1
        Book book = new Book();
        book.setIsbn(234457866);
        book.setTitle("TINTIN");
        
        Type type = new Type();
        type.setName("Comic");
        book.setType(type);
        
        Author author = new Author();
        author.setName("Herge");
        book.setAuthor(author);
        
        //book2
        Book book2 = new Book();
        book2.setIsbn(234457877);
        book2.setTitle("ZINZIN Ad");
        
        Type type2 = new Type();
        type2.setName("Comic");
        book2.setType(type);
        
        
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(book);
        bst.add(book2);
        
        
    }
}
