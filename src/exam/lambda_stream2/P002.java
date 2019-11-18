package exam.lambda_stream2;
/*
Given the code fragment:

ProductCode<Number, Integer> c1 = new ProductCode<Number, Integer>();
ProductCode<Number, String> c2 = new ProductCode<Number, String>();

You have been asked to define the ProductCode class. The definition of the ProductCode class must
allow c1 instantiation to succeed and cause a compilation error on c2 instantiation.

Which definition of ProductCode meets the requirement?

A:
class ProductCode<T, S<Integer>> {
    T c1;
    S c2;
}

B:
class ProductCode<T, S extends T> {
    T c1;
    S c2;
}

C:
class ProductCode<T, S> {
    T c1;
    S c2;
}

D:
class ProductCode<T, S super T> {
    T c1;
    S c2;
}

Ans: B
*/