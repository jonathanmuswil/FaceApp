import java.io.File;

public final class Zfa$a
{
  private final File a;
  private final float b;
  private final float c;
  
  public Zfa$a(File paramFile, float paramFloat1, float paramFloat2)
  {
    this.a = paramFile;
    this.b = paramFloat1;
    this.c = paramFloat2;
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
        if ((oXa.a(this.a, ((a)paramObject).a)) && (Float.compare(this.b, ((a)paramObject).b) == 0) && (Float.compare(this.c, ((a)paramObject).c) == 0)) {}
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
    return (i * 31 + Float.floatToIntBits(this.b)) * 31 + Float.floatToIntBits(this.c);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Result(file=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", min=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", max=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Zfa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */