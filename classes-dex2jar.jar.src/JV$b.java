public final class JV$b
{
  private final int a;
  private final JV.a[] b;
  
  JV$b(int paramInt, JV.a... paramVarArgs)
  {
    this.a = paramInt;
    this.b = paramVarArgs;
  }
  
  public JV.a[] a()
  {
    return this.b;
  }
  
  public int b()
  {
    return this.a;
  }
  
  public int c()
  {
    JV.a[] arrayOfa = this.b;
    int i = arrayOfa.length;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      k += arrayOfa[j].a();
      j++;
    }
    return k;
  }
  
  public int d()
  {
    return this.a * c();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/JV$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */