/* 作者：bbird_gl
 * 功能：打印镂空菱形
 * 日期：2019/5/16
 */
 
 public class Demo5 {
     public static void main(String argv[]) {
        //定义菱形层数
        int layer = 5;
        int i, j;
        int half = layer/2;
        //打印正金字塔
        for (i = 1; i <= half + 1; i++)
        {
            //打印空格
            for (j = 1; j <= (half + 1 - i); j++)
                System.out.print(' ');
            //打印星号
            for (j = 1; j <= (2 * i - 1); j++)
            {
                //第一行
                if (i == 1)
                {
                    System.out.print('*');
                }
                else
                {
                    if (j == 1 || j == (2 * i - 1))
                        System.out.print('*');
                    else
                        System.out.print(' ');
                }
            }
                
            //换行
            System.out.println();
        }
        //打印倒金字塔
        for (i = 1; i <= half; i++)
        {
            //打印空格
            for (j = 1; j <= i; j++)
               System.out.print(' ');
            //打印星号
            for (j = 1; j <= (2 * (half - i) + 1); j++)
            {
                //最后一行
                if (i == half)
                    System.out.print('*');
                else
                {
                    if (j == 1 || j == (2 * (half - i) + 1))
                        System.out.print('*');
                    else
                        System.out.print(' ');
                }
            }
            //换行
            System.out.println();
            
        }
     }
 }