package com.java.beans;

/**
 * Created by gbv on 10/28/2015.
 */
public enum  MySingleTon {
     INSTANCE;



    public void leaveTheBuilding(){
        INSTANCE.leaveTheBuilding();
    }

    /*public class MySingleTon{
          public static final MySingleTon myInstance = new MySingleTon();
    private MySingleTon(){}

    public static MySingleTon getMyInstance(){
        return myInstance;
    }
    private Object readResolve(){
        return myInstance;
    }
    }*/

}
