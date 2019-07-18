import com.bumptech.glide.load.g;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.m;
import java.util.Map;

class Jf$a
{
  final Af.d a;
  final qd<Af<?>> b = Tj.a(150, new If(this));
  private int c;
  
  Jf$a(Af.d paramd)
  {
    this.a = paramd;
  }
  
  <R> Af<R> a(Ce paramCe, Object paramObject, Nf paramNf, g paramg, int paramInt1, int paramInt2, Class<?> paramClass, Class<R> paramClass1, Fe paramFe, Hf paramHf, Map<Class<?>, m<?>> paramMap, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, j paramj, Af.a<R> parama)
  {
    Af localAf = (Af)this.b.a();
    Nj.a(localAf);
    localAf = (Af)localAf;
    int i = this.c;
    this.c = (i + 1);
    localAf.a(paramCe, paramObject, paramNf, paramg, paramInt1, paramInt2, paramClass, paramClass1, paramFe, paramHf, paramMap, paramBoolean1, paramBoolean2, paramBoolean3, paramj, parama, i);
    return localAf;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Jf$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */