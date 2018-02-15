/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package providertypes;
import java.util.Scanner;


/**
 *
 * @author Zohaib.Usmani
 */
public class ProvidersClass {
    String TOB,TOB1,TOB2,TOB3;
    
    public void getData()
    {
       
        Scanner kb = new Scanner(System.in);
         while(true)
        {
           try{
        System.out.print("Enter TOB :  ");
        TOB = kb.nextLine();
        char test = TOB.charAt(2);
        break;
           }
               catch(StringIndexOutOfBoundsException e)
               {
                System.out.printf("INVALID TOB. RETRY PLEASE.\n");
                String TOB = kb.nextLine();
                continue;
               }
        }
     
      
 String cutTOB = TOB.substring(0, 3);
 System.out.println("The TOB is: " +cutTOB);
 

 
  /* String TOB1= Character.toString(TOB.charAt(0));
   System.out.printf("Provider type = \n" ,TOB1);
  String TOB2= TOB.substring(1,1);
  System.out.printf("Provider type = \n" ,TOB2);
  String TOB3= TOB.substring(2,2); 
  System.out.printf("Provider type = \n" ,TOB3);*/

    
    
 TOB1=(cutTOB.substring(0,1));
  TOB2=(cutTOB.substring(1,2));
   TOB3=(cutTOB.substring(2,3));

   /* String TOB1= Character.toString(TOB.charAt(0));
    String TOB2= Character.toString(TOB.charAt(1));
    String TOB3= Character.toString(TOB.charAt(2));*/
     //String TOB1= cutTOB.substring(0, 1);
   
    }
   //System.out.printf("Provider type = " ,TOB1);
    
   /* }
     // String TOB1= TOB.substring(0,1);
   //System.out.print("Provider type = " ,TOB1);
  String TOB2= TOB.substring(2,1);
  //System.out.printf("Provider type = \n" ,TOB2);
  String TOB3= TOB.substring(3,1); 
  //System.out.printf("Provider type = \n" ,TOB3);*/
    
  public void getProvider()
        
  
               
    
          {
     switch(TOB1)
        {
            
            case "1": TOB1 = "hospital";
            break;
             case "2": TOB1 = "Skilled Nursing";
             break;
              case "3": TOB1 = "Home health";
              break;
               case "4": TOB1 = "Religious Nonmedical Hospital";
               break;
                case "5": TOB1 = "Religious Nonmedical extended care Hospital discontinued 10/1/05";
                break;
                 case "6": TOB1 = "intermediate care";
                 break;
                  case "7": TOB1 = "ESRD Facility";
                  break;
                   case "8": TOB1 = "CAH or ASC";
                   break;
                    case "9": TOB1 = "Reserved for national Assignment";
                    break;
                    default : System.out.printf("\n*** %s is invalid\n", TOB1);
                     break;
     }            
          switch(TOB2)
        {
            
            case "1": TOB2 = "Inpatient Part A";
            break;
             case "2": TOB2 = "Inpatient Part B";
             break;
              case "3": TOB2 = "Outpatient";
              break;
               case "4": TOB2 = "Other(part B)";
               break;
                case "5": TOB2 = "Intermediate care -Level 1";
                break;
                 case "6": TOB2 = "Intermediate care -Level 2";
                 break;
                  case "7": TOB2 = "Subacute Inpatient(Revenue Code 019 X required) 17X, 27X discontinued 10/1/2005";
                  break;
                   case "8": TOB2 = "Swing Bed";
                   break;
                    case "9": TOB2 = "Reserved for national Assignment";
                    break;
                    default : System.out.printf("\n*** %s is invalid\n", TOB2);
                     break;
                     }
           switch(TOB3)
        {
            
            case "0": TOB3 = "Non-payment/Zero Claim";
            break;
             case "1": TOB3 = "Admit Through Discharge";
             break;
              case "2": TOB3 = "Interim - First Claim";
              break;
               case "3": TOB3 = "Interim-Continuing Claims (Not valid for PPS Bills";
               break;
                case "4": TOB3 = "Interim - Last Claim (Not valid for PPS Bills)";
                break;
                 case "5": TOB3 = "Late Charge Only (Outpatient claims only)";
                 break;
                  case "7": TOB3 = "Replacement of Prior Claim (See adjustment third digit)";
                  break;
                   case "8": TOB3 = "Void/Cancel of Prior Claim (See adjustment third digit)";
                   break;
                    case "9": TOB3 = "Final claim for a Home Health PPS Episode";
                  break;
             case "A": TOB3 = "Admission/Election Notice for Hospice";
             break;
              case "B": TOB3 = "Hospice/Medicare Coordinated Care Demonstration/Religious Nonmedical Health Care Institution Termination/ Revocation Notice";
              break;
               case "C": TOB3 = "Hospice Change of Provider Notice";
               break;
                case "D": TOB3 = "Hospice/Medicare Coordinated Care Demonstration/Religious Nonmedical Health Care Institution Void/Cancel";
                break;
                 case "E": TOB3 = "Hospice Change of Ownership";
                 break;
                  case "F": TOB3 = "Beneficiary Initiated Adjustment Claim";
                  break;
                   case "G": TOB3 = "CWF Initiated Adjustment Claim";
                   break;
                    case "H": TOB3 = "CMS Initiated Adjustment Claim";
                  
            break;
             case "I": TOB3 = "FI Adjustment Claim (Other than QIO or Provider)";
             break;
              case "J": TOB3 = "Initiated Adjustment Claim--Other";
              break;
               case "K": TOB3 = "OIG Initiated Adjustment Claim";
               break;
                case "L": TOB3 = "MSP Initiated Adjustment Claim";
                break;
                 case "M": TOB3 = "QIO Adjustment Claim";
                 break;
                  case "P": TOB3 = "Subacute Inpatient(Revenue Code 019 X required) 17X, 27X discontinued 10/1/2005";
                  break;
      
                    default : System.out.printf("\n*** %s is invalid\n", TOB3);
                     break;
                     }
            System.out.printf("Provider type = %s\n " , TOB1 + " "+ TOB2 + " "+ TOB3);
        
}
}
