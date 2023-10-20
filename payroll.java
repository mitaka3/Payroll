
/**
 *
 * @author user
 */
import java.util.Scanner;
public class Payroll 
{
    public static void main(String[] args)
    {
        Scanner payroll = new Scanner (System.in);
        double hourlyrate,grosspay,WitholdingTax,netpay;
        int noofhours;
        
        System.out.println("Please input the Employee's Hourly Rate here: ");
        hourlyrate = payroll.nextDouble();
        System.out.println("Please input the Employee's Number of Hours here: ");
        noofhours = payroll.nextInt();
        
        grosspay = hourlyrate*noofhours;
        
        System.out.println ("The Gross Pay of the Employee is: " + grosspay + "Php");
        
        WitholdingTax = grosspay*0.15;
        
        System.out.println ("The Witholding Tax of the Employee is: " + WitholdingTax + " Php");
        
        netpay = grosspay-WitholdingTax;
        
        System.out.println("The Net Pay of the Employee is: " + netpay + "Php");
        
        
    }
}