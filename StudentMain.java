public class StudentMain {

   public static void main(String[]args) {
      Student st1 = new Student("Shreya", 20, 'F');
      Student st2=st1;
      Student st3 = new Student("Rohit", 21, 'M');
      st1.printStudent();
      st2.printStudent();
      st3.printStudent();
   }
}
