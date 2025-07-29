package ValidWord;


import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        if(word.length()<3) System.out.println("NO");

        if(word.matches(".*\\d.*")) System.out.println("NO");

        if(!word.toLowerCase().matches(".*[aeiou].*")) System.out.println("NO");

        if(!word.toLowerCase().matches(".*[bcdfghjklmnpqrstvwxyz].*")) System.out.println("NO");

    }
}

// Feito em:
// 14/07/2025