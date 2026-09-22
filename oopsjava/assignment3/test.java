package collect;

interface test {
 default void  hello() {
	 System.out.println("hello");
 }
}
interface interface3 extends test{
	@Override
	default void hello() {
		System.out.println("hellow pooja");
	}
}

public class test implements test,interface3{
		
}