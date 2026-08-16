package um;

import java.util.Scanner;

public class um {
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um n: ");
        int n = sc.nextInt();
        int fat = 1;
        while(n>0){
            fat *= n;
            n-=1;
        }
        System.out.println(fat);
    }
}
