package example;

import fedchun.kirill.Program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;

/**
 * Created by Кирилл on 21.03.2016.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        sortStrings();
    }

    //private final static BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
    private final static BufferedReader stdIn = new BufferedReader(new StringReader(
            "hello\n"+
            "232\r"+
            "World\r\n"+
            "\n"+
            "===\r"
    ));

    public static void stringReaderDemo() throws IOException {
        System.out.print(">");
        String s = stdIn.readLine();
        System.out.println();
        System.out.println(s);
    }

    public static void loop() {
        int a = 1;
        int b = 3;
        int i = 0;
        while (i < 10) {
            System.out.format("i=%s\nА=%s\nb=%s\n", i, a, b);
            i = i + 1;
            a = a + 3;
            b = b + a;

        }
        System.out.println("End of while.");
    }

    public static void tryAgain(String[] args) throws IOException {
        System.out.print("Введите число: ");
        String s =stdIn.readLine();
        double a = 0;
        boolean isNumber = true;
        try {
            a = Double.parseDouble(s);
        } catch (NumberFormatException e) {

            isNumber = false;
        }
        if (isNumber == true) {
            System.out.print("Вы ввели " + a);
        } else {
            System.out.println("Попробуй еще.");
        }
    }

    public static void stringArray() throws IOException {
        String[] strList;
        strList = new String[100];
        int i = 0;
        int k = 0;
        while (true) {
            System.out.format("Введите строку номер %s: \n", i);
            String s = stdIn.readLine();
            if (s.length() == 0) break;
            strList[i] = s;
            i = i + 1;
        }
        while (true) {
            System.out.println("Какую строку вы бы хотели вывести на экран?");
            try {
                String j = stdIn.readLine();
                if (j.length() == 0) break;
                k = Integer.parseInt(j);
                if (k < 1 || k > 0) {
                    System.out.println("Введите другое число");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число, попробуйте еще раз.");
                continue;
            }

            k = k - 1;
            System.out.println(strList[k]);
        }

    }
    public static void stringSort2() throws IOException {
        System.out.println("Введите ваши числа и строки:");
        String q = stdIn.readLine();
        String[] array = q.split(" ");
        int[] numArray = new int[100];
        String[] srtArray = new String[100];
        int i = 0;
        int strIndex = 0;
        int numIndex = 0;
        while (i<array.length){
            if(array[i].length()==0){
                i++;
                continue;
            }
            try {
                numArray[numIndex] = Integer.parseInt(array[i]);
                numIndex++;
            }
            catch (NumberFormatException e){
                srtArray[strIndex] = array[i];
                strIndex++;
            }
            i++;
        }
        Arrays.sort(numArray, 0, numIndex);
        Arrays.sort(srtArray, 0, strIndex);
        i=0;
        while(i<numIndex){
            System.out.println(numArray[i]);
            i++;
        }
        i=0;
        while(i<strIndex){
            System.out.println(srtArray[i]);
            i++;
        }

    }
    public static void arrayDemo(){
        String[] a = new String[10];
        a[5] = "asd";
        String[] b;
        b = a;
        System.out.println(b[5]);
        b[6] = "zxc";
        System.out.print(a[6]);
    }
    public static void sortDemo(){
        String[] array = new String[5];
        array[0] = "09";
        array[1] = "1";
        array[2] = "08";
        array[3] = "20";
        array[4] = "100";
        int i = 0;
        int[] intArray = new int[array.length];
        while(i<array.length){
            intArray[i] = Integer.parseInt(array[i]);
            i++;
        }
        Arrays.sort(array);
        i = 0;
        while(i<array.length){
            System.out.println(array[i]);
            i++;
        }
        System.out.println();
        Arrays.sort(intArray);
        i = 0;
        while(i<intArray.length){
            System.out.println(intArray[i]);
            i++;
        }
    }
    public static void testSplit() throws IOException {
        //String q = Program.stdIn.readLine();
        String q="one/two//three///four////1//2///3///41";
        String array[] = q.split("/");
        int i= 0;
        while(i<array.length){
            System.out.format("'%s'\n", array[i]);
            i++;
        }
    }
    public static void whileDemo(){
        int i = 0;
        while(i<11){
            System.out.format("%s: Hello world!\n", i);
            i++;
        }
    }
    public static void forDemo(){
        for(int i=0;i<11;i++) {
            System.out.format("%s: Hello world!\n", i);
        }
    }
    public static void doWhileDemo(){
        int i = 1;
        do{
            System.out.format("%s: Hello world!\n", i);
            i++;
        }
        while(i<11);
    }
    public static void sortStrings() throws IOException {
        String[] array = new String[100];
        System.out.println("Введите ваши строки: ");
        int arrayIndex = 0;
        for(;arrayIndex<array.length;arrayIndex++) {
            array[arrayIndex] =stdIn.readLine();
            if(array[arrayIndex].length()==0) break;
        }
        System.out.println("Введите разделитель: ");
        String s = stdIn.readLine();
        String[] copyArray = new String[100];
        copyArray = array;
        System.out.println("Ваш результат: ");
        for(int i=0;i<arrayIndex;i++){
            System.out.print(copyArray[i] + s);
        }


    }
    public static void charDemo() throws IOException {
        System.out.print(">");
        String s =stdIn.readLine();
        for(int i=0;i<s.length();i++){
            char d = s.charAt(i);
            System.out.format("[%s]='%s'>%s\n", i, d, (int)d);
        }

    }
    public static void charDemo2(){
        short[] array = {72,101,108,108,111,};
        char a = 72;
        char b = 'H';
        System.out.println(a!=b);
        for(int i=0;i<array.length;i++){
            System.out.print((char)(array[i]+1));
        }
    }
    public static void escapeCharDemo(){
        char a = '\t';
        char b = '\n';
        char x = '\u0048';
        char y = 0x48;
        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println(x);
        System.out.println(y);

        String s = "\u03b1ello";
        System.out.println(s);
        System.out.println((char)945);
        System.out.println("\tHello");
    }
    public static void substringDemo() throws IOException {
        System.out.println("Введите текст: ");
        String text = stdIn.readLine();
        for(;;){
            System.out.format("Введите начальный и конечный индекс подстроки(max:%s) через запятую: ", text.length());
            String s =stdIn.readLine();
            if(s.length()==0) break;
            String[] array =s.split(",");
            if(array.length<2){
                System.out.println("Недостаточно индексов");
                continue;
            }
            for(int i=0;i<2;i++){
                array[i]=array[i].trim();
                System.out.format("'%s'\n", array[i]);
            }
            int startIndex = 0;
            int endIndex = 0;
            try{
                startIndex = Integer.parseInt(array[0]);
                endIndex = Integer.parseInt(array[1]);
            }
            catch(NumberFormatException e){
                System.out.print("Один из индексов неверен");
                continue;
            }
            if(startIndex<0||startIndex>text.length()-1){
                System.out.println("Начальный индекс за пределами строки");
                continue;
            }
            if(endIndex<=startIndex||endIndex>text.length()){
                System.out.println("Конечный индекс неверен");
                continue;
            }
            String subStr = text.substring(startIndex, endIndex);
            System.out.println(subStr);
        }
    }
}
