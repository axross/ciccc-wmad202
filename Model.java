public class Model {
    /**
     * Create a person.
     */
    Model() {
    }

    /**
     * Create a student.
     * 
     * @param firstName      Model's first name. Allows {@code null}.
     * @param lastName       Model's last name. Allows {@code null}.
     * @param heightInInches Model's height in inches. Must be 24 to 80. Allows
     *                       {@code null}.
     * @param weightInPounds Model's weight in pounds. Must be 80 to 280. Allows
     *                       {@code null}.
     * @param canTravel      Whether the student can travel or not. Allows
     *                       {@code null}.
     */
    Model(String firstName, String lastName, int heightInInches, double weightInPounds, boolean canTravel) {
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(heightInInches);
        setWeight(weightInPounds);
        setCanTravel(canTravel);
    }

    /**
     * Create a student. This constructor sets {@code canTravel} to be {@code true}
     * and {@code smokes} to be {@code false}.
     * 
     * @param firstName      Model's first name. Allows {@code null}.
     * @param lastName       Model's last name. Allows {@code null}.
     * @param heightInInches Model's height in inches. Must be 24 to 80. Allows
     *                       {@code null}.
     * @param weightInPounds Model's weight in pounds. Must be 80 to 280. Allows
     *                       {@code null}.
     */
    Model(String firstName, String lastName, int heightInInches, double weightInPounds) {
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(heightInInches);
        setWeight(weightInPounds);
        setCanTravel(true);
        setSmokes(false);
    }

    private String firstName;

    private String lastName;

    private int heightInInches;

    private double weightInPounds;

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
        return heightInInches;
    }

    public String getHeightInFeetAndInches() {
        int feet = heightInInches / 12;
        int inches = heightInInches - feet * 12;
        String footUnitWord = feet <= 1 ? "foot" : "feet";
        String inchUnitWord = inches <= 1 ? "foot" : "feet";

        return String.format("%d %s %d %s", feet, footUnitWord, inches, inchUnitWord);
    }

    /**
     * @param Model's height in inches.
     */
    public final void setHeight(int inches) {
        assert inches >= 24 && inches <= 84 : "inches is null or int between 24 and 84";

        this.heightInInches = inches;
    }

    /**
     * @param feet   Model's height in feets.
     * @param inches Model's height in feets.
     */
    public final void setHeight(int feet, int inches) {
        setHeight(feet * 12 + inches);
    }

    /**
     * @return Model's weight in pounds.
     */
    public double getWeightInPounds() {
        return weightInPounds;
    }

    public long getWeightInKilograms() {
        return Math.round(weightInPounds * 0.453592);
    }

    /**
     * @param pounds Model's weight in pounds.
     */
    public final void setWeight(double pounds) {
        assert pounds >= 80 && pounds <= 280 : "pounds is null or int between 80 and 280";

        this.weightInPounds = pounds;
    }

    /**
     * @param kilograms Model's weight in kilograms.
     */
    public final void setWeight(long kilograms) {
        setWeight((double) kilograms / 0.453592);
    }

    /**
     * @return Whether the model can travel or not.
     */
    public boolean getCanTravel() {
        return canTravel;
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
     * @param canTravel whether the model smokes or not.
     */
    public final void setSmokes(boolean smokes) {
        this.smokes = smokes;
    }

    /**
     * Print the details.
     */
    public void printDetails() {
        String travel = getCanTravel() == true ? "Does travel" : "Does not travel";
        String smokes = getSmokes() == true ? "Does smoke" : "Does not smoke";
        String details = String.format("Name: %s %s\n" + "Height: %d inches\n" + "Weight: %d pounds\n" + "%s\n" + "%s",
                getFirstName(), getLastName(), Math.round(getHeightInInches()), Math.round(getWeightInPounds()), travel,
                smokes);

        System.out.println(details);
    }

    private static String occupation;

    /**
     * @return Model's occupation. Every model has the same one.
     */
    public static String getOccupation() {
        return occupation;
    }
}