package com.cput.chapter;

public class TechShopStock implements TechShopInterface
{
    @Override
    public int phoneStock(int a, int b)
    {
        return a * b;
    }

    @Override
    public int phoneSale(int a, int b)
    {
        return a - b;
    }

    @Override
    public int phoneMarkUp(int a, int b)
    {
        return a + b;
    }
}
