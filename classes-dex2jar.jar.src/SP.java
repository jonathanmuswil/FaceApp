import com.google.android.gms.ads.n;
import com.google.android.gms.internal.ads.yh;

@yh
public final class sp
{
  private final boolean a;
  private final int b;
  private final int c;
  private final boolean d;
  private final int e;
  private final n f;
  private final boolean g;
  
  private sp(sp.a parama)
  {
    this.a = sp.a.a(parama);
    this.b = sp.a.b(parama);
    this.c = 0;
    this.d = sp.a.c(parama);
    this.e = sp.a.d(parama);
    this.f = sp.a.e(parama);
    this.g = sp.a.f(parama);
  }
  
  public final int a()
  {
    return this.e;
  }
  
  public final int b()
  {
    return this.b;
  }
  
  public final n c()
  {
    return this.f;
  }
  
  public final boolean d()
  {
    return this.d;
  }
  
  public final boolean e()
  {
    return this.a;
  }
  
  public final boolean f()
  {
    return this.g;
  }
  
  public static final class a
  {
    private boolean a = false;
    private int b = -1;
    private int c = 0;
    private boolean d = false;
    private n e;
    private int f = 1;
    private boolean g = false;
    
    public final a a(int paramInt)
    {
      this.f = paramInt;
      return this;
    }
    
    public final a a(n paramn)
    {
      this.e = paramn;
      return this;
    }
    
    public final a a(boolean paramBoolean)
    {
      this.d = paramBoolean;
      return this;
    }
    
    public final sp a()
    {
      return new sp(this, null);
    }
    
    public final a b(int paramInt)
    {
      this.b = paramInt;
      return this;
    }
    
    public final a b(boolean paramBoolean)
    {
      this.a = paramBoolean;
      return this;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/sp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */