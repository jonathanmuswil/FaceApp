import io.faceapp.ui.misc.c.a;
import java.util.List;

public abstract class zMa$d
{
  public static final class a
    extends zMa.d
  {
    private final List<Yka> a;
    private final List<Yka> b;
    private final boolean c;
    
    public a(List<? extends Yka> paramList1, List<? extends Yka> paramList2, boolean paramBoolean)
    {
      super();
      this.a = paramList1;
      this.b = paramList2;
      this.c = paramBoolean;
    }
    
    public final boolean a()
    {
      return this.c;
    }
    
    public final List<Yka> b()
    {
      return this.a;
    }
    
    public final List<Yka> c()
    {
      return this.b;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject)
      {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          if ((oXa.a(this.a, ((a)paramObject).a)) && (oXa.a(this.b, ((a)paramObject).b)))
          {
            int i;
            if (this.c == ((a)paramObject).c) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0) {
              break label72;
            }
          }
        }
        return false;
      }
      label72:
      return true;
    }
    
    public int hashCode()
    {
      List localList = this.a;
      int i = 0;
      int j;
      if (localList != null) {
        j = localList.hashCode();
      } else {
        j = 0;
      }
      localList = this.b;
      if (localList != null) {
        i = localList.hashCode();
      }
      int k = this.c;
      int m = k;
      if (k != 0) {
        m = 1;
      }
      return (j * 31 + i) * 31 + m;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Content(newUpdates=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", oldUpdates=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(", afterRefresh=");
      localStringBuilder.append(this.c);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends zMa.d
  {
    public static final b a = new b();
    
    private b()
    {
      super();
    }
  }
  
  public static final class c
    extends zMa.d
  {
    public static final c a = new c();
    
    private c()
    {
      super();
    }
  }
  
  public static final class d
    extends zMa.d
  {
    private final c.a a;
    
    public d(c.a parama)
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
        if ((paramObject instanceof d))
        {
          paramObject = (d)paramObject;
          if (oXa.a(this.a, ((d)paramObject).a)) {}
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/zMa$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */