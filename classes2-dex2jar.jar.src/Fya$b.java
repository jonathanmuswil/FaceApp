import android.graphics.Matrix;
import android.os.Bundle;

public abstract class fya$b
{
  public static final class a
    extends fya.b.c
  {
    public static final a a = new a();
  }
  
  public static final class b
    extends fya.b
  {
    public static final b a = new b();
    
    private b()
    {
      super();
    }
  }
  
  public static abstract class c
    extends fya.b
  {
    public c()
    {
      super();
    }
  }
  
  public static final class d
    extends fya.b
  {
    private final Matrix a;
    
    public d(Matrix paramMatrix)
    {
      super();
      this.a = paramMatrix;
    }
    
    public final Matrix a()
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
      Matrix localMatrix = this.a;
      int i;
      if (localMatrix != null) {
        i = localMatrix.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("MatrixChangedByUser(matrix=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class e
    extends fya.b
  {
    public static final e a = new e();
    
    private e()
    {
      super();
    }
  }
  
  public static final class f
    extends fya.b
  {
    public static final f a = new f();
    
    private f()
    {
      super();
    }
  }
  
  public static final class g
    extends fya.b
  {
    private final boolean a;
    
    public g(boolean paramBoolean)
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
        if ((paramObject instanceof g))
        {
          paramObject = (g)paramObject;
          int i;
          if (this.a == ((g)paramObject).a) {
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
      localStringBuilder.append("SetBefore(before=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class h
    extends fya.b
  {
    private final Bundle a;
    
    public h(Bundle paramBundle)
    {
      super();
      this.a = paramBundle;
    }
    
    public final Bundle a()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof h))
        {
          paramObject = (h)paramObject;
          if (oXa.a(this.a, ((h)paramObject).a)) {}
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
      Bundle localBundle = this.a;
      int i;
      if (localBundle != null) {
        i = localBundle.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SetConfig(config=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class i
    extends fya.b
  {
    public static final i a = new i();
    
    private i()
    {
      super();
    }
  }
  
  public static final class j
    extends fya.b
  {
    private final mka a;
    
    public j(mka parammka)
    {
      super();
      this.a = parammka;
    }
    
    public final mka a()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof j))
        {
          paramObject = (j)paramObject;
          if (oXa.a(this.a, ((j)paramObject).a)) {}
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
      mka localmka = this.a;
      int i;
      if (localmka != null) {
        i = localmka.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SwitchToFolder(folder=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class k
    extends fya.b
  {
    private final lya a;
    
    public k(lya paramlya)
    {
      super();
      this.a = paramlya;
    }
    
    public final lya a()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof k))
        {
          paramObject = (k)paramObject;
          if (oXa.a(this.a, ((k)paramObject).a)) {}
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
      lya locallya = this.a;
      int i;
      if (locallya != null) {
        i = locallya.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SwitchToTool(type=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/fya$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */