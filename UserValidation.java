public class UserValidation {
    public static void validation(int a, int b) {

    if (a > 10 || a < 1) {
        try {
            throw new MyException("");
        } catch (MyException e) {
            System.out.println("Число меньше \"1\" или больше \"10\"");
          System.exit(1);

        }

    }

    if (b > 10 || b < 1) {
        try {
        throw new MyException("");
    } catch (MyException e) {
            System.out.println("Число меньше \"1\" или больше \"10\"");
            System.exit(1);
    }

    }
    int imput = 0;
}}
