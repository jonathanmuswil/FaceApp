public final class tia
{
  private final boolean a;
  private final int b;
  private final int c;
  
  public tia(int paramInt1, int paramInt2)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    boolean bool;
    if (this.b == this.c) {
      bool = true;
    } else {
      bool = false;
    }
    this.a = bool;
  }
  
  public final boolean a()
  {
    return this.a;
  }
  
  public final float b()
  {
    int i = this.b;
    float f = i;
    int j = this.c;
    int k = j;
    if (j == -1) {
      k = i * 2;
    }
    return f / k;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof tia))
      {
        paramObject = (tia)paramObject;
        int i;
        if (this.b == ((tia)paramObject).b) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0)
        {
          if (this.c == ((tia)paramObject).c) {
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
    return this.b * 31 + this.c;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ByteProgress(doneBytes=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", totalBytes=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/tia.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */