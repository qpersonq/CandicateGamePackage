
package CandicateGameBasicObject;

/**
 *
 * @author Dmitri
 */
public class CountyVote {
    public long CountyNumber;
    public String CountyName;
    
    
    protected int CandicateNumber;
    private long Voter[]=null;
    
    
    public CountyVote(int cno,String cnm,int thenumberofcandicatewithgiveup,long[]votearray){
        CountyNumber=cno;
        CountyName=cnm;
        
        CandicateNumber=thenumberofcandicatewithgiveup;
          
          Voter=votearray.clone();
          
    }
    public int getCandicateNumber(){
        return CandicateNumber;
    }
    public long getVote(int indx){
        return Voter[indx];
    }
    public void setVote(int indx,long setval){
        Voter[indx]=setval;
    }
    
}
