import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class tm
  implements pm
{
  private final File a;
  private final File[] b;
  private final Map<String, String> c;
  
  public tm(File paramFile)
  {
    this(paramFile, Collections.emptyMap());
  }
  
  public tm(File paramFile, Map<String, String> paramMap)
  {
    this.a = paramFile;
    this.b = new File[] { paramFile };
    this.c = new HashMap(paramMap);
    if (this.a.length() == 0L) {
      this.c.putAll(qm.a);
    }
  }
  
  public Map<String, String> a()
  {
    return Collections.unmodifiableMap(this.c);
  }
  
  public String b()
  {
    String str = getFileName();
    return str.substring(0, str.lastIndexOf('.'));
  }
  
  public File c()
  {
    return this.a;
  }
  
  public File[] d()
  {
    return this.b;
  }
  
  public String getFileName()
  {
    return c().getName();
  }
  
  public pm.a getType()
  {
    return pm.a.a;
  }
  
  public void remove()
  {
    Xaa localXaa = Naa.e();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Removing report at ");
    localStringBuilder.append(this.a.getPath());
    localXaa.d("CrashlyticsCore", localStringBuilder.toString());
    this.a.delete();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/tm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */