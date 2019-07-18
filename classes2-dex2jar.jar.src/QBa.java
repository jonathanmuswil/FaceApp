import android.os.Bundle;

public abstract class qBa
{
  public static final class a
    extends qBa
  {
    public static final a a = new a();
    
    private a()
    {
      super();
    }
  }
  
  public static final class b
    extends qBa
  {
    private final Throwable a;
    
    public b(Throwable paramThrowable)
    {
      super();
      this.a = paramThrowable;
    }
    
    public final Throwable a()
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
      Throwable localThrowable = this.a;
      int i;
      if (localThrowable != null) {
        i = localThrowable.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Failure(reason=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class c
    extends qBa
  {
    private final Bundle a;
    private final Object b;
    
    public c(Bundle paramBundle, Object paramObject)
    {
      super();
      this.a = paramBundle;
      this.b = paramObject;
    }
    
    public final Bundle a()
    {
      return this.a;
    }
    
    public final Object b()
    {
      return this.b;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof c))
        {
          paramObject = (c)paramObject;
          if ((oXa.a(this.a, ((c)paramObject).a)) && (oXa.a(this.b, ((c)paramObject).b))) {}
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
        j = localObject.hashCode();
      } else {
        j = 0;
      }
      localObject = this.b;
      if (localObject != null) {
        i = localObject.hashCode();
      }
      return j * 31 + i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Success(config=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", result=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/qBa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */