package interview.oops;
import java.util.*;  
abstract class Generics_Shape{  
abstract void draw();  
}  
class Rectangle extends Generics_Shape{  
void draw(){System.out.println("drawing rectangle");}  
}  
class Circle extends Generics_Shape{  
void draw(){System.out.println("drawing circle");}  
}  
  
  
class GenericTest{  
//creating a method that accepts only child class of Shape  
public static void drawShapes(List<? extends Generics_Shape> lists){  
for(Generics_Shape s:lists){  
s.draw();//calling method of Shape class by child class instance  
}  
}  
public static void main(String args[]){  
List<Rectangle> list1=new ArrayList<Rectangle>();  
list1.add(new Rectangle());  
  
List<Circle> list2=new ArrayList<Circle>();  
list2.add(new Circle());  
list2.add(new Circle());  
  
drawShapes(list1);  
drawShapes(list2);  
}}  