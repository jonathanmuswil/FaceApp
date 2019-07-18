import io.faceapp.ui.image_editor.common.view.ResultingBitmapView.d.a;

final class cya
  extends pXa
  implements cXa<WVa<? extends qBa.c, ? extends Boolean>, cWa>
{
  cya(Qxa paramQxa)
  {
    super(1);
  }
  
  public final void a(WVa<qBa.c, Boolean> paramWVa)
  {
    qBa.c localc = (qBa.c)paramWVa.a();
    if (oXa.a((Boolean)paramWVa.b(), Boolean.valueOf(true)))
    {
      if (Qxa.e(this.b) != null)
      {
        paramWVa = (fya)this.b.c();
        if (paramWVa != null)
        {
          localc = Qxa.e(this.b);
          if (localc != null)
          {
            paramWVa.a(new ResultingBitmapView.d.a(localc.b()));
          }
          else
          {
            oXa.a();
            throw null;
          }
        }
      }
      else if (Qxa.a(this.b) != null)
      {
        paramWVa = (fya)this.b.c();
        if (paramWVa != null) {
          paramWVa.a(new ResultingBitmapView.d.a(Qxa.a(this.b)));
        }
      }
      else
      {
        icb.a(this.b.b()).a("Before/After not ready", new Object[0]);
      }
    }
    else
    {
      paramWVa = (fya)this.b.c();
      if (paramWVa != null) {
        paramWVa.a(new ResultingBitmapView.d.a(localc.b()));
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/cya.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */