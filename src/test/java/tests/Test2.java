package tests;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.annotations.Test;

/**
 * Created by navyab on 7/3/18.
 */


public class Test2 extends BaseTest {

    @Test(groups = {"Sanity"})
    public void TestName() {
        System.out.println("inTestHomePageTEst2");

    }

    public void returnTestStatus(ITestResult ir){
        System.out.println(ir.getName());

    }

}
