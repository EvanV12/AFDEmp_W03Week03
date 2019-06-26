package p07PasparakisLesson;

public class LovelyHome {

	
	public LovelyHome() {										//default constructor - δεν παιρνει παραμετρους
		// TODO Auto-generated constructor stub
		System.out.println("My Lovely Home");
		class AClass {
			AClass() {
				System.out.println("AClass");
			}
		}
		
	}
	
	public LovelyHome(String msg) {
		// TODO Auto-generated constructor stub
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		LovelyHome aGirlyHome = new LovelyHome();
		LovelyHome aGirlyHome2 = new LovelyHome("A Home!");			//instanciation
		//System.out.println(aGirlyHome);
	}

}
