import android.content.Context;

class rm
  implements xm
{
  private final Context a;
  private final xm b;
  private boolean c = false;
  private String d;
  
  public rm(Context paramContext, xm paramxm)
  {
    this.a = paramContext;
    this.b = paramxm;
  }
  
  public String a()
  {
    if (!this.c)
    {
      this.d = oba.o(this.a);
      this.c = true;
    }
    Object localObject = this.d;
    if (localObject != null) {
      return (String)localObject;
    }
    localObject = this.b;
    if (localObject != null) {
      return ((xm)localObject).a();
    }
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/rm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */