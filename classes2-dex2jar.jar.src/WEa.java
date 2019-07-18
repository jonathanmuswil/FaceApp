final class wEa
  extends pXa
  implements cXa<xfa<? extends Kda>, cWa>
{
  wEa(fEa paramfEa, fEa.b paramb, uEa paramuEa)
  {
    super(1);
  }
  
  public final void a(xfa<Kda> paramxfa)
  {
    if (paramxfa.isReady())
    {
      paramxfa = (Kda)paramxfa.result();
      fEa.b localb = this.c;
      paramxfa = this.d.a(localb, paramxfa);
      if (paramxfa != null) {
        paramxfa = gla.a(this.b, paramxfa, null, null, 3, null);
      } else {
        paramxfa = null;
      }
      localb.a(paramxfa);
    }
    else
    {
      float f = paramxfa.getProgress();
      this.c.e().a(new AEa.c.a(f * 0.20000002F + 0.1F));
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/wEa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */