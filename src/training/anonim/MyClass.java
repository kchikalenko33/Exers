package training.anonim;

public abstract class MyClass {
    public void methode() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        var variable = new MyClass(){
          @Override
          public void methode() {
              System.out.println("Bye");
          }

          public void run() {
              System.out.println("run");
          }
        };

        variable.methode();
        variable.run();

        System.out.println(variable.getClass().getName());
        System.out.println(variable instanceof MyClass);
    }
}
