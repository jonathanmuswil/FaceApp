public final class yza<PAYLOAD>
{
  private PAYLOAD a;
  
  public final void a(cXa<? super PAYLOAD, cWa> paramcXa)
  {
    oXa.b(paramcXa, "applyFunc");
    Object localObject = this.a;
    if (localObject != null) {
      paramcXa.a(localObject);
    }
  }
  
  public final void a(zza paramzza, PAYLOAD paramPAYLOAD)
  {
    oXa.b(paramzza, "view");
    this.a = paramPAYLOAD;
    if (paramPAYLOAD == null) {
      paramzza.a(null);
    } else if ((paramPAYLOAD instanceof lka)) {
      paramzza.a(YAa.a.a((lka)paramPAYLOAD));
    } else if ((paramPAYLOAD instanceof Kka)) {
      paramzza.a(YAa.a.a((Kka)paramPAYLOAD));
    } else if ((paramPAYLOAD instanceof tka)) {
      paramzza.a(YAa.a.a((tka)paramPAYLOAD));
    } else if ((paramPAYLOAD instanceof kka)) {
      paramzza.a(YAa.a.a((kka)paramPAYLOAD));
    } else if ((paramPAYLOAD instanceof Gka)) {
      paramzza.a(YAa.a.a((Gka)paramPAYLOAD));
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/yza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */