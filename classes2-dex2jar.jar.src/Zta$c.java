import android.net.Uri;

public abstract class Zta$c
{
  public static final class a
    extends Zta.c
  {
    public static final a a = new a();
    
    private a()
    {
      super();
    }
  }
  
  public static final class b
    extends Zta.c
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
      localStringBuilder.append("FirstNameChanged(newFirstName=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class c
    extends Zta.c
  {
    private final String a;
    
    public c(String paramString)
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
      localStringBuilder.append("LastNameChanged(newLastName=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class d
    extends Zta.c
  {
    public static final d a = new d();
    
    private d()
    {
      super();
    }
  }
  
  public static final class e
    extends Zta.c
  {
    private final Uri a;
    private final boolean b;
    
    public e(Uri paramUri, boolean paramBoolean)
    {
      super();
      this.a = paramUri;
      this.b = paramBoolean;
    }
    
    public final boolean a()
    {
      return this.b;
    }
    
    public final Uri b()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject)
      {
        if ((paramObject instanceof e))
        {
          paramObject = (e)paramObject;
          if (oXa.a(this.a, ((e)paramObject).a))
          {
            int i;
            if (this.b == ((e)paramObject).b) {
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
      Uri localUri = this.a;
      int i;
      if (localUri != null) {
        i = localUri.hashCode();
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
      localStringBuilder.append("NewAvatarSelected(imageUri=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", cropped=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class f
    extends Zta.c
  {
    public static final f a = new f();
    
    private f()
    {
      super();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Zta$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */