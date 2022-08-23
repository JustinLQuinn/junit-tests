import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class CohortTest {

@Before
  public void setup(){
    Cohort Venus = new Cohort();
}

public void testIfConstructorCreatesCohort(){

    assertEquals("Venus",Cohort.class);
}


}
