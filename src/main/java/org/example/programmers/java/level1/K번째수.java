package org.example.programmers.java.level1;

public class K번째수 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(solution(array, commands));
    }

    private static int[] solution(int[] array, int[][] commands) {
        int startIdx, endIdx;
        int len = commands.length;
        int k =0;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            startIdx = commands[i][0] - 1;
            endIdx = commands[i][1] - 1;
            k = commands[i][2]-1;
            int[] slicedArr = slice(array, startIdx, endIdx);
            quickSort(slicedArr, 0, slicedArr.length-1);
            arr[i]=slicedArr[k];
        }
        return arr;
    }

    private static void quickSort(int[] slicedArr, int low, int high) {
        /*
         *  low가 high보다 크거나 같다면 정렬 할 원소가
         *  1개 이하이므로 정렬하지 않고 return한다.
         */
        if(low >= high) {
            return;
        }
        int pivot = partition(slicedArr, low, high); // 배열을 분할할 기준값을 생성

        quickSort(slicedArr, low, pivot - 1); //pivot 을 기준으로 분할 정복
        quickSort(slicedArr, pivot + 1, high);
    }
    private static int partition(int[] a, int left, int right) {
        //5263
        int low = left; // 0
        int high = right;// 3
        int pivot = a[left]; // 매개변수로 입력받은 배열의 맨 왼쪽 값을 기준으로 설정 5
        while(low < high) { // 왼쪽이 오른쪽의 인덱스를 넘지 않을 때까지 반복
            while(a[high] > pivot && low < high) { // 오른쪽에서 기준값보다 크고, 오른쪽이 왼쪽보다 크면
                // 제일 오른쪽값이 기준값보다 작은 경우를 찾아낼것임
                high--; // 오른쪽 포인터를 기준값에 가깝게 설정
                // 오른쪽에서 기준값보다 작은 값을 포인터로 설정 3[3]
            }
            while(a[low] <= pivot && low < high) { // 마찬가지로, 왼쪽에서 기준값보다 작거나 같고 오른쪽보다 작으면
                low++; // 왼쪽 포인터를 기준값에 가깝게 설정
                // 왼쪽에서 기준값보다 큰 값을 포인터로 설정 6[2]
            }
            swap(a, low, high); // 위에서 찾은 값을 서로 변경 5263 -> 5236
            //      2   3
        }
        swap(a, left, low); // 5236 -> 3256
        //      0   2
        return low; // 5를 기준값으로 다시 반환 -> 설정한 값을 기준으로 아무것도 바뀌지 않을 때까지 반복
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int[] slice(int[] arr, int startIdx, int endIdx) {
        int[] slicedArr = new int[endIdx - startIdx + 1];
        for (int i = 0; i < slicedArr.length; i++) {
            slicedArr[i] = arr[startIdx+i];
        }
        return slicedArr;
    }
}