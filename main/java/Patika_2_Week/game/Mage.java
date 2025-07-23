package Patika_2_Week.game;

public class Mage extends Character {
    public Mage(String name) {
        super(name, 100, 350);
    }

    @Override
    public void attack() {
        System.out.println(name + " Büyü yapıyor ! Hasar: " + attackPower);
    }

    public void castSpell() {
        System.out.println(name + " Ateş topu büyüsü yapıyor!");
    }
}