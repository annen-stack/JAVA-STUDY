package day06对象;

public class Test01Phone {
	public static void main(String[] args) {
		Phone p = new Phone();
		
		p.brand="锤子";
		p.color="棕色";
		p.price=1999;
		
		p.call("紫霞");
		p.sendMessage();
	}

}
