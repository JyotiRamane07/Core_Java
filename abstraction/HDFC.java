package com.jso.abstraction;

public abstract class HDFC {
abstract public void payment();
abstract public void transfer();
abstract public void checkStatement();
public void m1()//concrete method
{System.out.println("M1 method");
}
}
