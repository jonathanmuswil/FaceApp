public abstract interface vKa
  extends sla, jta<vKa.b>
{
  public abstract void aa();
  
  public abstract void ca();
  
  public abstract QQa<vKa.a> getViewActions();
  
  public static abstract class a
  {
    public static final class a
      extends vKa.a
    {
      public static final a a = new a();
      
      private a()
      {
        super();
      }
    }
    
    public static final class b
      extends vKa.a
    {
      public static final b a = new b();
      
      private b()
      {
        super();
      }
    }
    
    public static final class c
      extends vKa.a
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
        localStringBuilder.append("NewFeedback(newFeedback=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class d
      extends vKa.a
    {
      public static final d a = new d();
      
      private d()
      {
        super();
      }
    }
    
    public static final class e
      extends vKa.a
    {
      private final int a;
      
      public e(int paramInt)
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
          if ((paramObject instanceof e))
          {
            paramObject = (e)paramObject;
            int i;
            if (this.a == ((e)paramObject).a) {
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
        localStringBuilder.append("RateClicked(rating=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class f
      extends vKa.a
    {
      public static final f a = new f();
      
      private f()
      {
        super();
      }
    }
  }
  
  public static abstract class b
  {
    public static final class a
      extends vKa.b
    {
      public static final a a = new a();
      
      private a()
      {
        super();
      }
    }
    
    public static final class b
      extends vKa.b
    {
      private final int a;
      
      public b(int paramInt)
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
          if ((paramObject instanceof b))
          {
            paramObject = (b)paramObject;
            int i;
            if (this.a == ((b)paramObject).a) {
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
        localStringBuilder.append("RatingToComment(rating=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class c
      extends vKa.b
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
        localStringBuilder.append("RatingToStore(rating=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/vKa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */