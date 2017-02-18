package pratise.test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableMain {
    
    public static void main(String[] args) {
        ComparableCountry indiaCountry=new ComparableCountry(1, "India");
        ComparableCountry usaCountry=new ComparableCountry(4, "USA");
        ComparableCountry russiaCountry=new ComparableCountry(3, "Russia");
        ComparableCountry japanCountry=new ComparableCountry(2, "Japan");
        
        List<ComparableCountry> listOfCountries = new ArrayList<ComparableCountry>();
        listOfCountries.add(indiaCountry);
        listOfCountries.add(usaCountry);
        listOfCountries.add(russiaCountry);
        listOfCountries.add(japanCountry);
        
        System.out.println("Before Sort  : ");
        for (int i = 0; i < listOfCountries.size(); i++) {
            ComparableCountry country=(ComparableCountry) listOfCountries.get(i);
            System.out.println("Country Id: "+country.getCountryId()+"||"+"Country name:"+country.getCountryName());
        }
        Collections.sort(listOfCountries);
        
        System.out.println("After Sort  : ");
        for (int i = 0; i < listOfCountries.size(); i++) {
            ComparableCountry country=(ComparableCountry) listOfCountries.get(i);
            System.out.println("Country Id: "+country.getCountryId()+"|| "+"Country name: "+country.getCountryName());
        }
    }
    
}