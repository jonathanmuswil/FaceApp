import io.faceapp.ui.misc.c.a;

public abstract class yOa$c
{
  public static final class a
    extends yOa.c
  {
    public static final a a = new a();
    
    private a()
    {
      super();
    }
  }
  
  public static final class b
    extends yOa.c
  {
    public static final b a = new b();
    
    private b()
    {
      super();
    }
  }
  
  public static final class c
    extends yOa.c
  {
    private final c.a a;
    
    public c(c.a parama)
    {
      super();
      this.a = parama;
    }
    
    public final c.a a()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof c))
        {
          paramObject = (c)paramObject;
          if (oXa.a(this.a, ((c)paramObject).a)) {}
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
      c.a locala = this.a;
      int i;
      if (locala != null) {
        i = locala.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("NetworkError(error=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class d
    extends yOa.c
  {
    public static final d a = new d();
    
    private d()
    {
      super();
    }
  }
  
  public static final class e
    extends yOa.c
  {
    private final int a;
    private final String b;
    
    public e(int paramInt, String paramString)
    {
      super();
      this.a = paramInt;
      this.b = paramString;
    }
    
    public final String a()
    {
      return this.b;
    }
    
    public final int b()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof e))
        {
          paramObject = (e)paramObject;
          int i;
          if (this.a == ((e)paramObject).a) {
            i = 1;
          } else {
            i = 0;
          }
          if ((i != 0) && (oXa.a(this.b, ((e)paramObject).b))) {}
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
      int i = this.a;
      String str = this.b;
      int j;
      if (str != null) {
        j = str.hashCode();
      } else {
        j = 0;
      }
      return i * 31 + j;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Selected(styleId=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", comment=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/yOa$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */