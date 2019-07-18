import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

public final class vbb$a
{
  private final qbb a;
  private YYa.a b;
  private pZa c;
  private final List<Zab.a> d = new ArrayList();
  private final List<Sab.a> e = new ArrayList();
  private Executor f;
  private boolean g;
  
  public vbb$a()
  {
    this(qbb.d());
  }
  
  vbb$a(qbb paramqbb)
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/vbb$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */