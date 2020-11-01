public class CellPhoneTester{
public static void main(String[] Note)
{
System.out.println("JVM invoked main");
System.out.println("main method args length"+Note.length);
String documents="Marks cards";
CellPhone.storing(documents);
CellPhone.storing(documents,20);
CellPhone.storing(documents,"WhatsApp");
CellPhone.storing(20,documents);

System.out.println("EXIT :: main");
}
}
	
