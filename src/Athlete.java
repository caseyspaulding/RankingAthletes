public class Athlete {
    private String name;
    private int careerWins;
    private int careerLosses;
    double winRate = 0.0;
    double winningPercentage = 0.0;;



    public Athlete(String name, int careerWins, int careerLosses) {
        this.name = name;
        this.careerWins = careerWins;
        this.careerLosses = careerLosses;
        this.winningPercentage = winningPercentage;
    }

    public String getName() {
        return name;
    }

    public int getCareerWins() {
        return careerWins;
    }

    public int getCareerLosses() {
        return careerLosses;
    }

    public double getWinningPercentage() {
        return (double) careerWins / (careerWins + careerLosses) * 100;
    }

    public int getWinningPercentageRounded() {
        winRate = (double) careerWins / (careerWins + careerLosses) * 100;
        int winningPercentage = (int)Math.round(winRate);

        return winningPercentage;
    }


    @Override
    public String toString() {
        return name + " " + getWinningPercentageRounded() + "%";
    }
}

