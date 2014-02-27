/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookshop.exceptions;

/**
 *
 * @author ravindu
 */
public class NonExistingBookException extends Exception{

    public NonExistingBookException(String message) {
        super(message);
    }

    public NonExistingBookException(String message, Throwable cause) {
        super(message, cause);
    }
        
}
