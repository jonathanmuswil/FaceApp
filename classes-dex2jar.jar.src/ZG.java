import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class zg
  implements Tj.a<Ag.a>
{
  zg(Ag paramAg) {}
  
  public Ag.a a()
  {
    try
    {
      Ag.a locala = new Ag.a(MessageDigest.getInstance("SHA-256"));
      return locala;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      throw new RuntimeException(localNoSuchAlgorithmException);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/zg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */