import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public final class jg
  implements bg
{
  private final hg<jg.a, Object> a = new hg();
  private final jg.b b = new jg.b();
  private final Map<Class<?>, NavigableMap<Integer, Integer>> c = new HashMap();
  private final Map<Class<?>, ag<?>> d = new HashMap();
  private final int e;
  private int f;
  
  public jg(int paramInt)
  {
    this.e = paramInt;
  }
  
  private <T> ag<T> a(Class<T> paramClass)
  {
    ag localag = (ag)this.d.get(paramClass);
    Object localObject = localag;
    if (localag == null)
    {
      if (paramClass.equals(int[].class))
      {
        localObject = new ig();
      }
      else
      {
        if (!paramClass.equals(byte[].class)) {
          break label72;
        }
        localObject = new gg();
      }
      this.d.put(paramClass, localObject);
      return (ag<T>)localObject;
      label72:
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("No array pool found for: ");
      ((StringBuilder)localObject).append(paramClass.getSimpleName());
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    return (ag<T>)localObject;
  }
  
  private <T> ag<T> a(T paramT)
  {
    return a(paramT.getClass());
  }
  
  private <T> T a(jg.a parama)
  {
    return (T)this.a.a(parama);
  }
  
  private <T> T a(jg.a parama, Class<T> paramClass)
  {
    ag localag = a(paramClass);
    Object localObject = a(parama);
    if (localObject != null)
    {
      this.f -= localag.a(localObject) * localag.a();
      c(localag.a(localObject), paramClass);
    }
    paramClass = (Class<T>)localObject;
    if (localObject == null)
    {
      if (Log.isLoggable(localag.getTag(), 2))
      {
        localObject = localag.getTag();
        paramClass = new StringBuilder();
        paramClass.append("Allocated ");
        paramClass.append(parama.b);
        paramClass.append(" bytes");
        Log.v((String)localObject, paramClass.toString());
      }
      paramClass = localag.newArray(parama.b);
    }
    return paramClass;
  }
  
  private boolean a(int paramInt, Integer paramInteger)
  {
    boolean bool;
    if ((paramInteger != null) && ((c()) || (paramInteger.intValue() <= paramInt * 8))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private NavigableMap<Integer, Integer> b(Class<?> paramClass)
  {
    NavigableMap localNavigableMap = (NavigableMap)this.c.get(paramClass);
    Object localObject = localNavigableMap;
    if (localNavigableMap == null)
    {
      localObject = new TreeMap();
      this.c.put(paramClass, localObject);
    }
    return (NavigableMap<Integer, Integer>)localObject;
  }
  
  private void b()
  {
    b(this.e);
  }
  
  private void b(int paramInt)
  {
    while (this.f > paramInt)
    {
      Object localObject = this.a.a();
      Nj.a(localObject);
      ag localag = a(localObject);
      this.f -= localag.a(localObject) * localag.a();
      c(localag.a(localObject), localObject.getClass());
      if (Log.isLoggable(localag.getTag(), 2))
      {
        String str = localag.getTag();
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("evicted: ");
        localStringBuilder.append(localag.a(localObject));
        Log.v(str, localStringBuilder.toString());
      }
    }
  }
  
  private void c(int paramInt, Class<?> paramClass)
  {
    NavigableMap localNavigableMap = b(paramClass);
    paramClass = (Integer)localNavigableMap.get(Integer.valueOf(paramInt));
    if (paramClass != null)
    {
      if (paramClass.intValue() == 1) {
        localNavigableMap.remove(Integer.valueOf(paramInt));
      } else {
        localNavigableMap.put(Integer.valueOf(paramInt), Integer.valueOf(paramClass.intValue() - 1));
      }
      return;
    }
    paramClass = new StringBuilder();
    paramClass.append("Tried to decrement empty size, size: ");
    paramClass.append(paramInt);
    paramClass.append(", this: ");
    paramClass.append(this);
    throw new NullPointerException(paramClass.toString());
  }
  
  private boolean c()
  {
    int i = this.f;
    boolean bool;
    if ((i != 0) && (this.e / i < 2)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private boolean c(int paramInt)
  {
    boolean bool;
    if (paramInt <= this.e / 2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public <T> T a(int paramInt, Class<T> paramClass)
  {
    try
    {
      paramClass = a(this.b.a(paramInt, paramClass), paramClass);
      return paramClass;
    }
    finally
    {
      paramClass = finally;
      throw paramClass;
    }
  }
  
  public void a()
  {
    try
    {
      b(0);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void a(int paramInt)
  {
    if (paramInt >= 40) {
      try
      {
        a();
      }
      finally
      {
        break label44;
      }
    } else if ((paramInt >= 20) || (paramInt == 15)) {
      b(this.e / 2);
    }
    return;
    label44:
    throw ((Throwable)localObject);
  }
  
  public <T> T b(int paramInt, Class<T> paramClass)
  {
    try
    {
      Object localObject = (Integer)b(paramClass).ceilingKey(Integer.valueOf(paramInt));
      if (a(paramInt, (Integer)localObject)) {
        localObject = this.b.a(((Integer)localObject).intValue(), paramClass);
      } else {
        localObject = this.b.a(paramInt, paramClass);
      }
      paramClass = a((jg.a)localObject, paramClass);
      return paramClass;
    }
    finally {}
  }
  
  public <T> void put(T paramT)
  {
    try
    {
      Object localObject1 = paramT.getClass();
      Object localObject2 = a((Class)localObject1);
      int i = ((ag)localObject2).a(paramT);
      int j = ((ag)localObject2).a() * i;
      boolean bool = c(j);
      if (!bool) {
        return;
      }
      localObject2 = this.b.a(i, (Class)localObject1);
      this.a.a((mg)localObject2, paramT);
      paramT = b((Class)localObject1);
      localObject1 = (Integer)paramT.get(Integer.valueOf(((jg.a)localObject2).b));
      int k = ((jg.a)localObject2).b;
      i = 1;
      if (localObject1 != null) {
        i = 1 + ((Integer)localObject1).intValue();
      }
      paramT.put(Integer.valueOf(k), Integer.valueOf(i));
      this.f += j;
      b();
      return;
    }
    finally {}
  }
  
  private static final class a
    implements mg
  {
    private final jg.b a;
    int b;
    private Class<?> c;
    
    a(jg.b paramb)
    {
      this.a = paramb;
    }
    
    public void a()
    {
      this.a.a(this);
    }
    
    void a(int paramInt, Class<?> paramClass)
    {
      this.b = paramInt;
      this.c = paramClass;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool1 = paramObject instanceof a;
      boolean bool2 = false;
      boolean bool3 = bool2;
      if (bool1)
      {
        paramObject = (a)paramObject;
        bool3 = bool2;
        if (this.b == ((a)paramObject).b)
        {
          bool3 = bool2;
          if (this.c == ((a)paramObject).c) {
            bool3 = true;
          }
        }
      }
      return bool3;
    }
    
    public int hashCode()
    {
      int i = this.b;
      Class localClass = this.c;
      int j;
      if (localClass != null) {
        j = localClass.hashCode();
      } else {
        j = 0;
      }
      return i * 31 + j;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Key{size=");
      localStringBuilder.append(this.b);
      localStringBuilder.append("array=");
      localStringBuilder.append(this.c);
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
  }
  
  private static final class b
    extends dg<jg.a>
  {
    protected jg.a a()
    {
      return new jg.a(this);
    }
    
    jg.a a(int paramInt, Class<?> paramClass)
    {
      jg.a locala = (jg.a)b();
      locala.a(paramInt, paramClass);
      return locala;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/jg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */