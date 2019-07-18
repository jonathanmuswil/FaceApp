final class yt
{
  private final String a;
  private int b;
  
  yt(String paramString)
  {
    this.a = paramString;
    this.b = 0;
  }
  
  final boolean a()
  {
    return this.b < this.a.length();
  }
  
  final int b()
  {
    String str = this.a;
    int i = this.b;
    this.b = (i + 1);
    i = str.charAt(i);
    if (i < 55296) {
      return i;
    }
    int j = i & 0x1FFF;
    int k;
    for (i = 13;; i += 13)
    {
      str = this.a;
      k = this.b;
      this.b = (k + 1);
      k = str.charAt(k);
      if (k < 55296) {
        break;
      }
      j |= (k & 0x1FFF) << i;
    }
    return j | k << i;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/yt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */