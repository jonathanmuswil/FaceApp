final class zz<E>
  extends sz<E>
{
  static final sz<Object> c = new zz(new Object[0], 0);
  private final transient Object[] d;
  private final transient int e;
  
  zz(Object[] paramArrayOfObject, int paramInt)
  {
    this.d = paramArrayOfObject;
    this.e = paramInt;
  }
  
  final int a(Object[] paramArrayOfObject, int paramInt)
  {
    System.arraycopy(this.d, 0, paramArrayOfObject, paramInt, this.e);
    return paramInt + this.e;
  }
  
  public final E get(int paramInt)
  {
    dx.a(paramInt, this.e);
    return (E)this.d[paramInt];
  }
  
  final Object[] n()
  {
    return this.d;
  }
  
  final int o()
  {
    return 0;
  }
  
  final int p()
  {
    return this.e;
  }
  
  public final int size()
  {
    return this.e;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/zz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */