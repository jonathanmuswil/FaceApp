import java.io.FileOutputStream;
import org.json.JSONObject;

class ml
  implements Cl.e
{
  ml(Cl paramCl, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt) {}
  
  public void a(FileOutputStream paramFileOutputStream)
    throws Exception
  {
    paramFileOutputStream.write(new JSONObject(new ll(this)).toString().getBytes());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ml.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */