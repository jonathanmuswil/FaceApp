import java.util.List;

final class gna<T, R>
  implements DRa<Throwable, aRa<? extends List<? extends hka>>>
{
  gna(hna paramhna) {}
  
  public final XQa<List<hka>> a(Throwable paramThrowable)
  {
    oXa.b(paramThrowable, "error");
    Object localObject = (Rfa)paramThrowable;
    if (((oXa.a(paramThrowable, Rfa.e.c)) || ((paramThrowable instanceof Rfa.d))) && (this.a.a.e()))
    {
      localObject = ina.a(ina.d, this.a.a);
      paramThrowable = this.a.b.a;
      if (paramThrowable != null) {
        return ((XQa)localObject).a((bRa)paramThrowable);
      }
      oXa.b("transformer");
      throw null;
    }
    return XQa.a(paramThrowable);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/gna.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */