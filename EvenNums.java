class EvenNums {
  public static void main (String[]args) {
    for(int i=1; i<=100; i++) {
      System.out.print(i);
      if((i%2)==0)
        System.out.print(" Parzysta");
      else System.out.print(" Nieparzysta");


      System.out.print("\n");
    }
  }
}
