package ParameterTesting;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParaTest {
    @Test
    @Parameters({"para1","para2","para3"})
    public void printParameters(String para1,String para2,String para3){
        System.out.println("Parameter1: " + para1);
        System.out.println("Parameter2: " + para2);
        System.out.println("Parameter3: " + para3);
    }
}
