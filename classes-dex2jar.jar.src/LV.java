import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

final class lv
{
  private final ConcurrentHashMap<mv, List<Throwable>> a = new ConcurrentHashMap(16, 0.75F, 10);
  private final ReferenceQueue<Throwable> b = new ReferenceQueue();
  
  public final List<Throwable> a(Throwable paramThrowable, boolean paramBoolean)
  {
    for (Object localObject = this.b.poll(); localObject != null; localObject = this.b.poll()) {
      this.a.remove(localObject);
    }
    localObject = new mv(paramThrowable, null);
    localObject = (List)this.a.get(localObject);
    if (localObject != null) {
      return (List<Throwable>)localObject;
    }
    localObject = new Vector(2);
    paramThrowable = (List)this.a.putIfAbsent(new mv(paramThrowable, this.b), localObject);
    if (paramThrowable == null) {
      return (List<Throwable>)localObject;
    }
    return paramThrowable;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/lv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */