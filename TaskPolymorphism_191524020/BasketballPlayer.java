public class BasketballPlayer {
    protected String name;
    protected String position;
    protected String team;
    protected int height;
    protected int weight;
    protected int agility;
    protected int speed;
    protected int ballHandling;

    public BasketballPlayer() {
        this.name = "unknown";
        this.position = "unknown";
        this.team = "unknown";
        this.height = 0;
        this.weight = 0;
        this.agility = 0;
        this.speed = 0;
        this.ballHandling = 0;
    }

    public BasketballPlayer(String name, String position, String team) {
        this.name = name;
        this.position = position;
        this.team = team;
        this.height = 0;
        this.weight = 0;
        this.agility = 0;
        this.speed = 0;
        this.ballHandling = 0;
    }

    public BasketballPlayer(String name, String position, String team, int height, int weight, int agility, int speed, int ballHandling) {
        this.name = name;
        this.position = position;
        this.team = team;
        this.height = height;
        this.weight = weight;
        this.agility = agility;
        this.speed = speed;
        this.ballHandling = ballHandling;
    }

    public String getName() {
        return this.name;
    }

    public String getPosition() {
        return this.position;
    }

    public String getTeam() {
        return this.team;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getAgility() {
        return this.agility;
    }

    public int getSpeed() {
        return this.speed;
    }
    
    public int getBallHandling() {
        return this.ballHandling;
    }
    
    public int getValue() {
        int value = 0;

        if (this.getPosition() == "Center") {
            if (this.getHeight() >= 82 && this.getWeight() >= 220 && this.getWeight() <= 250 && this.getBallHandling() > 5)
                value = 10;
            else if (this.getHeight() >= 80 && this.getWeight() >= 210 && this.getWeight() <= 260 && this.getBallHandling() > 5)
                value =  8;
            else if (this.getHeight() >= 80 && this.getBallHandling() > 4)
                value = 6;
            else if (this.getHeight() >= 78 && this.getAgility() > 7)
                value = 5;
            else if (this.getHeight() >= 78)
                value = 4;
            else if (this.getHeight() >= 76 && this.getAgility() > 5)
                value = 2;
        } else if (this.getPosition() == "Forward") {
            if (this.getHeight() >= 80 && (this.getAgility() > 8 || this.getSpeed() > 7))
                value = 10;
            else if (this.getHeight() >= 78 && this.getAgility() > 6 && this.getSpeed() > 5)
                value = 8;
            else if (this.getHeight() >= 77 && this.getAgility() > 5)
                value = 6;
            else if (this.getHeight() >= 76 && this.getSpeed() > 4)
                value = 5;
            else if (this.getHeight() >= 75 && (this.getAgility() > 3 || this.getSpeed() > 3))
                value = 3;
            else if (this.getHeight() >= 74)
                value = 1;
        } else if (this.getPosition() == "Guard") {

        }

        return value;
    }

    public String toString() {
        return "Name\t\t: " + this.getName() + "\nPosition\t: " + this.getPosition() + "\nTeam\t\t: " + this.getTeam() + "\nValue\t\t: " + this.getValue();
    }
}