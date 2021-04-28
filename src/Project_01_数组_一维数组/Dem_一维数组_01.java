package Project_01_数组_一维数组;

import org.junit.Test;

/*
 * 数组（Array）：是多个相同类型数据按照一定顺序排列的组合，并使用一个名字命名，并通过编号的方式对这些数据进行同一管理
 *   数组属于引用数据类型变量，
 *   创建数组空间会在内存中开辟连续的内存空间，而数组名中引用的是这块连续空间的首地址
 *   数组长度一旦确定就无法修改
 *
 * */
public class Dem_一维数组_01 {
    /*
     * 一维数组的使用
     * ① 声明并且初始化一维数组
     * ② 如何获取数组指定位置的元素
     * ③ 如何获取数组的长度
     * ④ 如何遍历数组
     * ⑤ 数组元素的默认初始化值
     * ⑥ 一维数组的内存解析
     */

    /**① 声明并且初始化一维数组*/
    @Test
    public void ArrayTest1() {
//        int[] ids;
        /*静态初始化
         * 数组的初始化和数组元素赋值同时进行
         * */
        int[] ids = new int[]{12, 3, 54, 65};
        /*动态初始化
         * 数组初始化和数组元素初始化分开进行
         * */
        String[] strarray = new String[12];
        strarray[0] = "北京";
        strarray[1] = "上海";
        strarray[3] = "南京";
        strarray[4] = "杭州";
        //获取数组长度
        System.out.println("strarray长度是:"+strarray.length);
        //遍历数组元素
        for (int i = 0; i < strarray.length; i++) {
            System.out.println(strarray[i]);
        }
//        System.out.println(strarray[0]);

    }

    /*
    * 数组元素默认初始化值
    * 数组元素是引用类型时初始化值为 null
    *
    * */
    @Test
    public void ArrayTest2(){
        String[] as = new String[1];
        for (int i = 0; i < as.length; i++) {
            System.out.println("String类型数组默认值: "+as[i]);
        }

        int[] as1 = new int[1];
        for (int i = 0; i < as1.length; i++) {
            System.out.println("int数组默认值为："+as1[i]);
        }

        boolean[] at = new boolean[1];
        for (int i = 0; i <at.length ; i++) {
            System.out.println("boolean数组类型的默认值是: "+at[i]);
        }
        short[] sr = new short[1];
        for (int i = 0; i < sr.length; i++) {
            System.out.println("short数组类型的默认值是: "+sr[i]);
        }
        char[] cr = new char[1];
        for (int i = 0; i < cr.length; i++) {
            System.out.println("char数组默认初始化值是："+cr[i]);
        }

    }

    /*一维数组练习*/
    @Test
    public void ArrayTest3(){
        int[] arr = new int[]{3,2,1,0,3,9,5,7};
        int[] index = new int[]{2,0,2,3,5,0,0,5,6,6,7};
        String Til ="";
        for (int i = 0; i < index.length; i++) {
            Til += arr[index[i]];
        }
        System.out.println("联系方式是:"+Til);
    }
}
