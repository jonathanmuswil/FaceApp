import java.io.FileOutputStream;
import org.json.JSONObject;

class il
  implements Cl.e
{
  il(Cl paramCl, String paramString1, String paramString2, long paramLong) {}
  
  public void a(FileOutputStream paramFileOutputStream)
    throws Exception
  {
    paramFileOutputStream.write(new JSONObject(new hl(this)).toString().getBytes());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/il.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */