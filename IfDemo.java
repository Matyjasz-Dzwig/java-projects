class IfDemo {
  public static void main(String [] args) {
    int a, b, c; a = 2; b = 3;
    if (a<b) System.out.println("a jest mniejsze od b");
    if (a==b) System.out.println("To wywolanie nie zostanie wykonane");
    System.out.println();

    c = a-b;

    System.out.println("c zawiera " + c);
    if (c>=0) System.out.println("c jest nieujemne");
    if (c<0) System.out.println("c jest ujemne");
    System.out.println();

    c = b-a;

    System.out.println("c zawiera " + c);
    if (c>=0) System.out.println("c jest nieujemne");
    if (c<0) System.out.println("c jest ujemne");
  }
}
