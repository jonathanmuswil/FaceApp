public final class pHa
{
  private static final pHa a = new pHa(1, 2131099846);
  public static final pHa.a b = new pHa.a(null);
  private final int c;
  private final int d;
  
  public pHa(int paramInt1, int paramInt2)
  {
    this.c = paramInt1;
    this.d = paramInt2;
  }
  
  public final int b()
  {
    return this.d;
  }
  
  public final int c()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof pHa))
      {
        paramObject = (pHa)paramObject;
        int i;
        if (this.c == ((pHa)paramObject).c) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0)
        {
          if (this.d == ((pHa)paramObject).d) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0) {
            break label66;
          }
        }
      }
      return false;
    }
    label66:
    return true;
  }
  
  public int hashCode()
  {
    return this.c * 31 + this.d;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SeparatorModel(heightDp=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", colorRes=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public final pHa a()
    {
      return pHa.a();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pHa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */