import android.os.Bundle;
import com.google.android.gms.measurement.internal.Fa;

final class QF$b
  extends uK
{
  private final Fa a;
  
  QF$b(Fa paramFa)
  {
    this.a = paramFa;
  }
  
  public final int Pa()
  {
    return this.a.hashCode();
  }
  
  public final void onEvent(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
  {
    this.a.onEvent(paramString1, paramString2, paramBundle, paramLong);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/QF$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */