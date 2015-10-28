package com.java.beans;

/**
 * Created by gbv on 10/28/2015.
 */
public class NonInstantiable {

    public static int myFirstStaticField;

    private NonInstantiable() {
        //throw new AssertionError();// this will avoid the class being instantiated within the class;
    }

    public static int myFirstStaticMethod() {
        return 0;
    }

    public static void main(String[] args) {
        NonInstantiable non = new NonInstantiable();
        System.out.println(myFirstStaticMethod());
    }

}
