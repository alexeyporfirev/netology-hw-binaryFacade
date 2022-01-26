package tools;

public class BinOps {
    public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
        int arg0 = Integer.parseInt(a, 2);
        int arg1 = Integer.parseInt(b, 2);
        return Integer.toBinaryString(arg0 + arg1);
    }

    public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
        int arg0 = Integer.parseInt(a, 2);
        int arg1 = Integer.parseInt(b, 2);
        return Integer.toBinaryString(arg0 * arg1);
    }
}