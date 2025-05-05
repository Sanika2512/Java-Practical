import java.util.*;
class CalculateArea  {
 private float l;
 private float b;
 private float area;
public void setDim(){

 Scanner sc=new Scanner(System.in);
 System.out.println("Enter Length");
 l=sc.nextFloat();
System.out.println("Enter Breadth");
b=sc.nextFloat();

sc.close();
}


public void getArea(){
	
	System.out.println("Area Of Rectangle : "+(l*b));
		
}

}


class GetRectangleArea {

public static void main(String[] args){

CalculateArea c1=new CalculateArea();
c1.setDim();
c1.getArea();



}


}