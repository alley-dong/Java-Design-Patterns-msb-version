package com.dongchanglong.demo02;

//测试
public class Test01 {

    public static void main(String[] args) {

        ExpressionInterpreter e = new ExpressionInterpreter();
        long result = e.interpret("6 2 3 2 4 / - + *");
        System.out.println(result);
    }
}