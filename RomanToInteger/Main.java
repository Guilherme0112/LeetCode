package RomanToInteger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Object[][] roman = {
                {"I", 1},
                {"V", 5},
                {"X", 10},
                {"L", 50},
                {"C", 100},
                {"D", 500},
                {"M", 1000},
        };

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int lastNumber = 0;
        int result = 0;

        for(int j = 0; j < input.length(); j++){
            String letraAtual = input.charAt(j)+"";
            for(int i = 0; i < roman.length; i++){
                if(!roman[i][0].equals(letraAtual)) continue;
                int numeroRomano = (int) roman[i][1];
                if (lastNumber < numeroRomano) {
                    int sub = numeroRomano - lastNumber;
                    result = (result - lastNumber) + sub;
                } else {
                    result += numeroRomano;
                }
                lastNumber = numeroRomano;
            }
        }

        System.out.println(result);

    }
}