public class TryCatchExample {
    public static void main(String[] args) {
        Student student = new Student();

        try{
            student.toString();
        }catch (NullPointerException e){
            System.out.println("catch block");
            e.getStackTrace();
        }finally {
            System.out.println("finally block");
        }
    }
}
