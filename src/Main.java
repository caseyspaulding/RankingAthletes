/*
    * Name: Casey Spaulding
    * Date: 4/5/2023
    * SkillStorm Java
    * Assignment: Week 6 Lab
    *
    * Description: This program is a simple example of how to sort a list of objects using a comparator.
    * The program creates a list of athletes and sorts them by their total number of wins.
    *
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Athlete BabeRuth = new Athlete("Babe Ruth", 714, 696);
        Athlete MichaelJordan = new Athlete("Michael Jordan", 706, 366);
        Athlete TigerWoods = new Athlete("Tiger Woods", 120, 79);
        Athlete LebronJames = new Athlete("Lebron James", 919, 496);
        Athlete MichaelPhelps = new Athlete("Michael Phelps", 28, 2);

        List<Athlete> athletes = new ArrayList<>();
        athletes.add(BabeRuth);
        athletes.add(MichaelJordan);
        athletes.add(TigerWoods);
        athletes.add(LebronJames);
        athletes.add(MichaelPhelps);

        System.out.println("Casey Spaulding");
        System.out.println("4/5/2023");
        System.out.println("SkillStorm Java");
        System.out.println("Week 6 Lab Ranking Athletes");
        System.out.println("____________________");
        RankingAthletes rankingAthletes = new RankingAthletes();
        System.out.println(rankingAthletes.compareAthleteWinningPercentage(BabeRuth, MichaelJordan));

        System.out.println("____________________");
        System.out.println("Athletes Before Sorting: ");
        System.out.println("____________________");
        for (Athlete athlete : athletes) {
            System.out.println(athlete + " ");
        }
        System.out.println("____________________");
        System.out.println("Athletes After Sorting: ");
        System.out.println("____________________");
        athletes.sort(new RankingAthletes());
        for (Athlete athlete : athletes) {
            System.out.println(athlete + " ");
        }




    }

}