public class LinearSearch {

    /*
        Thuật toán LinearSearch(A, x)

        Đầu vào:
        A: mảng gồm n phần tử
        x: giá trị cần tìm

        Đầu ra:
        Vị trí của x trong mảng nếu tìm thấy
        -1 nếu không tìm thấy

        Bước 1: Duyệt lần lượt từng phần tử của mảng từ vị trí đầu tiên.

        Bước 2: Với mỗi vị trí i, so sánh A[i] với x.

        Bước 3:
        Nếu A[i] = x
            Trả về i.

        Bước 4:
        Nếu đã duyệt hết mảng mà không tìm thấy x
            Trả về -1.


        Mã giả:

        LinearSearch(A, x)

            for i = 0 đến length(A) - 1

                if A[i] == x
                    return i
                end if

            end for

            return -1

        End
    */

    public static int search(int[] arr, int x) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == x) {
                return i;
            }
        }

        return -1;
    }
}