package com.facebook.appevents;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

class v
  implements Serializable
{
  private HashMap<b, List<f>> a = new HashMap();
  
  public v() {}
  
  public v(HashMap<b, List<f>> paramHashMap)
  {
    this.a.putAll(paramHashMap);
  }
  
  private Object writeReplace()
  {
    return new a(this.a, null);
  }
  
  public Set<b> a()
  {
    return this.a.keySet();
  }
  
  public void a(b paramb, List<f> paramList)
  {
    if (!this.a.containsKey(paramb))
    {
      this.a.put(paramb, paramList);
      return;
    }
    ((List)this.a.get(paramb)).addAll(paramList);
  }
  
  public boolean a(b paramb)
  {
    return this.a.containsKey(paramb);
  }
  
  public List<f> b(b paramb)
  {
    return (List)this.a.get(paramb);
  }
  
  static class a
    implements Serializable
  {
    private final HashMap<b, List<f>> a;
    
    private a(HashMap<b, List<f>> paramHashMap)
    {
      this.a = paramHashMap;
    }
    
    private Object readResolve()
    {
      return new v(this.a);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/appevents/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */