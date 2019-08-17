package main.some;

public class Sort {

    public static void main(String[] args) {

        int[] array = new int[]{9,4,2,6,2,5,1,0};
//        quickSort(array, 0, array.length - 1);

//        heapSort(array);
        mergeSort(array, 0, array.length - 1);
        System.out.println();

    }

    public static void quickSort(int[] array, int start, int end){
        if(start >= end){
            return;
        }else{
            int left = start;
            int right = end;
            int temp = array[left];
            int free = left;
            while(left < right){
                while(left < right && array[right] > temp){
                    right --;
                }
                if(left < right){
                    array[free] = array[right];
                    free = right;
                }
                left ++;
                while(left < right && array[left] < temp){
                    left ++;
                }

                if(left < right){
                    array[free] = array[left];
                    free = left;
                }
            }
            array[free] = temp;
            quickSort(array, start, free - 1);
            quickSort(array, free + 1, end);
        }
    }

    public static void heapSort(int[] array){
        buildHeap(array);
        for(int i = array.length - 1; i >= 0; i--){
            System.out.println(array[0]);
            array[0] = array[i];
            array[i] = Integer.MAX_VALUE;
            heapHelper(array, 0);
        }
    }

    public static void buildHeap(int[] array){
        for(int i = (array.length - 1) / 2; i >= 0; i--){
            heapHelper(array, i);
        }
    }

    public static void heapHelper(int[] array, int index){
        if(index >= array.length){
            return;
        }else{
            int left = index << 1;
            int right = left + 1;
            int min = Integer.MAX_VALUE;
            int minIndex = -1;

            if(left < array.length){
                if(array[left] < min){
                    min = array[left];
                    minIndex = left;
                }
            }

            if(right < array.length){
                if(array[right] < min){
                    min = array[right];
                    minIndex = right;
                }
            }

            if(array[index] > min && minIndex > 0){
                array[minIndex] = array[index];
                array[index] = min;
                heapHelper(array, minIndex);
            }else{
                return;
            }
        }
    }

    public static void mergeSort(int[] array, int left, int right){
        if(left >= right || left < 0 || left >= array.length || right < 0 || right >= array.length){
            return;
        }else{
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            int[] temp = new int[right - left + 1];
            int i = left;
            int j = mid + 1;
            int index = 0;
            while(i <= mid && j <= right){
                if(array[i] < array[j]){
                    temp[index ++] = array[i ++];
                }else{
                    temp[index ++] = array[j ++];
                }
            }

            if(i <= mid){
                while(i <= mid){
                    temp[index ++] = array[i ++];
                }
            }

            if(j <= right){
                while(j <= right){
                    temp[index ++] = array[j ++];
                }
            }

            for(int k = left; k <= right; k++){
                array[k] = temp[k - left];
            }
        }
    }



}
