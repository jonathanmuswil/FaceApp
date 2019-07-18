import io.faceapp.m;
import io.faceapp.m.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class oIa
  extends gla<pIa>
{
  private Eda i;
  private pIa.a j;
  private final HashMap<pIa.a, rIa<?>> k;
  private boolean l;
  private KDa m;
  private final Rja n;
  private final pIa.a o;
  private final String p;
  private final boolean q;
  
  public oIa(Rja paramRja, pIa.a parama, String paramString, boolean paramBoolean)
  {
    this.n = paramRja;
    this.o = parama;
    this.p = paramString;
    this.q = paramBoolean;
    this.k = new HashMap();
  }
  
  private final Object a(pIa.b paramb)
  {
    boolean bool = paramb instanceof pIa.b.d;
    Object localObject1 = null;
    Object localObject2;
    if (bool)
    {
      a(((pIa.b.d)paramb).a());
      localObject2 = cWa.a;
    }
    else if ((paramb instanceof pIa.b.l))
    {
      a(((pIa.b.l)paramb).a());
      localObject2 = cWa.a;
    }
    else if ((paramb instanceof pIa.b.n))
    {
      a(this, ((pIa.b.n)paramb).a(), null, 2, null);
      localObject2 = cWa.a;
    }
    else if (oXa.a(paramb, pIa.b.j.a))
    {
      paramb = (pIa)c();
      localObject2 = localObject1;
      if (paramb != null)
      {
        paramb.k();
        localObject2 = cWa.a;
      }
    }
    else if (oXa.a(paramb, pIa.b.i.a))
    {
      paramb = (pIa)c();
      if (paramb != null)
      {
        paramb = paramb.h();
        if (paramb != null)
        {
          localObject2 = Boolean.valueOf(KOa.b.h(paramb));
          break label540;
        }
      }
      localObject2 = cWa.a;
    }
    else
    {
      Object localObject3;
      if ((paramb instanceof pIa.b.k))
      {
        localObject3 = (pIa)c();
        localObject2 = localObject1;
        if (localObject3 != null)
        {
          localObject3 = ((sla)localObject3).getRouter();
          localObject2 = localObject1;
          if (localObject3 != null)
          {
            m.a.a((m)localObject3, ((pIa.b.k)paramb).a(), false, 2, null);
            localObject2 = cWa.a;
          }
        }
      }
      else if ((paramb instanceof pIa.b.b))
      {
        localObject3 = (pIa)c();
        localObject2 = localObject1;
        if (localObject3 != null)
        {
          ((pIa)localObject3).h(((pIa.b.b)paramb).a());
          localObject2 = cWa.a;
        }
      }
      else if ((paramb instanceof pIa.b.c))
      {
        localObject3 = (pIa)c();
        localObject2 = localObject1;
        if (localObject3 != null)
        {
          ((pIa)localObject3).a(((pIa.b.c)paramb).a());
          localObject2 = cWa.a;
        }
      }
      else if ((paramb instanceof pIa.b.m))
      {
        a(((pIa.b.m)paramb).a());
        localObject2 = cWa.a;
      }
      else if ((paramb instanceof pIa.b.a))
      {
        a(((pIa.b.a)paramb).a());
        localObject2 = cWa.a;
      }
      else if ((paramb instanceof pIa.b.g))
      {
        localObject3 = (pIa)c();
        localObject2 = localObject1;
        if (localObject3 != null)
        {
          ((pIa)localObject3).a(((pIa.b.g)paramb).a());
          localObject2 = cWa.a;
        }
      }
      else if ((paramb instanceof pIa.b.e))
      {
        this.m = ((pIa.b.e)paramb).a();
        paramb = (pIa)c();
        localObject2 = localObject1;
        if (paramb != null)
        {
          paramb.O();
          localObject2 = cWa.a;
        }
      }
      else if ((paramb instanceof pIa.b.f))
      {
        paramb = (pIa.b.f)paramb;
        a(paramb.c(), paramb.b(), paramb.a());
        localObject2 = cWa.a;
      }
      else
      {
        if (!(paramb instanceof pIa.b.h)) {
          break label543;
        }
        a(((pIa.b.h)paramb).a());
        localObject2 = cWa.a;
      }
    }
    label540:
    return localObject2;
    label543:
    throw new UVa();
  }
  
  private final rIa<?> a(pIa.a parama)
  {
    Object localObject = (rIa)this.k.get(parama);
    if (localObject == null)
    {
      int i1 = jIa.a[parama.ordinal()];
      if (i1 != 1)
      {
        if (i1 != 2)
        {
          if (i1 == 3)
          {
            localObject = this.i;
            if (localObject != null)
            {
              localObject = new WDa((Eda)localObject);
            }
            else
            {
              oXa.b("uploadedPhotoOp");
              throw null;
            }
          }
          else
          {
            throw new UVa();
          }
        }
        else
        {
          localObject = this.i;
          if (localObject != null)
          {
            localObject = new Qwa((Eda)localObject);
          }
          else
          {
            oXa.b("uploadedPhotoOp");
            throw null;
          }
        }
      }
      else
      {
        localObject = this.i;
        if (localObject == null) {
          break label139;
        }
        localObject = new Qxa((Eda)localObject);
      }
      this.k.put(parama, localObject);
    }
    else
    {
      return (rIa<?>)localObject;
    }
    label139:
    oXa.b("uploadedPhotoOp");
    throw null;
  }
  
  private final void a(Eda paramEda)
  {
    this.i = paramEda;
    paramEda = paramEda.b().m();
    int i1;
    if (paramEda != VOa.a) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if (i1 == 0) {
      paramEda = null;
    }
    if (paramEda != null) {
      Uma.qa.x().set(paramEda);
    }
    f();
    a(this.o, this.p);
    this.l = true;
  }
  
  private final void a(KDa paramKDa, Eda paramEda, yka paramyka)
  {
    Object localObject = a(pIa.a.c);
    if (localObject != null)
    {
      localObject = (WDa)localObject;
      if ((paramKDa instanceof KDa.a))
      {
        ((WDa)localObject).a(paramKDa.a(), paramEda, paramyka.b());
        return;
      }
      if (paramyka != null)
      {
        if (((paramKDa instanceof KDa.b)) || ((paramKDa instanceof KDa.e)) || (oXa.a(paramKDa, KDa.d.b)) || (oXa.a(paramKDa, KDa.c.b))) {
          ((WDa)localObject).a(paramKDa, paramyka.b());
        }
        return;
      }
      throw new IllegalArgumentException("Required value was null.");
    }
    throw new _Va("null cannot be cast to non-null type io.faceapp.ui.layouts.LayoutsPresenter");
  }
  
  private final void a(Rja paramRja)
  {
    KDa localKDa = this.m;
    if (localKDa != null)
    {
      this.m = null;
      if ((localKDa instanceof KDa.a))
      {
        rIa localrIa = a(pIa.a.c);
        if (localrIa != null) {
          ((WDa)localrIa).a(localKDa.a(), paramRja);
        } else {
          throw new _Va("null cannot be cast to non-null type io.faceapp.ui.layouts.LayoutsPresenter");
        }
      }
      return;
    }
    icb.a("PhotoEditor").e("layoutsPhotoPickerRequestTarget was lost", new Object[0]);
  }
  
  private final void a(XDa.a parama)
  {
    a(this, pIa.a.c, null, 2, null);
    rIa localrIa = a(pIa.a.c);
    if (localrIa != null)
    {
      ((WDa)localrIa).a(parama);
      return;
    }
    throw new _Va("null cannot be cast to non-null type io.faceapp.ui.layouts.LayoutsPresenter");
  }
  
  private final void a(List<? extends List<String>> paramList)
  {
    if (!this.l) {
      return;
    }
    rIa localrIa = a(pIa.a.c);
    if (localrIa != null)
    {
      ((WDa)localrIa).a(paramList);
      return;
    }
    throw new _Va("null cannot be cast to non-null type io.faceapp.ui.layouts.LayoutsPresenter");
  }
  
  private final void a(pIa.a parama, String paramString)
  {
    this.j = parama;
    Object localObject = a(parama);
    if ((parama == pIa.a.c) && (paramString != null))
    {
      paramString = XDa.b.h.a(paramString);
      if (localObject != null) {
        ((WDa)localObject).a(paramString);
      } else {
        throw new _Va("null cannot be cast to non-null type io.faceapp.ui.layouts.LayoutsPresenter");
      }
    }
    paramString = (pIa)c();
    if (paramString != null)
    {
      rIa localrIa = a(parama);
      localObject = Uma.qa.m().get();
      oXa.a(localObject, "AppPreferences.deviceId.get()");
      paramString.a(new pIa.c.a(parama, localrIa, (String)localObject));
    }
  }
  
  private final void a(boolean paramBoolean)
  {
    Object localObject;
    if (this.l)
    {
      localObject = a(pIa.a.a);
      if (localObject != null)
      {
        localObject = (Qxa)localObject;
        if ((!paramBoolean) && (((Qxa)localObject).m()))
        {
          localObject = (pIa)c();
          if (localObject != null) {
            ((pIa)localObject).U();
          }
        }
        else if (this.q)
        {
          localObject = (pIa)c();
          if (localObject != null) {
            ((pIa)localObject).dismiss();
          }
        }
        else
        {
          localObject = (pIa)c();
          if (localObject != null) {
            ((pIa)localObject).i();
          }
        }
      }
      else
      {
        throw new _Va("null cannot be cast to non-null type io.faceapp.ui.image_editor.ImageEditorPresenter");
      }
    }
    else
    {
      localObject = (pIa)c();
      if (localObject != null) {
        ((pIa)localObject).dismiss();
      }
    }
  }
  
  private final void f()
  {
    Object localObject = this.i;
    if (localObject != null)
    {
      localObject = ((Eda)localObject).j().f().a(new lIa(this));
      oXa.a(localObject, "uploadedPhotoOp.region()…loadOriginalSizePhoto() }");
      a((XQa)localObject, mIa.b, nIa.b);
      return;
    }
    oXa.b("uploadedPhotoOp");
    throw null;
  }
  
  public void a(pIa parampIa)
  {
    oXa.b(parampIa, "view");
    super.b(parampIa);
    if (this.l)
    {
      pIa.a locala = this.j;
      if (locala != null)
      {
        a(this, locala, null, 2, null);
      }
      else
      {
        oXa.b("curMode");
        throw null;
      }
    }
    else
    {
      parampIa.a(new pIa.c.b(this.n, this.o, this.p));
    }
    gla.a(this, parampIa.getViewActions(), null, null, new kIa(this), 3, null);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/oIa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */