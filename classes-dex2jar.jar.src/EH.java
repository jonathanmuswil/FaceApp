import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class eh
{
  private final gh a;
  private final eh.a b = new eh.a();
  
  private eh(gh paramgh)
  {
    this.a = paramgh;
  }
  
  public eh(qd<List<Throwable>> paramqd)
  {
    this(new gh(paramqd));
  }
  
  private static <A> Class<A> b(A paramA)
  {
    return paramA.getClass();
  }
  
  private <A> List<ch<A, ?>> b(Class<A> paramClass)
  {
    try
    {
      List localList1 = this.b.a(paramClass);
      List localList2 = localList1;
      if (localList1 == null)
      {
        localList2 = Collections.unmodifiableList(this.a.a(paramClass));
        this.b.a(paramClass, localList2);
      }
      return localList2;
    }
    finally {}
  }
  
  public List<Class<?>> a(Class<?> paramClass)
  {
    try
    {
      paramClass = this.a.b(paramClass);
      return paramClass;
    }
    finally
    {
      paramClass = finally;
      throw paramClass;
    }
  }
  
  public <A> List<ch<A, ?>> a(A paramA)
  {
    List localList = b(b(paramA));
    int i = localList.size();
    Object localObject1 = Collections.emptyList();
    int j = 0;
    int m;
    for (int k = 1; j < i; k = m)
    {
      ch localch = (ch)localList.get(j);
      Object localObject2 = localObject1;
      m = k;
      if (localch.a(paramA))
      {
        m = k;
        if (k != 0)
        {
          localObject1 = new ArrayList(i - j);
          m = 0;
        }
        ((List)localObject1).add(localch);
        localObject2 = localObject1;
      }
      j++;
      localObject1 = localObject2;
    }
    return (List<ch<A, ?>>)localObject1;
  }
  
  public <Model, Data> void a(Class<Model> paramClass, Class<Data> paramClass1, dh<? extends Model, ? extends Data> paramdh)
  {
    try
    {
      this.a.a(paramClass, paramClass1, paramdh);
      this.b.a();
      return;
    }
    finally
    {
      paramClass = finally;
      throw paramClass;
    }
  }
  
  private static class a
  {
    private final Map<Class<?>, eh.a.a<?>> a = new HashMap();
    
    public <Model> List<ch<Model, ?>> a(Class<Model> paramClass)
    {
      paramClass = (eh.a.a)this.a.get(paramClass);
      if (paramClass == null) {
        paramClass = null;
      } else {
        paramClass = paramClass.a;
      }
      return paramClass;
    }
    
    public void a()
    {
      this.a.clear();
    }
    
    public <Model> void a(Class<Model> paramClass, List<ch<Model, ?>> paramList)
    {
      if ((eh.a.a)this.a.put(paramClass, new eh.a.a(paramList)) == null) {
        return;
      }
      paramList = new StringBuilder();
      paramList.append("Already cached loaders for model: ");
      paramList.append(paramClass);
      throw new IllegalStateException(paramList.toString());
    }
    
    private static class a<Model>
    {
      final List<ch<Model, ?>> a;
      
      public a(List<ch<Model, ?>> paramList)
      {
        this.a = paramList;
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/eh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */