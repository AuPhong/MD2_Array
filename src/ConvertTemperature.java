import java.util.Scanner;

public class ConvertTemperature {
    public static double cTof(double c){
        double f;
        return f = (9.0 / 5) * c + 32;
    }

    public static double fToc(double f){
        double c;
        return c =  (5.0 / 9) * (f - 32);
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Select to convert:\n1.C to F\n2.F to C\n0.Exit");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter C: ");
                    double c = sc.nextDouble();
                    System.out.println("F value is "+ cTof(c));
                    break;
                case 2:
                    System.out.println("Enter F: ");
                    double f = sc.nextDouble();
                    System.out.println("C value is "+ fToc(f));
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice!=0);
    }
}


