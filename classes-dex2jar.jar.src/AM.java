import android.content.Context;
import java.io.File;
import java.util.Set;

class am
{
  private static final am.b a = new am.b(null);
  private final Context b;
  private final am.a c;
  private Yl d;
  
  am(Context paramContext, am.a parama)
  {
    this(paramContext, parama, null);
  }
  
  am(Context paramContext, am.a parama, String paramString)
  {
    this.b = paramContext;
    this.c = parama;
    this.d = a;
    a(paramString);
  }
  
  private String a(File paramFile)
  {
    paramFile = paramFile.getName();
    int i = paramFile.lastIndexOf(".temp");
    if (i == -1) {
      return paramFile;
    }
    return paramFile.substring(20, i);
  }
  
  private File b(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("crashlytics-userlog-");
    localStringBuilder.append(paramString);
    localStringBuilder.append(".temp");
    paramString = localStringBuilder.toString();
    return new File(this.c.a(), paramString);
  }
  
  void a()
  {
    this.d.d();
  }
  
  void a(long paramLong, String paramString)
  {
    this.d.a(paramLong, paramString);
  }
  
  void a(File paramFile, int paramInt)
  {
    this.d = new nm(paramFile, paramInt);
  }
  
  final void a(String paramString)
  {
    this.d.a();
    this.d = a;
    if (paramString == null) {
      return;
    }
    if (!oba.a(this.b, "com.crashlytics.CollectCustomLogs", true))
    {
      Naa.e().d("CrashlyticsCore", "Preferences requested no custom logs. Aborting log file creation.");
      return;
    }
    a(b(paramString), 65536);
  }
  
  void a(Set<String> paramSet)
  {
    File[] arrayOfFile = this.c.a().listFiles();
    if (arrayOfFile != null)
    {
      int i = arrayOfFile.length;
      for (int j = 0; j < i; j++)
      {
        File localFile = arrayOfFile[j];
        if (!paramSet.contains(a(localFile))) {
          localFile.delete();
        }
      }
    }
  }
  
  Nk b()
  {
    return this.d.b();
  }
  
  byte[] c()
  {
    return this.d.c();
  }
  
  public static abstract interface a
  {
    public abstract File a();
  }
  
  private static final class b
    implements Yl
  {
    public void a() {}
    
    public void a(long paramLong, String paramString) {}
    
    public Nk b()
    {
      return null;
    }
    
    public byte[] c()
    {
      return null;
    }
    
    public void d() {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */