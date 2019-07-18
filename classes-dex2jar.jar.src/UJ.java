import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.a;

public class uj
  implements yj<Drawable>
{
  private final int a;
  private final boolean b;
  private vj c;
  
  protected uj(int paramInt, boolean paramBoolean)
  {
    this.a = paramInt;
    this.b = paramBoolean;
  }
  
  private xj<Drawable> a()
  {
    if (this.c == null) {
      this.c = new vj(this.a, this.b);
    }
    return this.c;
  }
  
  public xj<Drawable> a(a parama, boolean paramBoolean)
  {
    if (parama == a.e) {
      parama = wj.a();
    } else {
      parama = a();
    }
    return parama;
  }
  
  public static class a
  {
    private final int a;
    private boolean b;
    
    public a(int paramInt)
    {
      this.a = paramInt;
    }
    
    public uj a()
    {
      return new uj(this.a, this.b);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/uj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */