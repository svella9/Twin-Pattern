public class c3 extends p3{
	
	c1 twin1;
	c2 twin2;
		
	public void check(){
		if( twin1 == null || twin2 == null){
			twin1 = new c1();
			twin2 = new c2();
			
		}
	}
	
	public void foo(){
		check();
		twin1.foo();
	}
	
	public void bar(){
		check();
		twin2.bar();
	}
	
		
}
