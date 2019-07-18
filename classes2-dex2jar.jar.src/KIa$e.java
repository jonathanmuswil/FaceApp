import java.util.List;

public abstract class KIa$e
{
  private final String a;
  private final int b;
  
  private KIa$e(String paramString, int paramInt)
  {
    this.a = paramString;
    this.b = paramInt;
  }
  
  public final String a()
  {
    return this.a;
  }
  
  public final int b()
  {
    return this.b;
  }
  
  public static final class a
    extends KIa.e
  {
    private final String c;
    private final int d;
    private final List<KIa.c> e;
    private final List<eoa.c> f;
    private final boolean g;
    
    public a(String paramString, int paramInt, List<? extends KIa.c> paramList, List<eoa.c> paramList1, boolean paramBoolean)
    {
      super(paramInt, null);
      this.c = paramString;
      this.d = paramInt;
      this.e = paramList;
      this.f = paramList1;
      this.g = paramBoolean;
    }
    
    public final boolean c()
    {
      return this.g;
    }
    
    public final List<KIa.c> d()
    {
      return this.e;
    }
    
    public final List<eoa.c> e()
    {
      return this.f;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject)
      {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          if (oXa.a(this.c, ((a)paramObject).c))
          {
            int i;
            if (this.d == ((a)paramObject).d) {
              i = 1;
            } else {
              i = 0;
            }
            if ((i != 0) && (oXa.a(this.e, ((a)paramObject).e)) && (oXa.a(this.f, ((a)paramObject).f)))
            {
              if (this.g == ((a)paramObject).g) {
                i = 1;
              } else {
                i = 0;
              }
              if (i != 0) {
                break label108;
              }
            }
          }
        }
        return false;
      }
      label108:
      return true;
    }
    
    public int hashCode()
    {
      Object localObject = this.c;
      int i = 0;
      int j;
      if (localObject != null) {
        j = ((String)localObject).hashCode();
      } else {
        j = 0;
      }
      int k = this.d;
      localObject = this.e;
      int m;
      if (localObject != null) {
        m = localObject.hashCode();
      } else {
        m = 0;
      }
      localObject = this.f;
      if (localObject != null) {
        i = localObject.hashCode();
      }
      int n = this.g;
      int i1 = n;
      if (n != 0) {
        i1 = 1;
      }
      return (((j * 31 + k) * 31 + m) * 31 + i) * 31 + i1;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Content(avatar=");
      localStringBuilder.append(this.c);
      localStringBuilder.append(", unreadUpdates=");
      localStringBuilder.append(this.d);
      localStringBuilder.append(", photosItems=");
      localStringBuilder.append(this.e);
      localStringBuilder.append(", recentPhotos=");
      localStringBuilder.append(this.f);
      localStringBuilder.append(", hasMoreRecent=");
      localStringBuilder.append(this.g);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends KIa.e
  {
    private final String c;
    private final int d;
    private final List<KIa.c> e;
    private final List<eoa.c> f;
    private final KIa.a g;
    
    public b(String paramString, int paramInt, List<? extends KIa.c> paramList, List<eoa.c> paramList1, KIa.a parama)
    {
      super(paramInt, null);
      this.c = paramString;
      this.d = paramInt;
      this.e = paramList;
      this.f = paramList1;
      this.g = parama;
    }
    
    public final KIa.a c()
    {
      return this.g;
    }
    
    public final List<KIa.c> d()
    {
      return this.e;
    }
    
    public final List<eoa.c> e()
    {
      return this.f;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject)
      {
        if ((paramObject instanceof b))
        {
          paramObject = (b)paramObject;
          if (oXa.a(this.c, ((b)paramObject).c))
          {
            int i;
            if (this.d == ((b)paramObject).d) {
              i = 1;
            } else {
              i = 0;
            }
            if ((i != 0) && (oXa.a(this.e, ((b)paramObject).e)) && (oXa.a(this.f, ((b)paramObject).f)) && (oXa.a(this.g, ((b)paramObject).g))) {
              break label100;
            }
          }
        }
        return false;
      }
      label100:
      return true;
    }
    
    public int hashCode()
    {
      Object localObject = this.c;
      int i = 0;
      int j;
      if (localObject != null) {
        j = ((String)localObject).hashCode();
      } else {
        j = 0;
      }
      int k = this.d;
      localObject = this.e;
      int m;
      if (localObject != null) {
        m = localObject.hashCode();
      } else {
        m = 0;
      }
      localObject = this.f;
      int n;
      if (localObject != null) {
        n = localObject.hashCode();
      } else {
        n = 0;
      }
      localObject = this.g;
      if (localObject != null) {
        i = localObject.hashCode();
      }
      return (((j * 31 + k) * 31 + m) * 31 + n) * 31 + i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("WithEmptyView(avatar=");
      localStringBuilder.append(this.c);
      localStringBuilder.append(", unreadUpdates=");
      localStringBuilder.append(this.d);
      localStringBuilder.append(", photosItems=");
      localStringBuilder.append(this.e);
      localStringBuilder.append(", recentPhotos=");
      localStringBuilder.append(this.f);
      localStringBuilder.append(", emptyItem=");
      localStringBuilder.append(this.g);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/KIa$e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */