import java.util.*;
public class Sum {
     static int sum(int a,int b){
          int answer = a+b;
          return answer;
     }
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
          int finalAnswer = sum(a,b);
          System.out.println("Sum of two number: "+ finalAnswer);
    }
}
