public abstract class JOa$b
{
  public static final class a
    extends JOa.b
  {
    private final String a;
    private final int b;
    private final int c;
    
    public a(String paramString, int paramInt1, int paramInt2)
    {
      super();
      this.a = paramString;
      this.b = paramInt1;
      this.c = paramInt2;
    }
    
    public final String a()
    {
      return this.a;
    }
    
    public final int b()
    {
      return this.c;
    }
    
    public final int c()
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
          if (oXa.a(this.a, ((a)paramObject).a))
          {
            int i;
            if (this.b == ((a)paramObject).b) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0)
            {
              if (this.c == ((a)paramObject).c) {
                i = 1;
              } else {
                i = 0;
              }
              if (i != 0) {
                break label80;
              }
            }
          }
        }
        return false;
      }
      label80:
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
      return (i * 31 + this.b) * 31 + this.c;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("AddToComment(additionText=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", selectionStart=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(", selectionEnd=");
      localStringBuilder.append(this.c);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends JOa.b
  {
    public static final b a = new b();
    
    private b()
    {
      super();
    }
  }
  
  public static final class c
    extends JOa.b
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
      localStringBuilder.append("CommentChanged(newComment=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class d
    extends JOa.b
  {
    public static final d a = new d();
    
    private d()
    {
      super();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/JOa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */