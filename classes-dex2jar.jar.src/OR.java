import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.f.b;
import com.google.android.gms.common.api.f.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.h;

public final class or
  extends h<pr>
{
  private final Mp.a G;
  
  public or(Context paramContext, Looper paramLooper, d paramd, Mp.a parama, f.b paramb, f.c paramc)
  {
    super(paramContext, paramLooper, 68, paramd, paramb, paramc);
    this.G = parama;
  }
  
  final Mp.a B()
  {
    return this.G;
  }
  
  public final int g()
  {
    return 12800000;
  }
  
  protected final Bundle s()
  {
    Mp.a locala = this.G;
    if (locala == null) {
      return new Bundle();
    }
    return locala.a();
  }
  
  protected final String w()
  {
    return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
  }
  
  protected final String x()
  {
    return "com.google.android.gms.auth.api.credentials.service.START";
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/or.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */