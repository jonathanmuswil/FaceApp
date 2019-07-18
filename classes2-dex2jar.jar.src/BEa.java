import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class bEa
{
  public static final bEa a = new bEa();
  
  public final Bitmap a(List<? extends Uri> paramList)
  {
    oXa.b(paramList, "uris");
    Object localObject1 = new ArrayList(mWa.a(paramList, 10));
    Object localObject2 = paramList.iterator();
    int i;
    for (;;)
    {
      boolean bool = ((Iterator)localObject2).hasNext();
      i = 0;
      if (!bool) {
        break;
      }
      localObject3 = (Uri)((Iterator)localObject2).next();
      ((Collection)localObject1).add(WOa.a(WOa.e, new WOa.d((Uri)localObject3), false, 2, null));
    }
    localObject2 = new ArrayList(mWa.a((Iterable)localObject1, 10));
    Object localObject3 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject3).hasNext()) {
      ((Collection)localObject2).add(Integer.valueOf(((APa)((Iterator)localObject3).next()).c()));
    }
    localObject2 = mWa.e((Iterable)localObject2);
    if (localObject2 != null)
    {
      int j = ((Number)localObject2).intValue();
      localObject2 = new ArrayList(mWa.a((Iterable)localObject1, 10));
      localObject1 = ((Iterable)localObject1).iterator();
      while (((Iterator)localObject1).hasNext()) {
        ((Collection)localObject2).add(Integer.valueOf(((APa)((Iterator)localObject1).next()).b()));
      }
      localObject1 = mWa.e((Iterable)localObject2);
      if (localObject1 != null)
      {
        int k = ((Number)localObject1).intValue();
        localObject1 = Bitmap.createBitmap(j * 2, paramList.size() * k / 2, Bitmap.Config.ARGB_8888);
        localObject3 = new Canvas((Bitmap)localObject1);
        localObject2 = new Matrix();
        Paint localPaint = new Paint(2);
        paramList = paramList.iterator();
        while (paramList.hasNext())
        {
          Object localObject4 = paramList.next();
          if (i >= 0)
          {
            localObject4 = (Uri)localObject4;
            localObject4 = WOa.a(WOa.e, new WOa.d((Uri)localObject4), 0, 0, false, 14, null);
            if (localObject4 != null)
            {
              ((Matrix)localObject2).reset();
              float f1 = j;
              float f2 = f1 / ((Bitmap)localObject4).getWidth();
              float f3 = k;
              ((Matrix)localObject2).postScale(f2, f3 / ((Bitmap)localObject4).getHeight());
              if (i % 2 == 0) {
                f1 = 0.0F;
              }
              if (i < 2) {
                f3 = 0.0F;
              }
              ((Matrix)localObject2).postTranslate(f1, f3);
              ((Canvas)localObject3).drawBitmap((Bitmap)localObject4, (Matrix)localObject2, localPaint);
              ((Bitmap)localObject4).recycle();
              i++;
            }
            else
            {
              oXa.a();
              throw null;
            }
          }
          else
          {
            mWa.c();
            throw null;
          }
        }
        oXa.a(localObject1, "bitmap");
        return (Bitmap)localObject1;
      }
      throw new IllegalStateException("Required value was null.");
    }
    throw new IllegalStateException("Required value was null.");
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/bEa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */