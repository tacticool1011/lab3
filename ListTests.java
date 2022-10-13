import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ListTests {
	// @Test 
	// public void testFilter() {
    // List<String> list = new ArrayList<>();
    // list.add("hi");
    // list.add("eat");
    // list.add("eck");

    // List<String> ans = new ArrayList<>();
    // ans.add("eat");
    // ans.add("eck");
    // StringChecker str = new StringChecker() {

    //     @Override
    //     public boolean checkString(String s) {
    //         // TODO Auto-generated method stub
    //         return s.contains("e");
    //     }
        
    // };
    // assertEquals(ans, ListExamples.filter(list, str));
	// }

    @Test
    public void testMerge(){
        List<String> a = new ArrayList<>();
        a.add("hi");
        a.add("eat");
        a.add("eck");

        List<String> b = new ArrayList<>();
        b.add("bruh");
        b.add("eat");
        b.add("slime");
        Collections.sort(a);
        Collections.sort(b);
    
        List<String> ans = new ArrayList<>(Arrays.asList(
            new String[]{"bruh", "eat", "eat", "eck", "hi", "slime"}));

        assertEquals(ans, ListExamples.merge(a,b));
    }
}
