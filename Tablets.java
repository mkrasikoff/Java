import java.util.Scanner;

public class Tablets {

    public static void main(String[] args) {
        int packWitchPillsNumber;
        Scanner scanner = new Scanner(System.in);

        packWitchPillsNumber = scanner.nextInt();
        int[][] doubleArray = new int[packWitchPillsNumber][4];
        // Информация внутри - В первых ячейках - номер коробки.
        //                     Во вторых [a(i)] [x(i)] [последний день диапазона] [max кол-во таблеток]
        for(int i = 0; i < packWitchPillsNumber; i++) {
            doubleArray[i][0] = scanner.nextInt();
            doubleArray[i][1] = scanner.nextInt();
            doubleArray[i][2] = daysRange(doubleArray[i][0], doubleArray[i][1]);
            doubleArray[i][3] = doubleArray[i][1];
        }

        StringBuilder[] stringBuilders = new StringBuilder[packWitchPillsNumber];
        for(int i = 0; i < packWitchPillsNumber; i++) {
            int lastAdded = i;
            StringBuilder sb = new StringBuilder("" + i + " ");
            for(int j = i + 1; j < packWitchPillsNumber; j++) {
                if(doubleArray[lastAdded][2] < doubleArray[j][0]) {
                    doubleArray[i][3] += doubleArray[j][1];
                    lastAdded = j;
                    sb.append(j + " ");
                }
            }
            sb.deleteCharAt(sb.length() - 1);
            stringBuilders[i] = sb;
        }

        int resultMaxPills = 0;
        String resultPillsPackages = "";

        for(int i = 0; i < packWitchPillsNumber; i++) {
            if(doubleArray[i][3] > resultMaxPills) {
                resultMaxPills = doubleArray[i][3];
                resultPillsPackages = stringBuilders[i].toString();
            }
        }

        System.out.println(resultMaxPills);
        for(String s: resultPillsPackages.split("")) {
            System.out.print(s);
        }
        System.out.println();
    }

    public static int daysRange(int firstDay, int pills) {
        return firstDay + pills - 1;
    }
}