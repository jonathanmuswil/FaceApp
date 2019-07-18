final class jg$a
  implements mg
{
  private final jg.b a;
  int b;
  private Class<?> c;
  
  jg$a(jg.b paramb)
  {
    this.a = paramb;
  }
  
  public void a()
  {
    this.a.a(this);
  }
  
  void a(int paramInt, Class<?> paramClass)
  {
    this.b = paramInt;
    this.c = paramClass;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof a;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      paramObject = (a)paramObject;
      bool3 = bool2;
      if (this.b == ((a)paramObject).b)
      {
        bool3 = bool2;
        if (this.c == ((a)paramObject).c) {
          bool3 = true;
        }
      }
    }
    return bool3;
  }
  
  public int hashCode()
  {
    int i = this.b;
    Class localClass = this.c;
    int j;
    if (localClass != null) {
      j = localClass.hashCode();
    } else {
      j = 0;
    }
    return i * 31 + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Key{size=");
    localStringBuilder.append(this.b);
    localStringBuilder.append("array=");
    localStringBuilder.append(this.c);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/jg$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */