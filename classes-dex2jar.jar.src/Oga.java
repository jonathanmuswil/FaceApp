import java.util.List;

public final class oga
  extends bia<oga.a>
{
  private final String j;
  private final List<String> k;
  
  public oga(Eda paramEda, List<String> paramList)
  {
    super(paramEda);
    this.k = paramList;
    paramEda = new StringBuilder();
    paramEda.append(super.c());
    paramEda.append(".EditorApiResponse");
    this.j = paramEda.toString();
  }
  
  private final void a(uia paramuia)
  {
    Cpa localCpa = Cpa.k;
    paramuia.d();
    localCpa.a("style", 1);
  }
  
  private final QQa<uia> o()
  {
    QQa localQQa = QQa.a(uga.a);
    oXa.a(localQQa, "Observable.defer {\n     …ervable.empty()\n        }");
    return localQQa;
  }
  
  protected kRa a()
  {
    uXa localuXa1 = new uXa();
    localuXa1.a = null;
    uXa localuXa2 = new uXa();
    localuXa2.a = null;
    uXa localuXa3 = new uXa();
    localuXa3.a = null;
    Object localObject = new uXa();
    ((uXa)localObject).a = null;
    uXa localuXa4 = new uXa();
    localuXa4.a = null;
    QQa localQQa = i().j().f().c(new rga(this, localuXa2, localuXa3, (uXa)localObject, localuXa4, localuXa1));
    oXa.a(localQQa, "photoOp.region().result(…rvable)\n                }");
    localObject = RPa.a(localQQa, new Rfa.f[] { Rfa.f.j.e, Rfa.f.l.e }).b(EVa.b()).a(new sga(this, localuXa1, localuXa2, localuXa3, (uXa)localObject, localuXa4), new tga(this));
    oXa.a(localObject, "photoOp.region().result(…        { setError(it) })");
    return (kRa)localObject;
  }
  
  public final List<String> j()
  {
    return this.k;
  }
  
  public static final class a
  {
    private final Fka a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    
    public a(Fka paramFka, String paramString1, String paramString2, String paramString3, String paramString4)
    {
      this.a = paramFka;
      this.b = paramString1;
      this.c = paramString2;
      this.d = paramString3;
      this.e = paramString4;
    }
    
    public final String a()
    {
      return this.b;
    }
    
    public final String b()
    {
      return this.d;
    }
    
    public final String c()
    {
      return this.e;
    }
    
    public final Fka d()
    {
      return this.a;
    }
    
    public final String e()
    {
      return this.c;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          if ((oXa.a(this.a, ((a)paramObject).a)) && (oXa.a(this.b, ((a)paramObject).b)) && (oXa.a(this.c, ((a)paramObject).c)) && (oXa.a(this.d, ((a)paramObject).d)) && (oXa.a(this.e, ((a)paramObject).e))) {}
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
        j = ((Fka)localObject).hashCode();
      } else {
        j = 0;
      }
      localObject = this.b;
      int k;
      if (localObject != null) {
        k = ((String)localObject).hashCode();
      } else {
        k = 0;
      }
      localObject = this.c;
      int m;
      if (localObject != null) {
        m = ((String)localObject).hashCode();
      } else {
        m = 0;
      }
      localObject = this.d;
      int n;
      if (localObject != null) {
        n = ((String)localObject).hashCode();
      } else {
        n = 0;
      }
      localObject = this.e;
      if (localObject != null) {
        i = ((String)localObject).hashCode();
      }
      return (((j * 31 + k) * 31 + m) * 31 + n) * 31 + i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Result(imageRegion=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", depthToken=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(", triMapToken=");
      localStringBuilder.append(this.c);
      localStringBuilder.append(", facePointsToken=");
      localStringBuilder.append(this.d);
      localStringBuilder.append(", hairMaskToken=");
      localStringBuilder.append(this.e);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/oga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */