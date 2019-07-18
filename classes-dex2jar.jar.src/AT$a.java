import java.util.LinkedHashMap;

class AT$a<K, V>
{
  private LinkedHashMap<K, V> a;
  private int b;
  
  public AT$a(int paramInt)
  {
    this.b = paramInt;
    this.a = new zT(this, paramInt * 4 / 3 + 1, 0.75F, true);
  }
  
  public V a(K paramK)
  {
    try
    {
      paramK = this.a.get(paramK);
      return paramK;
    }
    finally
    {
      paramK = finally;
      throw paramK;
    }
  }
  
  public void a(K paramK, V paramV)
  {
    try
    {
      this.a.put(paramK, paramV);
      return;
    }
    finally
    {
      paramK = finally;
      throw paramK;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/AT$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */