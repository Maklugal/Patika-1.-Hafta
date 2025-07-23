package Patika_2_Week.game;

public class Character {
    protected String name;
    protected int health;
    protected int attackPower;

    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void attack() {
        System.out.println(name + "saldırıyor ! Hasar: " + attackPower);
    }

    public void showStats() {
        System.out.println("Karakter: " + name);
        System.out.println("Can : " + health);
        System.out.println("Saldırı gücü: " + attackPower);
        System.out.println("------------------------------");
    }
}
