
package CandicateGameBasicObject;


import java.util.Vector;

/**
 *
 * @author Dmitri
 */
public class Template2DArray <T2dTemplate>{
    protected int T2drow;
    protected int T2dcol;
    protected Vector<Vector<T2dTemplate>> tarr=null; 
    
    public Template2DArray(int sir,int sic){
        T2drow=sir;
        T2dcol=sic;
        
        Create2dArray();
        
    }
    
    protected void Create2dArray(){
       tarr=new Vector<Vector<T2dTemplate>>();
       tarr.setSize(T2drow);
       //System.out.print(tarr.size());
         for(int i=0;i<T2drow;i++){
             
           Vector<T2dTemplate> tmparr1d=  new Vector<T2dTemplate>(T2dcol);
           tmparr1d.setSize(T2dcol);
             tarr.set(i, tmparr1d);
         }
        
    }
    
    /**
     *
     * @param ir
     * @param ic
     * @return
     */
    public int getRow(){
        return T2drow;
    }
    public int getCol(){
        return T2dcol;
    }
    
    public  T2dTemplate getValue(int ir,int ic){
        T2dTemplate tptr=null;
        tptr=tarr.get(ir).get(ic);
        
        
        return tptr;
    }
    
    public boolean setValue(int ir,int ic,T2dTemplate setval){
       // System.out.print("echo");
        
       Vector<T2dTemplate> arr1d= tarr.get(ir);
       arr1d.set(ic, setval);
       
      
       
        return true;
    }
    
}
