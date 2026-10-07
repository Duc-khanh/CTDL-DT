public class BubbleSort {

    /*
        Bước 1: Bắt đầu từ đầu mảng.

        Bước 2:
        So sánh hai phần tử đứng cạnh nhau
        A[j] và A[j + 1].

        Bước 3:
        Nếu A[j] > A[j + 1]
        thì đổi chỗ hai phần tử.

        Bước 4:
        Tiếp tục so sánh các cặp kế tiếp
        cho đến cuối phần mảng chưa sắp xếp.

        Bước 5:
        Sau mỗi lượt, phần tử lớn nhất
        của phần chưa sắp xếp sẽ được đưa về cuối.

        Bước 6:
        Lặp lại cho đến khi toàn bộ mảng được sắp xếp.


        Mã giả:

        BubbleSort(A)

            n = length(A)

            for i = 0 đến n - 2

                for j = 0 đến n - 2 - i

                    if A[j] > A[j + 1]

                        temp = A[j]
                        A[j] = A[j + 1]
                        A[j + 1] = temp

                    end if

                end for

            end for

        End
    */

    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];

                    arr[j] = arr[j + 1];

                    arr[j + 1] = temp;
                }
            }
        }
    }
}