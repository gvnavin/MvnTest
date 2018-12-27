import org.junit.jupiter.api.Test;

public class SampleTest {

  @Test
  public void test() {
    final Sample sample = new Sample();
    sample.setTest("test");
    final String test = sample.getTest();
    System.out.println("test = " + test);
  }

}
