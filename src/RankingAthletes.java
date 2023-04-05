import java.util.Comparator;

public class RankingAthletes implements Comparator<Athlete> {
    public int compare(Athlete a1, Athlete a2) {
        if (a1 == null || a2 == null) {
            throw new NullPointerException("Athlete cannot be null");
        }
        if (a1.getWinningPercentage() > a2.getWinningPercentage()) {

            return -1;
        } else if (a1.getWinningPercentage() < a2.getWinningPercentage()) {
            return 1;
        } else {
            return 0;
        }
    }

    public int compareAthleteWinningPercentage(Athlete a1, Athlete a2) {
        if (a1 == null || a2 == null) {
            throw new NullPointerException("Athlete cannot be null");
        }
        if (a1.getWinningPercentage() > a2.getWinningPercentage()) {
            System.out.println(a1 + " is greater than " + a2);

            return -1;
        } else if (a1.getWinningPercentage() < a2.getWinningPercentage()) {
            System.out.println(a2 + " is greater than " + a1 );
            return 1;
        } else {
            return 0;
        }
    }


}












