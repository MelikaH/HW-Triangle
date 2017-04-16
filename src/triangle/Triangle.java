
package triangle;

/**
 *
 * @author Melika
 */
public class Triangle {

   public void check(){
       
   }

    public String triang(int s1, int s2, int s3){
       
      
             if(s1<=0 || s2<=0 || s3<=0){
                return ("Not valid.");}
        
             if(s1==s2 && s2==s3){
                return ("Equilaterall Triangle.");
        }
             if(((s1!=s2)&&(s2!=s3)&&(s1==s3))&&((s1+s2)>s3 && (s2+s3)>s1 && (s1+s3)>s2) ){
                return ("Isosceles Triangle.");
        }
             if((s1*s1)+(s2*s2)==(s3*s3)&&((s1+s2)>s3 && (s2+s3)>s1 && (s1+s3)>s2)){
                return ("Right Triangle.");
        }
             if((s1>s3 && s1>s2 && s3>s2)&&((s1+s2)>s3 && (s2+s3)>s1 && (s1+s3)>s2)){
                return ("Obtuse Triangle.");
        }
             if((s1<s3 && s2<s3 && s1<s2)&&((s1+s2)>s3 && (s2+s3)>s1 && (s1+s3)>s2)){
                return ("Acute Triangle.");
                    }            
    
    return ("Not a triangle.");
}
}
