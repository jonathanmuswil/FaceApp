final class ev
  extends sz<Object>
{
  private final transient Object[] c;
  private final transient int d;
  private final transient int e;
  
  ev(Object[] paramArrayOfObject, int paramInt1, int paramInt2)
  {
    this.c = paramArrayOfObject;
    this.d = paramInt1;
    this.e = paramInt2;
  }
  
  public final Object get(int paramInt)
  {
    dx.a(paramInt, this.e);
    return this.c[(paramInt * 2 + this.d)];
  }
  
  public final int size()
  {
    return this.e;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */