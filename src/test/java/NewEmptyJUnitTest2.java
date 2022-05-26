/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.mavenproject3.NewClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Javier
 */
public class NewEmptyJUnitTest2 {
    
    public NewEmptyJUnitTest2() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void primeros3impares() {
      NewClass instance = new NewClass();
        System.out.println("Pruebas elegibles");

        //En caso de querer probar las pruebas descomentar código
        //Prueba Número 1
        int num = 9;
        int[] expResultado1 = {1, 3, 5, 7, 9,-1,-1,-1,-1};
        int[] resultado1 = instance.primeros3impares(num);
        assertArrayEquals(expResultado1, resultado1);
        
         //Prueba Número 2
       // num = 8;
        //expResultado1 = {1, 3, 5, 7, -1,-1,-1,-1,-1};
        //resultado1 = instance.primeros3impares(num);
        //assertArrayEquals(expResultado1, resultado1);
        
         //Prueba Número 3
        //num = 7;
        //expResultado1 = {1, 3, 5, 7, 9,-1,-1,-1,-1};
        //resultado1 = instance.primeros3impares(num);
        //assertArrayEquals(expResultado1, resultado1);

     
     }
}
