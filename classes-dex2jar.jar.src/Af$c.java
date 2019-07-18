import com.bumptech.glide.load.g;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.l;

class Af$c<Z>
{
  private g a;
  private l<Z> b;
  private Vf<Z> c;
  
  void a()
  {
    this.a = null;
    this.b = null;
    this.c = null;
  }
  
  void a(Af.d paramd, j paramj)
  {
    Uj.a("DecodeJob.encode");
    try
    {
      paramd = paramd.a();
      g localg = this.a;
      wf localwf = new wf;
      localwf.<init>(this.b, this.c, paramj);
      paramd.a(localg, localwf);
      return;
    }
    finally
    {
      this.c.e();
      Uj.a();
    }
  }
  
  <X> void a(g paramg, l<X> paraml, Vf<X> paramVf)
  {
    this.a = paramg;
    this.b = paraml;
    this.c = paramVf;
  }
  
  boolean b()
  {
    boolean bool;
    if (this.c != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Af$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */