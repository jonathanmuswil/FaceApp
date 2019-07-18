final class qy
  implements _x
{
  private final by a;
  private final String b;
  private final Object[] c;
  private final int d;
  
  qy(by paramby, String paramString, Object[] paramArrayOfObject)
  {
    this.a = paramby;
    this.b = paramString;
    this.c = paramArrayOfObject;
    int i = paramString.charAt(0);
    if (i < 55296)
    {
      this.d = i;
      return;
    }
    int j = i & 0x1FFF;
    int k = 13;
    int m;
    for (i = 1;; i++)
    {
      m = paramString.charAt(i);
      if (m < 55296) {
        break;
      }
      j |= (m & 0x1FFF) << k;
      k += 13;
    }
    this.d = (j | m << k);
  }
  
  public final int a()
  {
    if ((this.d & 0x1) == 1) {
      return sx.d.i;
    }
    return sx.d.j;
  }
  
  public final boolean b()
  {
    return (this.d & 0x2) == 2;
  }
  
  public final by c()
  {
    return this.a;
  }
  
  final String d()
  {
    return this.b;
  }
  
  final Object[] e()
  {
    return this.c;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/qy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */