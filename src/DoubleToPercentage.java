public class DoubleToPercentage {

    public static void main(String[] args) {
        double winRate = 0.0;
        double winningPercentage = 0.0;
        int careerWins = 0;
        int careerLosses = 0;

        winRate = (double) careerWins / (careerWins + careerLosses) * 100;
        winningPercentage = Math.round(winRate * 100.0) / 100.0;

        System.out.println(winningPercentage);
    }
}
