public class Lab1 {
    public static void main(String[]args){
        // initializing four variables
        int x = 5;
        int y = 3;
        double r = 2.5;
        double h = 9.4;

        // creating function f(x,y) and g(x)
        double f = (-2.0*Math.pow(x,2)+x*y-4.0)/(-x);
        double g = -(x*x)+5;

        // calculating the volume of cylinder
        double v = Math.PI*Math.pow(r,2)*h;


        // printing rhe result
        System.out.println("Here are the declared and initialized variables: x = "+x+" , y = "+y);
        System.out.println("Here are the output values of the functions: f(x, y) = "+f+", g(x) = "+g );
        System.out.println();
        System.out.println("If the radius is "+r+" and the height is "+h+" then\n" +
                "The volume of the cylinder is "+v);
    }
}
