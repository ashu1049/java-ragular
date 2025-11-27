//write a java progem to grade tjhe students based on credentials
//if % above 65 then c, if above 75 then b and if above 85 then a

class ques1demo {
    public static void main(String args[])
    {
        int mark =75;

        if(mark>65 && mark<=75)
        {
            System.out.println("grade:C");
        }
        else if(mark>75 && mark<=85)
        {
            System.out.println("grade:B");
        }
        else if(mark>85)
        {
            System.out.println("grade:A");
        }
        else 
        {
            System.out.println("grade:D");
        }
    }
}