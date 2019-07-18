import com.bumptech.glide.load.i;
import com.bumptech.glide.load.j;
import java.io.InputStream;

public class nh
  implements ch<Ug, InputStream>
{
  public static final i<Integer> a = i.a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", Integer.valueOf(2500));
  private final bh<Ug, Ug> b;
  
  public nh(bh<Ug, Ug> parambh)
  {
    this.b = parambh;
  }
  
  public ch.a<InputStream> a(Ug paramUg, int paramInt1, int paramInt2, j paramj)
  {
    bh localbh = this.b;
    Ug localUg = paramUg;
    if (localbh != null)
    {
      localUg = (Ug)localbh.a(paramUg, 0, 0);
      if (localUg == null)
      {
        this.b.a(paramUg, 0, 0, paramUg);
        localUg = paramUg;
      }
    }
    return new ch.a(localUg, new ff(localUg, ((Integer)paramj.a(a)).intValue()));
  }
  
  public boolean a(Ug paramUg)
  {
    return true;
  }
  
  public static class a
    implements dh<Ug, InputStream>
  {
    private final bh<Ug, Ug> a = new bh(500L);
    
    public ch<Ug, InputStream> a(gh paramgh)
    {
      return new nh(this.a);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/nh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */