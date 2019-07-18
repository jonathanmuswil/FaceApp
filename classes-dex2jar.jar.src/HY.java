import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

final class hy<T>
  implements ry<T>
{
  private final by a;
  private final Ky<?, ?> b;
  private final boolean c;
  private final ix<?> d;
  
  private hy(Ky<?, ?> paramKy, ix<?> paramix, by paramby)
  {
    this.b = paramKy;
    this.c = paramix.a(paramby);
    this.d = paramix;
    this.a = paramby;
  }
  
  static <T> hy<T> a(Ky<?, ?> paramKy, ix<?> paramix, by paramby)
  {
    return new hy(paramKy, paramix, paramby);
  }
  
  public final void a(T paramT, dz paramdz)
    throws IOException
  {
    Iterator localIterator = this.d.a(paramT).d();
    while (localIterator.hasNext())
    {
      localObject = (Map.Entry)localIterator.next();
      nx localnx = (nx)((Map.Entry)localObject).getKey();
      if ((localnx.ja() == cz.i) && (!localnx.r()) && (!localnx.s()))
      {
        if ((localObject instanceof Hx)) {
          paramdz.a(localnx.o(), ((Hx)localObject).a().a());
        } else {
          paramdz.a(localnx.o(), ((Map.Entry)localObject).getValue());
        }
      }
      else {
        throw new IllegalStateException("Found invalid MessageSet item.");
      }
    }
    Object localObject = this.b;
    ((Ky)localObject).b(((Ky)localObject).c(paramT), paramdz);
  }
  
  public final boolean a(T paramT1, T paramT2)
  {
    if (!this.b.c(paramT1).equals(this.b.c(paramT2))) {
      return false;
    }
    if (this.c) {
      return this.d.a(paramT1).equals(this.d.a(paramT2));
    }
    return true;
  }
  
  public final int b(T paramT)
  {
    int i = this.b.c(paramT).hashCode();
    int j = i;
    if (this.c) {
      j = i * 53 + this.d.a(paramT).hashCode();
    }
    return j;
  }
  
  public final void b(T paramT1, T paramT2)
  {
    ty.a(this.b, paramT1, paramT2);
    if (this.c) {
      ty.a(this.d, paramT1, paramT2);
    }
  }
  
  public final boolean c(T paramT)
  {
    return this.d.a(paramT).c();
  }
  
  public final void d(T paramT)
  {
    this.b.a(paramT);
    this.d.c(paramT);
  }
  
  public final int e(T paramT)
  {
    Ky localKy = this.b;
    int i = localKy.d(localKy.c(paramT)) + 0;
    int j = i;
    if (this.c) {
      j = i + this.d.a(paramT).g();
    }
    return j;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/hy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */