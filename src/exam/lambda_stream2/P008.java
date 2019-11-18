package exam.lambda_stream2;

/*
Given the code fragment:
// line n1
Double d = str.average().getAsDouble();
System.out.println("Average = " + d);

Which should be inserted into line n1 to print Average = 2.5?
A: DoubleStream str = Stream.of(1.0, 2.0, 3.0, 4.0); // DoubleStream str = Stream.of(1.0, 2.0, 3.0, 4.0).mapToDouble(e->e);
B: IntStream str = IntStream.of(1, 2, 3, 4);
C: IntStream str = Stream.of(1, 2, 3, 4);
D: Stream str = Stream.of(1, 2, 3, 4);

Ans: B

解題：
A:
DoubleStream str = Stream.of(1.0, 2.0, 3.0, 4.0);
應改成
DoubleStream str = DoubleStream.of(1.0, 2.0, 3.0, 4.0);

B:
IntStream str = IntStream.of(1, 2, 3, 4);

C:
IntStream str = Stream.of(1, 2, 3, 4);
應改成
IntStream str = IntStream.of(1, 2, 3, 4);

D:
Stream str = Stream.of(1, 2, 3, 4);
由於 Stream 沒有提供 average() 方法所以應改成
IntStream str = IntStream.of(1, 2, 3, 4);
或
Stream str = Stream.of(1, 2, 3, 4);
Double d = str.mapToInt(e -> Integer.parseInt(e.toString())).average().getAsDouble();

Ans: B
*/
