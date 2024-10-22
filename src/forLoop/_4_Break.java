package src.forLoop;

import java.util.Scanner;

public class _4_Break {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);

            if (i==7){
                break;
            }
        }

        Scanner scanner = new Scanner(System.in);
        for (;;){//sonsuz dongu
            System.out.print("Enter a word: ");

            String word=scanner.nextLine();

            System.out.println(word);

            if(word.contains("a")){
                break;
            }
        }
    }
}
