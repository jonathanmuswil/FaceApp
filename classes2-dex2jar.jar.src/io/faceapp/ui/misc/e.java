package io.faceapp.ui.misc;

import QQa;
import Vma;
import XQa;
import Xma;
import android.content.Context;
import gla;
import io.faceapp.m;
import java.util.Iterator;
import java.util.List;
import nsa;
import nsa.a;
import nsa.b;
import oXa;
import sla;
import zPa;

public abstract class e<V extends j>
  extends gla<V>
{
  private final void b(boolean paramBoolean)
  {
    j localj = (j)c();
    if (localj != null)
    {
      Object localObject = f().iterator();
      while (((Iterator)localObject).hasNext())
      {
        zPa localzPa = (zPa)((Iterator)localObject).next();
        nsa.b.a(localzPa);
      }
      localObject = localj.h();
      if (localObject != null) {
        gla.b(this, a((Context)localObject, a.b), null, new h(this, localj, paramBoolean), 1, null);
      }
    }
  }
  
  public abstract XQa<nsa.b> a(Context paramContext, a parama);
  
  public void a(nsa.a parama)
  {
    oXa.b(parama, "shareType");
  }
  
  public final void a(boolean paramBoolean)
  {
    Object localObject = (j)c();
    if (localObject != null)
    {
      if (!g())
      {
        ((j)localObject).e();
        return;
      }
      if (Xma.e.b(Vma.c))
      {
        b(paramBoolean);
      }
      else
      {
        localObject = ((sla)localObject).getRouter();
        if (localObject != null)
        {
          XQa localXQa = Xma.e.a(Vma.c).d(1L).h();
          oXa.a(localXQa, "PermissionsManager.asObs…          .firstOrError()");
          gla.a(this, localXQa, null, new g(this, paramBoolean), 1, null);
          ((m)localObject).a(Vma.c);
        }
      }
    }
  }
  
  public final void b(nsa.a parama)
  {
    oXa.b(parama, "shareType");
    j localj = (j)c();
    if (localj != null)
    {
      if (!g())
      {
        localj.e();
        return;
      }
      Object localObject1 = f().iterator();
      Object localObject2;
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (zPa)((Iterator)localObject1).next();
        nsa.b.a((zPa)localObject2);
      }
      localObject1 = localj.h();
      if (localObject1 != null)
      {
        localObject2 = a((Context)localObject1, a.a);
        boolean bool = h();
        gla.b(this, nsa.b.a((Context)localObject1, parama, bool, (XQa)localObject2), null, new i(this, parama, localj), 1, null);
      }
    }
  }
  
  public abstract List<zPa> f();
  
  public abstract boolean g();
  
  public abstract boolean h();
  
  public static enum a
  {
    static
    {
      a locala1 = new a("Share", 0);
      a = locala1;
      a locala2 = new a("Save", 1);
      b = locala2;
      c = new a[] { locala1, locala2 };
    }
    
    private a() {}
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/misc/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */