package arrayTest;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayTest {

    public static void main(String[] args) {        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // array의 길이
        int k = in.nextInt(); // 변경횟수
        int a[] = new int[n];
        
        for(int a_i=0; a_i < n; a_i++){
            a[((n- (k%n))+a_i)%n] = in.nextInt();
        }
        for(int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
      
        System.out.println();
        
    }
}