/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//JUnit Suite Test
@RunWith(Suite.class)
@Suite.SuiteClasses({ 
   TestJunit1.class ,TestJunit2.class
})
public class JunitTestSuite {
}
