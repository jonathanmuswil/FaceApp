import java.util.List;

final class hEa
  extends pXa
  implements cXa<Integer, cWa>
{
  hEa(fEa paramfEa, AEa paramAEa)
  {
    super(1);
  }
  
  public final void a(Integer paramInteger)
  {
    FVa localFVa = fEa.a(this.b);
    Object localObject = fEa.c(this.b);
    oXa.a(paramInteger, "it");
    int i = paramInteger.intValue();
    boolean bool = false;
    localFVa.a(((List)localObject).subList(0, i));
    localObject = this.c;
    if (paramInteger.intValue() == 4) {
      bool = true;
    }
    ((AEa)localObject).b(bool);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/hEa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */