import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;
import java.util.concurrent.Callable;

final class _Na<V>
  implements Callable<aRa<? extends T>>
{
  _Na(aOa paramaOa, float paramFloat1, float paramFloat2) {}
  
  public final aRa<? extends Uri> call()
  {
    Object localObject1 = new WOa.d(aOa.a(this.a));
    Object localObject2 = WOa.e;
    Object localObject3 = null;
    localObject2 = WOa.a((WOa)localObject2, (WOa.c)localObject1, false, 2, null);
    if ((((APa)localObject2).c() == aOa.c(this.a)) && (((APa)localObject2).b() == aOa.c(this.a))) {
      return XQa.a(aOa.a(this.a));
    }
    localObject1 = WOa.a(WOa.e, (WOa.c)localObject1, 0, 0, false, 14, null);
    if (localObject1 != null)
    {
      localObject3 = WOa.e.a((Bitmap)localObject1, Math.max(this.b, this.c), Integer.valueOf(aOa.c(this.a)));
      localObject1 = _ra.h.a();
      WOa.a(WOa.e, (Bitmap)localObject3, (File)localObject1, 0, 4, null);
      localObject3 = Uri.fromFile((File)localObject1);
    }
    if (localObject3 != null)
    {
      localObject3 = XQa.a(localObject3);
      if (localObject3 != null) {}
    }
    else
    {
      localObject3 = XQa.a(new Exception());
    }
    return (aRa<? extends Uri>)localObject3;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/_Na.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */