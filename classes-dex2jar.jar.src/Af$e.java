class Af$e
{
  private boolean a;
  private boolean b;
  private boolean c;
  
  private boolean b(boolean paramBoolean)
  {
    if (((this.c) || (paramBoolean) || (this.b)) && (this.a)) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    return paramBoolean;
  }
  
  boolean a()
  {
    try
    {
      this.b = true;
      boolean bool = b(false);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  boolean a(boolean paramBoolean)
  {
    try
    {
      this.a = true;
      paramBoolean = b(paramBoolean);
      return paramBoolean;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  boolean b()
  {
    try
    {
      this.c = true;
      boolean bool = b(false);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  void c()
  {
    try
    {
      this.b = false;
      this.a = false;
      this.c = false;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Af$e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */