import java.util.Scanner;
import static java.lang.System.out;
public class Main {

	public static void main(String[] args) 
	{
		Integer value;
	System.out.println("Enter an integer");
	
	Scanner sc=new Scanner(System.in);
	value=sc. nextInt();
	out.println("The binary equivalent of "+value+" is "+Integer.toBinaryString(value));
	out.println("The hexadecimal equivalent of "+value+" is "+Integer.toHexString(value));
	out.println("The octal equivalent of "+value+" is "+Integer.toOctalString(value));
	out.println("Byte value of "+value+" is "+value.byteValue());
	out.println("Short value of "+value+" is "+value.shortValue());
	out.println("Long value of "+value+" is "+value.longValue());
	out.println("Float value of "+value+" is "+value.floatValue());
	out.println("Double value of "+value+" is "+value.doubleValue());
	}

}




