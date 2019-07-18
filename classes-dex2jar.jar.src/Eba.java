class eba
{
  public final String a;
  public final boolean b;
  
  eba(String paramString, boolean paramBoolean)
  {
    this.a = paramString;
    this.b = paramBoolean;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (eba.class == paramObject.getClass()))
    {
      paramObject = (eba)paramObject;
      if (this.b != ((eba)paramObject).b) {
        return false;
      }
      String str = this.a;
      return str != null ? str.equals(((eba)paramObject).a) : ((eba)paramObject).a == null;
    }
    return false;
  }
  
  public int hashCode()
  {
    String str = this.a;
    int i;
    if (str != null) {
      i = str.hashCode();
    } else {
      i = 0;
    }
    return i * 31 + this.b;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/eba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */