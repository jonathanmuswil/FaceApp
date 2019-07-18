import java.io.FileOutputStream;
import java.util.Map;
import org.json.JSONObject;

class sl
  implements Cl.e
{
  sl(Cl paramCl, int paramInt1, int paramInt2, long paramLong1, long paramLong2, boolean paramBoolean, Map paramMap, int paramInt3) {}
  
  public void a(FileOutputStream paramFileOutputStream)
    throws Exception
  {
    paramFileOutputStream.write(new JSONObject(new rl(this)).toString().getBytes());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/sl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */