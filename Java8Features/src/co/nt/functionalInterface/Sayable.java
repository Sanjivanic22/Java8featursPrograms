package co.nt.functionalInterface;
@FunctionalInterface
public interface Sayable {
void say(String msg);
public class FunctionalInterfaceEX implements Sayable{

	
	public void say(String msg) {
		System.out.println(msg);
		
	}
	public static void main(String[] args) {
		FunctionalInterfaceEX fie= new FunctionalInterfaceEX();
fie.say("Hello sanju");
	}

}}
