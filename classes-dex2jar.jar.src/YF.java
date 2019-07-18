import com.bumptech.glide.load.d;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.l;
import com.bumptech.glide.load.m;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class yf<Transcode>
{
  private final List<ch.a<?>> a = new ArrayList();
  private final List<g> b = new ArrayList();
  private Ce c;
  private Object d;
  private int e;
  private int f;
  private Class<?> g;
  private Af.d h;
  private j i;
  private Map<Class<?>, m<?>> j;
  private Class<Transcode> k;
  private boolean l;
  private boolean m;
  private g n;
  private Fe o;
  private Hf p;
  private boolean q;
  private boolean r;
  
  <Data> Tf<Data, ?, Transcode> a(Class<Data> paramClass)
  {
    return this.c.f().a(paramClass, this.g, this.k);
  }
  
  <X> d<X> a(X paramX)
    throws Ge.e
  {
    return this.c.f().c(paramX);
  }
  
  <Z> l<Z> a(Wf<Z> paramWf)
  {
    return this.c.f().a(paramWf);
  }
  
  List<ch<File, ?>> a(File paramFile)
    throws Ge.c
  {
    return this.c.f().a(paramFile);
  }
  
  void a()
  {
    this.c = null;
    this.d = null;
    this.n = null;
    this.g = null;
    this.k = null;
    this.i = null;
    this.o = null;
    this.j = null;
    this.p = null;
    this.a.clear();
    this.l = false;
    this.b.clear();
    this.m = false;
  }
  
  <R> void a(Ce paramCe, Object paramObject, g paramg, int paramInt1, int paramInt2, Hf paramHf, Class<?> paramClass, Class<R> paramClass1, Fe paramFe, j paramj, Map<Class<?>, m<?>> paramMap, boolean paramBoolean1, boolean paramBoolean2, Af.d paramd)
  {
    this.c = paramCe;
    this.d = paramObject;
    this.n = paramg;
    this.e = paramInt1;
    this.f = paramInt2;
    this.p = paramHf;
    this.g = paramClass;
    this.h = paramd;
    this.k = paramClass1;
    this.o = paramFe;
    this.i = paramj;
    this.j = paramMap;
    this.q = paramBoolean1;
    this.r = paramBoolean2;
  }
  
  boolean a(g paramg)
  {
    List localList = g();
    int i1 = localList.size();
    for (int i2 = 0; i2 < i1; i2++) {
      if (((ch.a)localList.get(i2)).a.equals(paramg)) {
        return true;
      }
    }
    return false;
  }
  
  bg b()
  {
    return this.c.a();
  }
  
  <Z> m<Z> b(Class<Z> paramClass)
  {
    m localm = (m)this.j.get(paramClass);
    Object localObject = localm;
    if (localm == null)
    {
      Iterator localIterator = this.j.entrySet().iterator();
      do
      {
        localObject = localm;
        if (!localIterator.hasNext()) {
          break;
        }
        localObject = (Map.Entry)localIterator.next();
      } while (!((Class)((Map.Entry)localObject).getKey()).isAssignableFrom(paramClass));
      localObject = (m)((Map.Entry)localObject).getValue();
    }
    if (localObject == null)
    {
      if ((this.j.isEmpty()) && (this.q))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Missing transformation for ");
        ((StringBuilder)localObject).append(paramClass);
        ((StringBuilder)localObject).append(". If you wish to ignore unknown resource types, use the optional transformation methods.");
        throw new IllegalArgumentException(((StringBuilder)localObject).toString());
      }
      return th.a();
    }
    return (m<Z>)localObject;
  }
  
  boolean b(Wf<?> paramWf)
  {
    return this.c.f().b(paramWf);
  }
  
  List<g> c()
  {
    if (!this.m)
    {
      this.m = true;
      this.b.clear();
      List localList = g();
      int i1 = localList.size();
      for (int i2 = 0; i2 < i1; i2++)
      {
        ch.a locala = (ch.a)localList.get(i2);
        if (!this.b.contains(locala.a)) {
          this.b.add(locala.a);
        }
        for (int i3 = 0; i3 < locala.b.size(); i3++) {
          if (!this.b.contains(locala.b.get(i3))) {
            this.b.add(locala.b.get(i3));
          }
        }
      }
    }
    return this.b;
  }
  
  boolean c(Class<?> paramClass)
  {
    boolean bool;
    if (a(paramClass) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  pg d()
  {
    return this.h.a();
  }
  
  Hf e()
  {
    return this.p;
  }
  
  int f()
  {
    return this.f;
  }
  
  List<ch.a<?>> g()
  {
    if (!this.l)
    {
      this.l = true;
      this.a.clear();
      List localList = this.c.f().a(this.d);
      int i1 = 0;
      int i2 = localList.size();
      while (i1 < i2)
      {
        ch.a locala = ((ch)localList.get(i1)).a(this.d, this.e, this.f, this.i);
        if (locala != null) {
          this.a.add(locala);
        }
        i1++;
      }
    }
    return this.a;
  }
  
  Class<?> h()
  {
    return this.d.getClass();
  }
  
  j i()
  {
    return this.i;
  }
  
  Fe j()
  {
    return this.o;
  }
  
  List<Class<?>> k()
  {
    return this.c.f().b(this.d.getClass(), this.g, this.k);
  }
  
  g l()
  {
    return this.n;
  }
  
  Class<?> m()
  {
    return this.k;
  }
  
  int n()
  {
    return this.e;
  }
  
  boolean o()
  {
    return this.r;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/yf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */