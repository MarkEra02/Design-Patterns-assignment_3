package com.company;

public class MasterDecorator extends WarriorDecorator {

    public MasterDecorator(Warrior warrior) {
        super(warrior);
    }

    public String trainYoungSouls() {
        return "Train recruits. ";
    }

    @Override
    public String combat() {
        return super.combat()+ trainYoungSouls();
    }
}
