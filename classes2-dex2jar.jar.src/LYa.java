public abstract class lya
{
  public static final lya.c a = new lya.c(null);
  private final rka b;
  
  private lya(rka paramrka)
  {
    this.b = paramrka;
  }
  
  public abstract rka a();
  
  public static final class a
    extends lya
  {
    private final rka c;
    
    public a(rka paramrka)
    {
      super(null);
      this.c = paramrka;
    }
    
    public rka a()
    {
      return this.c;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          if (oXa.a(a(), ((a)paramObject).a())) {}
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
      rka localrka = a();
      int i;
      if (localrka != null) {
        i = localrka.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("AdjustmentsTool(tool=");
      localStringBuilder.append(a());
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends lya
  {
    private final rka c;
    
    public b(rka paramrka)
    {
      super(null);
      this.c = paramrka;
    }
    
    public rka a()
    {
      return this.c;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof b))
        {
          paramObject = (b)paramObject;
          if (oXa.a(a(), ((b)paramObject).a())) {}
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
      rka localrka = a();
      int i;
      if (localrka != null) {
        i = localrka.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("BackgroundTool(tool=");
      localStringBuilder.append(a());
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class c
  {
    public final lya a(rka paramrka)
    {
      oXa.b(paramrka, "tool");
      String str = paramrka.c();
      switch (str.hashCode())
      {
      default: 
        break;
      case 1615078484: 
        if (str.equals("effect-tool")) {
          paramrka = new lya.e(paramrka);
        }
        break;
      case 1266959063: 
        if (str.equals("background-tool")) {
          paramrka = new lya.b(paramrka);
        }
        break;
      case 1247799989: 
        if (str.equals("crop-tool")) {
          paramrka = new lya.d(paramrka);
        }
        break;
      case 809064011: 
        if (str.equals("vignette-tool")) {
          paramrka = new lya.g(paramrka, pya.o.i);
        }
        break;
      case 239761653: 
        if (str.equals("overlay-tool")) {
          paramrka = new lya.f(paramrka);
        }
        break;
      case -127031528: 
        if (str.equals("tattoo-tool")) {
          paramrka = new lya.h(paramrka);
        }
        break;
      case -362331553: 
        if (str.equals("adjustments-tool")) {
          paramrka = new lya.a(paramrka);
        }
        break;
      case -1019709123: 
        if (str.equals("lens_blur-tool")) {
          paramrka = new lya.g(paramrka, pya.h.i);
        }
        break;
      }
      paramrka = null;
      return paramrka;
    }
  }
  
  public static final class d
    extends lya
  {
    private final rka c;
    
    public d(rka paramrka)
    {
      super(null);
      this.c = paramrka;
    }
    
    public rka a()
    {
      return this.c;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof d))
        {
          paramObject = (d)paramObject;
          if (oXa.a(a(), ((d)paramObject).a())) {}
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
      rka localrka = a();
      int i;
      if (localrka != null) {
        i = localrka.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("CropTool(tool=");
      localStringBuilder.append(a());
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class e
    extends lya
  {
    private final rka c;
    
    public e(rka paramrka)
    {
      super(null);
      this.c = paramrka;
    }
    
    public rka a()
    {
      return this.c;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof e))
        {
          paramObject = (e)paramObject;
          if (oXa.a(a(), ((e)paramObject).a())) {}
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
      rka localrka = a();
      int i;
      if (localrka != null) {
        i = localrka.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("EffectTool(tool=");
      localStringBuilder.append(a());
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class f
    extends lya
  {
    private final rka c;
    
    public f(rka paramrka)
    {
      super(null);
      this.c = paramrka;
    }
    
    public rka a()
    {
      return this.c;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof f))
        {
          paramObject = (f)paramObject;
          if (oXa.a(a(), ((f)paramObject).a())) {}
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
      rka localrka = a();
      int i;
      if (localrka != null) {
        i = localrka.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("OverlayTool(tool=");
      localStringBuilder.append(a());
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class g
    extends lya
  {
    private final rka c;
    private final pya d;
    
    public g(rka paramrka, pya parampya)
    {
      super(null);
      this.c = paramrka;
      this.d = parampya;
    }
    
    public rka a()
    {
      return this.c;
    }
    
    public final pya b()
    {
      return this.d;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof g))
        {
          paramObject = (g)paramObject;
          if ((oXa.a(a(), ((g)paramObject).a())) && (oXa.a(this.d, ((g)paramObject).d))) {}
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
      Object localObject = a();
      int i = 0;
      int j;
      if (localObject != null) {
        j = ((rka)localObject).hashCode();
      } else {
        j = 0;
      }
      localObject = this.d;
      if (localObject != null) {
        i = localObject.hashCode();
      }
      return j * 31 + i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("RangeTool(tool=");
      localStringBuilder.append(a());
      localStringBuilder.append(", range=");
      localStringBuilder.append(this.d);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class h
    extends lya
  {
    private final rka c;
    
    public h(rka paramrka)
    {
      super(null);
      this.c = paramrka;
    }
    
    public rka a()
    {
      return this.c;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof h))
        {
          paramObject = (h)paramObject;
          if (oXa.a(a(), ((h)paramObject).a())) {}
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
      rka localrka = a();
      int i;
      if (localrka != null) {
        i = localrka.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("TatooTool(tool=");
      localStringBuilder.append(a());
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/lya.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */