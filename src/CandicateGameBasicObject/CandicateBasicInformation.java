
package CandicateGameBasicObject;

/**
 *
 * @author Dmitri
 */
public class CandicateBasicInformation {
    public String CandicateName;
    public int CandicateNumber;
    public long CandicateMoney;
    
    public CandicateBasicInformation(){
        
    }
    public CandicateBasicInformation(String cnm,int cnu,long cm){
        CandicateName=cnm;
        CandicateNumber=cnu;
        CandicateMoney=cm;
    }
    
}
