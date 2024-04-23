class Mage extends Character {
    int mana;

    public Mage(String name, int health, int attack, int mana) {
        super(name, health, attack);
        this.mana = mana;
    }

    public void castSpell() {
        if (mana >= 20) {
            System.out.println(name + " 施放法術，造成雙倍傷害");
            attack *= 2;
            mana -= 20;
        } else {
            System.out.println("法力值不足，無法施放法術");
        }
    }

    @Override
    public void display() {
        System.out.println("法師 " + name + " 生命值: " + health + " 攻擊力: " + attack + " 法力值: " + mana);
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " 受到 " + damage + " 點傷害");
    }

}

