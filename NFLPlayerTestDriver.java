/**
 * Program: Final
 * File: NFLPlayerTestDriver.java
 * Summary: A "test suite" for the NFLPlayer class
 * Author: Chase Hausman
 * Date: March 17, 2018
 */
public class NFLPlayerTestDriver {
    public static void main(String args[]) {
        // Without arguments, create a new instance, show the results
        System.out.println("Creating without arguments:");
        NFLPlayer player_1 = new NFLPlayer();
        displayPlayerProperties(player_1);

        // Editing all properties, by setting all of them, show results
        System.out.println("\n\n Editing Properties");
        player_1.setCollege("Grand Canyon University");
        player_1.setFirstYear(1949);
        player_1.setHeight(18);
        player_1.setInterceptions(12);
        player_1.setName("Thunder the Antelope");
        player_1.setPosition("Mascot");
        player_1.setRating(12.5);
        player_1.setWeight(250);
        player_1.setTouchdowns(12021);
        player_1.setYards(515);
        displayPlayerProperties(player_1);

        // Creating a player with arguments, show results
        System.out.println("\n\n Creating with arguments");
        NFLPlayer player_2 = new NFLPlayer("Someone else", 72, 185, "Some position",
                1999, 65, 34, 215, 5.6, "No School");
        displayPlayerProperties(player_2);
    }

    private static void displayPlayerProperties(NFLPlayer player) {
        System.out.println("Name:          "+player.getName());
        System.out.println("Height:        "+player.getHeight());
        System.out.println("Height Format: "+player.getFormattedHeight());
        System.out.println("Weight:        "+player.getWeight());
        System.out.println("Position:      "+player.getPosition());
        System.out.println("First Year:    "+player.getFirstYear());
        System.out.println("Years Exp.:    "+player.getYearsOfExperience());
        System.out.println("Touchdowns:    "+player.getTouchdowns());
        System.out.println("Interceptions: "+player.getInterceptions());
        System.out.println("Yards:         "+player.getYards());
        System.out.println("Rating:        "+player.getRating());
        System.out.println("College:       "+player.getCollege());
    }
}
