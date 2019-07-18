import android.util.Log;
import com.google.android.gms.common.internal.k;
import java.util.Locale;

public class yq
{
  private final String a;
  private final String b;
  private final k c;
  private final int d;
  
  private yq(String paramString1, String paramString2)
  {
    this.b = paramString2;
    this.a = paramString1;
    this.c = new k(paramString1);
    for (int i = 2; (7 >= i) && (!Log.isLoggable(this.a, i)); i++) {}
    this.d = i;
  }
  
  public yq(String paramString, String... paramVarArgs)
  {
    this(paramString, paramVarArgs);
  }
  
  private final String c(String paramString, Object... paramVarArgs)
  {
    String str = paramString;
    if (paramVarArgs != null)
    {
      str = paramString;
      if (paramVarArgs.length > 0) {
        str = String.format(Locale.US, paramString, paramVarArgs);
      }
    }
    return this.b.concat(str);
  }
  
  public void a(String paramString, Object... paramVarArgs)
  {
    if (a(3)) {
      Log.d(this.a, c(paramString, paramVarArgs));
    }
  }
  
  public boolean a(int paramInt)
  {
    return this.d <= paramInt;
  }
  
  public void b(String paramString, Object... paramVarArgs)
  {
    Log.e(this.a, c(paramString, paramVarArgs));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/yq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */