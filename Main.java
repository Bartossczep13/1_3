import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    double l1;
    double l2;
    double suma;
    System.out.println("Podaj dwie liczby: ");

    Scanner first = new Scanner(System.in);
    l1 = first.nextDouble();
    Scanner secend = new Scanner(System.in);
    l2 = secend.nextDouble();

    suma= l1+l2;

    System.out.println("wynik dodawania "+suma);


    
  }
}