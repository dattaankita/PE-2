package com.stackroute.PE_2;

class Member_Variable{
	public Object [] getMemVar(String name, int age, double sal) {
		if(name == null || age == 0)
			return null;
		Member ob = new Member(name, age, sal);
		Object [] arr = {ob.getName(), ob.getAge(), ob.getSalary()};
		return arr;
	}
}

class Member{
	private String name;
	private String age;
	private String Salary;
	
	public Member(String name, int age, double Salary) {
		this.name = name;
		this.age = Integer.toString(age);
		this.Salary = Double.toString(Salary);
	}
	
	String getName() {
		return this.name;
	}
	
	int getAge() {
		return Integer.parseInt(this.age);
	}
	
	double getSalary() {
		return Double.parseDouble(this.Salary);
	}
}

class EvenNumTest{
	public boolean isEven(int number) {
		if(number%2 == 0)
			return true;
		else
			return false;
	}
}

public class App 
{
	boolean isPallindrome(String str) {
		StringBuilder s = new StringBuilder();
		s.append(str);
		if(str.equals(s.reverse().toString()))
			return true;
		return false;
	}

	boolean isPow4(int n) {
		if(n%4 == 0) {
			if(n/4 == 1)
	 			return true;
			return isPow4(n/4);
		}
		return false;
	}
	
	Member_Variable ob = new Member_Variable();
	
	EvenNumTest e= new EvenNumTest();

	public double [] stgrad(int n, int [] arr) {
	   int sum = 0;
	   for(int i=0;i<n;i++) {
		   sum = sum + arr[i];
	   }
	   double [] d = new double[3];
	   d[0] = (double)sum/n;
	   
	   int c= arr[0];
	   for(int i=0;i<n;i++) {
		   if(c>arr[i])
			   c=arr[i];
	   }
	   d[1] = c;
	   
       int b=arr[0];
	   for(int i=0;i<n;i++) {
		   if(b<arr[i]){
			   b=arr[i];
		   }
	   }
	   d[2]= b;
	   return d;
	}
	   
public long longFactorial(long n) {

	   if(n==1)
		   return n;
	   else
		   return (n * longFactorial(n-1));

}
}
