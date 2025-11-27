//If used amount of electricity unit is 1 to 100 show low usage ,  if between 100 and 300 then show mid usage and if more than 300 show high usage.

public class elecbill {
    public static void main (String args[])
    {
        int unit=250;

        if (unit<=100)
        {
            System.out.println("Usage of electricity is LOW.");
        }
        else if (unit>100 && unit<=300)
        {
            System.out.println("Usage of electricity is MODERATE.");
        }
        else if (unit>300)
        {
            System.out.println("Usage of electricity is HIGH.");
        }
        else
         {
            System.out.println("Invalid number of unit used.");
        }
    }
}
