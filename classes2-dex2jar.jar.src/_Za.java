import android.graphics.Bitmap;

final class _za
  extends pXa
  implements cXa<YVa<? extends Bitmap, ? extends Boolean, ? extends String>, cWa>
{
  _za(gAa paramgAa, rka paramrka)
  {
    super(1);
  }
  
  public final void a(YVa<Bitmap, Boolean, String> paramYVa)
  {
    Bitmap localBitmap = (Bitmap)paramYVa.a();
    Object localObject = (Boolean)paramYVa.b();
    paramYVa = (String)paramYVa.c();
    hAa localhAa = (hAa)this.b.c();
    if (localhAa != null)
    {
      gAa localgAa = this.b;
      oXa.a(localBitmap, "thumbnail");
      oXa.a(localObject, "isPro");
      localObject = gAa.a(localgAa, localBitmap, ((Boolean)localObject).booleanValue(), gAa.a(this.b), this.c);
      oXa.a(paramYVa, "effectID");
      localhAa.a((hAa.a)localObject, paramYVa);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/_za.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */