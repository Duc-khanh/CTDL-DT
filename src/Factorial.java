public class Factorial {

    /*
        Bước 1:
        Nhập số nguyên n.

        Bước 2:
        Nếu n < 0 thì thông báo không hợp lệ.

        Bước 3:
        Nếu n = 0 thì trả về 1.

        Bước 4:
        Nếu n > 0 thì trả về:

            n * Factorial(n - 1)

        Bước 5:
        Lặp lại quá trình đệ quy cho đến khi n = 0.


        Mã giả:

        Factorial(n)

            if n == 0
                return 1
            else
                return n * Factorial(n - 1)
            end if

        End
    */

    public static long tinhGiaiThua(int n) {

        if (n == 0) {
            return 1;
        }

        return n * tinhGiaiThua(n - 1);
    }
}