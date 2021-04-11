/* Nam Phu Nguyen (Logan)
   CS141 
   Programing Assignment#1, 9/30/2018
   This program helps find out and then print out two roots of a Quadratic with given coefficients a, b, and c as parameters
   For this assignment we may assume that the equation has two real roots, though mathematically this is not always the case.   */


class Assignment6{

    public static void printQuadratic (int a, int b, int c){ // a, b, and c are parameters
    
      System.out.println("The quadratic is: " +a+ "x^2 + " +b+ "x + " +c+ "=0"); // prints out the Quadratic equation
    
      double x1= (-(b) + Math.sqrt(b*b-4*a*c)) / (2*a); //calculates the first root--x1
      double x2= (-(b) - Math.sqrt(b*b-4*a*c)) / (2*a); //calculates the sencond root--x2
      
      System.out.println("This Quadratic has two roots: x1= " +x1+ ", x2= " +x2); //prints out the two roots of the Quadratic equation with the coeeficients a, b, c
    
    }
    
    public static void main(String[] args){ // open main program. In this main, we call out the printQuadratic and give it parameters
      
      printQuadratic(1,-7,12); 
      printQuadratic(2,6,4);
    
    
    }
}
    /* '''OUTPUT
    The quadratic is: 1x^2 + -7x + 12=0
 This Quadratic has two roots: x1= 4.0, x2= 3.0
 The quadratic is: 2x^2 + 6x + 4=0
 This Quadratic has two roots: x1= -1.0, x2= -2.0
 */

