class InchesCm {
  public static void main(String[] args) {
    double inches, cm;
    int counter;
    counter = 0;

    for(inches =1; inches <= 20; inches++) {
      cm = inches * 2.54;
      System.out.println(inches+" cali to "+ cm + " centymetrow");

      counter++;

      if(counter == 10) {
        System.out.println();
        counter = 0;
      }

    }
  }
}
