import java.util.List;

public abstract class lja
{
  public static final lja.a a = new lja.a(null);
  private final lja.e b;
  
  private lja(lja.e parame)
  {
    this.b = parame;
  }
  
  public final String a(String paramString)
  {
    oXa.b(paramString, "separator");
    lja.e locale = this.b;
    if ((locale != lja.e.a) && (locale != lja.e.b))
    {
      lja.c localc = (lja.c)this;
      paramString = gWa.a(new String[] { String.valueOf(locale.getId()), localc.b().f(), localc.a() }, paramString, null, null, 0, null, null, 62, null);
    }
    else
    {
      paramString = String.valueOf(this.b.getId());
    }
    return paramString;
  }
  
  public String toString()
  {
    return this.b.toString();
  }
  
  public static final class a
  {
    public final lja a(String paramString1, String paramString2)
    {
      oXa.b(paramString1, "serialized");
      oXa.b(paramString2, "separator");
      paramString2 = zYa.a(paramString1, new String[] { paramString2 }, false, 0, 6, null);
      paramString1 = lja.e.e.a(Integer.parseInt((String)paramString2.get(0)));
      if (paramString1 == null) {
        paramString1 = lja.e.a;
      }
      int i = kja.a[paramString1.ordinal()];
      if (i != 1)
      {
        if (i != 2)
        {
          if (i == 3) {
            return new lja.c(qja.o.a((String)paramString2.get(1)), (String)paramString2.get(2));
          }
          throw new UVa();
        }
        paramString1 = lja.b.c;
      }
      else
      {
        paramString1 = lja.d.c;
      }
      return paramString1;
    }
  }
  
  public static final class b
    extends lja
  {
    public static final b c = new b();
    
    private b()
    {
      super(null);
    }
  }
  
  public static final class c
    extends lja
  {
    private final qja c;
    private final String d;
    
    public c(qja paramqja, String paramString)
    {
      super(null);
      this.c = paramqja;
      this.d = paramString;
    }
    
    public final String a()
    {
      return this.d;
    }
    
    public final qja b()
    {
      return this.c;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof c))
        {
          paramObject = (c)paramObject;
          if ((oXa.a(this.c, ((c)paramObject).c)) && (oXa.a(this.d, ((c)paramObject).d))) {}
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
      Object localObject = this.c;
      int i = 0;
      int j;
      if (localObject != null) {
        j = ((Enum)localObject).hashCode();
      } else {
        j = 0;
      }
      localObject = this.d;
      if (localObject != null) {
        i = ((String)localObject).hashCode();
      }
      return j * 31 + i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("DebugPro(");
      localStringBuilder.append(this.c.f());
      localStringBuilder.append(')');
      return localStringBuilder.toString();
    }
  }
  
  public static final class d
    extends lja
  {
    public static final d c = new d();
    
    private d()
    {
      super(null);
    }
  }
  
  public static enum e
  {
    public static final lja.e.a e = new lja.e.a(null);
    private final int f;
    
    static
    {
      e locale1 = new e("UNDEFINED", 0, 0);
      a = locale1;
      e locale2 = new e("FREE", 1, 1);
      b = locale2;
      e locale3 = new e("PRO", 2, 2);
      c = locale3;
      d = new e[] { locale1, locale2, locale3 };
    }
    
    private e(int paramInt)
    {
      this.f = paramInt;
    }
    
    public final int getId()
    {
      return this.f;
    }
    
    public String toString()
    {
      int i = mja.a[ordinal()];
      String str;
      if (i != 1)
      {
        if (i != 2)
        {
          if (i == 3) {
            str = "Pro";
          } else {
            throw new UVa();
          }
        }
        else {
          str = "Free";
        }
      }
      else {
        str = "Undefined";
      }
      return str;
    }
    
    public static final class a
    {
      public final lja.e a(int paramInt)
      {
        for (locale : )
        {
          int k;
          if (locale.getId() == paramInt) {
            k = 1;
          } else {
            k = 0;
          }
          if (k != 0) {
            break label57;
          }
        }
        lja.e locale = null;
        label57:
        return locale;
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/lja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */