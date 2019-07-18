import android.util.Log;
import com.bumptech.glide.load.a;
import com.bumptech.glide.load.d;
import com.bumptech.glide.load.g;
import java.util.Collections;
import java.util.List;

class _f
  implements xf, Ze.a<Object>, xf.a
{
  private final yf<?> a;
  private final xf.a b;
  private int c;
  private uf d;
  private Object e;
  private volatile ch.a<?> f;
  private vf g;
  
  _f(yf<?> paramyf, xf.a parama)
  {
    this.a = paramyf;
    this.b = parama;
  }
  
  private void b(Object paramObject)
  {
    long l = Jj.a();
    try
    {
      d locald = this.a.a(paramObject);
      Object localObject = new wf;
      ((wf)localObject).<init>(locald, paramObject, this.a.i());
      vf localvf = new vf;
      localvf.<init>(this.f.a, this.a.l());
      this.g = localvf;
      this.a.d().a(this.g, (pg.b)localObject);
      if (Log.isLoggable("SourceGenerator", 2))
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        ((StringBuilder)localObject).append("Finished encoding source to cache, key: ");
        ((StringBuilder)localObject).append(this.g);
        ((StringBuilder)localObject).append(", data: ");
        ((StringBuilder)localObject).append(paramObject);
        ((StringBuilder)localObject).append(", encoder: ");
        ((StringBuilder)localObject).append(locald);
        ((StringBuilder)localObject).append(", duration: ");
        ((StringBuilder)localObject).append(Jj.a(l));
        Log.v("SourceGenerator", ((StringBuilder)localObject).toString());
      }
      this.f.c.b();
      this.d = new uf(Collections.singletonList(this.f.a), this.a, this);
      return;
    }
    finally
    {
      this.f.c.b();
    }
  }
  
  private boolean c()
  {
    boolean bool;
    if (this.c < this.a.g().size()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void a(g paramg, Exception paramException, Ze<?> paramZe, a parama)
  {
    this.b.a(paramg, paramException, paramZe, this.f.c.c());
  }
  
  public void a(g paramg1, Object paramObject, Ze<?> paramZe, a parama, g paramg2)
  {
    this.b.a(paramg1, paramObject, paramZe, this.f.c.c(), paramg1);
  }
  
  public void a(Exception paramException)
  {
    this.b.a(this.g, paramException, this.f.c, this.f.c.c());
  }
  
  public void a(Object paramObject)
  {
    Hf localHf = this.a.e();
    if ((paramObject != null) && (localHf.a(this.f.c.c())))
    {
      this.e = paramObject;
      this.b.b();
    }
    else
    {
      this.b.a(this.f.a, paramObject, this.f.c, this.f.c.c(), this.g);
    }
  }
  
  public boolean a()
  {
    Object localObject = this.e;
    if (localObject != null)
    {
      this.e = null;
      b(localObject);
    }
    localObject = this.d;
    if ((localObject != null) && (((uf)localObject).a())) {
      return true;
    }
    this.d = null;
    this.f = null;
    for (boolean bool = false; (!bool) && (c()); bool = true)
    {
      label49:
      localObject = this.a.g();
      int i = this.c;
      this.c = (i + 1);
      this.f = ((ch.a)((List)localObject).get(i));
      if ((this.f == null) || ((!this.a.e().a(this.f.c.c())) && (!this.a.c(this.f.c.a())))) {
        break label49;
      }
      this.f.c.a(this.a.j(), this);
    }
    return bool;
  }
  
  public void b()
  {
    throw new UnsupportedOperationException();
  }
  
  public void cancel()
  {
    ch.a locala = this.f;
    if (locala != null) {
      locala.c.cancel();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/_f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */