import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

final class nt<T>
  implements zt<T>
{
  private final it a;
  private final Rt<?, ?> b;
  private final boolean c;
  private final rs<?> d;
  
  private nt(Rt<?, ?> paramRt, rs<?> paramrs, it paramit)
  {
    this.b = paramRt;
    this.c = paramrs.a(paramit);
    this.d = paramrs;
    this.a = paramit;
  }
  
  static <T> nt<T> a(Rt<?, ?> paramRt, rs<?> paramrs, it paramit)
  {
    return new nt(paramRt, paramrs, paramit);
  }
  
  public final T a()
  {
    return this.a.r().K();
  }
  
  public final void a(T paramT, lu paramlu)
    throws IOException
  {
    Iterator localIterator = this.d.a(paramT).e();
    while (localIterator.hasNext())
    {
      localObject = (Map.Entry)localIterator.next();
      ys localys = (ys)((Map.Entry)localObject).getKey();
      if ((localys.U() == ku.i) && (!localys.W()) && (!localys.R()))
      {
        int i;
        if ((localObject instanceof Ps))
        {
          i = localys.m();
          localObject = ((Ps)localObject).a().b();
        }
        else
        {
          i = localys.m();
          localObject = ((Map.Entry)localObject).getValue();
        }
        paramlu.a(i, localObject);
      }
      else
      {
        throw new IllegalStateException("Found invalid MessageSet item.");
      }
    }
    Object localObject = this.b;
    ((Rt)localObject).b(((Rt)localObject).c(paramT), paramlu);
  }
  
  public final void a(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2, Wr paramWr)
    throws IOException
  {
    Es localEs = (Es)paramT;
    Object localObject = localEs.zzjp;
    paramT = (T)localObject;
    if (localObject == St.b())
    {
      paramT = St.c();
      localEs.zzjp = paramT;
    }
    while (paramInt1 < paramInt2)
    {
      paramInt1 = Vr.a(paramArrayOfByte, paramInt1, paramWr);
      int i = paramWr.a;
      if (i != 11)
      {
        if ((i & 0x7) == 2) {
          paramInt1 = Vr.a(i, paramArrayOfByte, paramInt1, paramInt2, paramT, paramWr);
        } else {
          paramInt1 = Vr.a(i, paramArrayOfByte, paramInt1, paramInt2, paramWr);
        }
      }
      else
      {
        int j = 0;
        localObject = null;
        for (;;)
        {
          i = paramInt1;
          if (paramInt1 >= paramInt2) {
            break;
          }
          paramInt1 = Vr.a(paramArrayOfByte, paramInt1, paramWr);
          int k = paramWr.a;
          int m = k >>> 3;
          i = k & 0x7;
          if (m != 2)
          {
            if ((m == 3) && (i == 2))
            {
              paramInt1 = Vr.e(paramArrayOfByte, paramInt1, paramWr);
              localObject = (_r)paramWr.c;
            }
          }
          else if (i == 0)
          {
            paramInt1 = Vr.a(paramArrayOfByte, paramInt1, paramWr);
            j = paramWr.a;
            continue;
          }
          i = paramInt1;
          if (k == 12) {
            break;
          }
          paramInt1 = Vr.a(k, paramArrayOfByte, paramInt1, paramInt2, paramWr);
        }
        if (localObject != null) {
          paramT.a(j << 3 | 0x2, localObject);
        }
        paramInt1 = i;
      }
    }
    if (paramInt1 == paramInt2) {
      return;
    }
    throw Ks.d();
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
    Bt.a(this.b, paramT1, paramT2);
    if (this.c) {
      Bt.a(this.d, paramT1, paramT2);
    }
  }
  
  public final int c(T paramT)
  {
    Rt localRt = this.b;
    int i = localRt.d(localRt.c(paramT)) + 0;
    int j = i;
    if (this.c) {
      j = i + this.d.a(paramT).h();
    }
    return j;
  }
  
  public final boolean f(T paramT)
  {
    return this.d.a(paramT).d();
  }
  
  public final void g(T paramT)
  {
    this.b.a(paramT);
    this.d.c(paramT);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/nt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */