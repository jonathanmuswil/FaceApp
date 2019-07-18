import android.content.Context;

public class qca
  implements Runnable
{
  private final Context a;
  private final mca b;
  
  public qca(Context paramContext, mca parammca)
  {
    this.a = paramContext;
    this.b = parammca;
  }
  
  public void run()
  {
    try
    {
      oba.c(this.a, "Performing time based file roll over.");
      if (!this.b.b()) {
        this.b.c();
      }
    }
    catch (Exception localException)
    {
      oba.a(this.a, "Failed to roll over file", localException);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/qca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */