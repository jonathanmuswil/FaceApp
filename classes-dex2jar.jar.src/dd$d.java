abstract class dd$d
  implements cd
{
  private final dd.c a;
  
  dd$d(dd.c paramc)
  {
    this.a = paramc;
  }
  
  private boolean a(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    paramInt1 = this.a.a(paramCharSequence, paramInt1, paramInt2);
    if (paramInt1 != 0)
    {
      if (paramInt1 != 1) {
        return a();
      }
      return false;
    }
    return true;
  }
  
  protected abstract boolean a();
  
  public boolean isRtl(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    if ((paramCharSequence != null) && (paramInt1 >= 0) && (paramInt2 >= 0) && (paramCharSequence.length() - paramInt2 >= paramInt1))
    {
      if (this.a == null) {
        return a();
      }
      return a(paramCharSequence, paramInt1, paramInt2);
    }
    throw new IllegalArgumentException();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/dd$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */