/* ���ߣ�bbird_gl
 * ���ܣ���ӡ�οս�����
 * ���ڣ�2019/5/16
 */
 
 public class Demo4 {
     public static void main(String argv[]) {
         int layer = 8;
         int i, j;
         for (i = 1; i <= layer; i++)
        {
            /* ��ӡ�ո� */
            for (j = 1; j <= (layer - i); j++)
                System.out.print(' ');
            
            /* ��ӡ�Ǻ� */
            for (j = 1; j <= (2 * i - 1); j++) {
                //�жϸò��Ƕ��㻹�ǵײ�
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
    
            /* ��ӡ���� */
            System.out.println();
        }

     }
 }