public abstract class yOa$b
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/yOa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */