final class hcb
  extends icb.a
{
  protected void a(int paramInt, String paramString1, String paramString2, Throwable paramThrowable)
  {
    throw new AssertionError("Missing override for log method.");
  }
  
  public void a(String paramString, Object... paramVarArgs)
  {
    icb.a[] arrayOfa = icb.c;
    int i = arrayOfa.length;
    for (int j = 0; j < i; j++) {
      arrayOfa[j].a(paramString, paramVarArgs);
    }
  }
  
  public void a(Throwable paramThrowable)
  {
    icb.a[] arrayOfa = icb.c;
    int i = arrayOfa.length;
    for (int j = 0; j < i; j++) {
      arrayOfa[j].a(paramThrowable);
    }
  }
  
  public void a(Throwable paramThrowable, String paramString, Object... paramVarArgs)
  {
    icb.a[] arrayOfa = icb.c;
    int i = arrayOfa.length;
    for (int j = 0; j < i; j++) {
      arrayOfa[j].a(paramThrowable, paramString, paramVarArgs);
    }
  }
  
  public void b(String paramString, Object... paramVarArgs)
  {
    icb.a[] arrayOfa = icb.c;
    int i = arrayOfa.length;
    for (int j = 0; j < i; j++) {
      arrayOfa[j].b(paramString, paramVarArgs);
    }
  }
  
  public void d(String paramString, Object... paramVarArgs)
  {
    icb.a[] arrayOfa = icb.c;
    int i = arrayOfa.length;
    for (int j = 0; j < i; j++) {
      arrayOfa[j].d(paramString, paramVarArgs);
    }
  }
  
  public void e(String paramString, Object... paramVarArgs)
  {
    icb.a[] arrayOfa = icb.c;
    int i = arrayOfa.length;
    for (int j = 0; j < i; j++) {
      arrayOfa[j].e(paramString, paramVarArgs);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/hcb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */