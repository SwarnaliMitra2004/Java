/*Create a Map where the keys are country names (as String) 
and the values are their capitals (also String). Populate the 
map with at least five countries and their capitals. Write a 
program that prompts the user to enter a country name 
and then displays the corresponding capital, if it exists in 
the map.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryCapitalMap {

    public static void main(String[] args) {

        // Create and populate the map
        Map<String, String> countryCapitals = new HashMap<>();
        countryCapitals.put("India", "New Delhi");
        countryCapitals.put("USA", "Washington D.C.");
        countryCapitals.put("UK", "London");
        countryCapitals.put("France", "Paris");
        countryCapitals.put("Japan", "Tokyo");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter country name: ");
        String country = sc.nextLine();

        // Check and display capital
        if (countryCapitals.containsKey(country)) {
            System.out.println("Capital of " + country + " is " + countryCapitals.get(country));
        } else {
            System.out.println("Country not found in the map.");
        }

        sc.close();
    }
}
