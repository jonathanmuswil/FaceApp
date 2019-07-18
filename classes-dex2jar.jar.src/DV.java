import java.util.Map;

final class dv<K>
  extends yz<K>
{
  private final transient wz<K, ?> c;
  private final transient sz<K> d;
  
  dv(wz<K, ?> paramwz, sz<K> paramsz)
  {
    this.c = paramwz;
    this.d = paramsz;
  }
  
  final int a(Object[] paramArrayOfObject, int paramInt)
  {
    return q().a(paramArrayOfObject, paramInt);
  }
  
  public final boolean contains(Object paramObject)
  {
    return this.c.get(paramObject) != null;
  }
  
  public final gv<K> m()
  {
    return (gv)q().iterator();
  }
  
  public final sz<K> q()
  {
    return this.d;
  }
  
  public final int size()
  {
    return this.c.size();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/dv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */