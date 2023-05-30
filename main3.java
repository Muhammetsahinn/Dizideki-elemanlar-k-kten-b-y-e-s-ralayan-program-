import java.util.Scanner;
import java.util.Arrays;

public class main3 {
    public static void main(String[] args) {
        int a;
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz : ");
        a = inp.nextInt();
        int[] list = new int[a];
        int[] top = new int[list.length];
        int sum = 0;
        for(int i = 0; i<a; i++){
            System.out.print("Dizinin 1. elemani : ");
            int n = inp.nextInt();
            list[sum++]=n;
        }
        Arrays.sort(list);
        System.out.println("Dizinin kucukten buyuge sirali hali : " + Arrays.toString(list));
    }
}


