class Va$c
{
  public final int a;
  public final String b;
  public final int c;
  public final int d;
  
  Va$c(String paramString, int paramInt1, int paramInt2)
  {
    this.b = paramString;
    this.a = paramInt1;
    this.c = paramInt2;
    this.d = -1;
  }
  
  Va$c(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    this.b = paramString;
    this.a = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
  }
  
  boolean a(int paramInt)
  {
    int i = this.c;
    if ((i != 7) && (paramInt != 7) && (i != paramInt))
    {
      int j = this.d;
      if (j != paramInt)
      {
        if (((i == 4) || (j == 4)) && (paramInt == 3)) {
          return true;
        }
        if (((this.c == 9) || (this.d == 9)) && (paramInt == 8)) {
          return true;
        }
        return ((this.c == 12) || (this.d == 12)) && (paramInt == 11);
      }
    }
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Va$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */