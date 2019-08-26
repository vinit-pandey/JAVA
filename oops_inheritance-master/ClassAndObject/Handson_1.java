import java.util.*;
class Box{
	
	int hight,width,depth;
	Box(int hight,int width,int depth)
	{
		this.hight = hight;
		this.width = width;
		this.depth = depth;
	}
	
	int volume()
	{
		return hight*width*depth;
	}
}
public class Handson_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hight: ");
		int hight = sc.nextInt();
		System.out.println("Enter Width: ");
		int width = sc.nextInt();
		System.out.println("Enter Depth: ");
		int depth = sc.nextInt();
		
		Box box = new Box(hight,width,depth);
		
		System.out.println("The Volume of the Box is : "+box.volume());

	}

}