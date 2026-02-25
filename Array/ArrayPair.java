package Array;

public class ArrayPair {
    public static  void printPair(int [] numbers){
        for(int i=0;i<numbers.length;i++){
            int cur = numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+ cur +","+numbers[j] + ")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] number = {2,4,6,8,10};
        printPair(number);
    }
}
