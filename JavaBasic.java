package hometask;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class JavaBasic {
    public static void main(String[] args) throws IOException {
        //task 1
//        System.out.println("\"Your time is limited,\n\tso don’t waste it\n\t\tliving someone else’s life\"\n\t\t\tSteve Jobs");
        //task 2
        Scanner scanner = new Scanner(System.in);
        /*System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.print("Enter percentage: ");
        int percent = scanner.nextInt();
        int part = num*percent/100;
        System.out.println(percent+" percent of "+num+" is "+part);*/
        //task 3
        /*System.out.print("Enter hundreds: ");
        int hundreds = scanner.nextInt();
        System.out.print("Enter dozens: ");
        int dozens = scanner.nextInt();
        System.out.print("Enter units: ");
        int units = scanner.nextInt();
        int generatedNum = (hundreds*100) + (dozens*10) + units;
        System.out.println("Compound number: "+generatedNum);*/
        //task 4
        /*System.out.print("Enter a six-digit number: ");
        int num = scanner.nextInt();
        if(num<100000||num>999999){
            System.out.println("Number should consist of six digits!");
        }
        else{
            int tempFirst = num/100000;
            int tempSecond = (num%100000 - num%10000)/10000;
            int tempThird = (num%10000 - num%1000)/1000;
            int tempFourth = (num%1000 - num%100)/100;
            int tempFifth = (num%100 - num%10)/10;
            int tempLast = num%10;
            int newNum = (tempLast*100000)+(tempFifth*10000)+(tempThird*1000)+(tempFourth*100)+(tempSecond*10)+tempFirst;
            System.out.println(newNum);
        }*/
        //task 5
        /*System.out.print("Enter number of the month: ");
        int monthIndex = scanner.nextInt();
        switch (monthIndex){
            case 1:case 2: case 12:
                System.out.println("Winter");
                break;
            case 3: case 4: case 5:
                System.out.println("Spring");
                break;
            case 6: case 7: case 8:
                System.out.println("Summer");
                break;
            case 9: case 10: case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Invalid month!");
                break;
        }*/
        //task 6
        /*System.out.print("Enter length in metres: ");
        int metres = scanner.nextInt();
        System.out.print("Press any key to convert to miles, 1 - inches, 2 - yards: ");
        int key = scanner.nextInt();
        double newLength = switch (key){
            case 1->metres*39.37;
            case 2->metres*1.09361;
            default ->metres/1609.0;
        };
        System.out.println("Length converted: "+newLength);*/
        //task 7
        /*System.out.print("Enter lower margin: ");
        int lwr = scanner.nextInt();
        System.out.print("Enter upper margin: ");
        int upr = scanner.nextInt();
        if(lwr>upr){
            int temp = lwr;
            lwr = upr;
            upr = temp;
        }
        for (int i = lwr; i<=upr; i++){
            if(i%2==1)
                System.out.print(i+" ");
        }*/
        //task 8
        System.out.print("Enter lower margin: ");
        int lwr = scanner.nextInt();
        System.out.print("Enter upper margin: ");
        int upr = scanner.nextInt();
        printTable(lwr, upr);
        //task 9
        /*Random random = new Random();
        int[] randomArr = new int[10];
        for(int i = 0; i < randomArr.length; i++)
            randomArr[i] = random.nextInt(-10,10);
        for(int elem:randomArr)
            System.out.print(elem+" ");
        System.out.println();
        int max = randomArr[0], min = randomArr[0], positiveElementsCounter = 0, negativeElementsCounter = 0, zerosCounter = 0;
        for(int elem:randomArr){
            if(elem>max)
                max = elem;
            if(elem<min)
                min = elem;
            if(elem>0)
                positiveElementsCounter++;
            else if(elem<0)
                negativeElementsCounter++;
            else if(elem==0)
                zerosCounter++;
        }
        System.out.println("Maximum value: "+max+", minimum value: "+min+"\nPositive elements: "+positiveElementsCounter
        +"\nNegative elements: "+negativeElementsCounter+"\nZeros: "+zerosCounter);*/
        //task 10
        /*Random random = new Random();
        int[] randomArr = new int[10];
        for(int i = 0; i < randomArr.length; i++)
            randomArr[i] = random.nextInt(-10,10);
        for(int elem:randomArr)
            System.out.print(elem+" ");
        System.out.println();
        int evenCounter = 0;
        for(int elem:randomArr){
            if(elem%2==0)
                evenCounter++;
        }
        int[] evenNumbers = new int[evenCounter];
        int index = 0;
        for(int elem:randomArr){
            if(elem%2==0){
                evenNumbers[index] = elem;
                index++;
            }
        }
        for(int elem:evenNumbers)
            System.out.print(elem+" ");
        System.out.println();
        int[] unevenNumbers = new int[randomArr.length-evenCounter];
        int index2 = 0;
        for(int elem:randomArr){
            if(elem%2==1){
                unevenNumbers[index2] = elem;
                index2++;
            }
        }
        for(int elem:unevenNumbers)
            System.out.print(elem+" ");
        System.out.println();
        int positiveCounter = 0;
        for(int elem:randomArr){
            if(elem>=0)
                positiveCounter++;
        }
        int[] negativeNumbers = new int[randomArr.length-positiveCounter];
        int index3 = 0;
        for(int elem:randomArr){
            if(elem<0){
                negativeNumbers[index3] = elem;
                index3++;
            }
        }
        for(int elem:negativeNumbers)
            System.out.print(elem+" ");
        System.out.println();
        int[] positiveNumbers = new int[positiveCounter];
        int index4 = 0;
        for(int elem:randomArr){
            if(elem>=0){
                positiveNumbers[index4] = elem;
                index4++;
            }
        }
        for(int elem:positiveNumbers)
            System.out.print(elem+" ");
        System.out.println();*/
        //task 11
        /*System.out.print("Enter a symbol: ");
        char symbol = (char)System.in.read();
        System.out.print("Pick a mode! Use:'h' for horizontal, 'v' for vertical: ");
        String mode = scanner.next();
        System.out.print("Finally, enter length: ");
        int len = scanner.nextInt();
        printLine(len, mode, symbol);*/
        //task 12
        /*int[] array ={5,3,6,8,2};
        System.out.print("Pick a mode! Use:'a' for ascending, 'r' for reverse: ");
        String mode = scanner.next();
        sortMode(array, mode);
        for(int elem:array)
            System.out.print(elem+" ");*/
    }
    public static void sortMode(int[] array, String mode){
        if(Objects.equals(mode, "a"))
            Arrays.sort(array);
        else if(Objects.equals(mode, "r")) {
            Arrays.sort(array);
            int[] temp = new int[array.length];
            System.arraycopy(array,0,temp,0,array.length);
            for(int i = 0;i<array.length;i++)
                array[i]=temp[temp.length-1-i];
        }
        else
            System.out.println("Invalid mode option! Use:\n\"a\" for ascending, \"r\" for reverse");
    }
    public static void printLine(int length, String mode, char character){
        if(Objects.equals(mode, "h")){
            for(int i = 0; i < length; i++)
                System.out.print(character);
        }
        else if(Objects.equals(mode, "v")) {
            for(int i = 0; i < length; i++)
                System.out.println(character);
        }
        else
            System.out.println("Invalid mode option! Use:\n\"h\" for horizontal, \"v\" for vertical");
    }
    public static void printTable(int lowerMargin, int upperMargin){
        for(int i = lowerMargin; i <= upperMargin; i++){
            for(int j = 1; j <= 10; j++){
                System.out.print(i+"*"+j+" = "+i*j+" ");
            }
            System.out.println();
        }
    }
}
