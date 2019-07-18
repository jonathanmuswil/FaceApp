import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;

public final class q_a
  implements f_a
{
  private final uZa a;
  private final XZa b;
  private final lab c;
  private final kab d;
  private int e = 0;
  private long f = 262144L;
  private oZa g;
  
  public q_a(uZa paramuZa, XZa paramXZa, lab paramlab, kab paramkab)
  {
    this.a = paramuZa;
    this.b = paramXZa;
    this.c = paramlab;
    this.d = paramkab;
  }
  
  private Eab a(long paramLong)
  {
    if (this.e == 4)
    {
      this.e = 5;
      return new q_a.d(paramLong);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("state: ");
    localStringBuilder.append(this.e);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  private Eab a(pZa parampZa)
  {
    if (this.e == 4)
    {
      this.e = 5;
      return new q_a.c(parampZa);
    }
    parampZa = new StringBuilder();
    parampZa.append("state: ");
    parampZa.append(this.e);
    throw new IllegalStateException(parampZa.toString());
  }
  
  private void a(pab parampab)
  {
    Gab localGab = parampab.g();
    parampab.a(Gab.a);
    localGab.a();
    localGab.b();
  }
  
  private Dab d()
  {
    if (this.e == 1)
    {
      this.e = 2;
      return new q_a.b();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("state: ");
    localStringBuilder.append(this.e);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  private Dab e()
  {
    if (this.e == 1)
    {
      this.e = 2;
      return new q_a.e(null);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("state: ");
    localStringBuilder.append(this.e);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  private Eab f()
  {
    if (this.e == 4)
    {
      this.e = 5;
      this.b.e();
      return new q_a.f(null);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("state: ");
    localStringBuilder.append(this.e);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  private String g()
    throws IOException
  {
    String str = this.c.c(this.f);
    this.f -= str.length();
    return str;
  }
  
  private oZa h()
    throws IOException
  {
    oZa.a locala = new oZa.a();
    for (;;)
    {
      String str = g();
      if (str.length() == 0) {
        break;
      }
      JZa.a.a(locala, str);
    }
    return locala.a();
  }
  
  public BZa.a a(boolean paramBoolean)
    throws IOException
  {
    int i = this.e;
    Object localObject;
    if ((i != 1) && (i != 3))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("state: ");
      ((StringBuilder)localObject).append(this.e);
      throw new IllegalStateException(((StringBuilder)localObject).toString());
    }
    try
    {
      localObject = o_a.a(g());
      BZa.a locala = new BZa$a;
      locala.<init>();
      locala.a(((o_a)localObject).a);
      locala.a(((o_a)localObject).b);
      locala.a(((o_a)localObject).c);
      locala.a(h());
      if ((paramBoolean) && (((o_a)localObject).b == 100)) {
        return null;
      }
      if (((o_a)localObject).b == 100)
      {
        this.e = 3;
        return locala;
      }
      this.e = 4;
      return locala;
    }
    catch (EOFException localEOFException)
    {
      localObject = this.b;
      if (localObject != null) {
        localObject = ((XZa)localObject).f().a().k().m();
      } else {
        localObject = "unknown";
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("unexpected end of stream on ");
      localStringBuilder.append((String)localObject);
      throw new IOException(localStringBuilder.toString(), localEOFException);
    }
  }
  
  public Dab a(xZa paramxZa, long paramLong)
    throws IOException
  {
    if ((paramxZa.a() != null) && (paramxZa.a().c())) {
      throw new ProtocolException("Duplex connections are not supported for HTTP/1");
    }
    if ("chunked".equalsIgnoreCase(paramxZa.a("Transfer-Encoding"))) {
      return d();
    }
    if (paramLong != -1L) {
      return e();
    }
    throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
  }
  
  public Eab a(BZa paramBZa)
  {
    if (!i_a.b(paramBZa)) {
      return a(0L);
    }
    if ("chunked".equalsIgnoreCase(paramBZa.b("Transfer-Encoding"))) {
      return a(paramBZa.k().g());
    }
    long l = i_a.a(paramBZa);
    if (l != -1L) {
      return a(l);
    }
    return f();
  }
  
  public XZa a()
  {
    return this.b;
  }
  
  public void a(oZa paramoZa, String paramString)
    throws IOException
  {
    if (this.e == 0)
    {
      this.d.a(paramString).a("\r\n");
      int i = 0;
      int j = paramoZa.b();
      while (i < j)
      {
        this.d.a(paramoZa.a(i)).a(": ").a(paramoZa.b(i)).a("\r\n");
        i++;
      }
      this.d.a("\r\n");
      this.e = 1;
      return;
    }
    paramoZa = new StringBuilder();
    paramoZa.append("state: ");
    paramoZa.append(this.e);
    throw new IllegalStateException(paramoZa.toString());
  }
  
  public void a(xZa paramxZa)
    throws IOException
  {
    String str = m_a.a(paramxZa, this.b.f().b().type());
    a(paramxZa.c(), str);
  }
  
  public long b(BZa paramBZa)
  {
    if (!i_a.b(paramBZa)) {
      return 0L;
    }
    if ("chunked".equalsIgnoreCase(paramBZa.b("Transfer-Encoding"))) {
      return -1L;
    }
    return i_a.a(paramBZa);
  }
  
  public void b()
    throws IOException
  {
    this.d.flush();
  }
  
  public void c()
    throws IOException
  {
    this.d.flush();
  }
  
  public void c(BZa paramBZa)
    throws IOException
  {
    long l = i_a.a(paramBZa);
    if (l == -1L) {
      return;
    }
    paramBZa = a(l);
    LZa.b(paramBZa, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
    paramBZa.close();
  }
  
  public void cancel()
  {
    XZa localXZa = this.b;
    if (localXZa != null) {
      localXZa.b();
    }
  }
  
  private abstract class a
    implements Eab
  {
    protected final pab a = new pab(q_a.d(q_a.this).n());
    protected boolean b;
    
    private a() {}
    
    final void a()
    {
      if (q_a.c(q_a.this) == 6) {
        return;
      }
      if (q_a.c(q_a.this) == 5)
      {
        q_a.a(q_a.this, this.a);
        q_a.a(q_a.this, 6);
        return;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("state: ");
      localStringBuilder.append(q_a.c(q_a.this));
      throw new IllegalStateException(localStringBuilder.toString());
    }
    
    public long b(jab paramjab, long paramLong)
      throws IOException
    {
      try
      {
        paramLong = q_a.d(q_a.this).b(paramjab, paramLong);
        return paramLong;
      }
      catch (IOException paramjab)
      {
        q_a.e(q_a.this).e();
        a();
        throw paramjab;
      }
    }
    
    public Gab n()
    {
      return this.a;
    }
  }
  
  private final class b
    implements Dab
  {
    private final pab a = new pab(q_a.b(q_a.this).n());
    private boolean b;
    
    b() {}
    
    public void a(jab paramjab, long paramLong)
      throws IOException
    {
      if (!this.b)
      {
        if (paramLong == 0L) {
          return;
        }
        q_a.b(q_a.this).d(paramLong);
        q_a.b(q_a.this).a("\r\n");
        q_a.b(q_a.this).a(paramjab, paramLong);
        q_a.b(q_a.this).a("\r\n");
        return;
      }
      throw new IllegalStateException("closed");
    }
    
    public void close()
      throws IOException
    {
      try
      {
        boolean bool = this.b;
        if (bool) {
          return;
        }
        this.b = true;
        q_a.b(q_a.this).a("0\r\n\r\n");
        q_a.a(q_a.this, this.a);
        q_a.a(q_a.this, 3);
        return;
      }
      finally {}
    }
    
    public void flush()
      throws IOException
    {
      try
      {
        boolean bool = this.b;
        if (bool) {
          return;
        }
        q_a.b(q_a.this).flush();
        return;
      }
      finally {}
    }
    
    public Gab n()
    {
      return this.a;
    }
  }
  
  private class c
    extends q_a.a
  {
    private final pZa d;
    private long e = -1L;
    private boolean f = true;
    
    c(pZa parampZa)
    {
      super(null);
      this.d = parampZa;
    }
    
    private void b()
      throws IOException
    {
      if (this.e != -1L) {
        q_a.d(q_a.this).r();
      }
      try
      {
        this.e = q_a.d(q_a.this).u();
        Object localObject = q_a.d(q_a.this).r().trim();
        if (this.e >= 0L) {
          if (!((String)localObject).isEmpty())
          {
            boolean bool = ((String)localObject).startsWith(";");
            if (!bool) {}
          }
          else
          {
            if (this.e == 0L)
            {
              this.f = false;
              localObject = q_a.this;
              q_a.a((q_a)localObject, q_a.g((q_a)localObject));
              i_a.a(q_a.a(q_a.this).g(), this.d, q_a.f(q_a.this));
              a();
            }
            return;
          }
        }
        ProtocolException localProtocolException = new java/net/ProtocolException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("expected chunk size and optional extensions but was \"");
        localStringBuilder.append(this.e);
        localStringBuilder.append((String)localObject);
        localStringBuilder.append("\"");
        localProtocolException.<init>(localStringBuilder.toString());
        throw localProtocolException;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw new ProtocolException(localNumberFormatException.getMessage());
      }
    }
    
    public long b(jab paramjab, long paramLong)
      throws IOException
    {
      if (paramLong >= 0L)
      {
        if (!this.b)
        {
          if (!this.f) {
            return -1L;
          }
          long l = this.e;
          if ((l == 0L) || (l == -1L))
          {
            b();
            if (!this.f) {
              return -1L;
            }
          }
          paramLong = super.b(paramjab, Math.min(paramLong, this.e));
          if (paramLong != -1L)
          {
            this.e -= paramLong;
            return paramLong;
          }
          q_a.e(q_a.this).e();
          paramjab = new ProtocolException("unexpected end of stream");
          a();
          throw paramjab;
        }
        throw new IllegalStateException("closed");
      }
      paramjab = new StringBuilder();
      paramjab.append("byteCount < 0: ");
      paramjab.append(paramLong);
      throw new IllegalArgumentException(paramjab.toString());
    }
    
    public void close()
      throws IOException
    {
      if (this.b) {
        return;
      }
      if ((this.f) && (!LZa.a(this, 100, TimeUnit.MILLISECONDS)))
      {
        q_a.e(q_a.this).e();
        a();
      }
      this.b = true;
    }
  }
  
  private class d
    extends q_a.a
  {
    private long d;
    
    d(long paramLong)
    {
      super(null);
      this.d = paramLong;
      if (this.d == 0L) {
        a();
      }
    }
    
    public long b(jab paramjab, long paramLong)
      throws IOException
    {
      if (paramLong >= 0L)
      {
        if (!this.b)
        {
          long l = this.d;
          if (l == 0L) {
            return -1L;
          }
          paramLong = super.b(paramjab, Math.min(l, paramLong));
          if (paramLong != -1L)
          {
            this.d -= paramLong;
            if (this.d == 0L) {
              a();
            }
            return paramLong;
          }
          q_a.e(q_a.this).e();
          paramjab = new ProtocolException("unexpected end of stream");
          a();
          throw paramjab;
        }
        throw new IllegalStateException("closed");
      }
      paramjab = new StringBuilder();
      paramjab.append("byteCount < 0: ");
      paramjab.append(paramLong);
      throw new IllegalArgumentException(paramjab.toString());
    }
    
    public void close()
      throws IOException
    {
      if (this.b) {
        return;
      }
      if ((this.d != 0L) && (!LZa.a(this, 100, TimeUnit.MILLISECONDS)))
      {
        q_a.e(q_a.this).e();
        a();
      }
      this.b = true;
    }
  }
  
  private final class e
    implements Dab
  {
    private final pab a = new pab(q_a.b(q_a.this).n());
    private boolean b;
    
    private e() {}
    
    public void a(jab paramjab, long paramLong)
      throws IOException
    {
      if (!this.b)
      {
        LZa.a(paramjab.size(), 0L, paramLong);
        q_a.b(q_a.this).a(paramjab, paramLong);
        return;
      }
      throw new IllegalStateException("closed");
    }
    
    public void close()
      throws IOException
    {
      if (this.b) {
        return;
      }
      this.b = true;
      q_a.a(q_a.this, this.a);
      q_a.a(q_a.this, 3);
    }
    
    public void flush()
      throws IOException
    {
      if (this.b) {
        return;
      }
      q_a.b(q_a.this).flush();
    }
    
    public Gab n()
    {
      return this.a;
    }
  }
  
  private class f
    extends q_a.a
  {
    private boolean d;
    
    private f()
    {
      super(null);
    }
    
    public long b(jab paramjab, long paramLong)
      throws IOException
    {
      if (paramLong >= 0L)
      {
        if (!this.b)
        {
          if (this.d) {
            return -1L;
          }
          paramLong = super.b(paramjab, paramLong);
          if (paramLong == -1L)
          {
            this.d = true;
            a();
            return -1L;
          }
          return paramLong;
        }
        throw new IllegalStateException("closed");
      }
      paramjab = new StringBuilder();
      paramjab.append("byteCount < 0: ");
      paramjab.append(paramLong);
      throw new IllegalArgumentException(paramjab.toString());
    }
    
    public void close()
      throws IOException
    {
      if (this.b) {
        return;
      }
      if (!this.d) {
        a();
      }
      this.b = true;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/q_a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */