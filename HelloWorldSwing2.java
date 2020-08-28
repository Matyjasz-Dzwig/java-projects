import javax.swing.JFrame;

class HelloWorldSwing2 {

  public static void createAndShowGUI() {
    JFrame dzwig = new JFrame("HelloWorldSwing2");
    dzwig.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    dzwig.pack();
    dzwig.setVisible(true);
    dzwig.setSize(400,300);
  }

  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        createAndShowGUI();

      }
    });
  }
}
