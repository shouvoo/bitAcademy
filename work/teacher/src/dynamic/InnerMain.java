package dynamic;

class Outer
{
	int a =10;
	static int d =40;
	
	
	////1. �Ϲ��̳�Ŭ����
	class Inner
	{
		int b = 200;
		int aa = a;
		public Inner() {
			// TODO Auto-generated constructor stub
			System.out.println("Inner ������");
		}
	}
	
	////2.static �̳�Ŭ����
	static class InnerSt{
		int c = 30000;
		//int aa = a;
		int dd = d;
		public InnerSt() {
			// TODO Auto-generated constructor stub
			System.out.println("StInner ������");
		}
	}
	
	
	//int bb = b;
	public Outer() {
		// TODO Auto-generated constructor stub
		System.out.println("Outer ������");
	}
	
	
	void meth()
	{
		int mx =1234;
		
		
		////3.local �̳�Ŭ����
		class InnerLocal{
			public InnerLocal() {
				// TODO Auto-generated constructor stub
				System.out.println("InnerLocal ������");
			}
			int e = 5050;
			int aaa = a;
			
			int mmxx = mx;
		}
		
		InnerLocal il = new InnerLocal();
		
		System.out.println("il.e:"+il.e);
		System.out.println("il.aaa:"+il.aaa);
		System.out.println("il.mmxx:"+il.mmxx);
		
	}
}


class IIChild extends Outer.Inner
{
	public IIChild() {
		// TODO Auto-generated constructor stub
		new Outer().super();
		System.out.println("IIChild ������");
		
	}
}

public class InnerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer oo = new Outer();
		System.out.println("-------------------");
		//Inner ii = new Inner();
		//Inner ii = oo.new Inner();
		Outer.Inner ii = oo.new Inner();
		System.out.println("-------------------");
		//Outer.InnerSt is = new InnerSt();
		Outer.InnerSt is = new Outer.InnerSt();
		
		
		//is = oo.InnerSt();
		
		System.out.println("-------------------");
		IIChild cc = new IIChild();
		System.out.println("-------------------");
		
		
		///4. �͸� �̳�Ŭ����
		Outer ooAno = new Outer() {
			@Override
			void meth() {
				// TODO Auto-generated method stub
				System.out.println("������ ������ meth()");
			}
		};
		
		
		
		System.out.println("oo.a:"+oo.a);
		//System.out.println("oo.b:"+oo.b);
		//System.out.println("ii.a:"+ii.a);
		System.out.println("ii.b:"+ii.b);
		System.out.println("ii.aa:"+ii.aa);
		System.out.println("is.c:"+is.c);
		System.out.println("is.dd:"+is.dd);
		System.out.println("-------------------");
		oo.meth();
		System.out.println("-------------------");
		ooAno.meth();

	}

}

///// �߱����� �����ϼ���
///�����- ������, ������, �轺��, ������(�ֹ��� �޾� �̸� ���� ��ǰ�� �ش�)
///Ȧ�� : ��ǰ - ¥���, «��, ���, �ܹ��� (�ֹ��� �޾� Ȧ�� �ش�)

///����� �����, ����� �ȱ�, Ȧ �ֹ�
///








