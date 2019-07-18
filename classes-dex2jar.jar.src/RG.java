import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class rg
{
  private final Map<String, rg.a> a = new HashMap();
  private final rg.b b = new rg.b();
  
  void a(String paramString)
  {
    try
    {
      rg.a locala1 = (rg.a)this.a.get(paramString);
      rg.a locala2 = locala1;
      if (locala1 == null)
      {
        locala2 = this.b.a();
        this.a.put(paramString, locala2);
      }
      locala2.b += 1;
      locala2.a.lock();
      return;
    }
    finally {}
  }
  
  void b(String paramString)
  {
    try
    {
      Object localObject = this.a.get(paramString);
      Nj.a(localObject);
      localObject = (rg.a)localObject;
      if (((rg.a)localObject).b >= 1)
      {
        ((rg.a)localObject).b -= 1;
        if (((rg.a)localObject).b == 0)
        {
          rg.a locala = (rg.a)this.a.remove(paramString);
          if (locala.equals(localObject))
          {
            this.b.a(locala);
          }
          else
          {
            localIllegalStateException = new java/lang/IllegalStateException;
            localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            localStringBuilder.append("Removed the wrong lock, expected to remove: ");
            localStringBuilder.append(localObject);
            localStringBuilder.append(", but actually removed: ");
            localStringBuilder.append(locala);
            localStringBuilder.append(", safeKey: ");
            localStringBuilder.append(paramString);
            localIllegalStateException.<init>(localStringBuilder.toString());
            throw localIllegalStateException;
          }
        }
        ((rg.a)localObject).a.unlock();
        return;
      }
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("Cannot release a lock that is not held, safeKey: ");
      localStringBuilder.append(paramString);
      localStringBuilder.append(", interestedThreads: ");
      localStringBuilder.append(((rg.a)localObject).b);
      localIllegalStateException.<init>(localStringBuilder.toString());
      throw localIllegalStateException;
    }
    finally {}
  }
  
  private static class a
  {
    final Lock a = new ReentrantLock();
    int b;
  }
  
  private static class b
  {
    private final Queue<rg.a> a = new ArrayDeque();
    
    rg.a a()
    {
      synchronized (this.a)
      {
        rg.a locala = (rg.a)this.a.poll();
        ??? = locala;
        if (locala == null) {
          ??? = new rg.a();
        }
        return (rg.a)???;
      }
    }
    
    void a(rg.a parama)
    {
      synchronized (this.a)
      {
        if (this.a.size() < 10) {
          this.a.offer(parama);
        }
        return;
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/rg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */