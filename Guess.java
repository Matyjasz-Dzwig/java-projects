class Guess {
  public static void main(String[] args)
    throws java.io.IOException {
    char ch, answer = 'a';

    System.out.println("Pomyslalem litere z przedzialu A do Z");
    System.out.print("Sprobuj ja odgadnac: ");

    ch = (char) System.in.read();

    if (ch == answer) System.out.print("Jebac Pis!");

  }
}
