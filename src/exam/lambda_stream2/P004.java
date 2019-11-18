package exam.lambda_stream2;

/*
Given:
class Foo<K, V> {
    private K key;
    private V value;
    public Foo(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public static <T> Foo<T, T> twice(T value) {
        return new Foo<T, T>(value, value);
    }
    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
    
}

Which option fails?
A. Foo<String, Integer> mark = new Foo<String, Integer>("Steve", 100);
B. Foo<String, String> pair = Foo.<String>twice("Hello World!");
C. Foo<Object, Object> percentage = new Foo<String, Integer>("Steve", 100);
D. Foo<String, String> grade = new Foo<>("John", "A");

Ans: C
*/


