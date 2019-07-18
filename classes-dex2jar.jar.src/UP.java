import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.Tl;
import com.google.android.gms.internal.ads.ob;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class up
{
  public static WeakHashMap<View, up> a = new WeakHashMap();
  private ob b;
  private WeakReference<View> c;
  
  private final void a(Hq paramHq)
  {
    Object localObject = this.c;
    if (localObject != null) {
      localObject = (View)((WeakReference)localObject).get();
    } else {
      localObject = null;
    }
    if (localObject == null)
    {
      Tl.d("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
      return;
    }
    if (!a.containsKey(localObject)) {
      a.put(localObject, this);
    }
    localObject = this.b;
    if (localObject != null) {
      try
      {
        ((ob)localObject).c(paramHq);
        return;
      }
      catch (RemoteException paramHq)
      {
        Tl.b("Unable to call setNativeAd on delegate", paramHq);
      }
    }
  }
  
  public final void a(rp paramrp)
  {
    a((Hq)paramrp.a());
  }
  
  public final void a(zp paramzp)
  {
    a((Hq)paramzp.k());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/up.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */