public class SuperHero {
    private int health;
    private String name;
    private String superpower;

    public SuperHero(String name, String superpower, int health) {
        this.name = name;
        this.superpower = superpower;
        this.health = health;
    }

    public SuperHero() {
        this.health = 0;
        this.name = "Unnamed Superhero";
        this.superpower = "Unknown";
    }
    public void heal(int health){
        this.health+=health;
    }
    public void loseHealth(int health){
        this.health-=health;
    }
    public String getName(){return name;}
    public int getHealth(){return health;}
    public String getSuperpower(){return superpower;}


}
