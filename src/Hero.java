public class Hero {
    private int health;
    private int damage;
    private String superdamage;

    public Hero(int health, int damage, String superdamage) {
        this.health = health;
        this.damage = damage;
        this.superdamage = superdamage;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperdamage() {
        return superdamage;
    }

    public void setSuperdamage(String superdamage) {
        this.superdamage = superdamage;
    }
}
