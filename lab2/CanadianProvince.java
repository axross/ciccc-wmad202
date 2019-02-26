package lab2;

public class CanadianProvince {
    private String name;

    private String capital;

    private int populationInMillion;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulationInMillion() {
        return populationInMillion;
    }

    public void setPopulationInMillion(int populationInMillion) {
        this.populationInMillion = populationInMillion;
    }

    public String getDetails() {
        return String.format("The capital of %s (pop. %d million) is %s.", name, populationInMillion, capital);
    }

    CanadianProvince(String name, String capital, int populationInMillion) {
        this.name = isValidProvince(name) ? name : DEFAULT_PROVINCE;
        this.capital = isValidCapital(capital) ? capital: DEFAULT_CAPITAL;
        this.populationInMillion = isValidPopulationInMillion(populationInMillion) ? populationInMillion: DEFAULT_POPUPLATION_IN_MILLION;
    }

    private boolean isValidProvince(String province) {
        int i = 0;
        
        while (i < AVAILABLE_PROVINCES.length) {
            if (AVAILABLE_PROVINCES[i].equals(province)) {
                return true;
            }

            ++i;
        }

        return false;
    }

    private boolean isValidCapital(String capital) {
        for (int i = 0; i < AVAILABLE_CAPITALS.length; ++i) {
            if (AVAILABLE_CAPITALS[i].equals(capital)) {
                return true;
            }
        }

        return false;
    }

    private boolean isValidPopulationInMillion(int populationInMillion) {
        return populationInMillion >= 0 && populationInMillion <= 38;
    }

    private static final String[] AVAILABLE_PROVINCES = {
        "Ontario", "Quebec", "Nova Scotia", "New Brunswick", "Manitoba",
        "British Columbia", "Prince Edward Island", "Saskatchewan", "Alberta",
        "Newfoundland and Labrador"
    };

    private static final String DEFAULT_PROVINCE = AVAILABLE_PROVINCES[5];

    private static final String[] AVAILABLE_CAPITALS = {
        "Toronto", "Quebec City", "Halifax", "Fredericton", "Winnipeg",
        "Victoria", "Charlottetown", "Regina", "Edmonton", "St. John's"
    };

    private static final String DEFAULT_CAPITAL = AVAILABLE_PROVINCES[5];

    private static final int DEFAULT_POPUPLATION_IN_MILLION = 4;
}
