package lab2;

public class SomeAwesomeCountry {
    private String name;

    private CanadianProvince[] provinces;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CanadianProvince[] getProvinces() {
        return provinces;
    }

    public void setProvinces(CanadianProvince[] provinces) {
        this.provinces = provinces;
    }

    SomeAwesomeCountry() {
        this.name = "Canada";
        this.provinces = new CanadianProvince[]{
            new CanadianProvince("Ontario", "Toronto", 13),
            new CanadianProvince("Quebec", "Quebec City", 8),
            new CanadianProvince("Nova Scotia", "Halifax", 1),
            new CanadianProvince("New Brunswick", "Fredericton", 1),
            new CanadianProvince("Manitoba", "Winnipeg", 1),
            new CanadianProvince("British Columbia", "Victoria", 5),
            new CanadianProvince("Prince Edward Island", "Charlottetown", 0),
            new CanadianProvince("Saskatchewan", "Regina", 1),
            new CanadianProvince("Alberta", "Edmonton", 4),
            new CanadianProvince("Newfoundland and Labrador", "St. John's", 0),
        };
    }
}
