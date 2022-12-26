
import javax.swing.JOptionPane;

public class RecursividadClases {
 public RecursividadClases(){
	 
 }
   
  public static String cuenta(int P,float Pedro,float Juan,String ImpRec)
	{
		ImpRec += P + "\t" + Pedro + "\t" + Juan + "\n";
		
		if(P > 2034)
		
			return ImpRec;
		
		else
		{
			P++;
			Pedro= (float) (Pedro + (Pedro * 0.04));
			Juan = (float) (Juan + (Juan * 0.023));
			
			return cuenta(P,Pedro,Juan,ImpRec);
		}
	}
  
    public static String SecuenciaUlam(String out, int value) {
    	if ((value % 2) == 0 && value > 1) {
            out += value + " → ";
            out = SecuenciaUlam(out, value /= 2);
            return out;
        } else if ((value % 2) != 0 && value > 1) {
            out += value + " → ";
            out = SecuenciaUlam(out, value = (value * 3) + 1);
            return out;
        } else {
            out += value;
            return out;
        }
    }
//Ingreso de solo datos numericos
public static boolean getCharacterNumeric(String Value) {
    int ValueNumeric;
    try {
        ValueNumeric = Integer.parseInt(Value);
        return true;
    } catch (Exception e) {
        return false;
    }
}
}
