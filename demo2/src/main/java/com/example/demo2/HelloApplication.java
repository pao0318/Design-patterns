package com.example.demo2;

public class HelloApplication {
    public static void main(String args[]){
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("Closed");
        obj.spec();
    }
}