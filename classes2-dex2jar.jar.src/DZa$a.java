public final class dZa$a
{
  boolean a;
  String[] b;
  String[] c;
  boolean d;
  
  public dZa$a(dZa paramdZa)
  {
    this.a = paramdZa.g;
    this.b = paramdZa.i;
    this.c = paramdZa.j;
    this.d = paramdZa.h;
  }
  
  dZa$a(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  public a a(boolean paramBoolean)
  {
    if (this.a)
    {
      this.d = paramBoolean;
      return this;
    }
    throw new IllegalStateException("no TLS extensions for cleartext connections");
  }
  
  public a a(FZa... paramVarArgs)
  {
    if (this.a)
    {
      String[] arrayOfString = new String[paramVarArgs.length];
      for (int i = 0; i < paramVarArgs.length; i++) {
        arrayOfString[i] = paramVarArgs[i].g;
      }
      b(arrayOfString);
      return this;
    }
    throw new IllegalStateException("no TLS versions for cleartext connections");
  }
  
  public a a(aZa... paramVarArgs)
  {
    if (this.a)
    {
      String[] arrayOfString = new String[paramVarArgs.length];
      for (int i = 0; i < paramVarArgs.length; i++) {
        arrayOfString[i] = paramVarArgs[i].qb;
      }
      a(arrayOfString);
      return this;
    }
    throw new IllegalStateException("no cipher suites for cleartext connections");
  }
  
  public a a(String... paramVarArgs)
  {
    if (this.a)
    {
      if (paramVarArgs.length != 0)
      {
        this.b = ((String[])paramVarArgs.clone());
        return this;
      }
      throw new IllegalArgumentException("At least one cipher suite is required");
    }
    throw new IllegalStateException("no cipher suites for cleartext connections");
  }
  
  public dZa a()
  {
    return new dZa(this);
  }
  
  public a b(String... paramVarArgs)
  {
    if (this.a)
    {
      if (paramVarArgs.length != 0)
      {
        this.c = ((String[])paramVarArgs.clone());
        return this;
      }
      throw new IllegalArgumentException("At least one TLS version is required");
    }
    throw new IllegalStateException("no TLS versions for cleartext connections");
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/dZa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */