import javax.lang.model.util.ElementScanner6;

public class ProBasketballPlayer extends BasketballPlayer {
    private int yearsInLeague;
    private String role;

    public ProBasketballPlayer() {
        super();
        this.yearsInLeague = 0;
        this.role = "bench";
    }

    public ProBasketballPlayer(String name, String position, String team) {
        super(name, position, team);
        this.yearsInLeague = 0;
        this.role = "bench";
    }

    public ProBasketballPlayer(String name, String position, String team, int height, int weight, int agility, int speed, int ballHandling, int yearsInLeague, String role) {
        super(name, position, team, height, weight, agility, speed, ballHandling);
        this.yearsInLeague = yearsInLeague;
        this.role = role;
    }

    public int getYearsInLeague() {
        return this.yearsInLeague;
    }

    public String getRole() {
        return this.role;
    }

    public String toString() {
        return super.toString() + "\nYears in League\t: " + this.getYearsInLeague() + "\nRole\t\t: " + this.getRole();
    }

    public int newContractValue() {
        int value = 0;

        if (this.getYearsInLeague() < 3) {
            value = 0;
        } else {
            if (this.getRole() == "starter") {
                if (super.getValue() > 8 && this.getYearsInLeague() >= 10)
                    value = 12_000_1000;
                else if (super.getValue() > 7 && this.getYearsInLeague() >= 8)
                    value = 10_000_000;
                else if (super.getValue() > 7 && this.getYearsInLeague() >= 5)
                    value = 8_000_000;
                else if (super.getValue() > 5 && this.getYearsInLeague() >= 10)
                    value = 6_000_000;
                else if (this.getYearsInLeague() >= 5)
                    value = 2_000_000;
                else
                    value = 1_000_000;
            } else if (this.getRole() == "bench") {
                if (super.getValue() > 8 && this.getYearsInLeague() >= 10)
                    value = 7_500_000;
                else if (super.getValue() > 7 && this.getYearsInLeague() >= 8)
                    value = 5_000_000;
                else if (super.getValue() > 5 && this.getYearsInLeague() >= 10)
                    value = 4_500_000;
                else if (this.getYearsInLeague() >= 7)
                    value = 2_000_000;
                else
                    value = 500_000;
            }
        }

        return value;
    }
}