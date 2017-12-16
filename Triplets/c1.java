public class c1 extends p1{

	static c2 twin1;
	static c3 twin2;
	
	static int count = 0;
	
	public c1(){
		if(count == 0){
			count++;
			twin1 = new c2();
			twin2 = new c3();
		}
	}
	
	public void bar(){
		twin1.bar();
	}
	
	public void fun(){
		twin2.fun();
	}

}
