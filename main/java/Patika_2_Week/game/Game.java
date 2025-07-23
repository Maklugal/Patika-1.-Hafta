package Patika_2_Week.game;

public class Game {

    /*
     * Savaşçı
     * Büyüxü
     * Okçu
     */
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Kral");
        Mage mage = new Mage("Gandalf");
        Archer archer = new Archer("Legolas");

        warrior.showStats();
        mage.showStats();
        archer.showStats();

        // Karakterler saldırı yapıyor.
        System.out.println(" === Saldırılar başlıyor === ");
        warrior.attack();
        mage.attack();
        archer.attack();

        // Özel yetenekler
        System.out.println(" === Özel yetenekler === ");
        warrior.shieldBlock();
        mage.castSpell();
        archer.multiShot();

    }
}
