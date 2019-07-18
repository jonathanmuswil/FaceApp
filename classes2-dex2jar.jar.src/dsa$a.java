import java.util.List;

public final class dsa$a
{
  private static final a a = new a(0L, null, "", 0, 0, true);
  public static final dsa.a.a b = new dsa.a.a(null);
  private final long c;
  private final Integer d;
  private final String e;
  private final int f;
  private final int g;
  private final boolean h;
  
  public dsa$a(long paramLong, Integer paramInteger, String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.c = paramLong;
    this.d = paramInteger;
    this.e = paramString;
    this.f = paramInt1;
    this.g = paramInt2;
    this.h = paramBoolean;
  }
  
  public final a a(long paramLong, Integer paramInteger, String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    oXa.b(paramString, "lastFeedback");
    return new a(paramLong, paramInteger, paramString, paramInt1, paramInt2, paramBoolean);
  }
  
  public final String a(String paramString)
  {
    oXa.b(paramString, "separator");
    long l = this.c;
    Integer localInteger = this.d;
    if (localInteger == null) {
      localInteger = Integer.valueOf(0);
    }
    return mWa.a(mWa.b(new Object[] { Long.valueOf(l), localInteger, this.e, Integer.valueOf(this.f), Integer.valueOf(this.g), Boolean.valueOf(this.h) }), paramString, null, null, 0, null, null, 62, null);
  }
  
  public final boolean b()
  {
    return this.h;
  }
  
  public final int c()
  {
    return this.f;
  }
  
  public final int d()
  {
    return this.g;
  }
  
  public final Integer e()
  {
    return this.d;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        int i;
        if (this.c == ((a)paramObject).c) {
          i = 1;
        } else {
          i = 0;
        }
        if ((i != 0) && (oXa.a(this.d, ((a)paramObject).d)) && (oXa.a(this.e, ((a)paramObject).e)))
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
            if (i != 0)
            {
              if (this.h == ((a)paramObject).h) {
                i = 1;
              } else {
                i = 0;
              }
              if (i != 0) {
                break label139;
              }
            }
          }
        }
      }
      return false;
    }
    label139:
    return true;
  }
  
  public final long f()
  {
    return this.c;
  }
  
  public int hashCode()
  {
    long l = this.c;
    int i = (int)(l ^ l >>> 32);
    Object localObject = this.d;
    int j = 0;
    int k;
    if (localObject != null) {
      k = ((Integer)localObject).hashCode();
    } else {
      k = 0;
    }
    localObject = this.e;
    if (localObject != null) {
      j = ((String)localObject).hashCode();
    }
    int m = this.f;
    int n = this.g;
    int i1 = this.h;
    int i2 = i1;
    if (i1 != 0) {
      i2 = 1;
    }
    return ((((i * 31 + k) * 31 + j) * 31 + m) * 31 + n) * 31 + i2;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("State(lastShownTimestamp=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", lastRating=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(", lastFeedback=");
    localStringBuilder.append(this.e);
    localStringBuilder.append(", dismissCount=");
    localStringBuilder.append(this.f);
    localStringBuilder.append(", imageSavingsAfterDismiss=");
    localStringBuilder.append(this.g);
    localStringBuilder.append(", canShow=");
    localStringBuilder.append(this.h);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public final dsa.a a()
    {
      return dsa.a.a();
    }
    
    public final dsa.a a(String paramString1, String paramString2)
    {
      oXa.b(paramString1, "serialized");
      oXa.b(paramString2, "separator");
      int i = 1;
      paramString2 = zYa.a(paramString1, new String[] { paramString2 }, false, 0, 6, null);
      long l = Long.parseLong((String)paramString2.get(0));
      paramString1 = Integer.valueOf(Integer.parseInt((String)paramString2.get(1)));
      if (paramString1.intValue() <= 0) {
        i = 0;
      }
      if (i == 0) {
        paramString1 = null;
      }
      return new dsa.a(l, paramString1, (String)paramString2.get(2), Integer.parseInt((String)paramString2.get(3)), Integer.parseInt((String)paramString2.get(4)), Boolean.parseBoolean((String)paramString2.get(5)));
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/dsa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */