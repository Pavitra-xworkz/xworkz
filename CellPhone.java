public class CellPhone{
public static void storing(String information)
{
System.out.println("invoked storing");
System.out.println("arg information: "+information);
}
public static void storing(String documents,String noOfApps)
{
System.out.println("invoked storing with two parameters");
System.out.println("String and String");
System.out.println("arg1 documents"+documents);
System.out.println("arg2 noOfApps"+noOfApps);
}
public static void storing(String documents,int noOfApps)
{
System.out.println("invoked storing with two   parameters");
System.out.println("String and int");
System.out.println("arg1 documents"+documents);
System.out.println("arg2 noOfApps"+noOfApps);
}
public static void storing(int noOfApps,String documents)
{
System.out.println("invoked storing with two   parameters");
System.out.println("int and String");
System.out.println("arg1 noOfApps"+noOfApps);
System.out.println("arg2 documents"+documents);
}
}


