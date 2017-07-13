package com.mycompany.app;

/**
 * Hello world!
 *
 */

class Sum {
    public int add(int ... args) {
        int res = 0;
        for (int arg : args)
            res += arg;
        return res;
    }
}

public class App {
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
