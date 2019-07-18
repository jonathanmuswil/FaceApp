import java.io.File;

public final class zha
  extends bia<zha.a>
{
  private final String j;
  private final String k;
  
  public zha(Eda paramEda, String paramString)
  {
    super(paramEda);
    this.k = paramString;
    paramEda = new StringBuilder();
    paramEda.append(super.c());
    paramEda.append(".TriMap");
    this.j = paramEda.toString();
  }
  
  private final QQa<uia> o()
  {
    QQa localQQa = QQa.a(Fha.a);
    oXa.a(localQQa, "Observable.defer {\n     …ervable.empty()\n        }");
    return localQQa;
  }
  
  protected kRa a()
  {
    Object localObject = QQa.a(new Cha(this));
    oXa.a(localObject, "Observable\n            .…Observable)\n            }");
    localObject = RPa.a((QQa)localObject, new Rfa.f[] { Rfa.f.j.e, Rfa.f.l.e }).b(EVa.b()).a(new Dha(this), new Eha(this));
    oXa.a(localObject, "Observable\n            .…        { setError(it) })");
    return (kRa)localObject;
  }
  
  public static final class a
  {
    private final File a;
    
    public a(File paramFile)
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
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/zha.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */