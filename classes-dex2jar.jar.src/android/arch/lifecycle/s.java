package android.arch.lifecycle;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class s
{
  private final HashMap<String, q> a = new HashMap();
  
  final q a(String paramString)
  {
    return (q)this.a.get(paramString);
  }
  
  public final void a()
  {
    Iterator localIterator = this.a.values().iterator();
    while (localIterator.hasNext()) {
      ((q)localIterator.next()).a();
    }
    this.a.clear();
  }
  
  final void a(String paramString, q paramq)
  {
    paramString = (q)this.a.put(paramString, paramq);
    if (paramString != null) {
      paramString.a();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/arch/lifecycle/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */