import io.faceapp.ui.misc.c;
import io.faceapp.ui.misc.c.a;
import java.util.List;

public abstract interface sFa
  extends sla, jta<sFa.c>, c
{
  public abstract void a(yka paramyka);
  
  public abstract void c(boolean paramBoolean);
  
  public abstract void dismiss();
  
  public abstract QQa<sFa.b> getViewActions();
  
  public static abstract interface a
  {
    public abstract void a(KDa paramKDa);
    
    public abstract void a(KDa paramKDa, Eda paramEda, yka paramyka);
  }
  
  public static abstract class b
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
  
  public static abstract class c
  {
    private final List<Eda> a;
    private final Eda b;
    private final KDa c;
    
    private c(List<Eda> paramList, Eda paramEda, KDa paramKDa)
    {
      this.a = paramList;
      this.b = paramEda;
      this.c = paramKDa;
    }
    
    public final List<Eda> a()
    {
      return this.a;
    }
    
    public final Eda b()
    {
      return this.b;
    }
    
    public final KDa c()
    {
      return this.c;
    }
    
    public static final class a
      extends sFa.c
    {
      private final List<Eda> d;
      private final Eda e;
      private final KDa f;
      private final List<zka> g;
      private final boolean h;
      private final boolean i;
      
      public a(List<Eda> paramList, Eda paramEda, KDa paramKDa, List<zka> paramList1, boolean paramBoolean1, boolean paramBoolean2)
      {
        super(paramEda, paramKDa, null);
        this.d = paramList;
        this.e = paramEda;
        this.f = paramKDa;
        this.g = paramList1;
        this.h = paramBoolean1;
        this.i = paramBoolean2;
      }
      
      public final boolean d()
      {
        return this.i;
      }
      
      public final List<zka> e()
      {
        return this.g;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject)
        {
          if ((paramObject instanceof a))
          {
            paramObject = (a)paramObject;
            if ((oXa.a(this.d, ((a)paramObject).d)) && (oXa.a(this.e, ((a)paramObject).e)) && (oXa.a(this.f, ((a)paramObject).f)) && (oXa.a(this.g, ((a)paramObject).g)))
            {
              int j;
              if (this.h == ((a)paramObject).h) {
                j = 1;
              } else {
                j = 0;
              }
              if (j != 0)
              {
                if (this.i == ((a)paramObject).i) {
                  j = 1;
                } else {
                  j = 0;
                }
                if (j != 0) {
                  break label122;
                }
              }
            }
          }
          return false;
        }
        label122:
        return true;
      }
      
      public final boolean f()
      {
        return this.h;
      }
      
      public int hashCode()
      {
        Object localObject = this.d;
        int j = 0;
        int k;
        if (localObject != null) {
          k = localObject.hashCode();
        } else {
          k = 0;
        }
        localObject = this.e;
        int m;
        if (localObject != null) {
          m = ((Eda)localObject).hashCode();
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
          j = localObject.hashCode();
        }
        int i1 = this.h;
        int i2 = i1;
        int i3;
        if (i1 != 0) {
          i3 = 1;
        }
        int i4 = this.i;
        i1 = i4;
        if (i4 != 0) {
          i1 = 1;
        }
        return ((((k * 31 + m) * 31 + n) * 31 + j) * 31 + i3) * 31 + i1;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Content(p=");
        localStringBuilder.append(this.d);
        localStringBuilder.append(", sp=");
        localStringBuilder.append(this.e);
        localStringBuilder.append(", t=");
        localStringBuilder.append(this.f);
        localStringBuilder.append(", sections=");
        localStringBuilder.append(this.g);
        localStringBuilder.append(", isPro=");
        localStringBuilder.append(this.h);
        localStringBuilder.append(", demoMode=");
        localStringBuilder.append(this.i);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class b
      extends sFa.c
    {
      private final List<Eda> d;
      private final Eda e;
      private final KDa f;
      private final c.a g;
      
      public b(List<Eda> paramList, Eda paramEda, KDa paramKDa, c.a parama)
      {
        super(paramEda, paramKDa, null);
        this.d = paramList;
        this.e = paramEda;
        this.f = paramKDa;
        this.g = parama;
      }
      
      public final c.a d()
      {
        return this.g;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof b))
          {
            paramObject = (b)paramObject;
            if ((oXa.a(this.d, ((b)paramObject).d)) && (oXa.a(this.e, ((b)paramObject).e)) && (oXa.a(this.f, ((b)paramObject).f)) && (oXa.a(this.g, ((b)paramObject).g))) {}
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
        Object localObject = this.d;
        int i = 0;
        int j;
        if (localObject != null) {
          j = localObject.hashCode();
        } else {
          j = 0;
        }
        localObject = this.e;
        int k;
        if (localObject != null) {
          k = ((Eda)localObject).hashCode();
        } else {
          k = 0;
        }
        localObject = this.f;
        int m;
        if (localObject != null) {
          m = localObject.hashCode();
        } else {
          m = 0;
        }
        localObject = this.g;
        if (localObject != null) {
          i = localObject.hashCode();
        }
        return ((j * 31 + k) * 31 + m) * 31 + i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Error(p=");
        localStringBuilder.append(this.d);
        localStringBuilder.append(", sp=");
        localStringBuilder.append(this.e);
        localStringBuilder.append(", t=");
        localStringBuilder.append(this.f);
        localStringBuilder.append(", errorModel=");
        localStringBuilder.append(this.g);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/sFa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */