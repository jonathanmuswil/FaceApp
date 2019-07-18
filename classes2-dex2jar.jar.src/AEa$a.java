public abstract class AEa$a
{
  private final int a;
  
  private AEa$a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public final int a()
  {
    return this.a;
  }
  
  public static final class a
    extends AEa.a
  {
    private final int b;
    private final Rja c;
    
    public a(int paramInt, Rja paramRja)
    {
      super(null);
      this.b = paramInt;
      this.c = paramRja;
    }
    
    public final Rja b()
    {
      return this.c;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          int i;
          if (this.b == ((a)paramObject).b) {
            i = 1;
          } else {
            i = 0;
          }
          if ((i != 0) && (oXa.a(this.c, ((a)paramObject).c))) {}
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
      int i = this.b;
      Rja localRja = this.c;
      int j;
      if (localRja != null) {
        j = localRja.hashCode();
      } else {
        j = 0;
      }
      return i * 31 + j;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("NewPhoto(i=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(", imageDesc=");
      localStringBuilder.append(this.c);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends AEa.a
  {
    private final int b;
    private final Eda c;
    private final String d;
    
    public b(int paramInt, Eda paramEda, String paramString)
    {
      super(null);
      this.b = paramInt;
      this.c = paramEda;
      this.d = paramString;
    }
    
    public final String b()
    {
      return this.d;
    }
    
    public final Eda c()
    {
      return this.c;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof b))
        {
          paramObject = (b)paramObject;
          int i;
          if (this.b == ((b)paramObject).b) {
            i = 1;
          } else {
            i = 0;
          }
          if ((i != 0) && (oXa.a(this.c, ((b)paramObject).c)) && (oXa.a(this.d, ((b)paramObject).d))) {}
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
      int i = this.b;
      Object localObject = this.c;
      int j = 0;
      int k;
      if (localObject != null) {
        k = ((Eda)localObject).hashCode();
      } else {
        k = 0;
      }
      localObject = this.d;
      if (localObject != null) {
        j = ((String)localObject).hashCode();
      }
      return (i * 31 + k) * 31 + j;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("UploadedPhoto(i=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(", photoOp=");
      localStringBuilder.append(this.c);
      localStringBuilder.append(", filterId=");
      localStringBuilder.append(this.d);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/AEa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */