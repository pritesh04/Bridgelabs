package JavaPackage;

public class Equality {
	public static void main(String[] args) {
		int a=12,b=14,c=23,d=43,e=21,f=32,g=65,h=96;
		int len1=(int) Math.sqrt((b-a)^2+(d-c)^2);
		int len2=(int) Math.sqrt((f-e)^2+(h-g)^2);
		System.out.println(Integer.toString(len1).equals(Integer.toString(len2)));
		System.out.println(Integer.toString(len1).compareTo(Integer.toString(len2)));
		System.out.println(len1 + "    " +len2); 
		int z= Integer.toString(len1).compareTo(Integer.toString(len2));
		if(z==0)
			System.out.println("Lines are equall");
		else if(z>0)
			System.out.println("Length 1 is greater");
		else
			System.out.println("Length 2 is greater");
		
	}

}

