import java.io.File;
import java.util.TreeSet;
import java.util.concurrent.Callable;

class fl
  implements Callable<Boolean>
{
  fl(Cl paramCl, Ll paramLl) {}
  
  public Boolean call()
    throws Exception
  {
    TreeSet localTreeSet = this.a.a;
    String str = Cl.c(this.b);
    if ((str != null) && (!localTreeSet.isEmpty()))
    {
      File localFile = (File)localTreeSet.first();
      if (localFile != null)
      {
        Cl localCl = this.b;
        Cl.a(localCl, Cl.f(localCl).d(), localFile, str);
      }
    }
    Cl.a(this.b, localTreeSet);
    return Boolean.TRUE;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/fl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */