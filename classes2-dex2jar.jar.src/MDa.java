import android.graphics.Bitmap;

final class mDa
  extends pXa
  implements cXa<YVa<? extends Bitmap, ? extends Boolean, ? extends String>, cWa>
{
  mDa(oDa paramoDa, rka paramrka)
  {
    super(1);
  }
  
  public final void a(YVa<Bitmap, Boolean, String> paramYVa)
  {
    Object localObject = (Bitmap)paramYVa.a();
    Boolean localBoolean = (Boolean)paramYVa.b();
    String str = (String)paramYVa.c();
    paramYVa = (pDa)this.b.c();
    if (paramYVa != null)
    {
      oDa localoDa = this.b;
      oXa.a(localObject, "thumb");
      oXa.a(localBoolean, "isPro");
      localObject = oDa.a(localoDa, (Bitmap)localObject, localBoolean.booleanValue(), this.c);
      oXa.a(str, "tatooID");
      paramYVa.a((pDa.a)localObject, str);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/mDa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */