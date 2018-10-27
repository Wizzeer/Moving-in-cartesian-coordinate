
import java.util.Scanner;

class MovingInCartesianCoordinate {
  public static void main(String[] args) {
    int x=0;
    int y=0;
    String userInput;
    Scanner sc=new Scanner(System.in);
    System.out.println("G - g�ra");
    System.out.println("D - d�");
    System.out.println("L - lewo");
    System.out.println("P - prawo");
    System.out.println("�eby wyj��: exit");
    System.out.println("Pocz�tkowa lokalizacja: ("+x+","+y+")");
    while(true){
      System.out.print("Podaj ruch (np. G18): ");
      userInput=sc.nextLine();
      if(userInput.equals("exit"))break;
      StringBuilder sbInput = new StringBuilder(userInput);
      char direction=sbInput.charAt(0);
      String move="";
      StringBuilder sbMove = new StringBuilder(move);
      
      for(int i=1;i<sbInput.length();i++){
        sbMove.append(sbInput.charAt(i));
      }
      int moveInt=Integer.parseInt(sbMove.toString());
      if(direction=='G'||direction=='g'){
        y+=moveInt;
      }
      else if(direction=='D'||direction=='d'){
        y-=moveInt;
      }
      else if(direction=='L'||direction=='l'){
        x-=moveInt;
      }
      else if(direction=='P'||direction=='p'){
        x+=moveInt;
      }
      System.out.println("Nowa lokalizacja: ("+x+","+y+")\n");
    }
  }
}