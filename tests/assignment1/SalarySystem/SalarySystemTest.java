package assignment1.SalarySystem;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Describe this class
 *
 * @author Luuk S. van Houdt <info@lsvh.org>
 * @version 0.1
 * @since 19-12-16 @ 23:38
 */

public class SalarySystemTest {
    private Employee e;
    private SalarySystem s;
    private ArrayList<Employee> a;

    @Before
    public void setUp() throws Exception {
        e = new Employee("Johan", 1, 500);
        s = new SalarySystem();
    }

    @Test
    public void addColleague() throws Exception {
        s.addColleague(e);
    }

    @Test
    public void search() throws Exception {
        addColleague();
        assertEquals(e, s.search(e.getName()));
    }

    @Test
    public void raiseSalary() throws Exception {
        double n = e.getPay() * 106 + 20000;
        s.raiseSalary(e);
        assertEquals(n/100, e.getPay(), Double.MIN_VALUE);
    }

    @Test
    public void printAll() throws Exception {

    }

    @Test
    public void main() throws Exception {

    }

}