import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

class Tester implements StringChecker{
    @Override
    public boolean checkString(String s){
        if(s.length() == 6){
            return true;
        }else{
            return false; 
        }
    }
}
public class ListTest {
    @Test 
	public void testFilter() {
    Tester sc = new Tester(); 
    List<String> input = new ArrayList<>();
    input.add("lab");
    input.add("report");
    input.add("is");
    input.add("hard");
    input.add("to");
    input.add("do");
    List<String> get = ListExamples.filter(input, sc);
    List<String> expected = new ArrayList<>();
    expected.add("report");
    assertTrue(expected.equals(get));
	}

    @Test 
	public void testFilterNothing() {
    Tester sc = new Tester(); 
    List<String> input = new ArrayList<>();
    input.add("lab");
    input.add("work");
    input.add("is");
    input.add("hard");
    input.add("to");
    input.add("do");
    List<String> get = ListExamples.filter(input, sc);
    List<String> expected = new ArrayList<>();
    assertTrue(expected.equals(get));
	}

    @Test 
	public void testFilterMultiple() {
    Tester sc = new Tester(); 
    List<String> input = new ArrayList<>();
    input.add("lab");
    input.add("report");
    input.add("is");
    input.add("hard");
    input.add("to");
    input.add("do");
    input.add("testis");
    input.add("useful");
    List<String> get = ListExamples.filter(input, sc);
    List<String> expected = new ArrayList<>();
    expected.add("report");
    expected.add("testis");
    expected.add("useful");
    assertTrue(expected.equals(get));
	}

    @Test 
	public void testMerge() { 
    List<String> input1 = new ArrayList<>();
    List<String> input2 = new ArrayList<>();
    input1.add("lab");
    input1.add("report");
    input1.add("is");
    input1.add("hard");
    input2.add("to");
    input2.add("do");
    input2.add("testis");
    input2.add("useful");
    List<String> get = ListExamples.merge(input1, input2);
    List<String> expected = new ArrayList<>();
    expected.add("lab");
    expected.add("report");
    expected.add("is");
    expected.add("hard");
    expected.add("to");
    expected.add("do");
    expected.add("testis");
    expected.add("useful");
    assertTrue(expected.equals(get));
	}


}
