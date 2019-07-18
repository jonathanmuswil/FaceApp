import android.os.IBinder;
import android.os.IInterface;

public class Hq$a
  extends Zu
  implements Hq
{
  public Hq$a()
  {
    super("com.google.android.gms.dynamic.IObjectWrapper");
  }
  
  public static Hq a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
    if ((localIInterface instanceof Hq)) {
      return (Hq)localIInterface;
    }
    return new Hq.a.a(paramIBinder);
  }
  
  public static final class a
    extends Yu
    implements Hq
  {
    a(IBinder paramIBinder)
    {
      super("com.google.android.gms.dynamic.IObjectWrapper");
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Hq$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */