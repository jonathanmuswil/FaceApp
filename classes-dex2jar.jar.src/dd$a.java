class dd$a
  implements dd.c
{
  static final a a = new a(true);
  static final a b = new a(false);
  private final boolean c;
  
  private dd$a(boolean paramBoolean)
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


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/dd$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */