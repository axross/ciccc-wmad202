package lab2;

public class Driver {
    public static void main(String[] args) {
        SomeAwesomeCountry someAwesomeCountry = new SomeAwesomeCountry();

        System.out.print(
            String.format(
                "Some awesome country %s has %d provinces: ",
                someAwesomeCountry.getName(),
                someAwesomeCountry.getProvinces().length
            )
        );

        CanadianProvince[] provinces = someAwesomeCountry.getProvinces();

        for (int i = 0; i < provinces.length; ++i) {
            System.out.print(provinces[i].getName());

            if (i == provinces.length - 1) {
                System.out.print("\n");
            } else if (i == provinces.length - 2) {
                System.out.print(" and ");
            } else {
                System.out.print(", ");
            }
        }

        System.out.println("");
        System.out.println(
            String.format(
                "Anyway, here is the detail of %d provinces:",
                someAwesomeCountry.getProvinces().length
            )
        );

        someAwesomeCountry.displayAllProvinces();

        System.out.println("");
        System.out.println(
            String.format(
                "So, %s has %d provinces that population is greater than 2 million and less than 10 million.",
                someAwesomeCountry.getName(),
                someAwesomeCountry.howManyHaveThisPopulation(2, 10)
            )
        );
    }
}