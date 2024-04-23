class Warrior extends Character {
    private int defense;

    public Warrior(String name, int health, int attack, int defense) {
        super(name, health, attack);
        this.defense = defense;
    }

    public void useShield() {
        System.out.println(name + " 使用盾牌，防禦力增加10點");
        defense += 10;
    }

    @Override
    public void display() {
        System.out.println("戰士 " + name + " 生命值: " + health + " 攻擊力: " + attack + " 防禦力: " + defense);
    }

    @Override
    public void takeDamage(int damage) {
        int actualDamage = damage - defense;
        if (actualDamage > 0) {
            health -= actualDamage;
            System.out.println(name + " 受到 " + actualDamage + " 點傷害");
        } else {
            System.out.println(name + " 守住了攻擊，沒有受到傷害");
        }
    }

}

