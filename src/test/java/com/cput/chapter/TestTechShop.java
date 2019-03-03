package com.cput.chapter;

import com.cput.chapter.config.AppConfig;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestTechShop {

    private ApplicationContext ctx;
    private TechShopInterface tech;

    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        tech = (TechShopInterface)ctx.getBean("tech");
    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void testPhoneSale() throws Exception {
        Assert.assertEquals(10, tech.phoneSale(20, 10));           //10 turbos got sold

    }

    @Test
    public void testPhoneStock() throws Exception {
        Assert.assertEquals(500, tech.phoneStock(100, 5));         //100 boxes of garret turbos came in with 5 in each box

    }

    @Test
    public void testPhoneMarkUp() throws Exception {
        Assert.assertEquals(8500, tech.phoneMarkUp(7000, 1500));        //mark up price is 1500

    }
}
