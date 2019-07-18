import java.io.File;

public final class sha
  extends bia<sha.a>
{
  private final String j;
  private final String k;
  
  public sha(Eda paramEda, String paramString)
  {
    super(paramEda);
    this.k = paramString;
    paramEda = new StringBuilder();
    paramEda.append(super.c());
    paramEda.append(".Tatoo");
    this.j = paramEda.toString();
  }
  
  private final QQa<uia> o()
  {
    QQa localQQa = QQa.a(yha.a);
    oXa.a(localQQa, "Observable.defer {\n     …ervable.empty()\n        }");
    return localQQa;
  }
  
  protected kRa a()
  {
    Object localObject = new uXa();
    ((uXa)localObject).a = null;
    QQa localQQa = QQa.a(new vha(this, (uXa)localObject));
    oXa.a(localQQa, "Observable\n            .…Observable)\n            }");
    localObject = RPa.a(localQQa, new Rfa.f[0]).b(EVa.b()).a(new wha(this, (uXa)localObject), new xha(this));
    oXa.a(localObject, "Observable\n            .…        { setError(it) })");
    return (kRa)localObject;
  }
  
  public static final class a
  {
    private final File a;
    private final Ska b;
    
    public a(File paramFile, Ska paramSka)
    {
      this.a = paramFile;
      this.b = paramSka;
    }
    
    public final File a()
    {
      return this.a;
    }
    
    public final Ska b()
    {
      return this.b;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          if ((oXa.a(this.a, ((a)paramObject).a)) && (oXa.a(this.b, ((a)paramObject).b))) {}
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
      Object localObject = this.a;
      int i = 0;
      int j;
      if (localObject != null) {
        j = ((File)localObject).hashCode();
      } else {
        j = 0;
      }
      localObject = this.b;
      if (localObject != null) {
        i = ((Ska)localObject).hashCode();
      }
      return j * 31 + i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Result(file=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", tatooData=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/sha.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */