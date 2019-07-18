import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class bS$a<K, V>
  extends eR<Map<K, V>>
{
  private final eR<K> a;
  private final eR<V> b;
  private final KR<? extends Map<K, V>> c;
  
  public bS$a(MQ paramMQ, Type paramType1, eR<K> parameR, Type paramType2, eR<V> parameR1, KR<? extends Map<K, V>> paramKR)
  {
    this.a = new nS(paramType1, paramType2, parameR);
    this.b = new nS(paramType1, paramKR, parameR1);
    KR localKR;
    this.c = localKR;
  }
  
  private String b(SQ paramSQ)
  {
    if (paramSQ.t())
    {
      paramSQ = paramSQ.o();
      if (paramSQ.B()) {
        return String.valueOf(paramSQ.z());
      }
      if (paramSQ.A()) {
        return Boolean.toString(paramSQ.u());
      }
      if (paramSQ.C()) {
        return paramSQ.p();
      }
      throw new AssertionError();
    }
    if (paramSQ.r()) {
      return "null";
    }
    throw new AssertionError();
  }
  
  public Map<K, V> a(cT paramcT)
    throws IOException
  {
    Object localObject = paramcT.A();
    if (localObject == dT.i)
    {
      paramcT.y();
      return null;
    }
    Map localMap = (Map)this.c.a();
    if (localObject == dT.a)
    {
      paramcT.a();
      while (paramcT.g())
      {
        paramcT.a();
        localObject = this.a.a(paramcT);
        if (localMap.put(localObject, this.b.a(paramcT)) == null)
        {
          paramcT.d();
        }
        else
        {
          paramcT = new StringBuilder();
          paramcT.append("duplicate key: ");
          paramcT.append(localObject);
          throw new _Q(paramcT.toString());
        }
      }
      paramcT.d();
    }
    else
    {
      paramcT.b();
      while (paramcT.g())
      {
        ER.a.a(paramcT);
        localObject = this.a.a(paramcT);
        if (localMap.put(localObject, this.b.a(paramcT)) != null)
        {
          paramcT = new StringBuilder();
          paramcT.append("duplicate key: ");
          paramcT.append(localObject);
          throw new _Q(paramcT.toString());
        }
      }
      paramcT.e();
    }
    return localMap;
  }
  
  public void a(eT parameT, Map<K, V> paramMap)
    throws IOException
  {
    if (paramMap == null)
    {
      parameT.g();
      return;
    }
    if (!this.d.b)
    {
      parameT.b();
      localObject = paramMap.entrySet().iterator();
      while (((Iterator)localObject).hasNext())
      {
        paramMap = (Map.Entry)((Iterator)localObject).next();
        parameT.b(String.valueOf(paramMap.getKey()));
        this.b.a(parameT, paramMap.getValue());
      }
      parameT.d();
      return;
    }
    ArrayList localArrayList = new ArrayList(paramMap.size());
    Object localObject = new ArrayList(paramMap.size());
    paramMap = paramMap.entrySet().iterator();
    int i = 0;
    int j = 0;
    int k = 0;
    int m;
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      SQ localSQ = this.a.a(localEntry.getKey());
      localArrayList.add(localSQ);
      ((List)localObject).add(localEntry.getValue());
      if ((!localSQ.q()) && (!localSQ.s())) {
        m = 0;
      } else {
        m = 1;
      }
      k |= m;
    }
    if (k != 0)
    {
      parameT.a();
      m = localArrayList.size();
      for (k = j; k < m; k++)
      {
        parameT.a();
        MR.a((SQ)localArrayList.get(k), parameT);
        this.b.a(parameT, ((List)localObject).get(k));
        parameT.c();
      }
      parameT.c();
    }
    else
    {
      parameT.b();
      m = localArrayList.size();
      for (k = i; k < m; k++)
      {
        parameT.b(b((SQ)localArrayList.get(k)));
        this.b.a(parameT, ((List)localObject).get(k));
      }
      parameT.d();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/bS$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */