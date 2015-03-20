 import java.util.Scanner;
 public class num7{
 
 public static int totalNum = 0;
      
		public static void main (String args []){
			Scanner s = new Scanner(System.in);
			System.out.print("How many numbers do you have?");
			totalNum = s.nextInt();
			
			if(totalNum > 0){

         System.out.print("Number"+" "+1+"?");
			int firstNum = s.nextInt();
			int min = firstNum;
			int max = firstNum;
			
			for(int i = 1; i <= totalNum-1; i++){
				System.out.print("Number"+" "+(i+1)+"?");
				int next= s.nextInt();
				
            if(next>max){
            max=next;
            }
            }

			System.out.println("Max:"+max);
		}
	}
}
