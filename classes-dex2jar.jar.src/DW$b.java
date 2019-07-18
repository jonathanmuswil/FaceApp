import android.net.Uri;
import java.util.List;

public final class DW$b
{
  private Uri a;
  private List<String> b;
  private String c;
  private List<String> d;
  private String e;
  
  DW$b(Uri paramUri)
  {
    this.a = paramUri;
  }
  
  public b a(String paramString)
  {
    this.e = paramString;
    return this;
  }
  
  public <T> b a(T... paramVarArgs)
  {
    this.d = HW.a(paramVarArgs);
    return this;
  }
  
  public b a(String... paramVarArgs)
  {
    this.b = HW.a(paramVarArgs);
    return this;
  }
  
  public DW a()
  {
    return new DW(this.a, this.b, this.c, this.d, this.e, null);
  }
  
  public b b(String paramString)
  {
    this.c = paramString;
    return this;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/DW$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */