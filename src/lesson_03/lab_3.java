package lesson_03;

public class lab_3 {
    public static void main(String[] args) {
        //Lab 3.1 count number even and odd in array
        int[] intArrToCount = {1,2,3,4,5,6,7};
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i<= intArrToCount.length-1; i++){
            if(intArrToCount[i] % 2 == 0){
                countEven++;
            }
            else{
                countOdd++;
            }
        }
        System.out.printf("Number of even number: %d\n", countEven);
        System.out.printf("Number of odd number: %d\n", countOdd);


        //Lab 3.2 find min max value in array
        int[] intArrToFind = {10,2,15,4,5,6,7};
        int minValue = intArrToFind[0];
        int maxValue = intArrToFind[0];
        for(int i = 1; i <= intArrToFind.length-1; i++){
            if (intArrToFind[i] < minValue){
                minValue = intArrToFind[i];
            }
            if (intArrToFind[i] > maxValue){
                maxValue = intArrToFind[i];
            }
        }
        System.out.printf("Min number: %d\n", minValue);
        System.out.printf("Max number: %d\n", maxValue);

        //Lab 3.3 sorting array
        int[] intArrToSort = {10,2,15,4,5,6,7,0};
        int temp;
        int minIndex;
        for(int i = 0; i <= intArrToSort.length-1; i++){
            minIndex = i;
            for(int j = i; j<= intArrToSort.length-1; j++){
                if(intArrToSort[j] < intArrToSort[minIndex]){
                    minIndex = j;
                }
            }
            temp = intArrToSort[i];
            intArrToSort[i] = intArrToSort[minIndex];
            intArrToSort[minIndex] = temp;

        }
        System.out.print("Array sorted: ");
        for(int i : intArrToSort){
            System.out.printf("%d,",i);
        }

        //Lab 3.4 merge 2 sorted array
        int[] intArrA = {1,3,4,5,6,7,8,9,19};
        int[] intArrB = {1,2,6,9,10,12};
        int indexA = 0;
        int indexB = 0;
        int indexAB = 0;
        int[] intArrAB = new int[intArrA.length + intArrB.length];
        while (indexA < intArrA.length  && indexB < intArrB.length){
            if(intArrA[indexA] < intArrB[indexB]){
                intArrAB[indexAB] = intArrA[indexA];
                indexAB++;
                indexA++;
            }else{
                intArrAB[indexAB] = intArrB[indexB];
                indexAB++;
                indexB++;
            }
        }
        while ((indexA<intArrA.length)){
            intArrAB[indexAB] = intArrA[indexA];
            indexAB++;
            indexA++;
        }
        while ((indexB<intArrB.length)){
            intArrAB[indexAB] = intArrB[indexB];
            indexAB++;
            indexB++;
        }
        System.out.print("\nArray merge: ");
        for(int i : intArrAB) {
            System.out.printf("%d,", i);
        }
    }
}
