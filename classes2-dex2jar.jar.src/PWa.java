import io.faceapp.ui.misc.c;
import io.faceapp.ui.misc.c.a;
import java.util.List;

public abstract interface pwa
  extends sla, jta<pwa.c>, c
{
  public abstract void E();
  
  public abstract void H();
  
  public abstract QQa<pwa.b> getViewActions();
  
  public abstract XQa<_ja> m();
  
  public static final class a
  {
    public static void a(pwa parampwa, c.a parama, Object paramObject)
    {
      oXa.b(parama, "model");
      parampwa.a(new pwa.c.e(parama));
    }
  }
  
  public static abstract class b
  {
    public static final class a
      extends pwa.b
    {
      public static final a a = new a();
      
      private a()
      {
        super();
      }
    }
    
    public static final class b
      extends pwa.b
    {
      public static final b a = new b();
      
      private b()
      {
        super();
      }
    }
    
    public static final class c
      extends pwa.b
    {
      private final Rja a;
      
      public c(Rja paramRja)
      {
        super();
        this.a = paramRja;
      }
      
      public final Rja a()
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
        Rja localRja = this.a;
        int i;
        if (localRja != null) {
          i = localRja.hashCode();
        } else {
          i = 0;
        }
        return i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("OnImageClicked(imageDesc=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class d
      extends pwa.b
    {
      public static final d a = new d();
      
      private d()
      {
        super();
      }
    }
  }
  
  public static abstract class c
  {
    public static final class a
      extends pwa.c
    {
      private final List<Rja> a;
      
      public a()
      {
        this(null, 1, null);
      }
      
      public a(List<? extends Rja> paramList)
      {
        super();
        this.a = paramList;
      }
      
      public final List<Rja> a()
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
        List localList = this.a;
        int i;
        if (localList != null) {
          i = localList.hashCode();
        } else {
          i = 0;
        }
        return i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Content(images=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class b
      extends pwa.c
    {
      public static final b a = new b();
      
      private b()
      {
        super();
      }
    }
    
    public static final class c
      extends pwa.c
    {
      public static final c a = new c();
      
      private c()
      {
        super();
      }
    }
    
    public static final class d
      extends pwa.c
    {
      public static final d a = new d();
      
      private d()
      {
        super();
      }
    }
    
    public static final class e
      extends pwa.c
    {
      private final c.a a;
      
      public e(c.a parama)
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
          if ((paramObject instanceof e))
          {
            paramObject = (e)paramObject;
            if (oXa.a(this.a, ((e)paramObject).a)) {}
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
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pwa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */