abstract class Character {
    String name;
    int health;
    int attack;

    public Character(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    public void attack(Character other){
        other.takeDamage(attack);
    }

    public void takeDamage(int damage){
        health -= damage;
        System.out.println("受到" + damage + "傷害，剩餘生命:" + health);
    }
    public  abstract void display();
}

