package day10¶àÌ¬;

class KeyBoard implements USB {
	public void open() {
		System.out.println("¼üÅÌ¿ªÆô£¬ÂÌµÆÉÁÒ»ÉÁ");
	}
	public void close() {
		System.out.println("¼üÅÌ¹Ø±Õ£¬ÂÌµÆÏ¨Ãğ");
	}
	public void type(){
		System.out.println("¼üÅÌ´ò×Ö");
	}
}
