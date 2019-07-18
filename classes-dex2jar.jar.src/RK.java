import android.content.Context;

class rk
{
  private final Context a;
  private final tk b;
  private qk c;
  
  public rk(Context paramContext)
  {
    this(paramContext, new tk());
  }
  
  public rk(Context paramContext, tk paramtk)
  {
    this.a = paramContext;
    this.b = paramtk;
  }
  
  public qk a()
  {
    if (this.c == null) {
      this.c = kk.a(this.a);
    }
    return this.c;
  }
  
  public void a(Fk paramFk)
  {
    Object localObject1 = a();
    if (localObject1 == null)
    {
      Naa.e().d("Answers", "Firebase analytics logging was enabled, but not available...");
      return;
    }
    Object localObject2 = this.b.a(paramFk);
    if (localObject2 == null)
    {
      localObject2 = Naa.e();
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Fabric event was not mappable to Firebase event: ");
      ((StringBuilder)localObject1).append(paramFk);
      ((Xaa)localObject2).d("Answers", ((StringBuilder)localObject1).toString());
      return;
    }
    ((qk)localObject1).a(((sk)localObject2).a(), ((sk)localObject2).b());
    if ("levelEnd".equals(paramFk.g)) {
      ((qk)localObject1).a("post_score", ((sk)localObject2).b());
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/rk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */