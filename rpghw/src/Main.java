public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("戰士A", 100, 15, 5);
        Mage mage = new Mage("法師B", 80, 10, 50);

        warrior.display();
        mage.display();

        // 模擬戰鬥
        System.out.println("===== 戰鬥開始 =====");

        mage.castSpell();
        warrior.useShield();
        warrior.attack(mage);

        warrior.display();
        mage.display();
    }
}
