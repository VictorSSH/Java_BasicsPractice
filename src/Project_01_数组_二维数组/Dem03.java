package Project_01_数组_二维数组;

import org.junit.Test;

/**
 * 二维数组
 * 对于二维数组的理解，我们可以看成是一维数组array1又作为另一个一维数组array2的元素存在
 * 其实，从数组底层的运行机制来看，其实没有多维数组。
 * <p>
 * 二维数组的使用
 * ① 声明并且初始化二维数组
 * ② 如何获取数组指定位置的元素
 * ③ 如何获取数组的长度
 * ④ 如何遍历数组
 * ⑤ 数组元素的默认初始化值
 * ⑥ 二维数组的内存解析
 */
public class Dem03 {
    @Test
//     ① 声明并且初始化二维数组
    public void ArrayTest1() {
        int[] arr = new int[]{1, 2, 3, 4};

        /*静态初始化二维数组*/
        int[][] arr1 = new int[][]{{1, 12}, {2, 3}, {23, 32}};

        /*动态初始化二维数组*/

        String[][] arr2 = new String[3][4];
        String[][] arr3 = new String[6][4];
        /*获取二维数组长度*/
        System.out.println(arr2.length);
        System.out.println(arr3.length);
        System.out.println(arr3[1].length);

        /*遍历二维数组*/

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.println(arr3[i][j] + " ");
            }
        }
    }

    @Test
//    二维数组初始化值/**/
    public void ArrayTest2() {

        /*
         *   针对于初始化方式一: int int[][] arr = new int[4][1]
         *
         *       外层元素的初始化值为: 地址值
         *       内层元素的初始化值为： 与一维数组初始化情况相同
         *
         *   针对于初始化方式二： int[][] arr = new int[3][]
         *
         *       外层元素的初始化值为：null
         *       内层元素的初始化值为: 不能调用，会提示空指针异常
         * */

        String[][] arr = new String[2][2];
        arr[0][0] = "海淀 ";
        System.out.println(arr[0][0]);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

    @Test
    public void ArrayTest3() {
        /**
         * 定义一个二维数组，输出二维数组的名称和二维数组的，每一个一维数组
         * 给二维数组中的元素赋值，输出对应的元素值
         *
         * */
        int[][] arr = new int[3][2];
        //输出二维数组的地址
        System.out.println(arr);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                //输出每一个一维数组的默认值
                System.out.println(arr[i][j]);
            }
        }
        System.out.println("---------------");
        //给每一个一维数组元素赋值
        arr[0][0] = 1;
        arr[0][1] = 2;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

}
