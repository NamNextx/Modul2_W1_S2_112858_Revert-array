import java.util.Scanner;

public class Revertarray {

    public static void main(String[] args) {
        int length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Process revert index in array");
        do {
            System.out.print("Length of array is: ");
            length = sc.nextInt();
            if (length > 20) {
                System.out.println("Pls input number less than 20");
            }
        } while (length > 20);
        int array[]=new int[length];
        int i = 0;

        while (i < length) {
            System.out.print("arr[" + i + "]= ");
            array[i]=sc.nextInt();
            i++;
        }
        //display(array);
        revertArray(array);
        // Dao cac phan tu trong mang


    }

    static void display(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.println("Array["+i+"]= "+ arr[i]);
        }
    }

    static void revertArray(int arr[]){
        int tg;
        for (int i=0;i<arr.length/2;i++){
            tg=arr[i];
            arr[i]=arr[arr.length-(i+1)];
            arr[arr.length-(i+1)]=tg;
        }
        display(arr);
    }

}
