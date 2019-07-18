public final class afa
{
  private final int height;
  private final String source;
  private final int width;
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof afa))
      {
        paramObject = (afa)paramObject;
        if (oXa.a(this.source, ((afa)paramObject).source))
        {
          int i;
          if (this.width == ((afa)paramObject).width) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0)
          {
            if (this.height == ((afa)paramObject).height) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0) {
              break label80;
            }
          }
        }
      }
      return false;
    }
    label80:
    return true;
  }
  
  public final int getHeight()
  {
    return this.height;
  }
  
  public final String getSource()
  {
    return this.source;
  }
  
  public final int getWidth()
  {
    return this.width;
  }
  
  public int hashCode()
  {
    String str = this.source;
    int i;
    if (str != null) {
      i = str.hashCode();
    } else {
      i = 0;
    }
    return (i * 31 + this.width) * 31 + this.height;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PhotoResolution(source=");
    localStringBuilder.append(this.source);
    localStringBuilder.append(", width=");
    localStringBuilder.append(this.width);
    localStringBuilder.append(", height=");
    localStringBuilder.append(this.height);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/afa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */