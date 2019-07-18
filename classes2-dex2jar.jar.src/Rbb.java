import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class rbb
{
  private static final char[] a = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70 };
  private static final Pattern b = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
  private final String c;
  private final pZa d;
  private String e;
  private pZa.a f;
  private final xZa.a g;
  private rZa h;
  private final boolean i;
  private sZa.a j;
  private mZa.a k;
  private AZa l;
  
  rbb(String paramString1, pZa parampZa, String paramString2, oZa paramoZa, rZa paramrZa, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.c = paramString1;
    this.d = parampZa;
    this.e = paramString2;
    this.g = new xZa.a();
    this.h = paramrZa;
    this.i = paramBoolean1;
    if (paramoZa != null) {
      this.g.a(paramoZa);
    }
    if (paramBoolean2)
    {
      this.k = new mZa.a();
    }
    else if (paramBoolean3)
    {
      this.j = new sZa.a();
      this.j.a(sZa.e);
    }
  }
  
  private static String a(String paramString, boolean paramBoolean)
  {
    int m = paramString.length();
    int n = 0;
    for (;;)
    {
      localObject = paramString;
      if (n >= m) {
        break label113;
      }
      int i1 = paramString.codePointAt(n);
      if ((i1 < 32) || (i1 >= 127) || (" \"<>^`{}|\\?#".indexOf(i1) != -1) || ((!paramBoolean) && ((i1 == 47) || (i1 == 37)))) {
        break;
      }
      n += Character.charCount(i1);
    }
    Object localObject = new jab();
    ((jab)localObject).a(paramString, 0, n);
    a((jab)localObject, paramString, n, m, paramBoolean);
    localObject = ((jab)localObject).e();
    label113:
    return (String)localObject;
  }
  
  private static void a(jab paramjab, String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    Object localObject2;
    for (Object localObject1 = null; paramInt1 < paramInt2; localObject1 = localObject2)
    {
      int m = paramString.codePointAt(paramInt1);
      if (paramBoolean)
      {
        localObject2 = localObject1;
        if (m == 9) {
          break label217;
        }
        localObject2 = localObject1;
        if (m == 10) {
          break label217;
        }
        localObject2 = localObject1;
        if (m == 12) {
          break label217;
        }
        if (m == 13)
        {
          localObject2 = localObject1;
          break label217;
        }
      }
      if ((m >= 32) && (m < 127) && (" \"<>^`{}|\\?#".indexOf(m) == -1) && ((paramBoolean) || ((m != 47) && (m != 37))))
      {
        paramjab.c(m);
        localObject2 = localObject1;
      }
      else
      {
        Object localObject3 = localObject1;
        if (localObject1 == null) {
          localObject3 = new jab();
        }
        ((jab)localObject3).c(m);
        for (;;)
        {
          localObject2 = localObject3;
          if (((jab)localObject3).p()) {
            break;
          }
          int n = ((jab)localObject3).readByte() & 0xFF;
          paramjab.writeByte(37);
          paramjab.writeByte(a[(n >> 4 & 0xF)]);
          paramjab.writeByte(a[(n & 0xF)]);
        }
      }
      label217:
      paramInt1 += Character.charCount(m);
    }
  }
  
  xZa.a a()
  {
    Object localObject1 = this.f;
    pZa localpZa;
    if (localObject1 != null)
    {
      localpZa = ((pZa.a)localObject1).a();
    }
    else
    {
      localpZa = this.d.e(this.e);
      if (localpZa == null) {
        break label166;
      }
    }
    Object localObject2 = this.l;
    localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = this.k;
      if (localObject1 != null)
      {
        localObject1 = ((mZa.a)localObject1).a();
      }
      else
      {
        localObject1 = this.j;
        if (localObject1 != null)
        {
          localObject1 = ((sZa.a)localObject1).a();
        }
        else
        {
          localObject1 = localObject2;
          if (this.i) {
            localObject1 = AZa.a(null, new byte[0]);
          }
        }
      }
    }
    rZa localrZa = this.h;
    localObject2 = localObject1;
    if (localrZa != null) {
      if (localObject1 != null)
      {
        localObject2 = new rbb.a((AZa)localObject1, localrZa);
      }
      else
      {
        this.g.a("Content-Type", localrZa.toString());
        localObject2 = localObject1;
      }
    }
    localObject1 = this.g;
    ((xZa.a)localObject1).a(localpZa);
    ((xZa.a)localObject1).a(this.c, (AZa)localObject2);
    return (xZa.a)localObject1;
    label166:
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("Malformed URL. Base: ");
    ((StringBuilder)localObject1).append(this.d);
    ((StringBuilder)localObject1).append(", Relative: ");
    ((StringBuilder)localObject1).append(this.e);
    throw new IllegalArgumentException(((StringBuilder)localObject1).toString());
  }
  
  void a(AZa paramAZa)
  {
    this.l = paramAZa;
  }
  
  void a(Object paramObject)
  {
    this.e = paramObject.toString();
  }
  
  void a(String paramString1, String paramString2)
  {
    if ("Content-Type".equalsIgnoreCase(paramString1)) {
      try
      {
        this.h = rZa.a(paramString2);
      }
      catch (IllegalArgumentException paramString1)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Malformed content type: ");
        localStringBuilder.append(paramString2);
        throw new IllegalArgumentException(localStringBuilder.toString(), paramString1);
      }
    } else {
      this.g.a(paramString1, paramString2);
    }
  }
  
  void a(String paramString1, String paramString2, boolean paramBoolean)
  {
    if (paramBoolean) {
      this.k.b(paramString1, paramString2);
    } else {
      this.k.a(paramString1, paramString2);
    }
  }
  
  void a(oZa paramoZa, AZa paramAZa)
  {
    this.j.a(paramoZa, paramAZa);
  }
  
  void a(sZa.b paramb)
  {
    this.j.a(paramb);
  }
  
  void b(String paramString1, String paramString2, boolean paramBoolean)
  {
    if (this.e != null)
    {
      String str1 = a(paramString2, paramBoolean);
      String str2 = this.e;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("{");
      localStringBuilder.append(paramString1);
      localStringBuilder.append("}");
      paramString1 = str2.replace(localStringBuilder.toString(), str1);
      if (!b.matcher(paramString1).matches())
      {
        this.e = paramString1;
        return;
      }
      paramString1 = new StringBuilder();
      paramString1.append("@Path parameters shouldn't perform path traversal ('.' or '..'): ");
      paramString1.append(paramString2);
      throw new IllegalArgumentException(paramString1.toString());
    }
    throw new AssertionError();
  }
  
  void c(String paramString1, String paramString2, boolean paramBoolean)
  {
    String str = this.e;
    if (str != null)
    {
      this.f = this.d.c(str);
      if (this.f != null)
      {
        this.e = null;
      }
      else
      {
        paramString1 = new StringBuilder();
        paramString1.append("Malformed URL. Base: ");
        paramString1.append(this.d);
        paramString1.append(", Relative: ");
        paramString1.append(this.e);
        throw new IllegalArgumentException(paramString1.toString());
      }
    }
    if (paramBoolean) {
      this.f.a(paramString1, paramString2);
    } else {
      this.f.b(paramString1, paramString2);
    }
  }
  
  private static class a
    extends AZa
  {
    private final AZa a;
    private final rZa b;
    
    a(AZa paramAZa, rZa paramrZa)
    {
      this.a = paramAZa;
      this.b = paramrZa;
    }
    
    public long a()
      throws IOException
    {
      return this.a.a();
    }
    
    public void a(kab paramkab)
      throws IOException
    {
      this.a.a(paramkab);
    }
    
    public rZa b()
    {
      return this.b;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/rbb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */