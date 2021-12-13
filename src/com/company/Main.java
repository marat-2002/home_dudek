package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boss boss = new Boss();
        boss.setHealth(100);
        boss.setDamage(25);
        System.out.println(boss.getHealth() + " " + boss.getDamage());
       Hero[]createHeroess = createHeroes();
        for (Hero command :createHeroess ) {
            System.out.println(command.getHealth() + " " + command.getDamage());

        }
    }
   public static Hero[] createHeroes(){
        Hero spider = new Hero(120, 15, "Wide Shot");
                Hero halk = new Hero(300, 20);
                        Hero thor = new Hero(250, 25,"Thunder Shot");
    Hero[] createHeroess = {spider , halk, thor};
            return createHeroess;
    }

}

