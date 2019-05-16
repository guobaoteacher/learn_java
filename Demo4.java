/* 作者：bbird_gl
 * 功能：打印镂空金字塔
 * 日期：2019/5/16
 */
 
 public class Demo4 {
     public static void main(String argv[]) {
         int layer = 8;
         int i, j;
         for (i = 1; i <= layer; i++)
        {
            /* 打印空格 */
            for (j = 1; j <= (layer - i); j++)
                System.out.print(' ');
            
            /* 打印星号 */
            for (j = 1; j <= (2 * i - 1); j++) {
                //判断该层是顶层还是底层
                if (i == 1 || i == layer)
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
    
            /* 打印空行 */
            System.out.println();
        }

     }
 }