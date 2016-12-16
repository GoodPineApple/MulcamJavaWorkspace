
/*
 01_01. Student, GraduateStudent
 01_02. 
 Student
 -------------------------
 -number : int
 -name : String
 -------------------------
 
 GraduateStudent
 -------------------------
 -lab : String
 -------------------------
 
 
 01_03. int number, String name, String lab
		public void setNumber(number) {
			this.number = number;
		}
		public int getNumber() {
			return number;
		}
		
		public void setName(name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		
		public void setLab(lab) {
			this.lab = lab;
		}
		public String getLab() {
			return lab;
		}
01_04. public Student(int number, String name) {
			this.number = number;
			this.name = name;
		}
		
		public GraduateStudent(int number, String name, String lab) {
			super(number, name);
			this.lab = lab;
		}
01_05. 1) s.setNumber = 10;

02_01. public void methodTwo(int i) {  }
02_02. public static void methodFour(int i) {  }
02_03. 
class ClassA {
	public void methodOne(int i) {  }
	public void methodTwo(int i) {  }
	public void methodThree(int i) {  }
	public static void methodFour(int i) {  }
}


class ClassB extends ClassA {
	public void methodOne(int i) {  }
	public void methodTwo(int i) {  }
	public void methodThree(int i) {  }
	public static void methodFour(int i) {  }
}

03_01. expands -> extends
	   gear = g -> Bike 클래스에서 private 변수로 선언했기에 설정 불가. setter를 활용해야함 

04_01.  동물입니다: Brave
		사자입니다.
		동물입니다: UNKNOWN
		사자입니다.
		
 */