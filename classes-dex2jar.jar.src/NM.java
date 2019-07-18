import java.io.File;
import java.io.IOException;
import java.util.Locale;

class nm
  implements Yl
{
  private final File a;
  private final int b;
  private Fba c;
  
  public nm(File paramFile, int paramInt)
  {
    this.a = paramFile;
    this.b = paramInt;
  }
  
  private void b(long paramLong, String paramString)
  {
    if (this.c == null) {
      return;
    }
    String str = paramString;
    if (paramString == null) {
      str = "null";
    }
    try
    {
      int i = this.b / 4;
      paramString = str;
      if (str.length() > i)
      {
        paramString = new java/lang/StringBuilder;
        paramString.<init>();
        paramString.append("...");
        paramString.append(str.substring(str.length() - i));
        paramString = paramString.toString();
      }
      paramString = paramString.replaceAll("\r", " ").replaceAll("\n", " ");
      paramString = String.format(Locale.US, "%d %s%n", new Object[] { Long.valueOf(paramLong), paramString }).getBytes("UTF-8");
      this.c.a(paramString);
      while ((!this.c.b()) && (this.c.d() > this.b)) {
        this.c.c();
      }
      return;
    }
    catch (IOException paramString)
    {
      Naa.e().b("CrashlyticsCore", "There was a problem writing to the Crashlytics log.", paramString);
    }
  }
  
  private nm.a e()
  {
    if (!this.a.exists()) {
      return null;
    }
    f();
    Object localObject = this.c;
    if (localObject == null) {
      return null;
    }
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = 0;
    localObject = new byte[((Fba)localObject).d()];
    try
    {
      Fba localFba = this.c;
      mm localmm = new mm;
      localmm.<init>(this, (byte[])localObject, arrayOfInt);
      localFba.a(localmm);
    }
    catch (IOException localIOException)
    {
      Naa.e().b("CrashlyticsCore", "A problem occurred while reading the Crashlytics log file.", localIOException);
    }
    return new nm.a((byte[])localObject, arrayOfInt[0]);
  }
  
  private void f()
  {
    if (this.c == null) {
      try
      {
        Fba localFba = new Fba;
        localFba.<init>(this.a);
        this.c = localFba;
      }
      catch (IOException localIOException)
      {
        Xaa localXaa = Naa.e();
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Could not open log file: ");
        localStringBuilder.append(this.a);
        localXaa.b("CrashlyticsCore", localStringBuilder.toString(), localIOException);
      }
    }
  }
  
  public void a()
  {
    oba.a(this.c, "There was a problem closing the Crashlytics log file.");
    this.c = null;
  }
  
  public void a(long paramLong, String paramString)
  {
    f();
    b(paramLong, paramString);
  }
  
  public Nk b()
  {
    Object localObject = e();
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = Nk.a(((nm.a)localObject).a, 0, ((nm.a)localObject).b);
    }
    return (Nk)localObject;
  }
  
  public byte[] c()
  {
    Object localObject = e();
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((nm.a)localObject).a;
    }
    return (byte[])localObject;
  }
  
  public void d()
  {
    a();
    this.a.delete();
  }
  
  public class a
  {
    public final byte[] a;
    public final int b;
    
    public a(byte[] paramArrayOfByte, int paramInt)
    {
      this.a = paramArrayOfByte;
      this.b = paramInt;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/nm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */