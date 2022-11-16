public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamageOfBoss(50);
        boss.setHealthOfBoss(500);
        boss.setTypeOfDefense("Protected with hands");
        System.out.println("Damage of Boss: " + boss.getDamageOfBoss() + " Health of Boss: " + boss.getHealthOfBoss() + " The type of Defense: " + boss.getTypeOfDefense());
        for (int i = 0; i < createHero().length; i++) {
            System.out.println(" Hero helth наших героев  = " + createHero()[i].getHealth()+ " Урон наших героев= " + createHero()[i].getDamage()+" Супер способность героев "+ createHero()[i].getSuperdamage());


        }
    }




    public static Hero[] createHero() {
        Hero hero = new Hero(30, 20, "Zzz");
        Hero hero1 = new Hero(10, 10, "Sss");
        Hero hero2 = new Hero(10,20,"AAA");

        Hero[] Boews = {hero, hero1, hero2 };
        return Boews;

    }

}