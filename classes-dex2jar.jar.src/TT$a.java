import java.util.Map.Entry;

class TT$a<K>
  implements Map.Entry<K, Object>
{
  private Map.Entry<K, TT> a;
  
  private TT$a(Map.Entry<K, TT> paramEntry)
  {
    this.a = paramEntry;
  }
  
  public K getKey()
  {
    return (K)this.a.getKey();
  }
  
  public Object getValue()
  {
    TT localTT = (TT)this.a.getValue();
    if (localTT == null) {
      return null;
    }
    return localTT.a();
  }
  
  public Object setValue(Object paramObject)
  {
    if ((paramObject instanceof VT)) {
      return ((TT)this.a.getValue()).c((VT)paramObject);
    }
    throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/TT$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */