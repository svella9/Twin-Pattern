public class c2 extends p2{
	
	c1 twin1;
	c3 twin2;
	
	
	public void check(){
		if(twin1 == null || twin2 == null){
			twin1 = new c1();
			twin2 = new c3();
		}
	}
	
	public void foo(){
		check();
		twin1.foo();
	}
	
	public void fun(){
		check();
		twin2.fun();
	}
	
	
}
