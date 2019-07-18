import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class jca<T>
{
  protected final Context a;
  protected final hca<T> b;
  protected final qba c;
  protected final kca d;
  private final int e;
  protected volatile long f;
  protected final List<lca> g = new CopyOnWriteArrayList();
  
  public jca(Context paramContext, hca<T> paramhca, qba paramqba, kca paramkca, int paramInt)
    throws IOException
  {
    this.a = paramContext.getApplicationContext();
    this.b = paramhca;
    this.d = paramkca;
    this.c = paramqba;
    this.f = this.c.a();
    this.e = paramInt;
  }
  
  private void a(int paramInt)
    throws IOException
  {
    if (!this.d.a(paramInt, e()))
    {
      String str = String.format(Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", new Object[] { Integer.valueOf(this.d.a()), Integer.valueOf(paramInt), Integer.valueOf(e()) });
      oba.a(this.a, 4, "Fabric", str);
      g();
    }
  }
  
  private void b(String paramString)
  {
    Iterator localIterator = this.g.iterator();
    while (localIterator.hasNext())
    {
      lca locallca = (lca)localIterator.next();
      try
      {
        locallca.a(paramString);
      }
      catch (Exception localException)
      {
        oba.a(this.a, "One of the roll over listeners threw an exception", localException);
      }
    }
  }
  
  public long a(String paramString)
  {
    paramString = paramString.split("_");
    if (paramString.length != 3) {
      return 0L;
    }
    try
    {
      long l = Long.valueOf(paramString[2]).longValue();
      return l;
    }
    catch (NumberFormatException paramString) {}
    return 0L;
  }
  
  public void a()
  {
    kca localkca = this.d;
    localkca.a(localkca.c());
    this.d.d();
  }
  
  public void a(T paramT)
    throws IOException
  {
    paramT = this.b.a(paramT);
    a(paramT.length);
    this.d.a(paramT);
  }
  
  public void a(List<File> paramList)
  {
    this.d.a(paramList);
  }
  
  public void a(lca paramlca)
  {
    if (paramlca != null) {
      this.g.add(paramlca);
    }
  }
  
  public void b()
  {
    Object localObject1 = this.d.c();
    int i = f();
    if (((List)localObject1).size() <= i) {
      return;
    }
    int j = ((List)localObject1).size() - i;
    oba.c(this.a, String.format(Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", new Object[] { Integer.valueOf(((List)localObject1).size()), Integer.valueOf(i), Integer.valueOf(j) }));
    Object localObject2 = new TreeSet(new ica(this));
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      File localFile = (File)((Iterator)localObject1).next();
      ((TreeSet)localObject2).add(new jca.a(localFile, a(localFile.getName())));
    }
    localObject1 = new ArrayList();
    localObject2 = ((TreeSet)localObject2).iterator();
    do
    {
      if (!((Iterator)localObject2).hasNext()) {
        break;
      }
      ((ArrayList)localObject1).add(((jca.a)((Iterator)localObject2).next()).a);
    } while (((ArrayList)localObject1).size() != j);
    this.d.a((List)localObject1);
  }
  
  protected abstract String c();
  
  public List<File> d()
  {
    return this.d.a(1);
  }
  
  protected int e()
  {
    return 8000;
  }
  
  protected int f()
  {
    return this.e;
  }
  
  public boolean g()
    throws IOException
  {
    boolean bool1 = this.d.b();
    boolean bool2 = true;
    String str;
    if (!bool1)
    {
      str = c();
      this.d.a(str);
      oba.a(this.a, 4, "Fabric", String.format(Locale.US, "generated new file %s", new Object[] { str }));
      this.f = this.c.a();
    }
    else
    {
      str = null;
      bool2 = false;
    }
    b(str);
    return bool2;
  }
  
  static class a
  {
    final File a;
    final long b;
    
    public a(File paramFile, long paramLong)
    {
      this.a = paramFile;
      this.b = paramLong;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/jca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */