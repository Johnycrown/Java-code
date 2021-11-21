package Chapter11;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class MyersBriggsQuestionaire {
    static String[] question = {"(A). expend energy enjoy groups\n(B). conserve energy, enjoy one-on-one",
            "(A). interpret literally\n(B). look for meaning and possibilities",
            "(A). logical, thinking, questioning \n(B). empathetic, feeling, accommodating",
            "(A). organize, orderly\n(B). flexible, adaptable",
            "(A). more outgoing, think aloud\n(B). more reserve" + "reserve, think to yourself",
            "(A). practical, realistic, experiential\n(B). imaginative, innovative,theoretical",
            "(A). candid, straight forward, frank\n(B). tactful kind, encouraging",
            "(A). plan, schedule\n(B). unplanned spontaneous",
            "(A). seek many tasks, public activities, interaction with others\n(B). seek private, " + "solitary activities with quiet to concentrate",
            "(A). standard, usual, conventional\n(B). different, novel, unique",
            "(A). firm, tend to criticize, hold the " + "line\n(B). gentle, tend to appreciate, conciliate",
            "(A). regulated, structured\n(B). easy going, Live and let live",
            "(A). external, communicative, express yourself\n(B). " + "internal, retinient, keep to yourself",
            "(A). focus on here and now\n(B). look to the future, global perspective, big picture",
            "(A). tough-minded, just\n(B). tender-hearted, merciful",
            "(A). preparation, plan ahead\n(B)" + " go with the flow, adapt as you go ",
            "(A). active, initiate\n(B). reflective, deliberate",
            "(A.) facts, things, 'what is'\n(B.) ideas, dreams, 'what could be'," + " philosophical",
            "(A). matter of fact, issue-oriented\n(B). sensitive, people-oriented, compassionate",
            "(A). control, govern\n(B). freedom"};
    static String[][] arrayOFUserResponse = new String[5][4];
    Scanner scanner = new Scanner(System.in);
    static  int numberOfA = 0;
  static int numberOfB = 0;
    static int numberOfAOfsecondColumn = 0;
    static   int numberOfBOfsecondColumn = 0;
    static  int numberOfAOfThirdColumn = 0;
    static  int numberOfBOfThirdColumn = 0;
    static int numberOfAOfFourthColumn = 0;
    static  int numberOfBOfFourthColumn = 0;

//
//    public static void displayquestion(String[] question) {
//        for (int counter = 0; counter < question.length; counter++) {
//            System.out.println((counter + 1) + " kindly select the option that best describe you\n" + question[counter]);
//        }
//    }


    public void takeTheQuestion(String[] questions) {


        int row = 0;
        for (int col = 0; col < questions.length; col++) {
            System.out.println((col + 1) + " kindly select the option that best describe you\n" + questions[col]);
            String userresponse = scanner.nextLine().toUpperCase();
            while (!(userresponse.equals("A") || userresponse.equals("B"))) {
                System.out.println(" kindly select the option of A or B");
                userresponse = scanner.nextLine();

            }

            arrayOFUserResponse[row][col % 4] = userresponse;
            if (col % 4 == 3) {
                row++;
            }
        }

        System.out.println(Arrays.deepToString(arrayOFUserResponse));

    }

    public static  void displayAnswer(){
        int counter = 1;
        for(String[] a: arrayOFUserResponse){
            for (String b : a){
                System.out.printf("%-4d%-10S",counter++, b);
                if(counter%4==1){
                    if(b.equals("A")) numberOfA++;
                    if(b.equals("B")) numberOfB++;
                }
                if(counter%4==2){
                    if(b.equals("A")) numberOfAOfsecondColumn++;
                    if(b.equals("B")) numberOfBOfsecondColumn++;
                }
                if(counter%4==3){
                    if(b.equals("A")) numberOfAOfThirdColumn++;
                    if(b.equals("B")) numberOfBOfThirdColumn++;
                }
                if(counter%4==0){
                    if(b.equals("A")) numberOfAOfFourthColumn ++;
                    if(b.equals("B")) numberOfBOfFourthColumn ++;
                }
            }
            System.out.println();
        }

    }
    public static void calculteNumberofAAndNumberOfB(){
        System.out.print( "A1 = " + numberOfA+" B1 = " + numberOfB+" A2 = " + numberOfAOfsecondColumn + "B2 = " + numberOfBOfsecondColumn +"A3 = "+numberOfAOfThirdColumn+
                " B3 = "+numberOfBOfThirdColumn+ " A4 = "+numberOfAOfFourthColumn+ "B4 = " + numberOfAOfFourthColumn
                );


    }
    public static void main(String[] args) {
        //displayquestion(question);
        MyersBriggsQuestionaire myersBrigs = new MyersBriggsQuestionaire();
        myersBrigs.takeTheQuestion(question);
        displayAnswer();
        calculteNumberofAAndNumberOfB();


    }
}
