import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.runners.model.MultipleFailureException.assertEmpty;

public class CohortTest {
private Cohort Venus;
@Before
  public void setup(){
     Venus = new Cohort();

}
@Test
public void testIfConstructorCreatesCohort(){

    assertEquals(0,Venus.getStudents().size());
}

@Test
    public void testIfAddStudentWorks(){
    Student Steve = new Student(2L, "Steve");
    Venus.addStudent(Steve);
    Student S = Steve;
    assertSame(7, Venus.getStudents().get(0));
//    assertEquals(2L, Steve.getId());
//
//    System.out.println(Venus.getStudents());
//
//    Student Mary = new Student(1L, "Mary");
//    Venus.addStudent(Mary);
//    assertEquals("Mary", Mary.getName());
//    assertEquals(1L, Mary.getId());
//
//    System.out.println(Venus.getStudents());
}

}
