package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        PreProcessing preProcessing =new PreProcessing();
        Long t1=System.currentTimeMillis();
        preProcessing.read();
//        System.out.println(preProcessing.stemTerm("seconds"));
        System.out.println("Time:"+((System.currentTimeMillis())-t1));
    }
}
