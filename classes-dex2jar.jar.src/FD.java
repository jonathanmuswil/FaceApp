import java.util.Map;

class fd
  extends od<K, V>
{
  fd(gd paramgd) {}
  
  protected int a(Object paramObject)
  {
    return this.d.a(paramObject);
  }
  
  protected Object a(int paramInt1, int paramInt2)
  {
    return this.d.f[((paramInt1 << 1) + paramInt2)];
  }
  
  protected V a(int paramInt, V paramV)
  {
    return (V)this.d.a(paramInt, paramV);
  }
  
  protected void a()
  {
    this.d.clear();
  }
  
  protected void a(int paramInt)
  {
    this.d.c(paramInt);
  }
  
  protected void a(K paramK, V paramV)
  {
    this.d.put(paramK, paramV);
  }
  
  protected int b(Object paramObject)
  {
    return this.d.b(paramObject);
  }
  
  protected Map<K, V> b()
  {
    return this.d;
  }
  
  protected int c()
  {
    return this.d.g;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/fd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */