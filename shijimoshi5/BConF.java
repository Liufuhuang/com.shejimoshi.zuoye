package com.shijimoshi5;

public class BConF implements BFruitAndVegetables{
    public Fruit createF(){
        System.out.println("生产苹果");
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
