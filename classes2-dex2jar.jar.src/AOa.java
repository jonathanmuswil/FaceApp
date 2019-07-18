import android.net.Uri;

public final class aOa
  extends gla<bOa>
{
  private final Uri i;
  private final int j;
  private final bOa.a k;
  
  public aOa(Uri paramUri, int paramInt, bOa.a parama)
  {
    this.i = paramUri;
    this.j = paramInt;
    this.k = parama;
  }
  
  private final void a(float paramFloat1, float paramFloat2)
  {
    Object localObject = XQa.a(new _Na(this, paramFloat1, paramFloat2));
    oXa.a(localObject, "Single.defer<Uri> {\n    …or(Exception())\n        }");
    XQa localXQa = ((XQa)localObject).b(EVa.b());
    oXa.a(localXQa, "croppedFileSingle.subscribeOn(io())");
    localObject = new YNa(this);
    b(localXQa, new ZNa(this), (cXa)localObject);
  }
  
  private final void a(bOa.b paramb)
  {
    if ((paramb instanceof bOa.b.a))
    {
      paramb = (bOa.b.a)paramb;
      a(paramb.b(), paramb.a());
      return;
    }
    throw new UVa();
  }
  
  public void a(bOa parambOa)
  {
    oXa.b(parambOa, "view");
    super.b(parambOa);
    parambOa.a(new bOa.c.a(this.i));
    gla.a(this, parambOa.getViewActions(), null, null, new XNa(this), 3, null);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/aOa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */