package org.example;

public class Cat extends Animal {
    private static final int RUN_LIMIT = 200;
    private static final int SWIM_LIMIT = 0; // Коты не умеют плавать
    private boolean isFull = false;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance <= RUN_LIMIT) {
            super.run(distance);
        } else {
            System.out.println(name + " не может пробежать " + distance + " метров.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public boolean eat(FoodBowl bowl) {
        if (bowl.getFoodAmount() > 0) {
            isFull = true;
            bowl.decreaseFood(1); // Кот съедает 1 порцию еды
            System.out.println(name + " покушал из миски.");
            return true;
        } else {
            System.out.println(name + " не может покушать, еды в миске нет.");
            return false;
        }
    }

    public boolean isFull() {
        return isFull;
    }
}
