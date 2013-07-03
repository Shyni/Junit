/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JunitTestSuiteRunner {
   public static void main(String[] args) {
     // Result result = JUnitCore.runClasses(TestJunit.class);
        Result result = JUnitCore.runClasses(JunitTestSuite.class);
      for (Failure failure : result.getFailures()) {
         System.out.println("JunitTestSuiteRunner.java : failure.toString() : "+failure.toString());
      }
      System.out.println("JunitTestSuiteRunner.java : result.wasSuccessful() : "+result.wasSuccessful());
   }
}
