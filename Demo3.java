/* ���ߣ�bbird_gl
 * ���ܣ���ӡ������
 * ���ڣ�2019/5/16
 */
public class Demo3 {
    public static void main(String argv[]) {
        //�������������
        int layer = 4;
        int i, j;
        for (i = 1; i <= layer; i++)
        {
            //��ӡ�ո�
            for (j = 1; j <= (layer - i); j++)
                System.out.print(' ');
            //��ӡ�Ǻ�
            for (j = 1; j <= (2 * i - 1); j++)
                System.out.print('*');
            //����
            System.out.println();
        }
    }
}