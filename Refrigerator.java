
public class Refrigerator{
public static void main(String[] mail)
{
arrayOfEmail();
}
public static void arrayOfEmail()
{
	String contactEmail="contact@xworkz.in";
	String subscribeEmail="subscribe@xworkz.in";
	String hrEmail="hr@xworkz.in";
	String[] emails={contactEmail,subscribeEmail,hrEmail,"querry@xworkz.in"};
int countOfArray=emails.length;
System.out.println("The length of Array is " + countOfArray);
String elementAtIndex1=emails[1];
String elementAtIndex2=emails[2];
String elementAtIndex3=emails[3];

System.out.println("The element at index one is: " + emails[1]); 
System.out.println("The element at index two is: " + emails[2]); 
System.out.println("The element at index three is:"+ emails[3]); 

}
}