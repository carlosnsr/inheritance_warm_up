class Mobile {
  // 'protected' means that child objects can directly access it
  protected String name;
  protected String type;
  // 'private' means that child objects CANNOT directly access it
  private int x;
  private int y;

  public Mobile(String name, int x, int y) {
    this.type = "mobile";
    this.name = name;
    this.x = x;
    this.y = y;
    System.out.println("\n" + this.name + " created at position (" + this.x + ", " + this.y + ")");
  }

  public void move(int x, int y) {
    this.x += x;
    this.y += y;
    System.out.println(name + " moved to (" + this.x + ", " + this.y + ")");
  }

  public void act() {
    System.out.println(name + " acts cool");
  }
};


class Zombie extends Mobile {
  public Zombie(String name, int x, int y) {
    super(name, x, y);  // This calls Mobile's constructor
    this.type = "zombie";
  }

  public void move(int x, int y) {
    super.move(x, y);  // This calls Mobile's move() first
    System.out.println(name + " says 'Mmm... Brainsss...'");
  }

  public void act() {
    System.out.println(name + " then grabs and bites");
  }
};


class Human extends Mobile {
  public Human(String name, int x, int y) {
    super(name, x, y);  // This calls Mobile's constructor
    this.type = "human";
  }

  public void move(int x, int y) {
    super.move(x, y);  // This calls Mobile's move() first
    System.out.println(name + " runs and listens to Ipod");
  }

  public void act() {
    System.out.println(name + " ducks and runs");
  }
};


public class Solution {
  public static void main(String args[]) {
    Mobile m = new Mobile("Mob", 10, 10);
    m.move(50, 0);
    m.act();

    Zombie z = new Zombie("Zom", 100, 100);
    z.move(0, 50);
    z.act();

    Human bob = new Human("Bob", 100, 150);
    bob.move(50, 50);
    bob.act();
  }
}
