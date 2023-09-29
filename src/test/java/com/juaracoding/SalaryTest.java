package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SalaryTest {

    //test gaji di atas 7000
    @Test
    public void salaryMore(){
        Salary salary = new Salary();
        Assert.assertEquals(salary.Salary(7100),2130);
    }

    //test di bawah 7000
    @Test
    public void salaryLower(){
        Salary salary = new Salary();
        Assert.assertEquals(salary.Salary(6100),6100);
    }
    //wakandaforever
}
