public class Wrapper{
public static void main(String[] args)
{
System.out.println("JVM invoked main method");
System.out.println("The Program will convert String to number");

 String alphabetsInEnglish="26";
 byte convertedAlphabetsInEnglish=Byte.parseByte(alphabetsInEnglish);
 System.out.println("converted byte: "+convertedAlphabetsInEnglish);
 
 String statesOfKarnataka="29";
 short convertedStatesOfKarnataka=Short.parseShort(statesOfKarnataka);
 System.out.println("converted short: "+convertedStatesOfKarnataka);
 
 String secondsInADay="86400";
 int convertedSecondsInADay=Integer.parseInt(secondsInADay);
 System.out.println("converted int: "+convertedSecondsInADay);
 
 String numberOfOrpansInIndia="29600000";
 long convertedNumberOfOrpansInIndia=Long.parseLong(numberOfOrpansInIndia);
 System.out.println("converted long: "+convertedNumberOfOrpansInIndia);
 
 String valueOfRootThree="1.732f";
 float convertedValueOfRootThree=Float.parseFloat(valueOfRootThree);
 System.out.println("converted float: "+convertedValueOfRootThree);
 
 String valueOfPi="3.141592653589793238";
 double convertedValueOfPi=Double.parseDouble(valueOfPi);
 System.out.println("converted double: "+convertedValueOfPi);
 
 String twoIsAPrimeNumber="true";
 boolean convertedTwoIsAPrimeNumber=Boolean.parseBoolean(twoIsAPrimeNumber);
 System.out.println("converted boolean: "+convertedTwoIsAPrimeNumber);
 
 String grade="B";
 char convertedGrade=grade.charAt(0);
 System.out.println("converted char: "+convertedGrade);
 
 System.out.println("Exit :: main");
 }
 }
  