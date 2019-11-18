package exam.lambda_stream2;

/*
Given the code fragment:
public class Test {
    List<String> list = null;
    public void printValues() {
        System.out.println(getList());
    }
    public List<String> getList() {
        return list;
    }
    public void setList(List<String> newList) {
        list = newList;
    }
}
and
List<String> li = Arrays.asList("Dog", "Cat", "Mouse");
Test t = new Test();
t.setList(li.stream().collect(Collectors.toList()));
t.getList().forEach(Test::printValues);

What is the result ?
A. A compilation error occurs.
B. [Dog, Cat, Mouse]
C. null
D. DogCatMouse

Ans: A
*/
