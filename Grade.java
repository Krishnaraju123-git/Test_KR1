class Grade
{
    public static void main(String args[])
    {
        int marks;
        if(marks>=81&&marks<=100)
          System.out.println("Grade A");
        else if (marks>=71&&marks<=80)
          System.out.println("Grade B");
        else if (marks>=61&&marks<=70)
          System.out.println("Grade C"); 
        else if (marks>=40&&marks<=60)
          System.out.println("Grade D");   
        else
          System.out.println("Failed");
    }
}