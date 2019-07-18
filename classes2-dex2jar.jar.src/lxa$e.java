import android.net.Uri;

public abstract class lxa$e
{
  public static final class a
    extends lxa.e
  {
    private final Eka a;
    
    public a(Eka paramEka)
    {
      super();
      this.a = paramEka;
    }
    
    public final Eka a()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          if (oXa.a(this.a, ((a)paramObject).a)) {}
        }
        else
        {
          return false;
        }
      }
      return true;
    }
    
    public int hashCode()
    {
      Eka localEka = this.a;
      int i;
      if (localEka != null) {
        i = localEka.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("FilterClicked(filter=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends lxa.e
  {
    public static final b a = new b();
    
    private b()
    {
      super();
    }
  }
  
  public static final class c
    extends lxa.e
  {
    public static final c a = new c();
    
    private c()
    {
      super();
    }
  }
  
  public static final class d
    extends lxa.e
  {
    public static final d a = new d();
    
    private d()
    {
      super();
    }
  }
  
  public static final class e
    extends lxa.e
  {
    public static final e a = new e();
    
    private e()
    {
      super();
    }
  }
  
  public static final class f
    extends lxa.e
  {
    public static final f a = new f();
    
    private f()
    {
      super();
    }
  }
  
  public static final class g
    extends lxa.e
  {
    public static final g a = new g();
    
    private g()
    {
      super();
    }
  }
  
  public static final class h
    extends lxa.e
  {
    public static final h a = new h();
    
    private h()
    {
      super();
    }
  }
  
  public static final class i
    extends lxa.e
  {
    public static final i a = new i();
    
    private i()
    {
      super();
    }
  }
  
  public static final class j
    extends lxa.e
  {
    private final Uri a;
    private final APa b;
    
    public j(Uri paramUri, APa paramAPa)
    {
      super();
      this.a = paramUri;
      this.b = paramAPa;
    }
    
    public final Uri a()
    {
      return this.a;
    }
    
    public final APa b()
    {
      return this.b;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof j))
        {
          paramObject = (j)paramObject;
          if ((oXa.a(this.a, ((j)paramObject).a)) && (oXa.a(this.b, ((j)paramObject).b))) {}
        }
        else
        {
          return false;
        }
      }
      return true;
    }
    
    public int hashCode()
    {
      Object localObject = this.a;
      int i = 0;
      int j;
      if (localObject != null) {
        j = ((Uri)localObject).hashCode();
      } else {
        j = 0;
      }
      localObject = this.b;
      if (localObject != null) {
        i = ((APa)localObject).hashCode();
      }
      return j * 31 + i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("UpdateViewSize(imageUri=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", viewSize=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/lxa$e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */