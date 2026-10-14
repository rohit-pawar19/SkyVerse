package com.itvedant.basic;

public class Variables {
	
	
	static String name="rohit";
	public static void main(String[] args) {
		int a=10;
		System.out.println(a);
		float b=20.77f;
		System.out.println(b);
		String firstName="rohit";
		
		int c=30,d=40,e=50;
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		InstanceVariables var=new InstanceVariables();
		var.display();
		
		Variables v=new Variables();
		System.out.println(name);
		Relational r=new Relational();
		r.display();
		
		
		Shorthand sh=new Shorthand();
		sh.display();
	}

}
class InstanceVariables{
	char ch='p';
	void display() {
		System.out.println(ch);
	}
}
class Relational {
	void display() {
		int a=10,b=20;
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a!=b);

	
	
	
	}


}

class Shorthand{
	void display() {
		int a=10;
		int b=20;
		a+=20;
		a+=b;
		
		a-=5;
		System.out.println(a);	
		int c=5;
		int d=3;
		System.out.println(c|d);
		System.out.println(~d);
		
		int p=9,q=3,r=5;
		int res=p++ + --r +q++ - --p-++q;
		System.out.println(res);
	}
}

