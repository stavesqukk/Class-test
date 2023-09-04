import java.util.Random;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t\t\t\t\t\t\tWelcome to login page\t\t\t\t\t\t\t\t\t");
        System.out.println("Username:");
        String rr = sc.next();
        char k = ' ';
        if (rr.length() < 4 || rr.length() > 20) {
            k='f';
        }
        else if (rr.contains(" ")) {
            k='f';
        }
        if (k == 'f'){
            System.out.println("(Rewrite the username as the requirements of the username is not fulfilled)");
            System.out.println("Username:");
        }
        System.out.println("Password:");
        String ss = sc.next();

        System.out.println("Login Successful");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tSome of the programs are given below");
        System.out.println("\t\t\t\t\t\t\t\t\t1.Greatest Number between 3 number");
        System.out.println("\t\t\t\t\t\t\t\t\t2.Calculator");
        System.out.println("\t\t\t\t\t\t\t\t\t3.Result calculator with 3 grades");
        System.out.println("\t\t\t\t\t\t\t\t\t4.Guessing Game");
        System.out.println("Enter the corresponding number of program which you want:");
        int o = sc.nextInt();
        if (o==1){
            System.out.println("\t\t\t\t\t\t\t\t\t\t\tProgram For Greatest number\t\t\t\t\t\t");
            System.out.println("Enter 1st number:");
            int a = sc.nextInt();
            System.out.println("Enter 2nd number:");
            int b = sc.nextInt();
            System.out.println("Enter 3rd number:");
            int c = sc.nextInt();
            if (a>b && a>c){
                System.out.println(a+"is the greatest number");
            }
            else if (b>c && b>a){
                System.out.println(b+"is the greatest number");
            }
            else {
                System.out.println(c+"is the greatest number");
            }
        }
        else if (o==2){
            System.out.println("\t\t\t\t\t\t\t\tCalculator\t\t\t\t\t\t\t\t");
            System.out.println("Available Operators: '+' '-' '/' '*'" );
            System.out.print("Enter 1st number: ");
            float num1 = sc.nextFloat();
            System.out.print("Enter the operation: ");
            char operation = sc.next().charAt(0);
            System.out.print("Enter 2nd number: ");
            float num2 = sc.nextFloat();
            double result = 0.0;
            switch (operation){
                case '+':
                    result = num1 + num2;
                    System.out.println("The result is " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("The result is " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("The result is " + result);
                    break;
                case'/':
                    result = (int)num1/num2;
                    System.out.println("The result is"+result);
                default:
                    System.out.println("Invalid operation was entered"+"\nRerun the program");
            }

        }
        else if(o==3){
            System.out.println("\t\t\t\t\t\t\t\t\tResult\t\t\t\t\t\t\t\t\t\t");
            System.out.println("Enter your marks in Physics");
            int a = sc.nextInt();
            System.out.println("Enter your marks in Chemistry");
            int b = sc.nextInt();
            System.out.println("Enter your marks in Maths");
            int c = sc.nextInt();
            float pp;
            pp = (((float) a / 75) * 100);
            float pc;
            pc = (((float) b / 75) * 100);
            float pm;
            pm = (((float) c / 75) * 100);
            if(pp>=90 && pp<=100){
                System.out.println("You got A+ in Physics");
            } else if ((pp<90 && (pp >= 80))) {
                System.out.println("You got A in Physics");

            }
            else if ((pp<80 && (pp >= 70))) {
                System.out.println("You got B+ in Physics");

            }
            else if ((pp<70 && (pp >= 60))) {
                System.out.println("You got B in Physics");

            }
            else if ((pp<60 && (pp >= 50))) {
                System.out.println("You got C+ in Physics");

            }
            else if ((pp<50 && (pp >= 40))) {
                System.out.println("You got C in Physics");

            }
            else if ((pp<40 && (pp >= 30))) {
                System.out.println("You got D+ in Physics");

            }
            else {
                System.out.println("You got NG in Physics");

            }
            if(pc>=90 && pc<=100){
                System.out.println("You got A+ in Chemistry");
            }
            else if ((pc<90 && (pc >= 80))) {
                System.out.println("You got A in Chemistry");

            }
            else if ((pc<80 && (pc >= 70))) {
                System.out.println("You got B+ in Chemistry");

            }
            else if ((pc<70 && (pc >= 60))) {
                System.out.println("You got B in Chemistry");

            }
            else if ((pc<60 && (pc >= 50))) {
                System.out.println("You got C+ in Chemistry");

            }
            else if ((pc<50 && (pc >= 40))) {
                System.out.println("You got C in Chemistry");

            }
            else if ((pc<40 && (pc >= 30))) {
                System.out.println("You got D+ in Chemistry");

            }
            else {
                System.out.println("You got NG in Chemistry");

            }
            if(pm>=90 && pm<=100){
                System.out.println("You got A+ in Maths");
            } else if ((pm<90 && (pm >= 80))) {
                System.out.println("You got A in Maths");

            }
            else if ((pm<80 && (pm >= 70))) {
                System.out.println("You got B+ in Maths");

            }
            else if ((pm<70 && (pm >= 60))) {
                System.out.println("You got B in Maths");

            }
            else if ((pm<60 && (pm >= 50))) {
                System.out.println("You got C+ in Maths");

            }
            else if ((pm<50 && (pm >= 40))) {
                System.out.println("You got C in Maths");

            }
            else if ((pm<40 && (pm >= 30))) {
                System.out.println("You got D+ in Maths");

            }
            else {
                System.out.println("You got NG in Maths");

            }
        }
        else if(o==4){
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tLet's Play The Guessing Game\t\t\t\t\t\t\t\t\t\t");
            System.out.println("\t\t\t\t\tWhen you enter a number and if the number is the lucky one you will get a price");
            System.out.println("Enter a number:");
            float d = sc.nextFloat();
            Random random = new Random();
            int rk = random.nextInt(10);
            if (d == rk){
                System.out.println("\t\t\t\t\tCongratulations! You're guess is right");

            }
            else {
                System.out.println("\t\t\t\t\tBetter luck next time");
            }
        }
        else{
            System.out.println("Invalid number is entered. Rerun the program");
        }
    }
}
