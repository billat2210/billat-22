package test0202;

public class test02 {
    public static void main(String[] args) {
		Foo foo=new Foo();
        Thread t1 = new Thread() {
			public void run(){
                foo.dosome();
            }
		};
		Thread t2 = new Thread() {
			public void run(){
                foo.dosome();
            }
		};
		t1.start();
		t2.start();
    }
}
class Foo{
    public static void dosome() {
		synchronized (Foo.class) {
			System.out.println("hello!");
		}
    }
}
