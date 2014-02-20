/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package treedbx;

import com.bookshop.controller.BookJpaController;
import com.bookshop.entity.Author;
import com.bookshop.entity.Book;
import com.bookshop.entity.Type;

/**
 *
 * @author ravindu
 */
public class TreeDBX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Book book = new Book();
        book.setIsbn(234457845);
        book.setTitle("TINTIN");
        
        Type type = new Type();
        type.setName("Comic");
        book.setType(type);
        
        Author author = new Author();
        author.setName("Herge");
        book.setAuthor(author);
        
        BookJpaController bjc = new BookJpaController();        
        bjc.create(book);
        
        
        
    }
}
