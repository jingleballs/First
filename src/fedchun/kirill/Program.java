package fedchun.kirill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Кирилл on 17.03.2016.
 */
public class Program {
    public static BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        double a = ReadDouble("Введите а: ", "Введите числовое значение");
        double b = ReadDouble("Введите b: ", "Введите числовое значение");
        double c = ReadDouble("Введите c: ", "Введите числовое значение");
        if (a==0){
            System.out.print("Коэффициэнт a не должнен быть равен нулю. Попробуйте еще раз.");
            System.exit(0);
        }
        System.out.format("%sx^2 + %sx + %s = 0\n", a,b,c);
        double d = Deskr(a,b,c);
        System.out.format("D = %s\n", d);
        if(d<0){
            System.out.println("Нет действительных корней.");
        }
        else if(d==0){
          System.out.format("x = %s\n", -b/(2*a));
        }
        else {
            double x1 = (-b-Math.sqrt(d)/(2*a));
            double x2 = (-b+Math.sqrt(d)/(2*a));
            System.out.format("x1 = %s\n", x1);
            System.out.format("x2 = %s\n", x2);
        }
    }
    static double Deskr(double a,double b,double c){
            return b*b-4*a*c;

    }
    static double ReadDouble(String prompt, String errMsg) throws IOException {
        System.out.print(prompt);
        try{
            return Double.parseDouble(stdIn.readLine());
        }
        catch (NumberFormatException e){
            System.out.print(errMsg);
            System.exit(1);
            return 0;
        }
    }
}
