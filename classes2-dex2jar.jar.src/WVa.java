import io.faceapp.ui.misc.c;
import io.faceapp.ui.misc.c.a;
import java.util.List;

public abstract interface wva
  extends sla, c
{
  public abstract void a(String paramString);
  
  public abstract void a(wva.c paramc);
  
  public abstract void b(List<String> paramList);
  
  public abstract void dismiss();
  
  public abstract QQa<wva.b> getViewActions();
  
  public abstract void k(boolean paramBoolean);
  
  public abstract void l(boolean paramBoolean);
  
  public abstract QQa<Object> ma();
  
  public abstract void n(boolean paramBoolean);
  
  public abstract void na();
  
  public abstract void o(boolean paramBoolean);
  
  public abstract QQa<Boolean> pa();
  
  public abstract QQa<String> qa();
  
  public abstract QQa<String> ra();
  
  public abstract QQa<Object> sa();
  
  public abstract QQa<Float> ta();
  
  public static final class a
  {
    public static void a(wva paramwva, c.a parama, Object paramObject)
    {
      oXa.b(parama, "model");
      paramwva.a(new wva.c.e(parama));
    }
  }
  
  public static abstract class b
  {
    public static final class a
      extends wva.b
    {
      private final boolean a;
      
      public a(boolean paramBoolean)
      {
        super();
        this.a = paramBoolean;
      }
      
      public final boolean a()
      {
        return this.a;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof a))
          {
            paramObject = (a)paramObject;
            int i;
            if (this.a == ((a)paramObject).a) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0) {}
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
        int j = i;
        if (i != 0) {
          j = 1;
        }
        return j;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Dismiss(confirmed=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class b
      extends wva.b
    {
      private final Rja a;
      
      public b(Rja paramRja)
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
          if ((paramObject instanceof b))
          {
            paramObject = (b)paramObject;
            if (oXa.a(this.a, ((b)paramObject).a)) {}
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
    
    public static final class c
      extends wva.b
    {
      public static final c a = new c();
      
      private c()
      {
        super();
      }
    }
  }
  
  public static abstract class c
  {
    public static final class a
      extends wva.c
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
      extends wva.c
    {
      public static final b a = new b();
      
      private b()
      {
        super();
      }
    }
    
    public static final class c
      extends wva.c
    {
      public static final c a = new c();
      
      private c()
      {
        super();
      }
    }
    
    public static final class d
      extends wva.c
    {
      public static final d a = new d();
      
      private d()
      {
        super();
      }
    }
    
    public static final class e
      extends wva.c
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
    
    public static final class f
      extends wva.c
    {
      public static final f a = new f();
      
      private f()
      {
        super();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/wva.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */