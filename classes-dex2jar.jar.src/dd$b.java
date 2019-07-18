class dd$b
  implements dd.c
{
  static final b a = new b();
  
  public int a(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    int i = 2;
    for (int j = paramInt1; (j < paramInt2 + paramInt1) && (i == 2); j++) {
      i = dd.b(Character.getDirectionality(paramCharSequence.charAt(j)));
    }
    return i;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/dd$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */