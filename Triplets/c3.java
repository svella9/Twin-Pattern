public class c3 extends p3{
	
	static c1 twin1;
	static c2 twin2;
	
	static int count = 0;
		
	public c3(){
		if( count == 0){
			count++;
			twin1 = new c1();
			twin2 = new c2();
			
		}
	}
	
	public void foo(){
		twin1.foo();
	}
	
	public void bar(){
		twin2.bar();
	}
	
		
}
