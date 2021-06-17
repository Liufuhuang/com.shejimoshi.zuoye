package com.shejimoshi.Observer;

public class OctalObserver extends Observer{
    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(){
        System.out.println("OctalString: " + Integer.toOctalString(subject.getState()));
    }
}
