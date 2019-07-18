public final class qu
  implements Cloneable
{
  private static final ru a = new ru();
  private boolean b = false;
  private int[] c;
  private ru[] d;
  private int e;
  
  qu()
  {
    this(10);
  }
  
  private qu(int paramInt)
  {
    int i = paramInt << 2;
    int j;
    for (paramInt = 4;; paramInt++)
    {
      j = i;
      if (paramInt >= 32) {
        break;
      }
      j = (1 << paramInt) - 12;
      if (i <= j) {
        break;
      }
    }
    paramInt = j / 4;
    this.c = new int[paramInt];
    this.d = new ru[paramInt];
    this.e = 0;
  }
  
  final ru a(int paramInt)
  {
    return this.d[paramInt];
  }
  
  public final boolean a()
  {
    return this.e == 0;
  }
  
  final int b()
  {
    return this.e;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof qu)) {
      return false;
    }
    paramObject = (qu)paramObject;
    int i = this.e;
    if (i != ((qu)paramObject).e) {
      return false;
    }
    int[] arrayOfInt = this.c;
    Object localObject = ((qu)paramObject).c;
    for (int j = 0; j < i; j++) {
      if (arrayOfInt[j] != localObject[j])
      {
        j = 0;
        break label83;
      }
    }
    j = 1;
    label83:
    if (j != 0)
    {
      localObject = this.d;
      paramObject = ((qu)paramObject).d;
      i = this.e;
      for (j = 0; j < i; j++) {
        if (!localObject[j].equals(paramObject[j]))
        {
          j = 0;
          break label143;
        }
      }
      j = 1;
      label143:
      if (j != 0) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = 17;
    for (int j = 0; j < this.e; j++) {
      i = (i * 31 + this.c[j]) * 31 + this.d[j].hashCode();
    }
    return i;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/qu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */