import java.util.Map.Entry;

final class QA$a
  implements Map.Entry<K, V>
{
  private int a;
  
  QA$a(QA paramQA, int paramInt)
  {
    this.a = paramInt;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof Map.Entry)) {
      return false;
    }
    paramObject = (Map.Entry)paramObject;
    Object localObject1 = getKey();
    Object localObject2 = ((Map.Entry)paramObject).getKey();
    int i;
    if ((localObject1 != localObject2) && ((localObject1 == null) || (!localObject1.equals(localObject2)))) {
      i = 0;
    } else {
      i = 1;
    }
    if (i != 0)
    {
      localObject1 = getValue();
      paramObject = ((Map.Entry)paramObject).getValue();
      if ((localObject1 != paramObject) && ((localObject1 == null) || (!localObject1.equals(paramObject)))) {
        i = 0;
      } else {
        i = 1;
      }
      if (i != 0) {
        return true;
      }
    }
    return false;
  }
  
  public final K getKey()
  {
    return (K)this.b.b(this.a);
  }
  
  public final V getValue()
  {
    return (V)this.b.c(this.a);
  }
  
  public final int hashCode()
  {
    Object localObject1 = getKey();
    Object localObject2 = getValue();
    int i = 0;
    int j;
    if (localObject1 != null) {
      j = localObject1.hashCode();
    } else {
      j = 0;
    }
    if (localObject2 != null) {
      i = localObject2.hashCode();
    }
    return j ^ i;
  }
  
  public final V setValue(V paramV)
  {
    return (V)this.b.a(this.a, paramV);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/QA$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */