package co.nt.functionalInterface;
@FunctionalInterface
interface Sayable1{
	void say(String msg);
	//it can contain any no of object class methods
	int hashCode();
	String toString();
}
public class FunctionalEx1 implements Sayable1{

	public void say(String msg) {
		System.out.println(msg);
	}
	public static void main(String[] args) {
		FunctionalEx1 f=new FunctionalEx1();
		f.say("Hello sanju");
	}
}
