package exam.lambda_stream2;

/*
Given the code fragment:
5. IntConsumer consumer = e -> System.out.println(e);
6. Integer value = 90;
7. // insert code frahment here
8. consumer.accept(result);

Which code fragment, when inserted at line 7, enables printing 100 ?

A:
ToIntFunction funRef = e -> e + 10; // 改成 e -> 10;
int result = funRef.apply(value);   // 改成 funRef.applyAsInt(value);

B:
Function<Integer> funRef = e -> e + 10; // 改成 Function<Integer, Integer> funRef = e -> e + 10; 
Integer result = funRef.apply(value);

C:
ToIntFunction<Integer> funRef = e -> e + 10;
int result = funRef.applyAsInt(value);

D:
IntFunction funRef = e -> e + 10;          // IntFunction<Integer> funRef = e -> e + 10;
Integer result = funRef.applyAsInt(value); // Integer result = funRef.apply(value);

Ans: C

解題：
A:
ToIntFunction funRef = e -> e + 10;
int result = funRef.apply(value);
應改成
ToIntFunction<Integer> funRef = e -> e + 10;
int result = funRef.applyAsInt(value);

B:
Function<Integer> funRef = e -> e + 10; 
Integer result = funRef.apply(value);
應改成
Function<Integer, Integer> funRef = e -> e + 10; 
Integer result = funRef.apply(value);

C:
ToIntFunction<Integer> funRef = e -> e + 10;
int result = funRef.applyAsInt(value);

D:
IntFunction funRef = e -> e + 10;
Integer result = funRef.applyAsInt(value);
應改成
IntFunction<Integer> funRef = e -> e + 10;
Integer result = funRef.apply(value);

Ans: C
*/
