import java.io.File;

public final class zha$a
{
  private final File a;
  
  public zha$a(File paramFile)
  {
    this.a = paramFile;
  }
  
  public final File a()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if (oXa.a(this.a, ((a)paramObject).a)) {}
      }
      else
      {
        return false;
      }
    }
    return true;
  }
  
  public int hashCode()
  {
    File localFile = this.a;
    int i;
    if (localFile != null) {
      i = localFile.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Result(file=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/zha$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */