import io.faceapp.ui.misc.c.a;

public abstract class sFa$b
{
  public static final class a
    extends sFa.b
  {
    public static final a a = new a();
    
    private a()
    {
      super();
    }
  }
  
  public static final class b
    extends sFa.b
  {
    private final yka a;
    
    public b(yka paramyka)
    {
      super();
      this.a = paramyka;
    }
    
    public final yka a()
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
      yka localyka = this.a;
      int i;
      if (localyka != null) {
        i = localyka.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("FreeFilterClicked(filter=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class c
    extends sFa.b
  {
    private final yka a;
    
    public c(yka paramyka)
    {
      super();
      this.a = paramyka;
    }
    
    public final yka a()
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
      yka localyka = this.a;
      int i;
      if (localyka != null) {
        i = localyka.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("GoPro(filter=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class d
    extends sFa.b
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
      localStringBuilder.append("NetworkError(errorModel=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class e
    extends sFa.b
  {
    private final yka a;
    
    public e(yka paramyka)
    {
      super();
      this.a = paramyka;
    }
    
    public final yka a()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof e))
        {
          paramObject = (e)paramObject;
          if (oXa.a(this.a, ((e)paramObject).a)) {}
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
      yka localyka = this.a;
      int i;
      if (localyka != null) {
        i = localyka.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("PaidFilterClicked(filter=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class f
    extends sFa.b
  {
    public static final f a = new f();
    
    private f()
    {
      super();
    }
  }
  
  public static final class g
    extends sFa.b
  {
    private final Eda a;
    
    public g(Eda paramEda)
    {
      super();
      this.a = paramEda;
    }
    
    public final Eda a()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof g))
        {
          paramObject = (g)paramObject;
          if (oXa.a(this.a, ((g)paramObject).a)) {}
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
      Eda localEda = this.a;
      int i;
      if (localEda != null) {
        i = localEda.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SwitchPhoto(photoOp=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/sFa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */