import java.util.*;
class Fact1{
public static long factorial(int n){
    if(n==0 || n==1){
	    return 1;
	
	}
	return n*factorial(n-1);

}
public static void main(String[] args)
{

  Scanner scanner=new Scanner(System.in);
  System.out.println("Enter any number : ");
  int n = scanner.nextInt();
  System.out.println("Factorial of "+n+" is : "+factorial(n));




}



}