import android.os.IBinder;
import android.os.IInterface;

public class rr
  implements IInterface
{
  private final IBinder a;
  private final String b;
  
  protected rr(IBinder paramIBinder, String paramString)
  {
    this.a = paramIBinder;
    this.b = paramString;
  }
  
  public IBinder asBinder()
  {
    return this.a;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/rr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */