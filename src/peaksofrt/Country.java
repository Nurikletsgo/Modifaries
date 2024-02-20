package peaksofrt;

public class Country {
    private String name;
    private String language;
    private double population;
    private int area;

    public Country(String name, String language, double population, int area) {
        this.name = name;
        this.language = language;
        this.population = population;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double getPeople() {
        return population;
    }

    public void setPeople(int population) {
        this.population = population;
    }

    public int getArea() {
        return area;
    }

    public void setAre(int ara) {
        this.area = area;
    }

    public static void getMorePopulation(Country[] countries) {
        Country max = countries[0];
        for (Country country : countries)
            if (country.population > max.population) {
                max = country;
            }
        System.out.println("------------------------------------------------------------" +
                "\nThe more population are " + max.population+" ("+max.name+")");
    }

    public static void getMoreArea(Country[] countries) {
        Country max = countries[0];
        for (Country country : countries)
            if (country.area > max.area) {
                max = country;
            }
        System.out.println("------------------------------------------------------------" +
                "\nThe biggest area is " + max.area+" ("+max.name+")");
    }
    public static void getSmallCountry(Country[]countries){
        Country min = countries[0];
        for (Country country : countries){
            if (min.area > country.area){
                min = country;

            }
        }
        System.out.println("------------------------------------------------------------" +
                "\n The small area "+min.area+"  and smaller population  "+min.population+" ("+min.name+"❤️🇰)");
    }

    @Override
    public String toString() {
        return "\nCountry : " +
                " name = " + name +
                ",  language = " + language +
                ",  people = " + population +
                ", area = " + area + " !";
    }
}


