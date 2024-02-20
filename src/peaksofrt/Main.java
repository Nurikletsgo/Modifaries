package peaksofrt;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Country country1 = new Country("Kyrggyzstan 🇰🇬", "kyrgyz", 7000000, 199900);
        Country country2 = new Country("Kazakstan 🇰🇿", "kazak", 13000000, 2725000);
        Country country3 = new Country("Russia 🇷🇺", "russian", 143000000, 17000000);
        Country country4 = new Country("China 🇨🇳", "chinese", 1500000000, 9597000);
        Country[] countries = {country1, country2, country3, country4};
        System.out.println(Arrays.toString(countries));

        Country.getMoreArea(countries);
        Country.getMorePopulation(countries);
        Country.getSmallCountry(countries);
    }
}