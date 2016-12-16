package test02;

//import test01.A;
//import test01.D;
import test01.*; //test01의 모든 클래스들을 import, A-D 모두 import, 하지만 B는 제외, 하위패키지는 제외  
import test01.test_1.B;

public class C { //test01의 패키지들을 import, 동일 패키지내의 객체들 생성 
	private A a = new A();
	private B b;
	private D d;
}
