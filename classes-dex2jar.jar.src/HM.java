import java.io.File;
import java.util.Map;

class hm
  implements pm
{
  private final File a;
  
  public hm(File paramFile)
  {
    this.a = paramFile;
  }
  
  public Map<String, String> a()
  {
    return null;
  }
  
  public String b()
  {
    return this.a.getName();
  }
  
  public File c()
  {
    return null;
  }
  
  public File[] d()
  {
    return this.a.listFiles();
  }
  
  public String getFileName()
  {
    return null;
  }
  
  public pm.a getType()
  {
    return pm.a.b;
  }
  
  public void remove()
  {
    for (localObject1 : d())
    {
      localObject2 = Naa.e();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Removing native report file at ");
      localStringBuilder.append(((File)localObject1).getPath());
      ((Xaa)localObject2).d("CrashlyticsCore", localStringBuilder.toString());
      ((File)localObject1).delete();
    }
    Object localObject1 = Naa.e();
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("Removing native report directory at ");
    ((StringBuilder)localObject2).append(this.a);
    ((Xaa)localObject1).d("CrashlyticsCore", ((StringBuilder)localObject2).toString());
    this.a.delete();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/hm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */