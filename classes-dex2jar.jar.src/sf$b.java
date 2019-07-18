import com.bumptech.glide.load.g;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class sf$b
  extends WeakReference<Pf<?>>
{
  final g a;
  final boolean b;
  Wf<?> c;
  
  sf$b(g paramg, Pf<?> paramPf, ReferenceQueue<? super Pf<?>> paramReferenceQueue, boolean paramBoolean)
  {
    super(paramPf, paramReferenceQueue);
    Nj.a(paramg);
    this.a = ((g)paramg);
    if ((paramPf.f()) && (paramBoolean))
    {
      paramg = paramPf.e();
      Nj.a(paramg);
      paramg = (Wf)paramg;
    }
    else
    {
      paramg = null;
    }
    this.c = paramg;
    this.b = paramPf.f();
  }
  
  void a()
  {
    this.c = null;
    clear();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/sf$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */