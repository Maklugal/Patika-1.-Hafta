package Patika_2_Week.game;

public class Warrior extends Character {
    public Warrior(String name) {
        super(name, 1500, 250);
    }

    @Override
    public void attack() {
        System.out.println(name + " Kılıcıyla saldırıyor ! Hasar: " + attackPower);
    }

    public void shieldBlock() {
        System.out.println(name + " Kalkanını kullanarak savunma yapıyor! ");
    }

}
