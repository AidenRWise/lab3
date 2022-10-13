import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;

public class ListTests {

@Test
public void testFilter(){

ArrayList<String> input = new ArrayList<>();
input.add("app");input.add("apple2");input.add("apple3");
ArrayList<String> answer = new ArrayList<>();
answer.add("apple2");answer.add("apple3");

StringChecker sc = new greaterThan3();

assertEquals(answer,ListExamples.filter(input,sc));

}

@Test
public void testMerge(){
ArrayList<String> input = new ArrayList<>();
input.add("apple");input.add("banana");input.add("flamingo");
ArrayList<String> input2 = new ArrayList<>();
input2.add("az");input2.add("coconut");input2.add("zebra");
ArrayList<String> answer = new ArrayList<>();
answer.add("apple");answer.add("az");answer.add("banana");answer.add("coconut");answer.add("flamingo");answer.add("zebra");

assertEquals(answer,ListExamples.merge(input,input2));


}




}