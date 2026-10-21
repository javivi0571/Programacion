import java.util.Scanner;

public class num_romanos {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nd = 0;

        System.out.println("Introduce un número romano");

        StringBuilder nr = new StringBuilder(sc.nextLine());
        for (int i = 0; i < nr.length(); i++) {
            switch (nr.charAt(i)){
                case 'M':
                    nd += (1000);
                    break;

                case 'D':
                    if(i + 1 < nr.length() && nr.charAt(i + 1) == 'M'){
                        nd -= 500;
                    }
                    else{
                        nd += 500;
                    }
                    break;

                case 'C':
                    if(i + 1 < nr.length() && (nr.charAt(i + 1) == 'M' || nr.charAt(i + 1) == 'D')){
                        nd -= 100;
                    }
                    else{
                        nd += 100;
                    }
                    break;

                case 'L':
                    if(i + 1 < nr.length() && (nr.charAt(i + 1) == 'M' || nr.charAt(i + 1) == 'D' || nr.charAt(i + 1) == 'C')){
                        nd -= 50;
                    }
                    else{
                        nd += 50;
                    }
                    break;

                case 'X':
                    if(i + 1 < nr.length() && (nr.charAt(i + 1) == 'M' || nr.charAt(i + 1) == 'D' || nr.charAt(i + 1) == 'C' || nr.charAt(i + 1) == 'L')){
                        nd -= 10;
                    }
                    else{
                        nd += 10;
                    }
                    break;

                case 'V':
                    if(i + 1 < nr.length() && (nr.charAt(i + 1) == 'M' || nr.charAt(i + 1) == 'D' || nr.charAt(i + 1) == 'C' || nr.charAt(i + 1) == 'L' || nr.charAt(i + 1) == 'X')){
                        nd -= 5;
                    }
                    else{
                        nd += 5;
                    }
                    break;

                case 'I':
                    if(i + 1 < nr.length() && (nr.charAt(i + 1) == 'M' || nr.charAt(i + 1) == 'D' || nr.charAt(i + 1) == 'C' || nr.charAt(i + 1) == 'L' || nr.charAt(i + 1) == 'X' || nr.charAt(i + 1) == 'V')){
                        nd -= 1;
                    }
                    else{
                        nd += 1;
                    }
                    break;
            }
        }
        System.out.println(nd);
    }
}

