import io.faceapp.ui.misc.c;
import io.faceapp.ui.misc.c.a;
import java.util.ArrayList;

public abstract interface yOa
  extends sla, jta<yOa.c>, c
{
  public abstract void G();
  
  public abstract void I();
  
  public abstract void a(Mka paramMka);
  
  public abstract void a(String paramString, ArrayList<String> paramArrayList);
  
  public abstract void a(boolean paramBoolean);
  
  public abstract void dismiss();
  
  public abstract void f(String paramString);
  
  public abstract QQa<yOa.b> getViewActions();
  
  public abstract void i();
  
  public abstract void j();
  
  public static final class a
  {
    public static void a(yOa paramyOa, c.a parama, Object paramObject)
    {
      oXa.b(parama, "model");
      paramyOa.a(new yOa.c.c(parama));
    }
  }
  
  public static abstract class b
  {
    public static final class a
      extends yOa.b
    {
      public static final a a = new a();
      
      private a()
      {
        super();
      }
    }
    
    public static final class b
      extends yOa.b
    {
      private final String a;
      
      public b(String paramString)
      {
        super();
        this.a = paramString;
      }
      
      public final String a()
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
        String str = this.a;
        int i;
        if (str != null) {
          i = str.hashCode();
        } else {
          i = 0;
        }
        return i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("CommentChanged(newComment=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class c
      extends yOa.b
    {
      private final boolean a;
      
      public c(boolean paramBoolean)
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
          if ((paramObject instanceof c))
          {
            paramObject = (c)paramObject;
            int i;
            if (this.a == ((c)paramObject).a) {
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
    
    public static final class d
      extends yOa.b
    {
      public static final d a = new d();
      
      private d()
      {
        super();
      }
    }
    
    public static final class e
      extends yOa.b
    {
      public static final e a = new e();
      
      private e()
      {
        super();
      }
    }
    
    public static final class f
      extends yOa.b
    {
      private final int a;
      
      public f(int paramInt)
      {
        super();
        this.a = paramInt;
      }
      
      public final int a()
      {
        return this.a;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof f))
          {
            paramObject = (f)paramObject;
            int i;
            if (this.a == ((f)paramObject).a) {
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
        return this.a;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("StyleSelected(styleId=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class g
      extends yOa.b
    {
      public static final g a = new g();
      
      private g()
      {
        super();
      }
    }
  }
  
  public static abstract class c
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
  
  public static abstract interface d
  {
    public abstract void a(String paramString, Rka paramRka);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/yOa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */