package com.shijimoshi5;

public class AConF implements AFruitAndVegetables{
    public Fruit createF(){
        System.out.println("生产香蕉!");
        return new Fruit() {
            @Override
            public void eat() {

            }
        };
    }
    public Vegetables createV(){
        return new Vegetables() {
            @Override
            public void eat() {

            }
        };
    }
}
