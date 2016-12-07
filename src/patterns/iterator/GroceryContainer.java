package patterns.iterator;

/**
 * Describe this class
 *
 * @author Luuk S. van Houdt <info@lsvh.org>
 * @version 0.1
 * @since 6-12-16 @ 23:09
 */

public class GroceryContainer implements MyContainer {
    private String[] groceries;

    public GroceryContainer(String[] groceries) {
        this.groceries = groceries;
    }

    public void setGroceries(String[] groceries) {
        this.groceries = groceries;
    }

    public String[] getGroceries() {
        return groceries;
    }

    @Override
    public MyIterator getIterator() {
        return new GroceryIterator();
    }

    private class GroceryIterator implements MyIterator {
        private int iteration = 0;

        @Override
        public boolean hasNext() {
            return groceries.length > iteration;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return "\t - Item " + (iteration+1) + ": " + groceries[iteration++];
            }
            return null;
        }
    }
}