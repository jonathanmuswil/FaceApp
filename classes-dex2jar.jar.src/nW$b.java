import android.content.ContentResolver;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class nW$b
{
  private final ContentResolver a;
  private Map<Class<?>, Object<?>> b;
  private Handler c;
  private kW d;
  private WQa e;
  private List<iW> f;
  
  nW$b(ContentResolver paramContentResolver)
  {
    WQa localWQa;
    if (GW.a) {
      localWQa = EVa.b();
    } else {
      localWQa = null;
    }
    this.e = localWQa;
    this.f = new ArrayList();
    this.a = paramContentResolver;
  }
  
  public nW a()
  {
    if (this.c == null)
    {
      localObject = new HandlerThread("StorIOContentResolverNotificationsThread");
      ((HandlerThread)localObject).start();
      this.c = new Handler(((HandlerThread)localObject).getLooper());
    }
    if (this.d == null) {
      this.d = new IW();
    }
    Object localObject = this.b;
    if (localObject != null) {
      this.d.a(Collections.unmodifiableMap((Map)localObject));
    }
    return new nW(this.a, this.c, this.d, this.e, this.f);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/nW$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */