import android.graphics.Bitmap;

public abstract interface pDa
  extends sla, zza
{
  public abstract void a(pDa.a parama, String paramString);
  
  public abstract void a(rka paramrka);
  
  public abstract void d(float paramFloat);
  
  public abstract QQa<pDa.b> getViewActions();
  
  public static final class a
  {
    private final Bitmap a;
    private final boolean b;
    private final rka c;
    private final boolean d;
    
    public a(Bitmap paramBitmap, boolean paramBoolean1, rka paramrka, boolean paramBoolean2)
    {
      this.a = paramBitmap;
      this.b = paramBoolean1;
      this.c = paramrka;
      this.d = paramBoolean2;
    }
    
    public final boolean a()
    {
      return this.d;
    }
    
    public final rka b()
    {
      return this.c;
    }
    
    public final Bitmap c()
    {
      return this.a;
    }
    
    public final boolean d()
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
            if ((i != 0) && (oXa.a(this.c, ((a)paramObject).c)))
            {
              if (this.d == ((a)paramObject).d) {
                i = 1;
              } else {
                i = 0;
              }
              if (i != 0) {
                break label94;
              }
            }
          }
        }
        return false;
      }
      label94:
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
      int k = this.b;
      int m = k;
      int n;
      if (k != 0) {
        n = 1;
      }
      localObject = this.c;
      if (localObject != null) {
        i = ((rka)localObject).hashCode();
      }
      int i1 = this.d;
      k = i1;
      if (i1 != 0) {
        k = 1;
      }
      return ((j * 31 + n) * 31 + i) * 31 + k;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("CatalogModel(thumb=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", isPro=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(", tatooTool=");
      localStringBuilder.append(this.c);
      localStringBuilder.append(", demoMode=");
      localStringBuilder.append(this.d);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static abstract class b
  {
    public static final class a
      extends pDa.b
    {
      private final Kka a;
      
      public a(Kka paramKka)
      {
        super();
        this.a = paramKka;
      }
      
      public final Kka a()
      {
        return this.a;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof a))
          {
            paramObject = (a)paramObject;
            if (oXa.a(this.a, ((a)paramObject).a)) {}
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
        Kka localKka = this.a;
        int i;
        if (localKka != null) {
          i = localKka.hashCode();
        } else {
          i = 0;
        }
        return i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("SelectPro(tatoo=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class b
      extends pDa.b
    {
      public static final b a = new b();
      
      private b()
      {
        super();
      }
    }
    
    public static final class c
      extends pDa.b
    {
      private final Kka a;
      
      public c(Kka paramKka)
      {
        super();
        this.a = paramKka;
      }
      
      public final Kka a()
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
        Kka localKka = this.a;
        int i;
        if (localKka != null) {
          i = localKka.hashCode();
        } else {
          i = 0;
        }
        return i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("SelectTatoo(tatoo=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class d
      extends pDa.b
    {
      private final pya a;
      private final float b;
      
      public d(pya parampya, float paramFloat)
      {
        super();
        this.a = parampya;
        this.b = paramFloat;
      }
      
      public final pya a()
      {
        return this.a;
      }
      
      public final float b()
      {
        return this.b;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof d))
          {
            paramObject = (d)paramObject;
            if ((oXa.a(this.a, ((d)paramObject).a)) && (Float.compare(this.b, ((d)paramObject).b) == 0)) {}
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
        pya localpya = this.a;
        int i;
        if (localpya != null) {
          i = localpya.hashCode();
        } else {
          i = 0;
        }
        return i * 31 + Float.floatToIntBits(this.b);
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("SetValue(range=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(", value=");
        localStringBuilder.append(this.b);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pDa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */