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
import java.util.ArrayList;
import java.util.List;

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
        book.setIsbn(1);
        book.setTitle("TINTIN");
        
        Type type = new Type();
        type.setName("Comic");
        book.setType(type);
        
        Author author = new Author();
        author.setName("Herge");
        book.setAuthor(author);
        
        //book2
        Book book2 = new Book();
        book2.setIsbn(2);
        book2.setTitle("Batman");
        
        Type type2 = new Type();
        type2.setName("Comic");
        book2.setType(type);
        
         //book3
        Book book2_1 = new Book();
        book2_1.setIsbn(3);
        book2_1.setTitle("Captain America");
        
         //book3
        Book book3 = new Book();
        book3.setIsbn(4);
        book3.setTitle("Asterix");
        
        Type type3 = new Type();
        type3.setName("Comic");
        book3.setType(type);
        
        //book4
        Book book4 = new Book();
        book4.setIsbn(5);
        book4.setTitle("XMEN");
        
        Type type4 = new Type();
        type4.setName("Comic");
        book4.setType(type);
        
        
        BinarySearchTree bst = new BinarySearchTree();
        
       /* bst.add(book);
        bst.add(book2);
        bst.add(book2_1);
        bst.add(book3);
        bst.add(book4);
        */
        
        List<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book2);
        books.add(book2_1);
        books.add(book3);
        books.add(book4);
        
        //bst.add(books);
        
        
        System.out.println("@************************************************");
        //bst.inOrder();
        //List<Book> allBooks = bst.findAll();
        
        
//        List<Book> allBooks = bst.find("tin");
//        for (Book b : allBooks) {
//            System.out.println(b.getTitle());
//        }
        
        
        //System.out.println(bst.find(2));
    }
}
