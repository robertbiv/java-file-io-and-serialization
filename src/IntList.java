//Robert Bennethum
public class IntList {
    static int[] countOccur(int arr[], int n) {
        int[] cntArr = new int[n];
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    cnt++;
            }
            cntArr[i] = cnt;
        }

        return cntArr;
    }
}
