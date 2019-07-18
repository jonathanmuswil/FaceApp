import java.util.Locale;

public final class dd
{
  public static final cd a = new dd.e(null, false);
  public static final cd b = new dd.e(null, true);
  public static final cd c = new dd.e(dd.b.a, false);
  public static final cd d = new dd.e(dd.b.a, true);
  public static final cd e = new dd.e(dd.a.a, false);
  public static final cd f = dd.f.b;
  
  static int a(int paramInt)
  {
    if (paramInt != 0)
    {
      if ((paramInt != 1) && (paramInt != 2)) {
        return 2;
      }
      return 0;
    }
    return 1;
  }
  
  static int b(int paramInt)
  {
    if (paramInt != 0)
    {
      if ((paramInt != 1) && (paramInt != 2)) {}
      switch (paramInt)
      {
      default: 
        return 2;
      case 16: 
      case 17: 
        return 0;
      }
    }
    return 1;
  }
  
  private static class a
    implements dd.c
  {
    static final a a = new a(true);
    static final a b = new a(false);
    private final boolean c;
    
    private a(boolean paramBoolean)
    {
      this.c = paramBoolean;
    }
    
    public int a(CharSequence paramCharSequence, int paramInt1, int paramInt2)
    {
      int i = 0;
      for (int j = paramInt1; j < paramInt2 + paramInt1; j++)
      {
        int k = dd.a(Character.getDirectionality(paramCharSequence.charAt(j)));
        if (k != 0)
        {
          if (k != 1) {
            continue;
          }
          if (!this.c) {
            return 1;
          }
        }
        else if (this.c)
        {
          return 0;
        }
        i = 1;
      }
      if (i != 0) {
        return this.c;
      }
      return 2;
    }
  }
  
  private static class b
    implements dd.c
  {
    static final b a = new b();
    
    public int a(CharSequence paramCharSequence, int paramInt1, int paramInt2)
    {
      int i = 2;
      for (int j = paramInt1; (j < paramInt2 + paramInt1) && (i == 2); j++) {
        i = dd.b(Character.getDirectionality(paramCharSequence.charAt(j)));
      }
      return i;
    }
  }
  
  private static abstract interface c
  {
    public abstract int a(CharSequence paramCharSequence, int paramInt1, int paramInt2);
  }
  
  private static abstract class d
    implements cd
  {
    private final dd.c a;
    
    d(dd.c paramc)
    {
      this.a = paramc;
    }
    
    private boolean a(CharSequence paramCharSequence, int paramInt1, int paramInt2)
    {
      paramInt1 = this.a.a(paramCharSequence, paramInt1, paramInt2);
      if (paramInt1 != 0)
      {
        if (paramInt1 != 1) {
          return a();
        }
        return false;
      }
      return true;
    }
    
    protected abstract boolean a();
    
    public boolean isRtl(CharSequence paramCharSequence, int paramInt1, int paramInt2)
    {
      if ((paramCharSequence != null) && (paramInt1 >= 0) && (paramInt2 >= 0) && (paramCharSequence.length() - paramInt2 >= paramInt1))
      {
        if (this.a == null) {
          return a();
        }
        return a(paramCharSequence, paramInt1, paramInt2);
      }
      throw new IllegalArgumentException();
    }
  }
  
  private static class e
    extends dd.d
  {
    private final boolean b;
    
    e(dd.c paramc, boolean paramBoolean)
    {
      super();
      this.b = paramBoolean;
    }
    
    protected boolean a()
    {
      return this.b;
    }
  }
  
  private static class f
    extends dd.d
  {
    static final f b = new f();
    
    f()
    {
      super();
    }
    
    protected boolean a()
    {
      int i = ed.a(Locale.getDefault());
      boolean bool = true;
      if (i != 1) {
        bool = false;
      }
      return bool;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/dd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */