/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.TestAdd;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class NewJUnitTest {
    
    public NewJUnitTest() {
    }
    
    @Test
public void testAdd() {
   // TestAdd Class is tested
   TestAdd tester = new TestAdd();   
   // Check if add(10,5) returns 50
   assertEquals("10 + 5 must be 50 which is a wrong condition", 50, tester.add(10, 5));

 } 
    
       @Test
public void testMultiply() {
   // TestAdd Class is tested
   TestAdd tester = new TestAdd();   
   // Check if multiply(10,5) returns 50   
   assertEquals("10 x 5 must be 50", 50, tester.multiply(10, 5));
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
    // @Test
    // public void hello() {}
}
