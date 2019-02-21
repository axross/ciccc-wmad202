public class Model {
    /**
     * Create a person.
     */
    Model() {
    }

    /**
     * Create a student.
     * 
     * @param firstName Model's first name. Allows {@code null}.
     * @param lastName  Model's last name. Allows {@code null}.
     * @param height    Model's height in inches. Must be 24 to 80. Allows
     *                  {@code null}.
     * @param weight    Model's weight in pounds. Must be 80 to 280. Allows
     *                  {@code null}.
     * @param canTravel Whether the student can travel or not. Allows {@code null}.
     */
    Model(String firstName, String lastName, int height, double weight, boolean canTravel) {
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(height);
        setWeight(weight);
        setCanTravel(canTravel);
    }

    /**
     * Create a student. This constructor sets {@code canTravel} to be {@code true}
     * and {@code smokes} to be {@code false}.
     * 
     * @param firstName Model's first name. Allows {@code null}.
     * @param lastName  Model's last name. Allows {@code null}.
     * @param height    Model's height in inches. Must be 24 to 80. Allows
     *                  {@code null}.
     * @param weight    Model's weight in pounds. Must be 80 to 280. Allows
     *                  {@code null}.
     */
    Model(String firstName, String lastName, int height, double weight) {
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(height);
        setWeight(weight);
        setCanTravel(true);
        setSmokes(false);
    }

    private String firstName;

    private String lastName;

    private int height;

    private double weight;

    private boolean canTravel;

    /**
     * Whether the model smokes or not.
     */
    private boolean smokes;

    /**
     * @return Model's first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param Model's first name.
     */
    public void setFirstName(String firstName) {
        if (firstName != null) {
            assert firstName.length() >= 3
                    && firstName.length() <= 20 : "firstName is null or String that 3 to 20 charactors long";

            this.firstName = firstName;
        } else {
            this.firstName = null;
        }
    }

    /**
     * @return Model's last name.
     */
    public final String getLastName() {
        return lastName;
    }

    /**
     * @param Model's last name.
     */
    public final void setLastName(String lastName) {
        if (lastName != null) {
            assert lastName.length() >= 3
                    && lastName.length() <= 20 : "lastName is null or String that 3 to 20 charactors long";

            this.lastName = lastName;
        } else {
            this.lastName = null;
        }
    }

    /**
     * @return Model's height in inches.
     */
    public int getHeightInInches() {
        return height;
    }

    /**
     * @return A formatted string experssing model's height in feet and inches.
     */
    public String getHeightStringInFeetAndInches() {
        int feet = height / INCHES_PER_FOOT;
        int inches = height - feet * INCHES_PER_FOOT;
        String footUnitWord = feet <= 1 ? "foot" : "feet";
        String inchUnitWord = inches <= 1 ? "inch" : "inches";

        return String.format("%d %s %d %s", feet, footUnitWord, inches, inchUnitWord);
    }

    /**
     * @return A string to display model's height in centimeters.
     */
    public double getHeightInCentimeters() {
        return (double) height / CENTIMETERS_PER_INCHES;
    }

    /**
     * @return A string to display model's height in centimeters.
     */
    public String getHeightStringInCentimeters() {
        return String.format("%d cm", Math.round(getHeightInCentimeters()));
    }

    /**
     * @param Model's height in inches.
     */
    public final void setHeight(int inches) {
        assert inches >= 24 && inches <= 84 : "inches is null or int between 24 and 84";

        this.height = inches;
    }

    /**
     * @param feet   Model's height in feets.
     * @param inches Model's height in feets.
     */
    public final void setHeight(int feet, int inches) {
        setHeight(feet * INCHES_PER_FOOT + inches);
    }

    /**
     * @return Model's weight in pounds.
     */
    public double getWeightInPounds() {
        return weight;
    }

    /**
     * @return Model's weight in kilograms.
     */
    public double getWeightInKilograms() {
        return Math.round(weight / POUNDS_PER_KILOGRAMS);
    }

    /**
     * @return A string to display model's weight in pounds.
     */
    public String getWeightStringInPounds() {
        double weightInInches = getWeightInPounds();

        if (weightInInches == 1.0 || weightInInches == 0.0) {
            return String.format("%d pound", Math.round(weightInInches));
        }

        return String.format("%d pounds", Math.round(weightInInches));
    }

    /**
     * @return A string to display model's weight in kilograms.
     */
    public String getWeightStringInKilograms() {
        double weightInKilograms = getWeightInKilograms();

        return String.format("%d kg", Math.round(weightInKilograms));
    }

    /**
     * @param pounds Model's weight in pounds.
     */
    public final void setWeight(double pounds) {
        assert pounds >= 80 && pounds <= 280 : "pounds is null or int between 80 and 280";

        this.weight = pounds;
    }

    /**
     * @param kilograms Model's weight in kilograms.
     */
    public final void setWeight(long kilograms) {
        setWeight((double) kilograms * POUNDS_PER_KILOGRAMS);
    }

    /**
     * @return Whether the model can travel or not.
     */
    public boolean getCanTravel() {
        return canTravel;
    }

    /**
     * @return A string to display whether the model can travel or not.
     */
    private String getStringCanTravel() {
        return getCanTravel() == true ? "Does travel" : "Does not travel";
    }

    /**
     * @param canTravel whether the model can travel or not.
     */
    public final void setCanTravel(boolean canTravel) {
        this.canTravel = canTravel;
    }

    /**
     * @return Whether the model smokes or not.
     */
    public boolean getSmokes() {
        return smokes;
    }

    /**
     * @return A string to display whether the model can travel or not.
     */
    private String getStringSmokes() {
        return getSmokes() == true ? "Does smoke" : "Does not smoke";
    }

    /**
     * @param canTravel whether the model smokes or not.
     */
    public final void setSmokes(boolean smokes) {
        this.smokes = smokes;
    }

    /**
     * @return Hourly wages of the model in USD.
     */
    public int calculatePayDollarsPerHour() {
        int totalWagesinDollarsPerHour = 0;

        if (height >= TALL_INCHES && weight < THIN_POUNDS) {
            totalWagesinDollarsPerHour += TALL_THIN_BONUS_DOLLARS_PER_HOUR;
        }

        if (getCanTravel() == true) {
            totalWagesinDollarsPerHour += TRAVEL_BONUS_DOLLARS_PER_HOUR;
        }

        if (getSmokes() == true) {
            totalWagesinDollarsPerHour -= SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
        }

        return totalWagesinDollarsPerHour;
    }

    /**
     * Print a general details.
     */
    public void printDetails() {
        String details = String.format("Name: %s %s\n" + "Height: %d inches\n" + "Weight: %d pounds\n" + "%s\n" + "%s",
                getFirstName(), getLastName(), Math.round(getHeightInInches()), Math.round(getWeightInPounds()),
                getStringCanTravel(), getStringSmokes());

        System.out.println(details);
    }

    /**
     * Print a details as model.
     */
    public void displayModelDetails() {
        displayModelDetails(false);
    }

    /**
     * Print a details as model.
     * 
     * @param useMetricUnits Whether using metric units or not.
     */
    public void displayModelDetails(boolean useMetricUnits) {
        String heightString = useMetricUnits == true ? getHeightStringInCentimeters()
                : getHeightStringInFeetAndInches();
        String weightString = useMetricUnits == true ? getWeightStringInKilograms() : getWeightStringInPounds();
        String travelString = getCanTravel() == true ? "yep" : "nope";
        String smokeString = getSmokes() == true ? "yep" : "nope";

        String message = String.format("Name: %s %s\nHeight: %s\nWeight: %s\nTravels: %s\nSmokes: %s\nHourly rate: $%d",
                firstName, lastName, heightString, weightString, travelString, smokeString,
                calculatePayDollarsPerHour());

        System.out.println(message);
    }

    private static String occupation;

    /**
     * @return Model's occupation. Every model has the same one.
     */
    public static String getOccupation() {
        return occupation;
    }

    public static final int INCHES_PER_FOOT = 12;

    public static final double CENTIMETERS_PER_INCHES = 0.393700787;

    public static final double POUNDS_PER_KILOGRAMS = 2.20462442;

    public static final int BASE_RATE_DOLLARS_PER_HOUR = 60;

    public static final int TALL_INCHES = 67;

    public static final double THIN_POUNDS = 140.0;

    public static final int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;

    public static final int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;

    public static final int SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;
}