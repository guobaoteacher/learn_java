/* 作者：bbird_gl
 * 功能：打印金字塔
 * 日期：2019/5/16
 */
public class Demo3 {
    public static void main(String argv[]) {
        //定义金字塔层数
        int layer = 4;
        int i, j;
        for (i = 1; i <= layer; i++)
        {
            //打印空格
            for (j = 1; j <= (layer - i); j++)
                System.out.print(' ');
            //打印星号
            for (j = 1; j <= (2 * i - 1); j++)
                System.out.print('*');
            //换行
            System.out.println();
        }
    }
}