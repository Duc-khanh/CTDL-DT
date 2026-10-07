import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int luaChon;

        do {

            System.out.println();
            System.out.println("====================================");
            System.out.println("     MENU CAU TRUC DU LIEU");
            System.out.println("====================================");
            System.out.println("1. Tim kiem tuyen tinh");
            System.out.println("2. Sap xep noi bot");
            System.out.println("3. Tinh giai thua bang de quy");
            System.out.println("0. Thoat");
            System.out.println("====================================");

            System.out.print("Nhap lua chon: ");
            luaChon = scanner.nextInt();

            switch (luaChon) {

                case 1:
                    chayLinearSearch(scanner);
                    break;

                case 2:
                    chayBubbleSort(scanner);
                    break;

                case 3:
                    chayFactorial(scanner);
                    break;

                case 0:
                    System.out.println("Da thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le.");
            }

        } while (luaChon != 0);

        scanner.close();
    }




    public static void chayLinearSearch(Scanner scanner) {

        int[] arr = {2, 3, 4, 10, 40};

        System.out.println();
        System.out.println("===== TIM KIEM TUYEN TINH =====");

        System.out.print("Mang: ");

        for (int value : arr) {
            System.out.print(value + " ");
        }

        System.out.println();

        System.out.print("Nhap gia tri can tim: ");
        int x = scanner.nextInt();

        int result = LinearSearch.search(arr, x);

        if (result == -1) {

            System.out.println(
                    "Khong tim thay phan tu trong mang."
            );

        } else {

            System.out.println(
                    "Tim thay " + x
                            + " tai index: "
                            + result
            );
        }
    }




    public static void chayBubbleSort(Scanner scanner) {

        int[] arr = {5, 3, 8, 4, 2};

        System.out.println();
        System.out.println("===== SAP XEP NOI BOT =====");

        System.out.print("Mang ban dau: ");

        for (int value : arr) {
            System.out.print(value + " ");
        }

        System.out.println();

        BubbleSort.bubbleSort(arr);

        System.out.print("Mang sau khi sap xep: ");

        for (int value : arr) {
            System.out.print(value + " ");
        }

        System.out.println();
    }




    public static void chayFactorial(Scanner scanner) {

        System.out.println();
        System.out.println("===== TINH GIAI THUA =====");

        System.out.print("Nhap n (n >= 0): ");

        int n = scanner.nextInt();

        if (n < 0) {

            System.out.println(
                    "n phai lon hon hoac bang 0."
            );

        } else {

            long result =
                    Factorial.tinhGiaiThua(n);

            System.out.println(
                    n + "! = " + result
            );
        }
    }
}