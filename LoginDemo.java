import java.util.*;
class LoginDemo {
  public static void main(String[]args) {
    System.out.print("Podaj login: ");
    Scanner sc = new Scanner(System.in);
    String login = sc.nextLine();

    System.out.print("Witaj " + login);

  }
}
