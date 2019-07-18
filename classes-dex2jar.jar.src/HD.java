import java.util.Map;

class hd
  extends od<E, E>
{
  hd(id paramid) {}
  
  protected int a(Object paramObject)
  {
    return this.d.indexOf(paramObject);
  }
  
  protected Object a(int paramInt1, int paramInt2)
  {
    return this.d.h[paramInt1];
  }
  
  protected E a(int paramInt, E paramE)
  {
    throw new UnsupportedOperationException("not a map");
  }
  
  protected void a()
  {
    this.d.clear();
  }
  
  protected void a(int paramInt)
  {
    this.d.q(paramInt);
  }
  
  protected void a(E paramE1, E paramE2)
  {
    this.d.add(paramE1);
  }
  
  protected int b(Object paramObject)
  {
    return this.d.indexOf(paramObject);
  }
  
  protected Map<E, E> b()
  {
    throw new UnsupportedOperationException("not a map");
  }
  
  protected int c()
  {
    return this.d.i;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/hd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */