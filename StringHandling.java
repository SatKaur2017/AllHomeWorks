package SampleClass;
public class StringHandling {
    public static void main(String[] args) {
        String mystr = "Selenium1";// String variable
        String mystr2 = "SELENIUM TESTING TOOL";
        String mystr3= "SELENIUM";
        String mystr4 = "  selenium Testing tool is the nice tool  ";
        String mystr11=" Testing"; //String variable
        String[] mystr1 = {"fname", "lastname", "stuID"};  //array of string
        swap the elements of string into another string
        String temp = mystr;
		mystr = mystr2;
        mystr2 = temp;
        string concatenation
        String+ string = concatenation
        string + Integer = Concatenation
        Integer+Integer = Addition
        1) System.out.println("Selenium" + " Testing");//selenium Testing
        2) System.out.println("Selenium" + 1 + 10);// Selenium110 string addition with integer is concatenation
        3) System.out.println(1 + 1+ "Selenium");// 2 Selenium integers addition is first then string concatenation
        4) System.out.println(mystr + ","+ (2+2));// Selenium,4 parenthesis addition first
        5) System.out.println("1"+ 1+ "Selenium");// 11selenium string concatenation with integer
        6) System.out.println(mystr == mystr2);//false--2-way comparison
        7) System.out.println(mystr3 == mystr2);//true--2-way comparison
        8) System.out.println(mystr3.equals(mystr2));//true--2-way comparison with method
        9) System.out.println(mystr3.equals(mystr));//false--2-way comparison with method
        10) System.out.println(mystr3.compareTo(mystr4));//-32 a-z=97-122 & A-Z =65-90;
        11) System.out.println(mystr3.compareTo(mystr11));//51
        12) System.out.println(mystr);//mystr=SELENIUM and mystr11=selenium
        13) System.out.println(mystr.length());//no of elements in string ==8 SELENIUM
        14) System.out.println(mystr.charAt(0));//to find the position of char in string
        15)  System.out.println(mystr.charAt(mystr.length()-1));//to find last variable in string
        16) System.out.println(mystr.indexOf("SELENIUM"));//position of occurrence of string in address
        17) System.out.println(mystr.substring(0,3));//SEL--
        18) System.out.println(mystr.substring(mystr.length()-3));//to find last three words in string
        19) System.out.println(mystr.contains("SELENIUM"));//BOOLEAN
        20) System.out.println(mystr.isEmpty());//Returns true if, and only if, length() is 0.
        21) System.out.println(mystr.equalsIgnoreCase(mystr4));//Returns true Compares this String to another String, ignoring case considerations.
        22) System.out.println(mystr4.compareToIgnoreCase(mystr11));//83--Compares two strings lexicographically, ignoring case differences
        23) System.out.println(mystr11.startsWith("Testing"));
        24) System.out.println(mystr4.lastIndexOf(mystr11));*/
        25) System.out.println(mystr4);        // without trim()
        26) System.out.println(mystr4.trim()); // with trim()---selenium testing tool
        27) Java String toLowerCase()
        28) 	String str=mystr2.toLowerCase(); // all cases lower cases 
				System.out.println(str);
        29) 	for (String str : mystr1) {
            //System.out.println(str);}
        30) //Java String toUpper()
				String s1upper=mystr4.toUpperCase();//SELENIUM TESTING TOOL IS THE NICE TOOL
				System.out.println(s1upper);
        31) //Java String replace()
				String replaceString=mystr4.replace('t','p');
				System.out.println(replaceString);
        32)// Java String endsWith()
				System.out.println(mystr3.endsWith("u")); //false
        33)// Java StringGetBytes()
				byte[] b=mystr3.getBytes(); //83,69,76,69,78,73,85,77
				for(int i=0;i<b.length;i++){
				System.out.println(b[i]);
        34) //Java Convert String to Double using Double.parseDouble(String)
				String mystr22="122.202";  //122.202
				double var= Double.parseDouble(mystr22);
				System.out.println(var);
        35)//Java Convert String to Double using Double.valueOf(String)
				String str2 = "122.111";//122.111
				double var2 = Double.valueOf(str2);
				System.out.println(var2);
        36) //Convert String to int using Integer.parseInt(String)
				String str3="1234"; //1234
				int num3 = Integer.parseInt(str3);
				System.out.println(num3);
        37) // Method 1: Using String.valueOf(long l): a long value as argument and returns a string representation of it.
				long lvar = 123;
				String str33 = String.valueOf(lvar);//123
				System.out.println(str33);
      }
    }