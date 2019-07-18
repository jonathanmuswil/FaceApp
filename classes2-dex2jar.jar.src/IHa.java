public final class iHa
{
  public static final iHa.a a = new iHa.a(null);
  private final int b;
  private final int c;
  private final WVa<Integer, bXa<cWa>> d;
  private final int e;
  private final float f;
  
  public iHa(int paramInt1, int paramInt2, WVa<Integer, ? extends bXa<cWa>> paramWVa, int paramInt3, float paramFloat)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramWVa;
    this.e = paramInt3;
    this.f = paramFloat;
  }
  
  public final WVa<Integer, bXa<cWa>> a()
  {
    return this.d;
  }
  
  public final iHa a(int paramInt1, int paramInt2, WVa<Integer, ? extends bXa<cWa>> paramWVa, int paramInt3, float paramFloat)
  {
    return new iHa(paramInt1, paramInt2, paramWVa, paramInt3, paramFloat);
  }
  
  public final int b()
  {
    return this.b;
  }
  
  public final int c()
  {
    return this.c;
  }
  
  public final int d()
  {
    return this.e;
  }
  
  public final float e()
  {
    return this.f;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof iHa))
      {
        paramObject = (iHa)paramObject;
        int i;
        if (this.b == ((iHa)paramObject).b) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0)
        {
          if (this.c == ((iHa)paramObject).c) {
            i = 1;
          } else {
            i = 0;
          }
          if ((i != 0) && (oXa.a(this.d, ((iHa)paramObject).d)))
          {
            if (this.e == ((iHa)paramObject).e) {
              i = 1;
            } else {
              i = 0;
            }
            if ((i != 0) && (Float.compare(this.f, ((iHa)paramObject).f) == 0)) {
              break label116;
            }
          }
        }
      }
      return false;
    }
    label116:
    return true;
  }
  
  public int hashCode()
  {
    int i = this.b;
    int j = this.c;
    WVa localWVa = this.d;
    int k;
    if (localWVa != null) {
      k = localWVa.hashCode();
    } else {
      k = 0;
    }
    return (((i * 31 + j) * 31 + k) * 31 + this.e) * 31 + Float.floatToIntBits(this.f);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ContentEmptyModel(imageRes=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", messageRes=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", btnInfo=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(", textColorRes=");
    localStringBuilder.append(this.e);
    localStringBuilder.append(", verticalBias=");
    localStringBuilder.append(this.f);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public final iHa a(int paramInt)
    {
      return new iHa(2131230995, paramInt, null, 2131099885, 0.0F, 16, null);
    }
    
    public final iHa a(int paramInt1, int paramInt2)
    {
      return new iHa(paramInt1, paramInt2, null, 2131099883, 0.0F, 16, null);
    }
    
    public final iHa a(int paramInt1, int paramInt2, int paramInt3, bXa<cWa> parambXa)
    {
      oXa.b(parambXa, "btnAction");
      return new iHa(paramInt1, paramInt2, new WVa(Integer.valueOf(paramInt3), parambXa), 2131099883, 0.0F, 16, null);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/iHa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */