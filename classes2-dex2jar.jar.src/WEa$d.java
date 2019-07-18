import android.graphics.Matrix;

public abstract class WEa$d
{
  public static final class a
    extends WEa.d
  {
    private final int a;
    private final int b;
    
    public a(int paramInt1, int paramInt2)
    {
      super();
      this.a = paramInt1;
      this.b = paramInt2;
    }
    
    public final int a()
    {
      return this.b;
    }
    
    public final int b()
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
          int i;
          if (this.a == ((a)paramObject).a) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0)
          {
            if (this.b == ((a)paramObject).b) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0) {
              break label66;
            }
          }
        }
        return false;
      }
      label66:
      return true;
    }
    
    public int hashCode()
    {
      return this.a * 31 + this.b;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("ContainerSizeChanged(width=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", height=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends WEa.d
  {
    private final int a;
    private final Matrix b;
    
    public b(int paramInt, Matrix paramMatrix)
    {
      super();
      this.a = paramInt;
      this.b = paramMatrix;
    }
    
    public final Matrix a()
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
        if ((paramObject instanceof b))
        {
          paramObject = (b)paramObject;
          int i;
          if (this.a == ((b)paramObject).a) {
            i = 1;
          } else {
            i = 0;
          }
          if ((i != 0) && (oXa.a(this.b, ((b)paramObject).b))) {}
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
      Matrix localMatrix = this.b;
      int j;
      if (localMatrix != null) {
        j = localMatrix.hashCode();
      } else {
        j = 0;
      }
      return i * 31 + j;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("MatrixChangedByUser(partIndex=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", matrix=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class c
    extends WEa.d
  {
    private final int a;
    
    public c(int paramInt)
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
      return this.a;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("PartClicked(partIndex=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/WEa$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */