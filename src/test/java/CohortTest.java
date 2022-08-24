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
    Student Steve = new Student(2, "Steve");
    Venus.addStudent(Steve);
    Student S = Steve;
    assertSame(S.getName(), Venus.getStudents().get(0).getName());
//    System.out.print(Venus.getStudents());

    Student Mary = new Student(1, "Mary");
    Venus.addStudent(Mary);
    assertEquals("Mary", Venus.getStudents().get(1).getName());
    assertEquals(1, Venus.getStudents().get(1).getId());
//    System.out.println(Venus.getStudents());
}

@Test
    public void test
}
