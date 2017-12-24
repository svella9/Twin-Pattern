public class c1 extends p1{

	c2 twin1;
	c3 twin2;
	
	public void check(){
		if(twin1 == null || twin2 == null){
			twin1 = new c2();
			twin2 = new c3();
		}
	}
	
	public void bar(){
		check();
		twin1.bar();
	}
	
	public void fun(){
		check();
		twin2.fun();
	}

}
