import java.util.NoSuchElementException;

public enum wwa
{
  public static final wwa.c g = new wwa.c(null);
  private final int h;
  
  static
  {
    wwa.a locala = new wwa.a("BUG_REPORT", 0);
    a = locala;
    wwa.f localf = new wwa.f("SUGGESTION", 1);
    b = localf;
    wwa.e locale = new wwa.e("QUESTION", 2);
    c = locale;
    wwa.d locald = new wwa.d("OFFER", 3);
    d = locald;
    wwa.b localb = new wwa.b("COMPLAINT", 4);
    e = localb;
    f = new wwa[] { locala, localf, locale, locald, localb };
  }
  
  private wwa(int paramInt)
  {
    this.h = paramInt;
  }
  
  public abstract int a();
  
  public abstract String b();
  
  public abstract int c();
  
  public abstract boolean d();
  
  public final int getId()
  {
    return this.h;
  }
  
  static final class a
    extends wwa
  {
    private final boolean i = true;
    private final int j = 2131689899;
    private final int k = 2131689893;
    private final String l = "Bug";
    
    a()
    {
      super(m, 1, null);
    }
    
    public int a()
    {
      return this.k;
    }
    
    public String b()
    {
      return this.l;
    }
    
    public int c()
    {
      return this.j;
    }
    
    public boolean d()
    {
      return this.i;
    }
  }
  
  static final class b
    extends wwa
  {
    private final boolean i;
    private final int j = 2131689959;
    private final int k = 2131689955;
    private final String l = "Complaint";
    
    b()
    {
      super(m, 5, null);
    }
    
    public int a()
    {
      return this.k;
    }
    
    public String b()
    {
      return this.l;
    }
    
    public int c()
    {
      return this.j;
    }
    
    public boolean d()
    {
      return this.i;
    }
  }
  
  public static final class c
  {
    public final wwa a(int paramInt)
    {
      for (wwa localwwa : )
      {
        int k;
        if (localwwa.getId() == paramInt) {
          k = 1;
        } else {
          k = 0;
        }
        if (k != 0) {
          return localwwa;
        }
      }
      throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
  }
  
  static final class d
    extends wwa
  {
    private final boolean i;
    private final int j = 2131689960;
    private final int k = 2131689956;
    private final String l = "Offer";
    
    d()
    {
      super(m, 4, null);
    }
    
    public int a()
    {
      return this.k;
    }
    
    public String b()
    {
      return this.l;
    }
    
    public int c()
    {
      return this.j;
    }
    
    public boolean d()
    {
      return this.i;
    }
  }
  
  static final class e
    extends wwa
  {
    private final boolean i;
    private final int j = 2131689961;
    private final int k = 2131689957;
    private final String l = "Question";
    
    e()
    {
      super(m, 3, null);
    }
    
    public int a()
    {
      return this.k;
    }
    
    public String b()
    {
      return this.l;
    }
    
    public int c()
    {
      return this.j;
    }
    
    public boolean d()
    {
      return this.i;
    }
  }
  
  static final class f
    extends wwa
  {
    private final boolean i;
    private final int j = 2131689962;
    private final int k = 2131689958;
    private final String l = "Suggestion";
    
    f()
    {
      super(m, 2, null);
    }
    
    public int a()
    {
      return this.k;
    }
    
    public String b()
    {
      return this.l;
    }
    
    public int c()
    {
      return this.j;
    }
    
    public boolean d()
    {
      return this.i;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/wwa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */