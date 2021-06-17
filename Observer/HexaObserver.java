package com.shejimoshi.Observer;

public class HexaObserver extends Observer{
    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(){
        System.out.println("HexString:" + Integer.toBinaryString(subject.getState()).toUpperCase());
    }
}
