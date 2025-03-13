package com.kovan;

public class Main {
    public static void main(String[] args) {

        LazzyInnerClassSingleton obj1 = LazzyInnerClassSingleton.getInstance();

        System.out.println(obj1.hashCode());

        LazzyInnerClassSingleton obj2 = LazzyInnerClassSingleton.getInstance();

        System.out.println(obj2.hashCode());
    }
}
