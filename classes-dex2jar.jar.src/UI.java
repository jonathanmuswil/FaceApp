import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ui
{
  private final List<ui.a<?, ?>> a = new ArrayList();
  
  public <Z, R> ti<Z, R> a(Class<Z> paramClass, Class<R> paramClass1)
  {
    try
    {
      if (paramClass1.isAssignableFrom(paramClass))
      {
        paramClass = vi.a();
        return paramClass;
      }
      Object localObject1 = this.a.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (ui.a)((Iterator)localObject1).next();
        if (((ui.a)localObject2).a(paramClass, paramClass1))
        {
          paramClass = ((ui.a)localObject2).c;
          return paramClass;
        }
      }
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("No transcoder registered to transcode from ");
      ((StringBuilder)localObject2).append(paramClass);
      ((StringBuilder)localObject2).append(" to ");
      ((StringBuilder)localObject2).append(paramClass1);
      ((IllegalArgumentException)localObject1).<init>(((StringBuilder)localObject2).toString());
      throw ((Throwable)localObject1);
    }
    finally {}
  }
  
  public <Z, R> void a(Class<Z> paramClass, Class<R> paramClass1, ti<Z, R> paramti)
  {
    try
    {
      List localList = this.a;
      ui.a locala = new ui$a;
      locala.<init>(paramClass, paramClass1, paramti);
      localList.add(locala);
      return;
    }
    finally
    {
      paramClass = finally;
      throw paramClass;
    }
  }
  
  public <Z, R> List<Class<R>> b(Class<Z> paramClass, Class<R> paramClass1)
  {
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      if (paramClass1.isAssignableFrom(paramClass))
      {
        localArrayList.add(paramClass1);
        return localArrayList;
      }
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext()) {
        if (((ui.a)localIterator.next()).a(paramClass, paramClass1)) {
          localArrayList.add(paramClass1);
        }
      }
      return localArrayList;
    }
    finally {}
  }
  
  private static final class a<Z, R>
  {
    private final Class<Z> a;
    private final Class<R> b;
    final ti<Z, R> c;
    
    a(Class<Z> paramClass, Class<R> paramClass1, ti<Z, R> paramti)
    {
      this.a = paramClass;
      this.b = paramClass1;
      this.c = paramti;
    }
    
    public boolean a(Class<?> paramClass1, Class<?> paramClass2)
    {
      boolean bool;
      if ((this.a.isAssignableFrom(paramClass1)) && (paramClass2.isAssignableFrom(this.b))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ui.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */