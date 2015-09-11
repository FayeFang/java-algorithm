public class RunnableThread implements Runnable {
  public int count = 0;

  public void run() {
    System.out.println("RunnableThread Starting.");
    try {
      while (count < 5) {
        Thread.sleep(500);
        System.out.println("In Thread, count is " + count);
        count++;
      }
    }
    catch (InterruptedException exc) {
      System.out.println("RunnableThread Interrupted.");
    }
    System.out.println("RunnableThread Terminating");
  }

  public static void main(String[] args) {
    RunnableThread instance = new RunnableThread();
    Thread thread = new Thread(instance);
    thread.start();

    while (instance.count != 5) {
      try {
        Thread.sleep(250);
      }
      catch (InterruptedException exc) {
        exc.printStackTrace();
      }
    }
  }
}