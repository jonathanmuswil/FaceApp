import java.util.List;

public final class _ea
{
  private final List<afa> images;
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof _ea))
      {
        paramObject = (_ea)paramObject;
        if (oXa.a(this.images, ((_ea)paramObject).images)) {}
      }
      else
      {
        return false;
      }
    }
    return true;
  }
  
  public final List<afa> getImages()
  {
    return this.images;
  }
  
  public int hashCode()
  {
    List localList = this.images;
    int i;
    if (localList != null) {
      i = localList.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PhotoInfo(images=");
    localStringBuilder.append(this.images);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/_ea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */