/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookshop.util;

/**
 *
 * @author amila
 */
public class ComboItem {
    

    private Long key;
    private String value;

    public ComboItem(Long key, String value)
    {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString(){
        return value;
    }

    public Long getKey()
    {
        return key;
    }

    public String getValue()
    {
        return value;
    }
}

