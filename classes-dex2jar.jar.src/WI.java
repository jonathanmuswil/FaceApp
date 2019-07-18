import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

class wi
  implements Ei
{
  private final Set<Fi> a = Collections.newSetFromMap(new WeakHashMap());
  private boolean b;
  private boolean c;
  
  void a()
  {
    this.c = true;
    Iterator localIterator = Pj.a(this.a).iterator();
    while (localIterator.hasNext()) {
      ((Fi)localIterator.next()).onDestroy();
    }
  }
  
  public void a(Fi paramFi)
  {
    this.a.add(paramFi);
    if (this.c) {
      paramFi.onDestroy();
    } else if (this.b) {
      paramFi.i();
    } else {
      paramFi.j();
    }
  }
  
  void b()
  {
    this.b = true;
    Iterator localIterator = Pj.a(this.a).iterator();
    while (localIterator.hasNext()) {
      ((Fi)localIterator.next()).i();
    }
  }
  
  public void b(Fi paramFi)
  {
    this.a.remove(paramFi);
  }
  
  void c()
  {
    this.b = false;
    Iterator localIterator = Pj.a(this.a).iterator();
    while (localIterator.hasNext()) {
      ((Fi)localIterator.next()).j();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/wi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */