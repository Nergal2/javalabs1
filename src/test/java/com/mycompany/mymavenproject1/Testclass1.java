/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mymavenproject1;
import static org.junit.Assert.*;
import org.junit.Test;
/**
 *
 * @author Администратор
 */
public class Testclass1 {
        @Test
    public void  testing ()
    {   Mavienjavaclass jtest = new Mavienjavaclass(); 
        assertEquals (10,jtest.calcsmth());
    }
    
}
