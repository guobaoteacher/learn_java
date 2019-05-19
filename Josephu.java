/**
 * @author bbird_gl
 * @date 2019-5-19
 * @function ����������
 */
public class Josephu {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CycleLink link = new CycleLink();
		link.setLen(5);
		link.createLink();
		link.setK(2);
		link.setM(2);
		link.show();
		link.play();
	}

}

//С���ڵ�
class Child {
	int num;
	Child nextChild = null;
	
	public Child(int num)
	{
		this.num = num;
	}
}

//��������
class CycleLink {
	Child head = null;
	Child cur = null;
	Child pre = null;
	int len = 0;
	int k = 0;
	int m = 0;
	
	//���ó���
	public void setLen(int len)
	{
		this.len = len;
	}
	
	//���ô�k���˿�ʼ����
	public void setK(int k)
	{
		this.k = k;
	}
	
	//��������m���˳���
	public void setM(int m)
	{
		this.m = m;
	}
	
	//��ʼ��������Ϸ
	public void play()
	{
		cur = head;
		//�ҵ����Ϊk���˿�ʼ����
		for(int i = 1; i < k; i++)
		{
			cur = cur.nextChild;
			pre = pre.nextChild;
		}
		
		while(len != 1)
		{
			//����m
			for(int j = 1; j < m; j++)
			{
				cur = cur.nextChild;
				pre = pre.nextChild;
			}
			
			//����
			pre.nextChild = cur.nextChild;
			cur = pre.nextChild;
			len--;
		}
		System.out.print("�����е��ǣ�"+cur.num);
	}
	
	//����ѭ������
	public void createLink()
	{
		for(int i = 1; i <= len; i++)
		{
			//��һ��С���ڵ�
			if (i == 1)
			{
				Child ch = new Child(i);
				head = ch;
				cur = ch;
			}
			else
			{
				Child ch = new Child(i);
				cur.nextChild = ch;
				cur = cur.nextChild;
				//���һ��С���ڵ�
				if (i == len)
				{
					cur.nextChild = head;
					pre = cur;
				}
			}
		}
	}
	
	//��ӡѭ������������֤ѭ�������Ƿ񴴽��ɹ�
	public void show()
	{
		cur = head;
		do
		{
			System.out.print(cur.num+" ");
			cur = cur.nextChild;
		}while(cur != head);
	}
}