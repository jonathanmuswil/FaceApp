import java.util.List;

public final class sFa$c$a
  extends sFa.c
{
  private final List<Eda> d;
  private final Eda e;
  private final KDa f;
  private final List<zka> g;
  private final boolean h;
  private final boolean i;
  
  public sFa$c$a(List<Eda> paramList, Eda paramEda, KDa paramKDa, List<zka> paramList1, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramList, paramEda, paramKDa, null);
    this.d = paramList;
    this.e = paramEda;
    this.f = paramKDa;
    this.g = paramList1;
    this.h = paramBoolean1;
    this.i = paramBoolean2;
  }
  
  public final boolean d()
  {
    return this.i;
  }
  
  public final List<zka> e()
  {
    return this.g;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if ((oXa.a(this.d, ((a)paramObject).d)) && (oXa.a(this.e, ((a)paramObject).e)) && (oXa.a(this.f, ((a)paramObject).f)) && (oXa.a(this.g, ((a)paramObject).g)))
        {
          int j;
          if (this.h == ((a)paramObject).h) {
            j = 1;
          } else {
            j = 0;
          }
          if (j != 0)
          {
            if (this.i == ((a)paramObject).i) {
              j = 1;
            } else {
              j = 0;
            }
            if (j != 0) {
              break label122;
            }
          }
        }
      }
      return false;
    }
    label122:
    return true;
  }
  
  public final boolean f()
  {
    return this.h;
  }
  
  public int hashCode()
  {
    Object localObject = this.d;
    int j = 0;
    int k;
    if (localObject != null) {
      k = localObject.hashCode();
    } else {
      k = 0;
    }
    localObject = this.e;
    int m;
    if (localObject != null) {
      m = ((Eda)localObject).hashCode();
    } else {
      m = 0;
    }
    localObject = this.f;
    int n;
    if (localObject != null) {
      n = localObject.hashCode();
    } else {
      n = 0;
    }
    localObject = this.g;
    if (localObject != null) {
      j = localObject.hashCode();
    }
    int i1 = this.h;
    int i2 = i1;
    int i3;
    if (i1 != 0) {
      i3 = 1;
    }
    int i4 = this.i;
    i1 = i4;
    if (i4 != 0) {
      i1 = 1;
    }
    return ((((k * 31 + m) * 31 + n) * 31 + j) * 31 + i3) * 31 + i1;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Content(p=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(", sp=");
    localStringBuilder.append(this.e);
    localStringBuilder.append(", t=");
    localStringBuilder.append(this.f);
    localStringBuilder.append(", sections=");
    localStringBuilder.append(this.g);
    localStringBuilder.append(", isPro=");
    localStringBuilder.append(this.h);
    localStringBuilder.append(", demoMode=");
    localStringBuilder.append(this.i);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/sFa$c$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */