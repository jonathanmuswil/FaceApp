import io.faceapp.ui.misc.c.a;
import java.util.List;

public abstract class XIa$d
{
  public static final class a
    extends XIa.d
  {
    private final List<LIa> a;
    private final boolean b;
    
    public a(List<? extends LIa> paramList, boolean paramBoolean)
    {
      super();
      this.a = paramList;
      this.b = paramBoolean;
    }
    
    public final boolean a()
    {
      return this.b;
    }
    
    public final List<LIa> b()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject)
      {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          if (oXa.a(this.a, ((a)paramObject).a))
          {
            int i;
            if (this.b == ((a)paramObject).b) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0) {
              break label58;
            }
          }
        }
        return false;
      }
      label58:
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
      int j = this.b;
      int k = j;
      if (j != 0) {
        k = 1;
      }
      return i * 31 + k;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Content(pollParts=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", afterRefresh=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends XIa.d
  {
    public static final b a = new b();
    
    private b()
    {
      super();
    }
  }
  
  public static final class c
    extends XIa.d
  {
    public static final c a = new c();
    
    private c()
    {
      super();
    }
  }
  
  public static final class d
    extends XIa.d
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/XIa$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */