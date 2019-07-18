import java.io.File;

public final class Ne$d
{
  private final String a;
  private final long b;
  private final long[] c;
  private final File[] d;
  
  private Ne$d(Ne paramNe, String paramString, long paramLong, File[] paramArrayOfFile, long[] paramArrayOfLong)
  {
    this.a = paramString;
    this.b = paramLong;
    this.d = paramArrayOfFile;
    this.c = paramArrayOfLong;
  }
  
  public File a(int paramInt)
  {
    return this.d[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Ne$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */