/* ���ߣ�bbird_gl
 * ���ܣ���ӡ�ο�����
 * ���ڣ�2019/5/16
 */
 
 public class Demo5 {
     public static void main(String argv[]) {
        //�������β���
        int layer = 5;
        int i, j;
        int half = layer/2;
        //��ӡ��������
        for (i = 1; i <= half + 1; i++)
        {
            //��ӡ�ո�
            for (j = 1; j <= (half + 1 - i); j++)
                System.out.print(' ');
            //��ӡ�Ǻ�
            for (j = 1; j <= (2 * i - 1); j++)
            {
                //��һ��
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
                
            //����
            System.out.println();
        }
        //��ӡ��������
        for (i = 1; i <= half; i++)
        {
            //��ӡ�ո�
            for (j = 1; j <= i; j++)
               System.out.print(' ');
            //��ӡ�Ǻ�
            for (j = 1; j <= (2 * (half - i) + 1); j++)
            {
                //���һ��
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
            //����
            System.out.println();
            
        }
     }
 }