package java_class;

import java.util.Scanner;

public class Ch7Qz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		box box1 = new box();
		box box2 = new box();
		
		System.out.print("첫 번째 박스 넓이: ");
		box1.width = sc.nextInt();
		System.out.print("첫 번째 박스 길이: ");
		box1.length = sc.nextInt();
		System.out.print("첫 번째 박스 높이: ");
		box1.height = sc.nextInt();
		
		System.out.print("두 번째 박스 넓이: ");
		box2.width = sc.nextInt();
		System.out.print("두 번째 박스 길이: ");
		box2.length = sc.nextInt();
		System.out.print("두 번째 박스 높이: ");
		box2.height = sc.nextInt();
		
		
		if(box1.surface()>box2.surface())
		{
			System.out.println("큰 박스 면적,가로,세로,높이 ");
		    System.out.print(box1.surface() + " ");
		    System.out.print(box1.width + " ");
		    System.out.print(box1.length+ " ");
		    System.out.print(box1.height+ " ");
		    System.out.println("");
			System.out.println("작은 박스 면적,가로,세로,높이 ");
		    System.out.print(box2.surface()+ " ");
		    System.out.print(box2.width + " ");
		    System.out.print(box2.length+ " ");
		    System.out.print(box2.height+ " ");
		    System.out.println("");
	   }else if(box1.surface() < box2.surface())
	   {
			System.out.println("큰 박스 면적,가로,세로,높이 ");
		    System.out.print(box2.surface() + " ");
		    System.out.print(box2.width + " ");
		    System.out.print(box2.length+ " ");
		    System.out.print(box2.height+ " ");
		    System.out.println("");
			System.out.println("작은 박스 면적,가로,세로,높이 ");
		    System.out.print(box1.surface() + " ");
		    System.out.print(box1.width + " ");
		    System.out.print(box1.length+ " ");
		    System.out.print(box1.height+ " ");
		    System.out.println("");
	   }else
	   {
		   System.out.println("면적이 같습니다. ");
	   }
		if(box1.volume()>box2.volume())
		{
			System.out.println("큰 박스 부피,가로,세로,높이 ");
		    System.out.print(box1.volume() + " ");
		    System.out.print(box1.width + " ");
		    System.out.print(box1.length+ " ");
		    System.out.print(box1.height+ " ");
		    System.out.println(" ");
			System.out.println("작은 박스 부피,가로,세로,높이 ");
		    System.out.print(box2.volume()+ " ");
		    System.out.print(box2.width + " ");
		    System.out.print(box2.length+ " ");
		    System.out.print(box2.height+ " ");
		    System.out.println(" ");
	   }else if(box1.volume() < box2.volume())
	   {
			System.out.println("큰 박스 넓이,가로,세로,높이 ");
		    System.out.print(box2.volume() + " ");
		    System.out.print(box2.width + " ");
		    System.out.print(box2.length+ " ");
		    System.out.print(box2.height+ " ");
		    System.out.println(" ");
			System.out.println("작은 박스 넓이,가로,세로,높이 ");
		    System.out.print(box1.volume());
		    System.out.print(box1.width + " ");
		    System.out.print(box1.length+ " ");
		    System.out.print(box1.height+ " ");
		    System.out.println(" ");
	   }else
	   {
		   System.out.println("넓이가 같습니다. ");
	   }
		
		sc.close();
		   
		   
	   }
	
	

}

class box{
	int width;
	int length;
	int height;
	
	int surface()
	{
		return (2*length*width)+(2*length*height)+(2*height*width);
	}
	
	int volume()
	{
		return width*length*height;
	}
	
}
