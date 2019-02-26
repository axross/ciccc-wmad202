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
    }
}