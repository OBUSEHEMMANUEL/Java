package Deitel.chapter_5.chapter_6;
import java.security.SecureRandom;
public class RandomIntegers {
    private static final SecureRandom number = new SecureRandom();
    public static void main(String[] args) {


//        int frequency1 = 0;
//        int frequency2 = 1;
//        int frequency3 = 2;
//        int frequency4 = 3;
//        int frequency5 = 4;
//        int frequency6 = 5;
//        int frequency7 = 6;
//


        for (int counter = 1; counter <= 20; counter++) {
            int coin = 1 + number.nextInt(6);
            System.out.printf("\t%d",coin);
            if (counter % 5 == 0){
                System.out.println();
            }

//            switch (coin){
//                case 1:
//                    ++frequency1;
//                    break;
//                case 2:
//                    ++frequency2;
//                    break;
//                case 3:
//                    ++frequency3;
//                    break;
//                case 4:
//                    ++frequency4;
//                    break;
//                case 5:
//                    ++frequency5;
//                    break;
//                case 6:
//                    ++frequency6;
//                    break;
//                case 7:
//                    ++frequency7;
//            }

            }
//            System.out.printf("\t%d \t%d \t%d \t%d \t%d \t%d \t%d ", frequency1,frequency2, frequency3, frequency4, frequency5,frequency6, frequency7);

        }
    }