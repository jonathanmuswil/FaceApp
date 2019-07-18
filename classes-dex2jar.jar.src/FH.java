import com.bumptech.glide.load.a;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class fh<Model, Data>
  implements ch<Model, Data>
{
  private final List<ch<Model, Data>> a;
  private final qd<List<Throwable>> b;
  
  fh(List<ch<Model, Data>> paramList, qd<List<Throwable>> paramqd)
  {
    this.a = paramList;
    this.b = paramqd;
  }
  
  public ch.a<Data> a(Model paramModel, int paramInt1, int paramInt2, j paramj)
  {
    int i = this.a.size();
    ArrayList localArrayList = new ArrayList(i);
    Object localObject1 = null;
    int j = 0;
    Object localObject4;
    for (Object localObject2 = null; j < i; localObject2 = localObject4)
    {
      Object localObject3 = (ch)this.a.get(j);
      localObject4 = localObject2;
      if (((ch)localObject3).a(paramModel))
      {
        localObject3 = ((ch)localObject3).a(paramModel, paramInt1, paramInt2, paramj);
        localObject4 = localObject2;
        if (localObject3 != null)
        {
          localObject4 = ((ch.a)localObject3).a;
          localArrayList.add(((ch.a)localObject3).c);
        }
      }
      j++;
    }
    paramModel = (Model)localObject1;
    if (!localArrayList.isEmpty())
    {
      paramModel = (Model)localObject1;
      if (localObject2 != null) {
        paramModel = new ch.a((g)localObject2, new fh.a(localArrayList, this.b));
      }
    }
    return paramModel;
  }
  
  public boolean a(Model paramModel)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      if (((ch)localIterator.next()).a(paramModel)) {
        return true;
      }
    }
    return false;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("MultiModelLoader{modelLoaders=");
    localStringBuilder.append(Arrays.toString(this.a.toArray()));
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  static class a<Data>
    implements Ze<Data>, Ze.a<Data>
  {
    private final List<Ze<Data>> a;
    private final qd<List<Throwable>> b;
    private int c;
    private Fe d;
    private Ze.a<? super Data> e;
    private List<Throwable> f;
    private boolean g;
    
    a(List<Ze<Data>> paramList, qd<List<Throwable>> paramqd)
    {
      this.b = paramqd;
      Nj.a(paramList);
      this.a = paramList;
      this.c = 0;
    }
    
    private void d()
    {
      if (this.g) {
        return;
      }
      if (this.c < this.a.size() - 1)
      {
        this.c += 1;
        a(this.d, this.e);
      }
      else
      {
        Nj.a(this.f);
        this.e.a(new Qf("Fetch failed", new ArrayList(this.f)));
      }
    }
    
    public Class<Data> a()
    {
      return ((Ze)this.a.get(0)).a();
    }
    
    public void a(Fe paramFe, Ze.a<? super Data> parama)
    {
      this.d = paramFe;
      this.e = parama;
      this.f = ((List)this.b.a());
      ((Ze)this.a.get(this.c)).a(paramFe, this);
      if (this.g) {
        cancel();
      }
    }
    
    public void a(Exception paramException)
    {
      List localList = this.f;
      Nj.a(localList);
      ((List)localList).add(paramException);
      d();
    }
    
    public void a(Data paramData)
    {
      if (paramData != null) {
        this.e.a(paramData);
      } else {
        d();
      }
    }
    
    public void b()
    {
      Object localObject = this.f;
      if (localObject != null) {
        this.b.a(localObject);
      }
      this.f = null;
      localObject = this.a.iterator();
      while (((Iterator)localObject).hasNext()) {
        ((Ze)((Iterator)localObject).next()).b();
      }
    }
    
    public a c()
    {
      return ((Ze)this.a.get(0)).c();
    }
    
    public void cancel()
    {
      this.g = true;
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext()) {
        ((Ze)localIterator.next()).cancel();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/fh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */