package com.company;

public class SoliderDecorator extends WarriorDecorator {

    public SoliderDecorator(Warrior warrior){
        super(warrior);
    }

    String fightWithEnemies(){
        return "Fight with enemies. ";
    }

    @Override
    public String combat() {
        return super.combat() + fightWithEnemies();
    }
}
