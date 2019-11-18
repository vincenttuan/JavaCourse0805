package exam.lambda_stream2;

/*
Given the code fragment:
Path path1 = Paths.get("/software/././sys/readme.txt");
Path path2 = path1.normalize();
Path path3 = path2.relativize(path1);
System.out.print(path1.getNameCount());
System.out.print(" : " + path2.getNameCount());
System.out.print(" : " + path3.getNameCount());

What is the result?
A. 5 : 3 : 6
B. 4 : 4 : 4
C. 3 : 3 : 4
D. 6 : 5 : 6

Ans: A
*/

