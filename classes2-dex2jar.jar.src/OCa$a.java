import java.util.Arrays;

final class OCa$a
{
  private final int[] a;
  private final long b;
  private final int c;
  private final int d;
  private final int e;
  private final int f;
  private final int g;
  
  public OCa$a(int[] paramArrayOfInt, long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    this.a = paramArrayOfInt;
    this.b = paramLong;
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = paramInt4;
    this.g = paramInt5;
  }
  
  public final int a()
  {
    return this.e;
  }
  
  public final int b()
  {
    return this.d;
  }
  
  public final int c()
  {
    return this.c;
  }
  
  public final long d()
  {
    return this.b;
  }
  
  public final int[] e()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if (oXa.a(this.a, ((a)paramObject).a))
        {
          int i;
          if (this.b == ((a)paramObject).b) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0)
          {
            if (this.c == ((a)paramObject).c) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0)
            {
              if (this.d == ((a)paramObject).d) {
                i = 1;
              } else {
                i = 0;
              }
              if (i != 0)
              {
                if (this.e == ((a)paramObject).e) {
                  i = 1;
                } else {
                  i = 0;
                }
                if (i != 0)
                {
                  if (this.f == ((a)paramObject).f) {
                    i = 1;
                  } else {
                    i = 0;
                  }
                  if (i != 0)
                  {
                    if (this.g == ((a)paramObject).g) {
                      i = 1;
                    } else {
                      i = 0;
                    }
                    if (i != 0) {
                      break label169;
                    }
                  }
                }
              }
            }
          }
        }
      }
      return false;
    }
    label169:
    return true;
  }
  
  public final int f()
  {
    return this.g;
  }
  
  public final int g()
  {
    return this.f;
  }
  
  public int hashCode()
  {
    int[] arrayOfInt = this.a;
    int i;
    if (arrayOfInt != null) {
      i = Arrays.hashCode(arrayOfInt);
    } else {
      i = 0;
    }
    long l = this.b;
    return (((((i * 31 + (int)(l ^ l >>> 32)) * 31 + this.c) * 31 + this.d) * 31 + this.e) * 31 + this.f) * 31 + this.g;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Stats(hist=");
    localStringBuilder.append(Arrays.toString(this.a));
    localStringBuilder.append(", count=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", avgr=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", avgg=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(", avgb=");
    localStringBuilder.append(this.e);
    localStringBuilder.append(", minv=");
    localStringBuilder.append(this.f);
    localStringBuilder.append(", maxv=");
    localStringBuilder.append(this.g);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/OCa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */