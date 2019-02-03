# Lab Description

In this lab, you are asked to implement a class.

You can use `Math.Pow(a,b)` method to compute powers of a number. 

**Make Discount Method**

- Input: Price
- Output: Reduced Price

Example code 

```java
private static double[] makeDiscount(double[] inputPrices, double discountRate) {
	double[] newArray = new double[inputPrices.length];
	for (int i = 0; i < inputPrices.length; i++)
		newArray[i] = inputPrices[i] * (1-discountRate);
	return newArray;
}
```
