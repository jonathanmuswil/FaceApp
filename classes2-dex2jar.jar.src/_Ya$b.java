final class _Ya$b
{
  final String a;
  final String b;
  final String c;
  final mab d;
  
  boolean a(String paramString)
  {
    if (this.a.startsWith("*."))
    {
      int i = paramString.indexOf('.');
      int j = paramString.length();
      boolean bool = true;
      if (j - i - 1 == this.b.length())
      {
        String str = this.b;
        if (paramString.regionMatches(false, i + 1, str, 0, str.length())) {}
      }
      else
      {
        bool = false;
      }
      return bool;
    }
    return paramString.equals(this.b);
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof b))
    {
      String str = this.a;
      paramObject = (b)paramObject;
      if ((str.equals(((b)paramObject).a)) && (this.c.equals(((b)paramObject).c)) && (this.d.equals(((b)paramObject).d))) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public int hashCode()
  {
    return ((527 + this.a.hashCode()) * 31 + this.c.hashCode()) * 31 + this.d.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.c);
    localStringBuilder.append(this.d.a());
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/_Ya$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */