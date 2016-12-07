package patterns.iterator;

/**
 * Describe this class
 *
 * @version 0.1
 * @author Luuk S. van Houdt <info@lsvh.org>
 * @since 30-11-16 @ 12:35
 */

public class Main {
    public static void main(String[] args) {
        /*
         * Wrong example: The grocery list.
         */

        String[] items = {"Beer", "Wine", "Meat", "E-numbers"};

        System.out.println("# Wrong example:");
        for (int i = 0; items.length > i; i++) {
            String x = items[i];
            System.out.println("\t - Item " + (i+1) + ": " + x);
        }


        /*
         * Correct example: The grocery list.
         */

        String[] groceries = {"Butter", "Eggs", "Cheese", "Air"};

        GroceryContainer groceryList = new GroceryContainer(groceries);

        System.out.println("# Correct example:");
        for (MyIterator grocery = groceryList.getIterator(); grocery.hasNext();) {
            String g = (String) grocery.next();
            System.out.println(g);
        }


        /*
         * The phone number list
         *

        HashMap phoneNumbers = new HashMap();
        phoneNumbers.put("John", "0612382939");
        phoneNumbers.put("Pete", "0612461223");
        phoneNumbers.put("Kate", "5030-1-2-3-06");
        phoneNumbers.put("Trump?", "0101001001");

        PhoneNumberContainer phoneNumberList = new PhoneNumberContainer(phoneNumbers);

        System.out.println("# Phone Numbers");
        for (MyIterator phoneNumber = phoneNumberList.getIterator(); phoneNumber.hasNext();) {
            String pn = (String) phoneNumber.next();
            System.out.println(pn);
        }
        **/
    }
}