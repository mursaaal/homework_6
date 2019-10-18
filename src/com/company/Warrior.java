package com.company;

public class Warrior extends Player implements UseSuperAbility {
String weapon;

        @Override
        public void superAbility(){
            System.out.println("Ability used");
        }
    }

