package com.shijimoshi5;

public class BConV implements BFruitAndVegetables{
    public Fruit createF(){
        return new Fruit() {
            @Override
            public void eat() {

            }
        };
    }
    public Vegetables createV(){
        System.out.println("生产西红柿");
        return new Vegetables() {
            @Override
            public void eat() {

            }
        };
    }
}
