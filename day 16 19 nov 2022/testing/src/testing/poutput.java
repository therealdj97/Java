package testing;
public class output
    {
        public static void main(String args[])
        {
            char c[]={'a','1','b',' ','A','0'];
            for (int i = 0; i < 5; ++i)
            {
	        if(Character.isDigit(c[i]))
                    System.out.println(c[i]" is a digit");
                if(Character.isWhitespace(c[i]))
                   System.out.println(c[i]" is a Whitespace character");
                if(Character.isUpperCase(c[i]))
                   System.out.println(c[i]" is an Upper case Letter");
                if(Character.isUpperCase(c[i]))
                   System.out.println(c[i]" is a lower case Letter");
                i = i + 3;
            }
        }
    }