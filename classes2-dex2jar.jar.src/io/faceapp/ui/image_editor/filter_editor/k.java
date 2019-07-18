package io.faceapp.ui.image_editor.filter_editor;

import YVa;
import android.graphics.Bitmap;
import cWa;
import cXa;
import gla;
import java.util.Map;
import mka;
import oXa;
import pXa;
import pxa;

final class k
  extends pXa
  implements cXa<YVa<? extends Bitmap, ? extends Boolean, ? extends pxa>, cWa>
{
  k(r paramr, mka parammka)
  {
    super(1);
  }
  
  public final void a(YVa<Bitmap, Boolean, pxa> paramYVa)
  {
    Object localObject1 = (Bitmap)paramYVa.a();
    Object localObject2 = (Boolean)paramYVa.b();
    paramYVa = (pxa)paramYVa.c();
    r localr = this.b;
    oXa.a(localObject1, "thumb");
    mka localmka = this.c;
    oXa.a(localObject2, "isPro");
    localObject2 = r.a(localr, (Bitmap)localObject1, localmka, ((Boolean)localObject2).booleanValue());
    localObject1 = (s)this.b.c();
    if (localObject1 != null)
    {
      oXa.a(paramYVa, "selection");
      ((s)localObject1).a((s.a)localObject2, paramYVa);
    }
    localObject1 = paramYVa.n();
    if (localObject1 != null) {
      r.a(this.b).put(paramYVa.m(), localObject1);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/filter_editor/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */