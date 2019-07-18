import java.util.List;

final class vz
  extends sz<E>
{
  private final transient int c;
  private final transient int d;
  
  vz(sz paramsz, int paramInt1, int paramInt2)
  {
    this.c = paramInt1;
    this.d = paramInt2;
  }
  
  public final sz<E> a(int paramInt1, int paramInt2)
  {
    dx.a(paramInt1, paramInt2, this.d);
    sz localsz = this.e;
    int i = this.c;
    return (sz)localsz.subList(paramInt1 + i, paramInt2 + i);
  }
  
  public final E get(int paramInt)
  {
    dx.a(paramInt, this.d);
    return (E)this.e.get(paramInt + this.c);
  }
  
  final Object[] n()
  {
    return this.e.n();
  }
  
  final int o()
  {
    return this.e.o() + this.c;
  }
  
  final int p()
  {
    return this.e.o() + this.c + this.d;
  }
  
  public final int size()
  {
    return this.d;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/vz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */