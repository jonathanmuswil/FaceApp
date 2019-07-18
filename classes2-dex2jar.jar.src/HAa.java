import android.graphics.Bitmap;

public abstract interface hAa
  extends sla, zza
{
  public abstract void a(hAa.a parama, String paramString);
  
  public abstract void a(rka paramrka);
  
  public abstract void b(float paramFloat);
  
  public abstract QQa<hAa.b> getViewActions();
  
  public static final class a
  {
    private final Bitmap a;
    private final boolean b;
    private final boolean c;
    private final rka d;
    
    public a(Bitmap paramBitmap, boolean paramBoolean1, boolean paramBoolean2, rka paramrka)
    {
      this.a = paramBitmap;
      this.b = paramBoolean1;
      this.c = paramBoolean2;
      this.d = paramrka;
    }
    
    public final boolean a()
    {
      return this.c;
    }
    
    public final rka b()
    {
      return this.d;
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
            if (i != 0)
            {
              if (this.c == ((a)paramObject).c) {
                i = 1;
              } else {
                i = 0;
              }
              if ((i != 0) && (oXa.a(this.d, ((a)paramObject).d))) {
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
      int i1 = this.c;
      k = i1;
      if (i1 != 0) {
        k = 1;
      }
      localObject = this.d;
      if (localObject != null) {
        i = ((rka)localObject).hashCode();
      }
      return ((j * 31 + n) * 31 + k) * 31 + i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("EffectsModel(thumb=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", isPro=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(", demoMode=");
      localStringBuilder.append(this.c);
      localStringBuilder.append(", effectTool=");
      localStringBuilder.append(this.d);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static abstract class b
  {
    public static final class a
      extends hAa.b
    {
      private final tka a;
      
      public a(tka paramtka)
      {
        super();
        this.a = paramtka;
      }
      
      public final tka a()
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
        tka localtka = this.a;
        int i;
        if (localtka != null) {
          i = localtka.hashCode();
        } else {
          i = 0;
        }
        return i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("SelectEffect(effect=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class b
      extends hAa.b
    {
      private final tka a;
      
      public b(tka paramtka)
      {
        super();
        this.a = paramtka;
      }
      
      public final tka a()
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
        tka localtka = this.a;
        int i;
        if (localtka != null) {
          i = localtka.hashCode();
        } else {
          i = 0;
        }
        return i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("SelectPro(effect=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class c
      extends hAa.b
    {
      public static final c a = new c();
      
      private c()
      {
        super();
      }
    }
    
    public static final class d
      extends hAa.b
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/hAa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */