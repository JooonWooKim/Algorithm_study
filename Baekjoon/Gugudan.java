//백준 2739번

import java.util.*;

public class Gugudan{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int i = sc.nextInt();
        //2를 입력
        for(int j=1; j<=9; j++){
            System.out.println(i+" * "+j+" = "+i*j);
        }
    }
}
