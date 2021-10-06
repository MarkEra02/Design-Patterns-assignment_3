package com.company;

public class Main {

    public static void main(String[] args) {
        Warrior warrior = new MasterDecorator(new SoliderDecorator(new Recruit()));

        System.out.println(warrior.combat());
    }
}
