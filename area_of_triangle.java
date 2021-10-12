public class Main {

    public static void main(String[] args) {
	// write your code here
        long x1=10,x2=10,x3=80,y1=20,y2=60,y3=20;
                long area;
                area = (x1*(y2-y1)+x2*(y3-y1)+x3*(y1-y2))/2;
        System.out.println("area of triangle = ");
        System.out.println( area);
    }
}