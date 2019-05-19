/**
 * @author bbird_gl
 * @date 2019-5-19
 * @function 丢手帕问题
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

//小孩节点
class Child {
	int num;
	Child nextChild = null;
	
	public Child(int num)
	{
		this.num = num;
	}
}

//环形链表
class CycleLink {
	Child head = null;
	Child cur = null;
	Child pre = null;
	int len = 0;
	int k = 0;
	int m = 0;
	
	//设置长度
	public void setLen(int len)
	{
		this.len = len;
	}
	
	//设置从k个人开始数数
	public void setK(int k)
	{
		this.k = k;
	}
	
	//设置数到m的人出列
	public void setM(int m)
	{
		this.m = m;
	}
	
	//开始丢手帕游戏
	public void play()
	{
		cur = head;
		//找到编号为k的人开始报数
		for(int i = 1; i < k; i++)
		{
			cur = cur.nextChild;
			pre = pre.nextChild;
		}
		
		while(len != 1)
		{
			//数到m
			for(int j = 1; j < m; j++)
			{
				cur = cur.nextChild;
				pre = pre.nextChild;
			}
			
			//出列
			pre.nextChild = cur.nextChild;
			cur = pre.nextChild;
			len--;
		}
		System.out.print("最后出列的是："+cur.num);
	}
	
	//创建循环链表
	public void createLink()
	{
		for(int i = 1; i <= len; i++)
		{
			//第一个小孩节点
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
				//最后一个小孩节点
				if (i == len)
				{
					cur.nextChild = head;
					pre = cur;
				}
			}
		}
	}
	
	//打印循环链表，用来验证循环链表是否创建成功
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