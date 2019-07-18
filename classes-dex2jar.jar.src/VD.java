public class vd<E>
  implements Cloneable
{
  private static final Object a = new Object();
  private boolean b = false;
  private int[] c;
  private Object[] d;
  private int e;
  
  public vd()
  {
    this(10);
  }
  
  public vd(int paramInt)
  {
    if (paramInt == 0)
    {
      this.c = jd.a;
      this.d = jd.c;
    }
    else
    {
      paramInt = jd.b(paramInt);
      this.c = new int[paramInt];
      this.d = new Object[paramInt];
    }
    this.e = 0;
  }
  
  private void c()
  {
    int i = this.e;
    int[] arrayOfInt = this.c;
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
          arrayOfInt[k] = arrayOfInt[j];
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
  
  public void a(int paramInt)
  {
    paramInt = jd.a(this.c, this.e, paramInt);
    if (paramInt >= 0)
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
  }
  
  public void a(int paramInt, E paramE)
  {
    int i = this.e;
    if ((i != 0) && (paramInt <= this.c[(i - 1)]))
    {
      c(paramInt, paramE);
      return;
    }
    if ((this.b) && (this.e >= this.c.length)) {
      c();
    }
    int j = this.e;
    if (j >= this.c.length)
    {
      i = jd.b(j + 1);
      int[] arrayOfInt = new int[i];
      Object[] arrayOfObject = new Object[i];
      Object localObject = this.c;
      System.arraycopy(localObject, 0, arrayOfInt, 0, localObject.length);
      localObject = this.d;
      System.arraycopy(localObject, 0, arrayOfObject, 0, localObject.length);
      this.c = arrayOfInt;
      this.d = arrayOfObject;
    }
    this.c[j] = paramInt;
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
  
  public E b(int paramInt)
  {
    return (E)b(paramInt, null);
  }
  
  public E b(int paramInt, E paramE)
  {
    paramInt = jd.a(this.c, this.e, paramInt);
    if (paramInt >= 0)
    {
      Object[] arrayOfObject = this.d;
      if (arrayOfObject[paramInt] != a) {
        return (E)arrayOfObject[paramInt];
      }
    }
    return paramE;
  }
  
  public int c(int paramInt)
  {
    if (this.b) {
      c();
    }
    return jd.a(this.c, this.e, paramInt);
  }
  
  public void c(int paramInt, E paramE)
  {
    int i = jd.a(this.c, this.e, paramInt);
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
          this.c[j] = paramInt;
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
          i = jd.a(this.c, this.e, paramInt);
        }
      }
      j = this.e;
      if (j >= this.c.length)
      {
        j = jd.b(j + 1);
        int[] arrayOfInt = new int[j];
        localObject1 = new Object[j];
        Object localObject2 = this.c;
        System.arraycopy(localObject2, 0, arrayOfInt, 0, localObject2.length);
        localObject2 = this.d;
        System.arraycopy(localObject2, 0, localObject1, 0, localObject2.length);
        this.c = arrayOfInt;
        this.d = ((Object[])localObject1);
      }
      j = this.e;
      if (j - i != 0)
      {
        localObject1 = this.c;
        int k = i + 1;
        System.arraycopy(localObject1, i, localObject1, k, j - i);
        localObject1 = this.d;
        System.arraycopy(localObject1, i, localObject1, k, this.e - i);
      }
      this.c[i] = paramInt;
      this.d[i] = paramE;
      this.e += 1;
    }
  }
  
  public vd<E> clone()
  {
    try
    {
      vd localvd = (vd)super.clone();
      localvd.c = ((int[])this.c.clone());
      localvd.d = ((Object[])this.d.clone());
      return localvd;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError(localCloneNotSupportedException);
    }
  }
  
  public int d(int paramInt)
  {
    if (this.b) {
      c();
    }
    return this.c[paramInt];
  }
  
  public void e(int paramInt)
  {
    a(paramInt);
  }
  
  public E f(int paramInt)
  {
    if (this.b) {
      c();
    }
    return (E)this.d[paramInt];
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
      localStringBuilder.append(d(i));
      localStringBuilder.append('=');
      Object localObject = f(i);
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


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/vd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */