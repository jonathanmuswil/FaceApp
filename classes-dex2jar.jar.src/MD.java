public class md<E>
  implements Cloneable
{
  private static final Object a = new Object();
  private boolean b = false;
  private long[] c;
  private Object[] d;
  private int e;
  
  public md()
  {
    this(10);
  }
  
  public md(int paramInt)
  {
    if (paramInt == 0)
    {
      this.c = jd.b;
      this.d = jd.c;
    }
    else
    {
      paramInt = jd.c(paramInt);
      this.c = new long[paramInt];
      this.d = new Object[paramInt];
    }
    this.e = 0;
  }
  
  private void c()
  {
    int i = this.e;
    long[] arrayOfLong = this.c;
    Object[] arrayOfObject = this.d;
    int j = 0;
    int m;
    for (int k = 0; j < i; k = m)
    {
      Object localObject = arrayOfObject[j];
      m = k;
      if (localObject != a)
      {
        if (j != k)
        {
          arrayOfLong[k] = arrayOfLong[j];
          arrayOfObject[k] = localObject;
          arrayOfObject[j] = null;
        }
        m = k + 1;
      }
      j++;
    }
    this.b = false;
    this.e = k;
  }
  
  public long a(int paramInt)
  {
    if (this.b) {
      c();
    }
    return this.c[paramInt];
  }
  
  public void a()
  {
    int i = this.e;
    Object[] arrayOfObject = this.d;
    for (int j = 0; j < i; j++) {
      arrayOfObject[j] = null;
    }
    this.e = 0;
    this.b = false;
  }
  
  public void a(long paramLong)
  {
    int i = jd.a(this.c, this.e, paramLong);
    if (i >= 0)
    {
      Object[] arrayOfObject = this.d;
      Object localObject1 = arrayOfObject[i];
      Object localObject2 = a;
      if (localObject1 != localObject2)
      {
        arrayOfObject[i] = localObject2;
        this.b = true;
      }
    }
  }
  
  public void a(long paramLong, E paramE)
  {
    int i = this.e;
    if ((i != 0) && (paramLong <= this.c[(i - 1)]))
    {
      c(paramLong, paramE);
      return;
    }
    if ((this.b) && (this.e >= this.c.length)) {
      c();
    }
    int j = this.e;
    if (j >= this.c.length)
    {
      i = jd.c(j + 1);
      long[] arrayOfLong = new long[i];
      Object[] arrayOfObject = new Object[i];
      Object localObject = this.c;
      System.arraycopy(localObject, 0, arrayOfLong, 0, localObject.length);
      localObject = this.d;
      System.arraycopy(localObject, 0, arrayOfObject, 0, localObject.length);
      this.c = arrayOfLong;
      this.d = arrayOfObject;
    }
    this.c[j] = paramLong;
    this.d[j] = paramE;
    this.e = (j + 1);
  }
  
  public int b()
  {
    if (this.b) {
      c();
    }
    return this.e;
  }
  
  public E b(long paramLong)
  {
    return (E)b(paramLong, null);
  }
  
  public E b(long paramLong, E paramE)
  {
    int i = jd.a(this.c, this.e, paramLong);
    if (i >= 0)
    {
      Object[] arrayOfObject = this.d;
      if (arrayOfObject[i] != a) {
        return (E)arrayOfObject[i];
      }
    }
    return paramE;
  }
  
  public void b(int paramInt)
  {
    Object[] arrayOfObject = this.d;
    Object localObject1 = arrayOfObject[paramInt];
    Object localObject2 = a;
    if (localObject1 != localObject2)
    {
      arrayOfObject[paramInt] = localObject2;
      this.b = true;
    }
  }
  
  public int c(long paramLong)
  {
    if (this.b) {
      c();
    }
    return jd.a(this.c, this.e, paramLong);
  }
  
  public E c(int paramInt)
  {
    if (this.b) {
      c();
    }
    return (E)this.d[paramInt];
  }
  
  public void c(long paramLong, E paramE)
  {
    int i = jd.a(this.c, this.e, paramLong);
    if (i >= 0)
    {
      this.d[i] = paramE;
    }
    else
    {
      int j = i;
      Object localObject1;
      if (j < this.e)
      {
        localObject1 = this.d;
        if (localObject1[j] == a)
        {
          this.c[j] = paramLong;
          localObject1[j] = paramE;
          return;
        }
      }
      i = j;
      if (this.b)
      {
        i = j;
        if (this.e >= this.c.length)
        {
          c();
          i = jd.a(this.c, this.e, paramLong);
        }
      }
      j = this.e;
      if (j >= this.c.length)
      {
        j = jd.c(j + 1);
        long[] arrayOfLong = new long[j];
        localObject1 = new Object[j];
        Object localObject2 = this.c;
        System.arraycopy(localObject2, 0, arrayOfLong, 0, localObject2.length);
        localObject2 = this.d;
        System.arraycopy(localObject2, 0, localObject1, 0, localObject2.length);
        this.c = arrayOfLong;
        this.d = ((Object[])localObject1);
      }
      int k = this.e;
      if (k - i != 0)
      {
        localObject1 = this.c;
        j = i + 1;
        System.arraycopy(localObject1, i, localObject1, j, k - i);
        localObject1 = this.d;
        System.arraycopy(localObject1, i, localObject1, j, this.e - i);
      }
      this.c[i] = paramLong;
      this.d[i] = paramE;
      this.e += 1;
    }
  }
  
  public md<E> clone()
  {
    try
    {
      md localmd = (md)super.clone();
      localmd.c = ((long[])this.c.clone());
      localmd.d = ((Object[])this.d.clone());
      return localmd;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError(localCloneNotSupportedException);
    }
  }
  
  public String toString()
  {
    if (b() <= 0) {
      return "{}";
    }
    StringBuilder localStringBuilder = new StringBuilder(this.e * 28);
    localStringBuilder.append('{');
    for (int i = 0; i < this.e; i++)
    {
      if (i > 0) {
        localStringBuilder.append(", ");
      }
      localStringBuilder.append(a(i));
      localStringBuilder.append('=');
      Object localObject = c(i);
      if (localObject != this) {
        localStringBuilder.append(localObject);
      } else {
        localStringBuilder.append("(this Map)");
      }
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/md.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */