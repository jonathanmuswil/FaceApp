public class BZa$a
{
  xZa a;
  vZa b;
  int c = -1;
  String d;
  nZa e;
  oZa.a f;
  DZa g;
  BZa h;
  BZa i;
  BZa j;
  long k;
  long l;
  VZa m;
  
  public BZa$a()
  {
    this.f = new oZa.a();
  }
  
  BZa$a(BZa paramBZa)
  {
    this.a = paramBZa.a;
    this.b = paramBZa.b;
    this.c = paramBZa.c;
    this.d = paramBZa.d;
    this.e = paramBZa.e;
    this.f = paramBZa.f.a();
    this.g = paramBZa.g;
    this.h = paramBZa.h;
    this.i = paramBZa.i;
    this.j = paramBZa.j;
    this.k = paramBZa.k;
    this.l = paramBZa.l;
    this.m = paramBZa.m;
  }
  
  private void a(String paramString, BZa paramBZa)
  {
    if (paramBZa.g == null)
    {
      if (paramBZa.h == null)
      {
        if (paramBZa.i == null)
        {
          if (paramBZa.j == null) {
            return;
          }
          paramBZa = new StringBuilder();
          paramBZa.append(paramString);
          paramBZa.append(".priorResponse != null");
          throw new IllegalArgumentException(paramBZa.toString());
        }
        paramBZa = new StringBuilder();
        paramBZa.append(paramString);
        paramBZa.append(".cacheResponse != null");
        throw new IllegalArgumentException(paramBZa.toString());
      }
      paramBZa = new StringBuilder();
      paramBZa.append(paramString);
      paramBZa.append(".networkResponse != null");
      throw new IllegalArgumentException(paramBZa.toString());
    }
    paramBZa = new StringBuilder();
    paramBZa.append(paramString);
    paramBZa.append(".body != null");
    throw new IllegalArgumentException(paramBZa.toString());
  }
  
  private void d(BZa paramBZa)
  {
    if (paramBZa.g == null) {
      return;
    }
    throw new IllegalArgumentException("priorResponse.body != null");
  }
  
  public a a(int paramInt)
  {
    this.c = paramInt;
    return this;
  }
  
  public a a(long paramLong)
  {
    this.l = paramLong;
    return this;
  }
  
  public a a(BZa paramBZa)
  {
    if (paramBZa != null) {
      a("cacheResponse", paramBZa);
    }
    this.i = paramBZa;
    return this;
  }
  
  public a a(DZa paramDZa)
  {
    this.g = paramDZa;
    return this;
  }
  
  public a a(String paramString)
  {
    this.d = paramString;
    return this;
  }
  
  public a a(String paramString1, String paramString2)
  {
    this.f.a(paramString1, paramString2);
    return this;
  }
  
  public a a(nZa paramnZa)
  {
    this.e = paramnZa;
    return this;
  }
  
  public a a(oZa paramoZa)
  {
    this.f = paramoZa.a();
    return this;
  }
  
  public a a(vZa paramvZa)
  {
    this.b = paramvZa;
    return this;
  }
  
  public a a(xZa paramxZa)
  {
    this.a = paramxZa;
    return this;
  }
  
  public BZa a()
  {
    if (this.a != null)
    {
      if (this.b != null)
      {
        if (this.c >= 0)
        {
          if (this.d != null) {
            return new BZa(this);
          }
          throw new IllegalStateException("message == null");
        }
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("code < 0: ");
        localStringBuilder.append(this.c);
        throw new IllegalStateException(localStringBuilder.toString());
      }
      throw new IllegalStateException("protocol == null");
    }
    throw new IllegalStateException("request == null");
  }
  
  void a(VZa paramVZa)
  {
    this.m = paramVZa;
  }
  
  public a b(long paramLong)
  {
    this.k = paramLong;
    return this;
  }
  
  public a b(BZa paramBZa)
  {
    if (paramBZa != null) {
      a("networkResponse", paramBZa);
    }
    this.h = paramBZa;
    return this;
  }
  
  public a b(String paramString1, String paramString2)
  {
    this.f.c(paramString1, paramString2);
    return this;
  }
  
  public a c(BZa paramBZa)
  {
    if (paramBZa != null) {
      d(paramBZa);
    }
    this.j = paramBZa;
    return this;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/BZa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */