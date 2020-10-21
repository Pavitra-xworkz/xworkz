public class Score{
public static void main(String[] marks)
{
arrayOfPercentage();
}
public static void arrayOfPercentage()
{
	float percentageOfSslc=93.28f;
	float percentageOfPuc=80.83f;
	float percentageOfGraduation=74.8f;
	float[] percentages={percentageOfSslc,percentageOfPuc,percentageOfGraduation};
int countOfArray=percentages.length;
System.out.println("The length of Array is" + countOfArray);
float elementAtIndex1=percentages[0];
float elementAtIndex2=percentages[1];
float elementAtIndex3=percentages[2];

System.out.println("The element at index one is: " + percentages[0]); 
System.out.println("The element at index two is: " + percentages[1]); 
System.out.println("The element at index three is: "+ percentages[2]); 

}
}