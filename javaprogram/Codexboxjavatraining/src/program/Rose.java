package program;

  public class Rose extends Student {
      int age=20;
      int id=3;
      String name="rema";


      @Override
      int age() {
          return age;
      }

      @Override
      String name() {
          return name;
      }

      @Override
      int id() {
          return id;
      }

      @Override
      char section() {
          return 0;
      }

      public static void main(String[] args) {
          Rose R=new Rose();
          System.out.println(R.age());
          System.out.println(R.id());
          System.out.println(R.name());
          Ravali obj= new Ravali();

          System.out.println(obj.section());
          System.out.println(obj.id());
          System.out.println(obj.age());
          System.out.println(obj.name());

      }


      }

