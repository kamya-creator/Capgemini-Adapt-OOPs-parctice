// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Validator
{
    public String checkComment(String comment) throws SpamCommentException
    {
        List<String> al = Arrays.asList(new String[] {"abcde", "lmno", "pqrst","wxyz"});
        String[] s = comment.split(" ");
        int count =0,index=0;
        System.out.println("Krishna" + s);
        for(String s1 : s)
        {   
            System.out.println(s1 + "Radhe");
            if(al.contains(s1))
            count++;
        }
        System.out.println("Count"+count);
        if(count>=2)
        {
            throw new SpamCommentException("account ban due to spam comment");
        }
        else if(count>0)
        {
            throw new SpamCommentException("spam comment");
        }
        else{
            return "comment is not spam";
        }
    }
    public String commentTheString(String comment)
    {
        try{
            checkComment(comment);
        }
        catch(SpamCommentException sce)
        {
            return sce.msg;
        }
        catch(Exception e)
        {
            return "other exception";
        }
        
        return "comment posted";
    }
}
class SpamCommentException extends Exception{
    public static String msg;
    SpamCommentException(String s)
    {
        msg = s;
    }
}
class Main{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the comment");
        String s = scn.nextLine();
        System.out.println("Entered comment" + s);
        Validator v = new Validator();
        try{
            String msg1 = v.checkComment(s);
            System.out.println(msg1);
        }
        catch(SpamCommentException  sce)
        {
            System.out.println(sce.msg);
        }
    }
}
