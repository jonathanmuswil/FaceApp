import com.bumptech.glide.load.a;
import com.bumptech.glide.load.g;
import java.io.File;
import java.util.List;

class uf
  implements xf, Ze.a<Object>
{
  private final List<g> a;
  private final yf<?> b;
  private final xf.a c;
  private int d = -1;
  private g e;
  private List<ch<File, ?>> f;
  private int g;
  private volatile ch.a<?> h;
  private File i;
  
  uf(List<g> paramList, yf<?> paramyf, xf.a parama)
  {
    this.a = paramList;
    this.b = paramyf;
    this.c = parama;
  }
  
  uf(yf<?> paramyf, xf.a parama)
  {
    this(paramyf.c(), paramyf, parama);
  }
  
  private boolean b()
  {
    boolean bool;
    if (this.g < this.f.size()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void a(Exception paramException)
  {
    this.c.a(this.e, paramException, this.h.c, a.c);
  }
  
  public void a(Object paramObject)
  {
    this.c.a(this.e, paramObject, this.h.c, a.c, this.e);
  }
  
  public boolean a()
  {
    for (;;)
    {
      Object localObject1 = this.f;
      boolean bool = false;
      if ((localObject1 != null) && (b()))
      {
        this.h = null;
        while ((!bool) && (b()))
        {
          localObject1 = this.f;
          int j = this.g;
          this.g = (j + 1);
          this.h = ((ch)((List)localObject1).get(j)).a(this.i, this.b.n(), this.b.f(), this.b.i());
          if ((this.h != null) && (this.b.c(this.h.c.a())))
          {
            this.h.c.a(this.b.j(), this);
            bool = true;
          }
        }
        return bool;
      }
      this.d += 1;
      if (this.d >= this.a.size()) {
        return false;
      }
      localObject1 = (g)this.a.get(this.d);
      Object localObject2 = new vf((g)localObject1, this.b.l());
      this.i = this.b.d().a((g)localObject2);
      localObject2 = this.i;
      if (localObject2 != null)
      {
        this.e = ((g)localObject1);
        this.f = this.b.a((File)localObject2);
        this.g = 0;
      }
    }
  }
  
  public void cancel()
  {
    ch.a locala = this.h;
    if (locala != null) {
      locala.c.cancel();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/uf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */