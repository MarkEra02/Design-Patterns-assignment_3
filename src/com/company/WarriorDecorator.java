package com.company;

public class WarriorDecorator implements Warrior {
    private Warrior warrior;

    public WarriorDecorator(Warrior warrior) {
        this.warrior = warrior;
    }

    @Override
    public String combat(){
        return warrior.combat();
    }
}
