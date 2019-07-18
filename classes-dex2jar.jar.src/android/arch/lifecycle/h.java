package android.arch.lifecycle;

import android.util.Log;
import h.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;

public class h
  extends d
{
  private f<e, a> a = new f();
  private d.b b;
  private final WeakReference<f> c;
  private int d = 0;
  private boolean e = false;
  private boolean f = false;
  private ArrayList<d.b> g = new ArrayList();
  
  public h(f paramf)
  {
    this.c = new WeakReference(paramf);
    this.b = d.b.b;
  }
  
  static d.b a(d.a parama)
  {
    switch (g.a[parama.ordinal()])
    {
    default: 
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unexpected event value ");
      localStringBuilder.append(parama);
      throw new IllegalArgumentException(localStringBuilder.toString());
    case 6: 
      return d.b.a;
    case 5: 
      return d.b.e;
    case 3: 
    case 4: 
      return d.b.d;
    }
    return d.b.c;
  }
  
  static d.b a(d.b paramb1, d.b paramb2)
  {
    d.b localb = paramb1;
    if (paramb2 != null)
    {
      localb = paramb1;
      if (paramb2.compareTo(paramb1) < 0) {
        localb = paramb2;
      }
    }
    return localb;
  }
  
  private void a(f paramf)
  {
    Iterator localIterator = this.a.descendingIterator();
    while ((localIterator.hasNext()) && (!this.f))
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      a locala = (a)localEntry.getValue();
      while ((locala.a.compareTo(this.b) > 0) && (!this.f) && (this.a.contains(localEntry.getKey())))
      {
        d.a locala1 = b(locala.a);
        d(a(locala1));
        locala.a(paramf, locala1);
        c();
      }
    }
  }
  
  private static d.a b(d.b paramb)
  {
    int i = g.b[paramb.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4)
          {
            if (i != 5)
            {
              StringBuilder localStringBuilder = new StringBuilder();
              localStringBuilder.append("Unexpected state value ");
              localStringBuilder.append(paramb);
              throw new IllegalArgumentException(localStringBuilder.toString());
            }
            throw new IllegalArgumentException();
          }
          return d.a.ON_PAUSE;
        }
        return d.a.ON_STOP;
      }
      return d.a.ON_DESTROY;
    }
    throw new IllegalArgumentException();
  }
  
  private void b(f paramf)
  {
    h.d locald = this.a.n();
    while ((locald.hasNext()) && (!this.f))
    {
      Map.Entry localEntry = (Map.Entry)locald.next();
      a locala = (a)localEntry.getValue();
      while ((locala.a.compareTo(this.b) < 0) && (!this.f) && (this.a.contains(localEntry.getKey())))
      {
        d(locala.a);
        locala.a(paramf, e(locala.a));
        c();
      }
    }
  }
  
  private boolean b()
  {
    int i = this.a.size();
    boolean bool = true;
    if (i == 0) {
      return true;
    }
    d.b localb1 = ((a)this.a.m().getValue()).a;
    d.b localb2 = ((a)this.a.o().getValue()).a;
    if ((localb1 != localb2) || (this.b != localb2)) {
      bool = false;
    }
    return bool;
  }
  
  private d.b c(e parame)
  {
    parame = this.a.b(parame);
    Object localObject = null;
    if (parame != null) {
      parame = ((a)parame.getValue()).a;
    } else {
      parame = null;
    }
    if (!this.g.isEmpty())
    {
      localObject = this.g;
      localObject = (d.b)((ArrayList)localObject).get(((ArrayList)localObject).size() - 1);
    }
    return a(a(this.b, parame), (d.b)localObject);
  }
  
  private void c()
  {
    ArrayList localArrayList = this.g;
    localArrayList.remove(localArrayList.size() - 1);
  }
  
  private void c(d.b paramb)
  {
    if (this.b == paramb) {
      return;
    }
    this.b = paramb;
    if ((!this.e) && (this.d == 0))
    {
      this.e = true;
      d();
      this.e = false;
      return;
    }
    this.f = true;
  }
  
  private void d()
  {
    f localf = (f)this.c.get();
    if (localf == null)
    {
      Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
      return;
    }
    while (!b())
    {
      this.f = false;
      if (this.b.compareTo(((a)this.a.m().getValue()).a) < 0) {
        a(localf);
      }
      Map.Entry localEntry = this.a.o();
      if ((!this.f) && (localEntry != null) && (this.b.compareTo(((a)localEntry.getValue()).a) > 0)) {
        b(localf);
      }
    }
    this.f = false;
  }
  
  private void d(d.b paramb)
  {
    this.g.add(paramb);
  }
  
  private static d.a e(d.b paramb)
  {
    int i = g.b[paramb.ordinal()];
    if (i != 1) {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4)
          {
            if (i != 5)
            {
              StringBuilder localStringBuilder = new StringBuilder();
              localStringBuilder.append("Unexpected state value ");
              localStringBuilder.append(paramb);
              throw new IllegalArgumentException(localStringBuilder.toString());
            }
          }
          else {
            throw new IllegalArgumentException();
          }
        }
        else {
          return d.a.ON_RESUME;
        }
      }
      else {
        return d.a.ON_START;
      }
    }
    return d.a.ON_CREATE;
  }
  
  public d.b a()
  {
    return this.b;
  }
  
  public void a(d.b paramb)
  {
    c(paramb);
  }
  
  public void a(e parame)
  {
    Object localObject = this.b;
    d.b localb = d.b.a;
    if (localObject != localb) {
      localb = d.b.b;
    }
    a locala = new a(parame, localb);
    if ((a)this.a.b(parame, locala) != null) {
      return;
    }
    localObject = (f)this.c.get();
    if (localObject == null) {
      return;
    }
    int i;
    if ((this.d == 0) && (!this.e)) {
      i = 0;
    } else {
      i = 1;
    }
    localb = c(parame);
    this.d += 1;
    while ((locala.a.compareTo(localb) < 0) && (this.a.contains(parame)))
    {
      d(locala.a);
      locala.a((f)localObject, e(locala.a));
      c();
      localb = c(parame);
    }
    if (i == 0) {
      d();
    }
    this.d -= 1;
  }
  
  public void b(d.a parama)
  {
    c(a(parama));
  }
  
  public void b(e parame)
  {
    this.a.remove(parame);
  }
  
  static class a
  {
    d.b a;
    GenericLifecycleObserver b;
    
    a(e parame, d.b paramb)
    {
      this.b = j.a(parame);
      this.a = paramb;
    }
    
    void a(f paramf, d.a parama)
    {
      d.b localb = h.a(parama);
      this.a = h.a(this.a, localb);
      this.b.a(paramf, parama);
      this.a = localb;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/arch/lifecycle/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */