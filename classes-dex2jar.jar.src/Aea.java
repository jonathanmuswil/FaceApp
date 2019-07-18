final class aea<T, R>
  implements DRa<T, TQa<? extends R>>
{
  aea(Qda paramQda, uXa paramuXa1, uXa paramuXa2) {}
  
  public final QQa<xfa<Kda>> a(NOa<vsa.a> paramNOa)
  {
    oXa.b(paramNOa, "cacheInfoBox");
    Object localObject1;
    if (paramNOa.a())
    {
      this.b.a = new xda(null, 1, null);
      paramNOa = this.a;
      localObject1 = this.b.a;
      if (localObject1 != null)
      {
        paramNOa = Qda.b(paramNOa, (xda)localObject1);
      }
      else
      {
        oXa.b("hostManager");
        throw null;
      }
    }
    else
    {
      localObject1 = (vsa.a)paramNOa.b();
      this.b.a = xda.d.a(((vsa.a)localObject1).b(), ((vsa.a)localObject1).c());
      this.c.a = ((vsa.a)localObject1).d();
      paramNOa = this.a;
      localObject1 = ((vsa.a)localObject1).d();
      Object localObject2 = this.b.a;
      if (localObject2 == null) {
        break label140;
      }
      paramNOa = Qda.a(paramNOa, (String)localObject1, (xda)localObject2);
    }
    return paramNOa;
    label140:
    oXa.b("hostManager");
    throw null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/aea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */