public class DrawFigures1 {
public static void main(String[] args) {
//<!--This is a comment/reminder to decompose this file-->

	down();
	 System.out.println();
	down();
	up();
	 System.out.println();
	up();
	flag();
	up();

       
  
    }
	
	public static void up() {
		System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
	}
	public static void down() {
	    System.out.println(" \\    /");
        System.out.println("  \\  /");
        System.out.println("   \\/");
	}
	public static void flag() {
	    System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
        System.out.println("|United|");
        System.out.println("|States|");
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
	}
}
