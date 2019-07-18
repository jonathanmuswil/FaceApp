package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.support.v4.graphics.drawable.IconCompat;
import androidx.versionedparcelable.b;

public class IconCompatParcelizer
{
  public static IconCompat read(b paramb)
  {
    IconCompat localIconCompat = new IconCompat();
    localIconCompat.b = paramb.a(localIconCompat.b, 1);
    localIconCompat.d = paramb.a(localIconCompat.d, 2);
    localIconCompat.e = paramb.a(localIconCompat.e, 3);
    localIconCompat.f = paramb.a(localIconCompat.f, 4);
    localIconCompat.g = paramb.a(localIconCompat.g, 5);
    localIconCompat.h = ((ColorStateList)paramb.a(localIconCompat.h, 6));
    localIconCompat.j = paramb.a(localIconCompat.j, 7);
    localIconCompat.c();
    return localIconCompat;
  }
  
  public static void write(IconCompat paramIconCompat, b paramb)
  {
    paramb.a(true, true);
    paramIconCompat.a(paramb.c());
    paramb.b(paramIconCompat.b, 1);
    paramb.b(paramIconCompat.d, 2);
    paramb.b(paramIconCompat.e, 3);
    paramb.b(paramIconCompat.f, 4);
    paramb.b(paramIconCompat.g, 5);
    paramb.b(paramIconCompat.h, 6);
    paramb.b(paramIconCompat.j, 7);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/androidx/core/graphics/drawable/IconCompatParcelizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */