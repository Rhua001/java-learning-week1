package week1.day6;

public class ArrayDemo {
    public static void main(String[] args) {


        //一维数组
        int[] arr1 = new int[5];
        int[] arr2 = {1, 2, 3, 4, 5};

        //遍历数组
        for (int i = 0; i <arr2.length ; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();

        //增强for循环
        for (int num:arr2){
            System.out.print(num+" ");
        }
        System.out.println();

        //二维数组
        int[][] arr3={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        //遍历数组
        for (int i = 0; i < arr3.length ; i++) {
            for (int j = 0; j <arr3[i].length ; j++) {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
