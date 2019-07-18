import java.io.FileOutputStream;
import org.json.JSONObject;

class pl
  implements Cl.e
{
  pl(Cl paramCl, boolean paramBoolean) {}
  
  public void a(FileOutputStream paramFileOutputStream)
    throws Exception
  {
    paramFileOutputStream.write(new JSONObject(new ol(this)).toString().getBytes());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/pl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */