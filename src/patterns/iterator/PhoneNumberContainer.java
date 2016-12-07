package patterns.iterator;

import java.util.HashMap;

/**
 * Describe this class
 *
 * @author Luuk S. van Houdt <info@lsvh.org>
 * @version 0.1
 * @since 6-12-16 @ 23:09
 */

public class PhoneNumberContainer implements MyContainer {
    private HashMap phoneNumbers;

    public PhoneNumberContainer(HashMap phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void setPhoneNumbers(HashMap phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public HashMap getPhoneNumbers() {
        return phoneNumbers;
    }

    @Override
    public MyIterator getIterator() {
        return new PhoneNumberIterator();
    }

    private class PhoneNumberIterator implements MyIterator {
        private int iteration = 0;

        @Override
        public boolean hasNext() {
            return phoneNumbers.size() > iteration;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return "\t - Item " + (iteration+1) + ": " + phoneNumbers.get(iteration);
            }
            return null;
        }
    }
}