package Patika_2_Week.game;

public class Archer extends Character {
    public Archer(String name) {
        super(name, 150, 300);
    }

    @Override
    public void attack() {
        System.out.println(name + " Ok fırlatıyor! Hasar: " + attackPower);
    }

    public void multiShot() {
        System.out.println(name + " 3 ok birden fırlattı! ");
    }

}