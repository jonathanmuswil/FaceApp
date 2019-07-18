import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public final class vbb
{
  private final Map<Method, wbb<?>> a = new ConcurrentHashMap();
  final YYa.a b;
  final pZa c;
  final List<Zab.a> d;
  final List<Sab.a> e;
  final Executor f;
  final boolean g;
  
  vbb(YYa.a parama, pZa parampZa, List<Zab.a> paramList, List<Sab.a> paramList1, Executor paramExecutor, boolean paramBoolean)
  {
    this.b = parama;
    this.c = parampZa;
    this.d = paramList;
    this.e = paramList1;
    this.f = paramExecutor;
    this.g = paramBoolean;
  }
  
  private void b(Class<?> paramClass)
  {
    qbb localqbb = qbb.d();
    for (paramClass : paramClass.getDeclaredMethods()) {
      if (!localqbb.a(paramClass)) {
        a(paramClass);
      }
    }
  }
  
  public Sab<?, ?> a(Sab.a parama, Type paramType, Annotation[] paramArrayOfAnnotation)
  {
    xbb.a(paramType, "returnType == null");
    xbb.a(paramArrayOfAnnotation, "annotations == null");
    int i = this.e.indexOf(parama) + 1;
    int j = this.e.size();
    for (int k = i; k < j; k++)
    {
      Sab localSab = ((Sab.a)this.e.get(k)).a(paramType, paramArrayOfAnnotation, this);
      if (localSab != null) {
        return localSab;
      }
    }
    paramArrayOfAnnotation = new StringBuilder("Could not locate call adapter for ");
    paramArrayOfAnnotation.append(paramType);
    paramArrayOfAnnotation.append(".\n");
    if (parama != null)
    {
      paramArrayOfAnnotation.append("  Skipped:");
      for (k = 0; k < i; k++)
      {
        paramArrayOfAnnotation.append("\n   * ");
        paramArrayOfAnnotation.append(((Sab.a)this.e.get(k)).getClass().getName());
      }
      paramArrayOfAnnotation.append('\n');
    }
    paramArrayOfAnnotation.append("  Tried:");
    k = this.e.size();
    while (i < k)
    {
      paramArrayOfAnnotation.append("\n   * ");
      paramArrayOfAnnotation.append(((Sab.a)this.e.get(i)).getClass().getName());
      i++;
    }
    throw new IllegalArgumentException(paramArrayOfAnnotation.toString());
  }
  
  public Sab<?, ?> a(Type paramType, Annotation[] paramArrayOfAnnotation)
  {
    return a(null, paramType, paramArrayOfAnnotation);
  }
  
  public <T> Zab<DZa, T> a(Zab.a parama, Type paramType, Annotation[] paramArrayOfAnnotation)
  {
    xbb.a(paramType, "type == null");
    xbb.a(paramArrayOfAnnotation, "annotations == null");
    int i = this.d.indexOf(parama) + 1;
    int j = this.d.size();
    for (int k = i; k < j; k++)
    {
      Zab localZab = ((Zab.a)this.d.get(k)).a(paramType, paramArrayOfAnnotation, this);
      if (localZab != null) {
        return localZab;
      }
    }
    paramArrayOfAnnotation = new StringBuilder("Could not locate ResponseBody converter for ");
    paramArrayOfAnnotation.append(paramType);
    paramArrayOfAnnotation.append(".\n");
    if (parama != null)
    {
      paramArrayOfAnnotation.append("  Skipped:");
      for (k = 0; k < i; k++)
      {
        paramArrayOfAnnotation.append("\n   * ");
        paramArrayOfAnnotation.append(((Zab.a)this.d.get(k)).getClass().getName());
      }
      paramArrayOfAnnotation.append('\n');
    }
    paramArrayOfAnnotation.append("  Tried:");
    k = this.d.size();
    while (i < k)
    {
      paramArrayOfAnnotation.append("\n   * ");
      paramArrayOfAnnotation.append(((Zab.a)this.d.get(i)).getClass().getName());
      i++;
    }
    throw new IllegalArgumentException(paramArrayOfAnnotation.toString());
  }
  
  public <T> Zab<T, AZa> a(Zab.a parama, Type paramType, Annotation[] paramArrayOfAnnotation1, Annotation[] paramArrayOfAnnotation2)
  {
    xbb.a(paramType, "type == null");
    xbb.a(paramArrayOfAnnotation1, "parameterAnnotations == null");
    xbb.a(paramArrayOfAnnotation2, "methodAnnotations == null");
    int i = this.d.indexOf(parama) + 1;
    int j = this.d.size();
    for (int k = i; k < j; k++)
    {
      Zab localZab = ((Zab.a)this.d.get(k)).a(paramType, paramArrayOfAnnotation1, paramArrayOfAnnotation2, this);
      if (localZab != null) {
        return localZab;
      }
    }
    paramArrayOfAnnotation1 = new StringBuilder("Could not locate RequestBody converter for ");
    paramArrayOfAnnotation1.append(paramType);
    paramArrayOfAnnotation1.append(".\n");
    if (parama != null)
    {
      paramArrayOfAnnotation1.append("  Skipped:");
      for (k = 0; k < i; k++)
      {
        paramArrayOfAnnotation1.append("\n   * ");
        paramArrayOfAnnotation1.append(((Zab.a)this.d.get(k)).getClass().getName());
      }
      paramArrayOfAnnotation1.append('\n');
    }
    paramArrayOfAnnotation1.append("  Tried:");
    k = this.d.size();
    while (i < k)
    {
      paramArrayOfAnnotation1.append("\n   * ");
      paramArrayOfAnnotation1.append(((Zab.a)this.d.get(i)).getClass().getName());
      i++;
    }
    throw new IllegalArgumentException(paramArrayOfAnnotation1.toString());
  }
  
  public <T> Zab<T, AZa> a(Type paramType, Annotation[] paramArrayOfAnnotation1, Annotation[] paramArrayOfAnnotation2)
  {
    return a(null, paramType, paramArrayOfAnnotation1, paramArrayOfAnnotation2);
  }
  
  public <T> T a(Class<T> paramClass)
  {
    xbb.a(paramClass);
    if (this.g) {
      b(paramClass);
    }
    ClassLoader localClassLoader = paramClass.getClassLoader();
    ubb localubb = new ubb(this, paramClass);
    return (T)Proxy.newProxyInstance(localClassLoader, new Class[] { paramClass }, localubb);
  }
  
  wbb<?> a(Method paramMethod)
  {
    Object localObject = (wbb)this.a.get(paramMethod);
    if (localObject != null) {
      return (wbb<?>)localObject;
    }
    synchronized (this.a)
    {
      wbb localwbb = (wbb)this.a.get(paramMethod);
      localObject = localwbb;
      if (localwbb == null)
      {
        localObject = wbb.a(this, paramMethod);
        this.a.put(paramMethod, localObject);
      }
      return (wbb<?>)localObject;
    }
  }
  
  public <T> Zab<DZa, T> b(Type paramType, Annotation[] paramArrayOfAnnotation)
  {
    return a(null, paramType, paramArrayOfAnnotation);
  }
  
  public <T> Zab<T, String> c(Type paramType, Annotation[] paramArrayOfAnnotation)
  {
    xbb.a(paramType, "type == null");
    xbb.a(paramArrayOfAnnotation, "annotations == null");
    int i = this.d.size();
    for (int j = 0; j < i; j++)
    {
      Zab localZab = ((Zab.a)this.d.get(j)).b(paramType, paramArrayOfAnnotation, this);
      if (localZab != null) {
        return localZab;
      }
    }
    return Qab.d.a;
  }
  
  public static final class a
  {
    private final qbb a;
    private YYa.a b;
    private pZa c;
    private final List<Zab.a> d = new ArrayList();
    private final List<Sab.a> e = new ArrayList();
    private Executor f;
    private boolean g;
    
    public a()
    {
      this(qbb.d());
    }
    
    a(qbb paramqbb)
    {
      this.a = paramqbb;
    }
    
    public a a(Sab.a parama)
    {
      List localList = this.e;
      xbb.a(parama, "factory == null");
      localList.add(parama);
      return this;
    }
    
    public a a(YYa.a parama)
    {
      xbb.a(parama, "factory == null");
      this.b = ((YYa.a)parama);
      return this;
    }
    
    public a a(Zab.a parama)
    {
      List localList = this.d;
      xbb.a(parama, "factory == null");
      localList.add(parama);
      return this;
    }
    
    public a a(String paramString)
    {
      xbb.a(paramString, "baseUrl == null");
      a(pZa.b(paramString));
      return this;
    }
    
    public a a(pZa parampZa)
    {
      xbb.a(parampZa, "baseUrl == null");
      Object localObject = parampZa.j();
      if ("".equals(((List)localObject).get(((List)localObject).size() - 1)))
      {
        this.c = parampZa;
        return this;
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("baseUrl must end in /: ");
      ((StringBuilder)localObject).append(parampZa);
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    
    public a a(uZa paramuZa)
    {
      xbb.a(paramuZa, "client == null");
      a((YYa.a)paramuZa);
      return this;
    }
    
    public vbb a()
    {
      if (this.c != null)
      {
        Object localObject1 = this.b;
        Object localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new uZa();
        }
        Object localObject3 = this.f;
        localObject1 = localObject3;
        if (localObject3 == null) {
          localObject1 = this.a.a();
        }
        localObject3 = new ArrayList(this.e);
        ((List)localObject3).addAll(this.a.a((Executor)localObject1));
        ArrayList localArrayList = new ArrayList(this.d.size() + 1 + this.a.c());
        localArrayList.add(new Qab());
        localArrayList.addAll(this.d);
        localArrayList.addAll(this.a.b());
        return new vbb((YYa.a)localObject2, this.c, Collections.unmodifiableList(localArrayList), Collections.unmodifiableList((List)localObject3), (Executor)localObject1, this.g);
      }
      throw new IllegalStateException("Base URL required.");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/vbb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */