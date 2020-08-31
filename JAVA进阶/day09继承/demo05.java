package day09继承;
/*
 * 子类中出现与父类一模一样的方法时（返回值类型，方法名和参数列表都相同），会出现覆盖效
果，也称为重写或者复写。声明不变，重新实现。
 */
class Phone{
	public void sendMessage() {
		System.out.println("发短信");
	}
	public void call() {
		System.out.println("打电话");
	}
	public void showNum() {
		System.out.println("来电显示号码");
	}
}
class NewPhone extends Phone{
	public void showNum() {
		super.showNum();
		System.out.println("显示来电姓名");
		System.out.println("显示头像");
	}
}
public class demo05 {
	public static void main(String[] args) {
		NewPhone np = new NewPhone();
		np.call();
		np.showNum();
		
	}

}
