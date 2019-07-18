import java.io.File;
import java.util.List;

public final class rha
  extends bia<File>
{
  private final String j;
  private final List<String> k;
  
  public rha(Eda paramEda, List<String> paramList)
  {
    super(paramEda);
    this.k = paramList;
    paramEda = new StringBuilder();
    paramEda.append(super.c());
    paramEda.append(".Stylist");
    this.j = paramEda.toString();
  }
  
  private final QQa<uia> o()
  {
    QQa localQQa = QQa.a(qha.a);
    oXa.a(localQQa, "Observable.defer {\n     …ervable.empty()\n        }");
    return localQQa;
  }
  
  protected kRa a()
  {
    Object localObject = i().j().f().c(new nha(this));
    oXa.a(localObject, "photoOp.region().result(…rvable)\n                }");
    localObject = RPa.a((QQa)localObject, new Rfa.f[] { Rfa.f.j.e }).b(EVa.b()).a(new oha(this), new pha(this));
    oXa.a(localObject, "photoOp.region().result(…        { setError(it) })");
    return (kRa)localObject;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/rha.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */