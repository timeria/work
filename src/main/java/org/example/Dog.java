package org.example;

public class Dog extends Animal {
    private static final int RUN_LIMIT = 500;
    private static final int SWIM_LIMIT = 10;

    public Dog(String name) {
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
        if (distance <= SWIM_LIMIT) {
            super.swim(distance);
        } else {
            System.out.println(name + " не может проплыть " + distance + " метров.");
        }
    }
}