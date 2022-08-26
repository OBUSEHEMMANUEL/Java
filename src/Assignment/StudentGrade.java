package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade {
   static Scanner input = new Scanner(System.in);
  static   int numberOfStudents, count =0;
  static   int numberOfSubjects;
    static   int [][] studentGrades;
    static  int [] totals;
    static  double [] averages;


    public static void main(String[] args) throws InterruptedException {
        setUp();
       gradeInput();
       resultIsBeingProcessed();
       header();
       processGrade();
       subjectSummary();


    }

  public static void setUp(){
      System.out.println("Enter number of students: ");
      numberOfStudents = input.nextInt();
      System.out.println("Enter number of subjects: ");
      numberOfSubjects = input.nextInt();
  }


  public static void doubleLine(){
      for(int i = 0; i < 80; i++){
          System.out.print("=");
      }
      System.out.println();
  }
  public static void gradeInput() {
      studentGrades = new int[numberOfStudents][numberOfSubjects];

      for (int rows = 0; rows < studentGrades.length; rows++) {
          for (int column = 0; column < studentGrades[rows].length; column++) {
              System.out.printf("Enter student Grade for Student %d and subject %d: ", (rows + 1), (column + 1));
              int grade = input.nextInt();
              studentGrades[rows][column] = grade;

          }
          System.out.println();
      }
  }

      public static void resultIsBeingProcessed() throws InterruptedException {
          System.out.println("saving result");
          for (int i = 0; i < 20; i++) {
              Thread.sleep(10);
              System.out.print(">");
          }
          System.out.println(" ");
          System.out.println("Result saved");
          System.out.println("Print out result");
          for (int i = 0; i < 15; i++) {
              Thread.sleep(10);
              System.out.print(">");
          }
          System.out.println();



      }

  public static void header (){
      System.out.print("WELCOME TO RESULT PAGE");
      System.out.println();
    doubleLine();
      System.out.print("STUDENT");
      for (int rows = 0; rows < numberOfSubjects; rows++) {
          System.out.printf(" %10s","SUB"+(rows+1));
      }
      System.out.printf("%10s %10s %10s", "TOTAL","AVERAGE", "POSITION");
      System.out.println();
      doubleLine();
      System.out.println();
  }

public static void processGrade(){
        totals = new int[numberOfStudents];
        averages = new double[numberOfStudents];
    for (int rows = 0; rows < studentGrades.length; rows++) {
        int total = 0;
        System.out.printf("Student %d", (rows + 1));
        for (int column = 0; column < studentGrades[rows].length; column++) {
            System.out.printf("%10d", studentGrades[rows][column]);
            total += studentGrades[rows][column];
        }
        totals[rows] = total;
        averages[rows] = (double) total / numberOfSubjects;
        System.out.printf("%10d%10.2f", totals[rows], averages[rows]);
        System.out.println();
    }

}
public static void position(){

    for (int rows = 0; rows <  numberOfSubjects; rows++) {
        Arrays.sort(averages);
        System.out.printf("%10f", averages[rows]);
        System.out.println();
    }
}
public static int highestStudentScore(int[][] array) {
    int highest = array[0][0];
    for (int rows = 0; rows < array.length; rows++) {
        if (array[rows][0] > highest) {
          highest = array[rows][0];
        }
    }
    return highest;
}
private static int index = 1;
    public static int highestStudentScoreIndex(int[][] array) {
        int highest = array[0][0];
        for (int rows = 0; rows < array.length; rows++) {
            if (array[rows][0] > highest) {
               index = rows + 1 ;
                }
            }
        return index;
    }
    public static int lowestStudentScore(int[][] array) {
        int highest = array[0][0];
        for (int rows = 0; rows < array.length; rows++) {
            if (array[rows][0] < highest) {
                highest = array[rows][0];
            }
        }
        return highest;

    }
    public static int lowestStudentScoreIndex(int[][] array) {
        int highest = array[0][0];
        for (int rows = 0; rows < array.length; rows++) {
            if (array[rows][0] > highest) {
                index = rows + 1 ;
            }
        }
        return index;
    }
    public static int totalSubject(int[][] array) {
        int total = array[0][0];
        for (int rows = 0; rows < array.length; rows++) {
                total += array[rows][0] ;

        }
        return total;
    }
    public static int averageSubject(int[][] array) {
        int total = array[0][0];
        int average= 0;
        for (int rows = 0; rows < array.length; rows++) {
            total += array[rows][0] ;
        }
        average = total/numberOfSubjects;
        return average;
    }


    public static void subjectSummary(){
        doubleLine();
        doubleLine();

    System.out.printf("%s", "SUBJECT SUMMARY");
    System.out.println();
    System.out.println("Subject 1");
    System.out.println();
    System.out.printf("%s student %d Scoring %d","Highest subject score is:", highestStudentScoreIndex(studentGrades), highestStudentScore(studentGrades));
    System.out.printf("%s student %d Scoring %d","Lowest subject score is:",lowestStudentScoreIndex(studentGrades),lowestStudentScore(studentGrades));
        System.out.printf("");
}
//public static void bestStudentInEachSubject(){
//    for (int i = 0; i < studentGrades.length; i++) {
//
//
//    }
//}

}
