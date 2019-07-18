import java.io.File;
import java.util.Map;

abstract interface pm
{
  public abstract Map<String, String> a();
  
  public abstract String b();
  
  public abstract File c();
  
  public abstract File[] d();
  
  public abstract String getFileName();
  
  public abstract pm.a getType();
  
  public abstract void remove();
  
  public static enum a
  {
    private a() {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/pm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */