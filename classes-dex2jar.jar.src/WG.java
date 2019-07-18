import android.annotation.SuppressLint;
import com.bumptech.glide.load.g;

public class wg
  extends Kj<g, Wf<?>>
  implements xg
{
  private xg.a e;
  
  public wg(long paramLong)
  {
    super(paramLong);
  }
  
  protected int a(Wf<?> paramWf)
  {
    if (paramWf == null) {
      return super.b(null);
    }
    return paramWf.b();
  }
  
  @SuppressLint({"InlinedApi"})
  public void a(int paramInt)
  {
    if (paramInt >= 40) {
      a();
    } else if ((paramInt >= 20) || (paramInt == 15)) {
      a(b() / 2L);
    }
  }
  
  public void a(xg.a parama)
  {
    this.e = parama;
  }
  
  protected void b(g paramg, Wf<?> paramWf)
  {
    paramg = this.e;
    if ((paramg != null) && (paramWf != null)) {
      paramg.a(paramWf);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/wg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */