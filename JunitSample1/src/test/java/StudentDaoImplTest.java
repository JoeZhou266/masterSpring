import org.junit.Test;

import static org.junit.Assert.*;

import com.zjg.junitSample.StudentDaoImpl;
import com.zjg.junitSample.Student;



public class StudentDaoImplTest {

    @Test
    public void studentDaoImpl() {
        System.out.println("Test Start 1:");
        StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
        System.out.println("Test 1 end:");
    }

    @Test
    public void update() {
        System.out.println("Test Start 2:");
        StudentDaoImpl studentDaoImpl2 = new StudentDaoImpl();
        studentDaoImpl2.update("Frank");
        System.out.println("Test 2 end:");
    }
}