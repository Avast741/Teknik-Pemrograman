public class CollegeBasketballPlayer extends BasketballPlayer {
    private int eligibilityRemaining;
    private String role;

    public CollegeBasketballPlayer() {
        super();
        this.eligibilityRemaining = 4;
        this.role = "bench";
    }

    public CollegeBasketballPlayer(String name, String position, String team) {
        super(name, position, team);
        this.eligibilityRemaining = 4;
        this.role = "bench";

    }

    public CollegeBasketballPlayer(String name, String position, String team, int height, int weight, int agility, int speed, int ballHandling, int eligibilityRemaining, String role) {
        super(name, position, team, height, weight, agility, speed, ballHandling);
        this.eligibilityRemaining = eligibilityRemaining;
        this.role = role;
    }

    public int getEligibilityRemaining() {
        return this.eligibilityRemaining;
    }

    public String getRole() {
        return this.role;
    }

    public String toString() {
        return super.toString() + "\nRole\t\t: " + this.getRole();
    }

    public boolean draftable() {
        return (this.getRole() == "starter" && super.getValue() > 4) || (this.getRole() == "bench" && super.getValue() >= 8);
    }
}