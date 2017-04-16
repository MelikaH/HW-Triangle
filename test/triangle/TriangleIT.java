/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Melika
 */
public class TriangleIT {
    
    public TriangleIT() {
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

    /**
     * Test of triang method, of class Triangle.
     */
    
    @Test
    public void testTriang() {
        System.out.println("triang");
        int s1 = 1;
        int s2 = 7;
        int s3 = 1;
        Triangle instance = new Triangle();
        String expResult = "Not a triangle."; // it looks like isosceles triangle but it is not
        String result = instance.triang(s1, s2, s3);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testTriang1() {
        System.out.println("triang");
        int s1 = 5;
        int s2 = 5;
        int s3 = 5;
        Triangle instance = new Triangle();
        String expResult = "Equilaterall Triangle.";
        String result = instance.triang(s1, s2, s3);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testTriang2() {
        System.out.println("triang");
        int s1 = 0;
        int s2 = 0;
        int s3 = 0;
        Triangle instance = new Triangle();
        String expResult = "Not valid.";
        String result = instance.triang(s1, s2, s3);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testTriang3() {
        System.out.println("triang");
        int s1 = -1;
        int s2 = 2;
        int s3 = 2;
        Triangle instance = new Triangle();
        String expResult = "Not valid.";
        String result = instance.triang(s1, s2, s3);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testTriang4() {
        System.out.println("triang");
        int s1 = 1;
        int s2 = 2;
        int s3 = 3;
        Triangle instance = new Triangle();
        String expResult = "Not a triangle."; // it looks like acute but it is not
        String result = instance.triang(s1, s2, s3);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testTriang5() {
        System.out.println("triang");
        int s1 = 4;
        int s2 = 2;
        int s3 = 3;
        Triangle instance = new Triangle();
        String expResult = "Obtuse Triangle.";
        String result = instance.triang(s1, s2, s3);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testTriang6() {
        System.out.println("triang");
        int s1 = 3;
        int s2 = 4;
        int s3 = 5;
        Triangle instance = new Triangle();
        String expResult = "Right Triangle.";
        String result = instance.triang(s1, s2, s3);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testTriang7() {
        System.out.println("triang");
        int s1 = 5;
        int s2 = 3;
        int s3 = 5;
        Triangle instance = new Triangle();
        String expResult = "Isosceles Triangle.";
        String result = instance.triang(s1, s2, s3);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testTriang8() {
        System.out.println("triang");
        int s1 = 3;
        int s2 = 5;
        int s3 = 6;
        Triangle instance = new Triangle();
        String expResult = "Acute Triangle.";
        String result = instance.triang(s1, s2, s3);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testTriang9() {
        System.out.println("triang");
        int s1 = 0;
        int s2 = -5;
        int s3 = 5;
        Triangle instance = new Triangle();
        String expResult = "Not valid.";
        String result = instance.triang(s1, s2, s3);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testTriang10() {
        System.out.println("triang");
        int s1 = 5;
        int s2 = 3;
        int s3 = 0;
        Triangle instance = new Triangle();
        String expResult = "Not valid.";
        String result = instance.triang(s1, s2, s3);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testTriang11() {
        System.out.println("triang");
        int s1 = 10;
        int s2 = 1;
        int s3 = 2;
        Triangle instance = new Triangle();
        String expResult = "Not a triangle."; // it looks like obtuse triangle but it is not
        String result = instance.triang(s1, s2, s3);
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testTriang12() {
        System.out.println("triang");
        int s1 = 10;
        int s2 = 1;
        int s3 = -2;
        Triangle instance = new Triangle();
        String expResult = "Not valid.";
        String result = instance.triang(s1, s2, s3);
        assertEquals(expResult, result);
    
    
}
}