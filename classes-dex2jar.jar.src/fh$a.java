import com.bumptech.glide.load.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class fh$a<Data>
  implements Ze<Data>, Ze.a<Data>
{
  private final List<Ze<Data>> a;
  private final qd<List<Throwable>> b;
  private int c;
  private Fe d;
  private Ze.a<? super Data> e;
  private List<Throwable> f;
  private boolean g;
  
  fh$a(List<Ze<Data>> paramList, qd<List<Throwable>> paramqd)
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


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/fh$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */