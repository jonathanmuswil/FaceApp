import java.util.Iterator;
import java.util.List;

public final class yMa
  extends gla<zMa>
{
  private final String i = "Updates";
  private WVa<? extends List<Yka>, ? extends List<Yka>> j;
  private kRa k;
  
  private final void a(String paramString, Rka paramRka)
  {
    Object localObject1 = this.j;
    if (localObject1 != null)
    {
      List localList1 = (List)((WVa)localObject1).a();
      List localList2 = (List)((WVa)localObject1).b();
      localObject1 = localList1.iterator();
      int m = 0;
      int i1;
      int i2;
      for (int n = 0;; n++)
      {
        boolean bool = ((Iterator)localObject1).hasNext();
        i1 = -1;
        if (!bool) {
          break;
        }
        localObject2 = (Yka)((Iterator)localObject1).next();
        if (((localObject2 instanceof Vka)) && (oXa.a(((Vka)localObject2).d().l(), paramString))) {
          i2 = 1;
        } else {
          i2 = 0;
        }
        if (i2 != 0) {
          break label120;
        }
      }
      n = -1;
      label120:
      localObject1 = Integer.valueOf(n);
      if (((Integer)localObject1).intValue() >= 0) {
        n = 1;
      } else {
        n = 0;
      }
      if (n == 0) {
        localObject1 = null;
      }
      if (localObject1 != null)
      {
        n = ((Integer)localObject1).intValue();
        localObject1 = localList1.get(n);
        if (localObject1 != null)
        {
          localObject1 = (Vka)localObject1;
          localList1.set(n, Vka.a((Vka)localObject1, 0, 0, 0, false, null, null, Oka.a(((Vka)localObject1).d(), null, null, null, false, null, null, null, paramRka, 127, null), 63, null));
        }
        else
        {
          throw new _Va("null cannot be cast to non-null type io.faceapp.model.updates.NewFriendPollUpdate");
        }
      }
      Object localObject2 = localList2.iterator();
      for (n = 0;; n++)
      {
        i2 = i1;
        if (!((Iterator)localObject2).hasNext()) {
          break;
        }
        localObject1 = (Yka)((Iterator)localObject2).next();
        if (((localObject1 instanceof Vka)) && (oXa.a(((Vka)localObject1).d().l(), paramString))) {
          i2 = 1;
        } else {
          i2 = 0;
        }
        if (i2 != 0)
        {
          i2 = n;
          break;
        }
      }
      paramString = Integer.valueOf(i2);
      n = m;
      if (paramString.intValue() >= 0) {
        n = 1;
      }
      if (n == 0) {
        paramString = null;
      }
      if (paramString != null)
      {
        n = paramString.intValue();
        paramString = localList2.get(n);
        if (paramString != null)
        {
          paramString = (Vka)paramString;
          localList2.set(n, Vka.a(paramString, 0, 0, 0, false, null, null, Oka.a(paramString.d(), null, null, null, false, null, null, null, paramRka, 127, null), 63, null));
        }
        else
        {
          throw new _Va("null cannot be cast to non-null type io.faceapp.model.updates.NewFriendPollUpdate");
        }
      }
      a(this, localList1, localList2, false, 4, null);
    }
  }
  
  private final void a(List<? extends Yka> paramList)
  {
    if (paramList.isEmpty()) {
      return;
    }
    Object localObject = (zMa)c();
    if (localObject != null)
    {
      localObject = ((zMa)localObject).K().a(vMa.a).h().a(new sMa(this, paramList));
      oXa.a(localObject, "view.shownState.filter {…(newUpdates.first().id) }");
      tMa localtMa = new tMa(this, paramList);
      a((XQa)localObject, new uMa(this, paramList), localtMa);
    }
  }
  
  private final void a(List<? extends Yka> paramList1, List<? extends Yka> paramList2, boolean paramBoolean)
  {
    if ((paramList1.isEmpty()) && (paramList2.isEmpty())) {
      paramList1 = zMa.d.b.a;
    } else {
      paramList1 = new zMa.d.a(paramList1, paramList2, paramBoolean);
    }
    paramList2 = (zMa)c();
    if (paramList2 != null) {
      paramList2.a(paramList1);
    }
  }
  
  private final void a(zMa.c paramc)
  {
    if (oXa.a(paramc, zMa.c.c.a))
    {
      a(true);
    }
    else if (oXa.a(paramc, zMa.c.d.a))
    {
      a(false);
    }
    else if ((paramc instanceof zMa.c.b))
    {
      paramc = (zMa.c.b)paramc;
      a(paramc.b(), paramc.a());
    }
    else
    {
      if (!(paramc instanceof zMa.c.a)) {
        break label82;
      }
      b(((zMa.c.a)paramc).a());
    }
    return;
    label82:
    throw new UVa();
  }
  
  private final void a(boolean paramBoolean)
  {
    Object localObject = this.k;
    if (localObject != null) {
      ((kRa)localObject).i();
    }
    if (!paramBoolean)
    {
      localObject = (zMa)c();
      if (localObject != null) {
        ((jta)localObject).a(zMa.d.c.a);
      }
    }
    localObject = doa.a(doa.c, 0, 0, 3, null);
    pMa localpMa = new pMa(this, paramBoolean);
    this.k = b((XQa)localObject, new rMa(this), localpMa);
  }
  
  private final void b(String paramString)
  {
    Object localObject = this.j;
    if (localObject != null)
    {
      List localList = (List)((WVa)localObject).a();
      localObject = (List)((WVa)localObject).b();
      mWa.a(localList, new wMa(paramString));
      mWa.a((List)localObject, new xMa(paramString));
      a(this, localList, (List)localObject, false, 4, null);
    }
  }
  
  public void a(zMa paramzMa)
  {
    oXa.b(paramzMa, "view");
    super.b(paramzMa);
    Object localObject = this.j;
    if (localObject != null)
    {
      a(this, (List)((WVa)localObject).c(), (List)((WVa)localObject).d(), false, 4, null);
    }
    else
    {
      localObject = Uma.qa.c().b().e(lMa.a).a(mMa.a).h().a(gRa.a()).b(new kMa(paramzMa));
      oXa.a(localObject, "AppPreferences.authUserC… { view.bindTo(Loading) }");
      gla.a(this, (XQa)localObject, null, new nMa(this), 1, null);
    }
    gla.a(this, paramzMa.getViewActions(), null, null, new oMa(this), 3, null);
  }
  
  public String b()
  {
    return this.i;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/yMa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */