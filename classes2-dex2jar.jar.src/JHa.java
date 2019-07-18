public final class jHa
{
  private static final jHa a = new jHa(2131230993, Integer.valueOf(2131689612), 2131689611, null, 0, 0.0F, 56, null);
  private static final jHa b = a(a, 2131230994, null, 0, null, 2131099883, 0.0F, 46, null);
  private static final jHa c = e.a(2131689629);
  private static final jHa d = e.b(2131689629);
  public static final jHa.a e = new jHa.a(null);
  private final int f;
  private final Integer g;
  private final int h;
  private final WVa<Integer, bXa<cWa>> i;
  private final int j;
  private final float k;
  
  public jHa(int paramInt1, Integer paramInteger, int paramInt2, WVa<Integer, ? extends bXa<cWa>> paramWVa, int paramInt3, float paramFloat)
  {
    this.f = paramInt1;
    this.g = paramInteger;
    this.h = paramInt2;
    this.i = paramWVa;
    this.j = paramInt3;
    this.k = paramFloat;
  }
  
  public final jHa a(int paramInt1, Integer paramInteger, int paramInt2, WVa<Integer, ? extends bXa<cWa>> paramWVa, int paramInt3, float paramFloat)
  {
    return new jHa(paramInt1, paramInteger, paramInt2, paramWVa, paramInt3, paramFloat);
  }
  
  public final WVa<Integer, bXa<cWa>> e()
  {
    return this.i;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof jHa))
      {
        paramObject = (jHa)paramObject;
        int m;
        if (this.f == ((jHa)paramObject).f) {
          m = 1;
        } else {
          m = 0;
        }
        if ((m != 0) && (oXa.a(this.g, ((jHa)paramObject).g)))
        {
          if (this.h == ((jHa)paramObject).h) {
            m = 1;
          } else {
            m = 0;
          }
          if ((m != 0) && (oXa.a(this.i, ((jHa)paramObject).i)))
          {
            if (this.j == ((jHa)paramObject).j) {
              m = 1;
            } else {
              m = 0;
            }
            if ((m != 0) && (Float.compare(this.k, ((jHa)paramObject).k) == 0)) {
              break label130;
            }
          }
        }
      }
      return false;
    }
    label130:
    return true;
  }
  
  public final int f()
  {
    return this.f;
  }
  
  public final int g()
  {
    return this.h;
  }
  
  public final int h()
  {
    return this.j;
  }
  
  public int hashCode()
  {
    int m = this.f;
    Object localObject = this.g;
    int n = 0;
    int i1;
    if (localObject != null) {
      i1 = ((Integer)localObject).hashCode();
    } else {
      i1 = 0;
    }
    int i2 = this.h;
    localObject = this.i;
    if (localObject != null) {
      n = ((WVa)localObject).hashCode();
    }
    return ((((m * 31 + i1) * 31 + i2) * 31 + n) * 31 + this.j) * 31 + Float.floatToIntBits(this.k);
  }
  
  public final Integer i()
  {
    return this.g;
  }
  
  public final float j()
  {
    return this.k;
  }
  
  public final long k()
  {
    return this.f * 37 + this.h;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ContentErrorModel(imageRes=");
    localStringBuilder.append(this.f);
    localStringBuilder.append(", titleRes=");
    localStringBuilder.append(this.g);
    localStringBuilder.append(", subtitleRes=");
    localStringBuilder.append(this.h);
    localStringBuilder.append(", btnInfo=");
    localStringBuilder.append(this.i);
    localStringBuilder.append(", textColorRes=");
    localStringBuilder.append(this.j);
    localStringBuilder.append(", verticalBias=");
    localStringBuilder.append(this.k);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public final jHa a()
    {
      return jHa.a();
    }
    
    public final jHa a(int paramInt)
    {
      return new jHa(2131230995, null, paramInt, null, 0, 0.0F, 56, null);
    }
    
    public final jHa a(bXa<cWa> parambXa)
    {
      oXa.b(parambXa, "action");
      return new jHa(2131230995, Integer.valueOf(2131689622), 2131689621, new WVa(Integer.valueOf(2131689619), parambXa), 0, 0.0F, 48, null);
    }
    
    public final jHa b()
    {
      return jHa.b();
    }
    
    public final jHa b(int paramInt)
    {
      return new jHa(2131230996, null, paramInt, null, 2131099883, 0.0F, 32, null);
    }
    
    public final jHa b(bXa<cWa> parambXa)
    {
      oXa.b(parambXa, "action");
      return new jHa(2131230996, Integer.valueOf(2131689622), 2131689621, new WVa(Integer.valueOf(2131689619), parambXa), 2131099883, 0.0F, 32, null);
    }
    
    public final jHa c()
    {
      return jHa.c();
    }
    
    public final jHa d()
    {
      return jHa.d();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/jHa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */