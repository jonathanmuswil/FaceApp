import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

final class pGa<T, R>
  implements DRa<T, aRa<? extends R>>
{
  pGa(lGa paramlGa) {}
  
  public final XQa<Rva.a> a(Bitmap paramBitmap)
  {
    oXa.b(paramBitmap, "bitmap");
    Object localObject = WOa.a(WOa.e, paramBitmap, null, 2, null);
    XQa localXQa = lGa.a(this.a, paramBitmap, _ra.h.i()).d(mGa.a);
    localObject = lGa.a(this.a, (Bitmap)localObject, _ra.h.h()).d(nGa.a);
    paramBitmap = lGa.b(this.a);
    ArrayList localArrayList = new ArrayList(mWa.a(paramBitmap, 10));
    Iterator localIterator = paramBitmap.iterator();
    while (localIterator.hasNext())
    {
      paramBitmap = ((lGa.b)localIterator.next()).b();
      if (!(paramBitmap.isEmpty() ^ true)) {
        paramBitmap = null;
      }
      if (paramBitmap == null) {
        paramBitmap = mWa.a(lGa.a(this.a));
      }
      localArrayList.add(paramBitmap);
    }
    return XQa.a(localXQa, (aRa)localObject, XQa.a(localArrayList), new oGa(this));
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pGa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */