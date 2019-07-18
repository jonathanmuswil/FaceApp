public enum s_a
{
  public final int m;
  
  private s_a(int paramInt)
  {
    this.m = paramInt;
  }
  
  public static s_a a(int paramInt)
  {
    for (s_a locals_a : ) {
      if (locals_a.m == paramInt) {
        return locals_a;
      }
    }
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/s_a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */