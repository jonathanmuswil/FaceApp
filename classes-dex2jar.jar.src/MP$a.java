import android.os.Bundle;
import com.google.android.gms.common.api.a.d.e;

@Deprecated
public class Mp$a
  implements a.d.e
{
  private static final a a = new Mp.a.a().a();
  private final String b = null;
  private final boolean c;
  
  public Mp$a(Mp.a.a parama)
  {
    this.c = parama.a.booleanValue();
  }
  
  public final Bundle a()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("consumer_package", null);
    localBundle.putBoolean("force_save_dialog", this.c);
    return localBundle;
  }
  
  @Deprecated
  public static class a
  {
    protected Boolean a = Boolean.valueOf(false);
    
    public Mp.a a()
    {
      return new Mp.a(this);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Mp$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */