public class c2 extends p2{
	
	static c1 twin1;
	static c3 twin2;
	
	static int count = 0;
	
	public c2(){
		if(count == 0){
			count++;
			twin1 = new c1();
			twin2 = new c3();
		}
	}
	
	public void foo(){
		twin1.foo();
	}
	
	public void fun(){
		twin2.fun();
	}
	
	
}
