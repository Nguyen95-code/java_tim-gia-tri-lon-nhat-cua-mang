import java.util.Scanner;

public class SearchMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Enter the size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        }while (size>20);
        array=new int[size];
        for (int i=0;i<array.length;i++){
            System.out.println("array["+i+"]:");
            array[i]=scanner.nextInt();
        }
        System.out.print("Property list:");
        for (int j=0;j<array.length;j++){
            System.out.print(array[j]+"\t");
        }
        int max=array[0];
        int index=1;
        for (int k=0;k<array.length;k++){
            if (array[k]>max){
                max = array[k];
                index=k+1;
            }
        }
        System.out.println("The largest property value in the list is " + max +", at position " + index );
    }
}
