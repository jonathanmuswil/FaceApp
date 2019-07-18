package io.faceapp.ui.image_editor.filter_editor;

import cWa;
import cXa;
import mka;
import oXa;
import pXa;
import pxa;

final class q
  extends pXa
  implements cXa<s.b, cWa>
{
  q(r paramr, s params, mka parammka)
  {
    super(1);
  }
  
  public final void a(s.b paramb)
  {
    oXa.b(paramb, "it");
    if ((paramb instanceof s.b.c))
    {
      r.a(this.b, this.c, (s.b.c)paramb, this.d);
    }
    else if ((paramb instanceof s.b.b))
    {
      r.a(this.b, this.c, (s.b.b)paramb);
    }
    else
    {
      Object localObject;
      if ((paramb instanceof s.b.a))
      {
        localObject = this.b;
        r.a((r)localObject, this.c, this.d, r.a((r)localObject, ((s.b.a)paramb).a()));
      }
      else if ((paramb instanceof s.b.d))
      {
        r localr = this.b;
        s locals = this.c;
        localObject = this.d;
        paramb = (s.b.d)paramb;
        r.a(localr, locals, (mka)localObject, new pxa(paramb.a(), paramb.b()));
      }
      else if ((paramb instanceof s.b.e))
      {
        r.a(this.b, (s.b.e)paramb);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/filter_editor/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */