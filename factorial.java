public class Main {

    public static void main(String[] args) {
	// write your code here
        int i,fact=1;
        int num=5;
        for(i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("factorial of " +num+ "is" +fact);
    }
}