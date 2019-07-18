import java.io.File;

public final class uia
{
  private final int a;
  private final int b;
  private final boolean c;
  private final File d;
  
  public uia(int paramInt1, int paramInt2, boolean paramBoolean, File paramFile)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramBoolean;
    this.d = paramFile;
  }
  
  public final File a()
  {
    return this.d;
  }
  
  public final int b()
  {
    return this.b;
  }
  
  public final int c()
  {
    return this.a;
  }
  
  public final boolean d()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof uia))
      {
        paramObject = (uia)paramObject;
        int i;
        if (this.a == ((uia)paramObject).a) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0)
        {
          if (this.b == ((uia)paramObject).b) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0)
          {
            if (this.c == ((uia)paramObject).c) {
              i = 1;
            } else {
              i = 0;
            }
            if ((i != 0) && (oXa.a(this.d, ((uia)paramObject).d))) {
              break label102;
            }
          }
        }
      }
      return false;
    }
    label102:
    return true;
  }
  
  public int hashCode()
  {
    int i = this.a;
    int j = this.b;
    int k = this.c;
    int n = k;
    if (k != 0) {
      n = 1;
    }
    File localFile = this.d;
    int m;
    if (localFile != null) {
      m = localFile.hashCode();
    } else {
      m = 0;
    }
    return ((i * 31 + j) * 31 + n) * 31 + m;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("DownloadProgress(totalBytes=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", readBytes=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", isComplete=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", file=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/uia.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */