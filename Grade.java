public class Grade{
public static void main(String[] args)
{
arrayOfGrade();
}
public static void arrayOfGrade()
{
char marksBetween1To10='A';
char marksBetween11To20='B';
char marksBetween21To30='C';
char marksBetween31To40='D';
char marksBetween41To50='E';
char marksBetween51To60='F';
char marksBetween61To70='G';
char marksBetween71To80='H';
char marksBetween81To90='I';
char marksBetween91To100='J';
char marksBetween101To110='K';

char[] allmarks = { marksBetween1To10,marksBetween11To20,marksBetween31To40,marksBetween41To50,marksBetween51To60,marksBetween61To70,marksBetween71To80,marksBetween81To90,marksBetween91To100,marksBetween101To110};

int countOfArray=allmarks.length;
System.out.println("The length of Array is " + countOfArray);
char elementAtIndex1=allmarks[1];
System.out.println("marksbetween 31 to 40 represented in group: " + elementAtIndex1);
System.out.println("marks between 71 to 80 represented in group: " + allmarks[6]);

System.out.println("number of marks between 101 to 110 represented in group: " + allmarks[9]);


}
}