package fit5042.tutex;

import fit5042.tutex.repository.PropertyRepository;
import fit5042.tutex.repository.PropertyRepositoryFactory;
import fit5042.tutex.repository.SimplePropertyRepositoryImpl;
import fit5042.tutex.repository.entities.Property;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * TODO Exercise 1.3 Step 3 Complete this class. Please refer to tutorial instructions.
 * This is the main driver class. This class contains the main method for Exercise 1A
 * 
 * This program can run without the completion of Exercise 1B.
 * 
 * @author Jian
 */
public class RealEstateAgency {

    private String name;
    private final PropertyRepository propertyRepository;

    public RealEstateAgency(String name) throws Exception {
        this.name = name;
        this.propertyRepository = PropertyRepositoryFactory.getInstance();
    }
    
    public static void main(String[] args) {
        SimplePropertyRepositoryImpl impl = new SimplePropertyRepositoryImpl();
        Scanner sc = new Scanner(System.in);

        try {
            impl.addProperty(new Property(12, "Clayton", 24, 2.0));
            impl.addProperty(new Property(95, "Caufield", 155, 5.5));
            impl.addProperty(new Property(66, "SouthYarra", 78, 6.1));
            impl.addProperty(new Property(57, "Huntingdale", 99, 3.7));
            impl.addProperty(new Property(42, "Oakleigh", 32, 1.6));
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Added failed");
        }
        System.out.println("5 propertities added successful");
        System.out.println("*****************************************************************");
        try {
            for (int i = 0; i < impl.getAllProperties().size(); i++) {
                String str = impl.getAllProperties().get(i).toString();
                int num = i + 1;
                System.out.println(num + "  " + str);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("*****************************************************************");
        System.out.println("Enter the ID of property you want to search");
        try {
            int i = sc.nextInt();
            System.out.println(impl.searchPropertyById(i-1).toString());

        } catch (Exception e) {
            System.err.print("You must enter the right number");
                    
        }

        
    }

}
