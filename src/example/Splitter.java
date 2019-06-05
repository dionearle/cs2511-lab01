package example;

import java.util.Scanner;

public class Splitter {

    public static void main(String[] args){
        System.out.println("Enter a sentence specified by spaces only: ");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print(scanner.next());
        while (scanner.hasNext()) {
        	System.out.print('\n');
        	System.out.print(scanner.next());
        }
        
        scanner.close();
    }
}
