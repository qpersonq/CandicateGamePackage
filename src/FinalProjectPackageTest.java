
import CandicateGameBasicObject.*;
import java.nio.charset.Charset;
/**
 *
 * @author Dmitri
 */



public class FinalProjectPackageTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Test2Darray
        {
         int prerow=100,precol=99;
         Template2DArray<Integer> testtmp2darray=new Template2DArray<Integer>(prerow,precol);
        
         int mybt=(1);
         for(int i=0;i<prerow;i++){
             for(int j=0;j<precol;j++){
                 testtmp2darray.setValue(i, j,mybt );
             }
         }
         
      
         //print
         
         for(int i=0;i<prerow;i++){
             for(int j=0;j<precol;j++){
                 System.out.print(testtmp2darray.getValue(i, j)+" ");
             }
             System.out.println();
         }
        }
        
        
         //test2candicate basic information
         {
         CandicateBasicInformation CBI=new CandicateBasicInformation(new String("馬英九"),1,10000000);
         CBI.CandicateName="蔡英文";
         System.out.println(CBI.CandicateName+" "+CBI.CandicateMoney);
         }
         
         
         //test countyvote
         {
         CountyVote CV=new CountyVote(101,"台北",5,new long[]{10000,10215,123,4546,45} );
         System.out.print(CV.CountyNumber+" "+CV.CountyName+" ");
               for(int i=0;i<CV.getCandicateNumber();i++){
                   CV.setVote(i, CV.getVote(i)+1);
                   System.out.print(CV.getVote(i)+" ");
               }
         System.out.println();
         }
    }
    
}
