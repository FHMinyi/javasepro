package com.fhminyi.extends4override;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal animal = new Cat();
        animal.cry();
//        cat.cry();
        String ani = animal.toString();
        System.out.println(ani);
    }
}

class Cat extends Animal{
    @Override
//    private void cry() 权限要大于等于父类
    public void cry(){
        System.out.println("Cat cry");
    }
}

class Animal {
//    私有，静态方法，都不能被重写，
    public void cry() {
        System.out.println("Animal cry");
    }


}
